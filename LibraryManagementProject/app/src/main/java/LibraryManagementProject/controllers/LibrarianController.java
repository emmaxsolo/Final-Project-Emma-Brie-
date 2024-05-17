package LibraryManagementProject.controllers;

import LibraryManagementProject.DatabaseInitializer;
import LibraryManagementProject.factory.Book;
import LibraryManagementProject.factory.BookFactory;
import LibraryManagementProject.models.Librarian;
import LibraryManagementProject.models.Session;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author 1982228,emmas
 */

/**
 * The LibrarianController class contains all the librarian-related 
 * actions that involve the library management system.
 */
public class LibrarianController {

    public LibrarianController() {

    }
    
    /**
     * The method enables the creation of a librarian user account where they can
     * sign up for a desired username and password. 
     * 
     * The librarianID is auto-incremented by 1 each time a new Librarian registers
     * for a librarian user account.
     * 
     * @param username librarian username
     * @param password librarian password
     * @return true if the sign up was successful where the username and password are set within the Librarians table
     */
    public boolean registerLibrarian(String username, String password) {
        String query = "INSERT INTO librarians (username, password) VALUES (?, ?)";
        try ( Connection conn = DatabaseInitializer.getInstance().getConnection()) {
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            int result = pstmt.executeUpdate();
            return result > 0;
        } catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
            return false;
        }
    }

    /**
     * The method enables the registered librarian to access a librarian user account where they can
     * log in with their username and password stored within the Librarian's table once registered.
     * 
     * Once librarian has registered username and password in the librarian table, it creates a new librarian obj 
     * where it sets the current librarian logged in within the current session.
     * 
     * @param username librarian username
     * @param password librarian password
     * @return true if login was successful where the the user name and password are retrieved from the Librarian's table.
     */
    public boolean logInLibrarian(String username, String password) {
        String query = "SELECT * FROM Librarians WHERE username = ? AND password = ?";
        try ( Connection conn = DatabaseInitializer.getInstance().getConnection();  PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                Librarian loggedInLibrarian = new Librarian(
                        rs.getInt("librarian_id"),
                        rs.getString("username"),
                        rs.getString("password")
                );
                Session.setCurrentLibrarian(loggedInLibrarian); // Set the current librarian in session
                System.out.println("Successful login for librarian ID: " + loggedInLibrarian.getLibrarianID());
                return true;
            }
            System.out.println("Login failed for username: " + username);
            return false;
        } catch (SQLException e) {
            System.err.println("Login failed: " + e.getMessage());
            return false;
        }
    }

    /**
     * The method enables the current logged in librarian to add a student with the student information.
     * The method allows the added student to register a student user account with their desired username and password.
     * 
     * First, checks if a student has already been added with a student id by checking the students table 
     * if any student id exists based on user input.
     * 
     * Second, once student info is found, it inserts the student information in the students table and sets librarianID who has 
     * added the student within the students table.
     * 
     * The method returns true once a student has been added successfully.
     * 
     * @param studentId
     * @param studentName
     * @param contactNumber
     * @param librarianId
     * @return true once a student with their student_id, student_name, contact_number has been registered in the system by a librarian.
     */
    public boolean addStudent(int studentId, String studentName, String contactNumber, int librarianId) {
        
        String checkQuery = "SELECT * FROM Students WHERE student_id = ?";
        try ( Connection conn = DatabaseInitializer.getInstance().getConnection();  PreparedStatement checkStmt = conn.prepareStatement(checkQuery)) {
            checkStmt.setInt(1, studentId);
            ResultSet rs = checkStmt.executeQuery();
            if (rs.next()) {
                System.err.println("Student with ID " + studentId + " already exists.");
                return false;
            }

            String query = "INSERT INTO Students (student_id, student_name, contact_number, added_by_librarian) VALUES (?, ?, ?, ?)";
            try ( PreparedStatement pstmt = conn.prepareStatement(query)) {
                pstmt.setInt(1, studentId);
                pstmt.setString(2, studentName);
                pstmt.setString(3, contactNumber);
                pstmt.setInt(4, librarianId);
                pstmt.executeUpdate();
                return true;
            }
        } catch (SQLException e) {
            System.err.println("Add student failed: " + e.getMessage());
            return false;
        }
    }
    
    /**
     * The helper method is used to clear the current librarian's session and to confirm that the current librarian has logged out.
     */
    public void logOut() {
        Session.clearCurrentLibrarian();
        System.out.println("Librarian logged out.");
    }

    /**
     * The method enables the librarian to add book within the Books table where the librarian inputs 
     * the book information.
     * 
     * Books are created with the createBook method within BookFactory class with factory design pattern 
     * where different book types exist in the library such as EBook, Paperback, or Hardcover.
     * 
     * @param book  
     * @return true if the book has been added in the Books table.
     */
    public boolean addBook(Book book) {
        String query = "INSERT INTO Books (SN, title, author, publisher, price, quantity, issued, addedDate, type) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try ( Connection conn = DatabaseInitializer.getInstance().getConnection()) {
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, book.getSN());
            pstmt.setString(2, book.getTitle());
            pstmt.setString(3, book.getAuthor());
            pstmt.setString(4, book.getPublisher());
            pstmt.setDouble(5, book.getPrice());
            pstmt.setInt(6, book.getQte());
            pstmt.setInt(7, book.getQteIssued());
            pstmt.setString(8, Timestamp.valueOf(LocalDateTime.now()).toString()); // LOCAL DATE AND TIME
            pstmt.setString(9, book.getType()); // char is primitive type, maybe it does not get the actual char value? can probably wrap obj
            int result = pstmt.executeUpdate();
            return result > 0;
        } catch (SQLException e) {
            System.err.println("Add book failed: " + e.getMessage());
            return false;
        }
    }

    /**
     * The method allows the librarian to return a book based on the id of the issuedBooks table.
     * The librarian can return book on behalf of any students. 
     * 
     * It verifies the issuedBook id where the book details are associated with it. It updates the book qte,
     * based on the number of books the student has borrowed, ie. issue qte to be returned.
     * 
     * It removes the books that have been issued in the issued books table.
     * @param issuedBookId
     * @return true if book has been returned.
     */
    public boolean returnBook(int issuedBookId) {
        Librarian currentLibrarian = Session.getCurrentLibrarian();
        if (currentLibrarian == null) {
            System.err.println("No librarian logged in.");
            return false;
        }

        try (Connection conn = DatabaseInitializer.getInstance().getConnection()) {
            // Get the book details from IssuedBooks
            String selectQuery = "SELECT SN, quantity FROM IssuedBooks WHERE id = ? ";
            try (PreparedStatement selectStmt = conn.prepareStatement(selectQuery)) {
                selectStmt.setInt(1, issuedBookId);
                ResultSet rs = selectStmt.executeQuery();
                if (rs.next()) {
                    String sn = rs.getString("SN");
                    int quantity = rs.getInt("quantity");

                    // Update the book quantities
                    String updateQuery = "UPDATE Books SET issued = issued - ? WHERE SN = ?";
                    try (PreparedStatement updateStmt = conn.prepareStatement(updateQuery)) {
                        updateStmt.setInt(1, quantity);
                        updateStmt.setString(2, sn);
                        updateStmt.executeUpdate();
                    }

                    // Delete the record from IssuedBooks
                    String deleteQuery = "DELETE FROM IssuedBooks WHERE id = ?";
                    try (PreparedStatement deleteStmt = conn.prepareStatement(deleteQuery)) {
                        deleteStmt.setInt(1, issuedBookId);
                        deleteStmt.executeUpdate();
                    }

                    return true;
                } else {
                    System.err.println("Issued book not found.");
                    return false;
                }
            }
        } catch (SQLException e) {
            System.err.println("Error returning book: " + e.getMessage());
            return false;
        }
    }
    
    /**
     * The method fetches the list of books in k-v pairs.
     * The book type columns displays the book type in string based on the librarian input.
     * 
     * @return books 
     */
    public Map<String, Book> getBookCatalogLibrarian() {
        Map<String, Book> books = new HashMap<>();
        String query = "SELECT * FROM Books";
        try ( Connection conn = DatabaseInitializer.getInstance().getConnection();  PreparedStatement pstmt = conn.prepareStatement(query);  ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                Book book = new BookFactory().createBook(
                        rs.getString("SN"),
                        rs.getString("title"),
                        rs.getString("author"),
                        rs.getString("publisher"),
                        rs.getDouble("price"),
                        rs.getInt("quantity"),
                        rs.getInt("issued"),
                        rs.getString("addedDate"),
                        rs.getString("type").charAt(0)
                );
                books.put(rs.getString("SN"), book);
            }
        } catch (SQLException e) {
            System.err.println("Error fetching book catalog: " + e.getMessage());
        }
        return books;
    }

    /**
     * The method gets all the books that the student has borrowed which are automatically issued to student.
     * 
     * @return list of k-v pairs issued books
     */
    public List<Map<String, Object>> getAllIssuedBooks() {
        Librarian currentLibrarian = Session.getCurrentLibrarian();

        if (currentLibrarian == null) {
            System.err.println("No librarian logged in");
            return new ArrayList<>();
        }

        List<Map<String, Object>> issuedBooks = new ArrayList<>();
        String query = "SELECT * FROM ISSUEDBOOKS";

        try ( Connection conn = DatabaseInitializer.getInstance().getConnection();  PreparedStatement pstmt = conn.prepareStatement(query)) {
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Map<String, Object> issuedBook = new HashMap<>();
                issuedBook.put("id", rs.getInt("id"));
                issuedBook.put("SN", rs.getString("SN"));
                issuedBook.put("title", rs.getString("title"));
                issuedBook.put("StId",rs.getString("StId"));
                issuedBook.put("quantity", rs.getInt("quantity"));
                issuedBook.put("IssueDate", rs.getString("IssueDate"));
                issuedBooks.add(issuedBook);
            }
        } catch (SQLException e) {
            System.err.println("Error fetching issued books" + e.getMessage());
        }
        return issuedBooks;

    }
}


