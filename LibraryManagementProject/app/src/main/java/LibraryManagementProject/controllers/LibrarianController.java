package LibraryManagementProject.controllers;

import LibraryManagementProject.DatabaseInitializer;
import LibraryManagementProject.factory.Book;
import LibraryManagementProject.factory.BookFactory;
import LibraryManagementProject.helpers.SQLCommands;
import LibraryManagementProject.models.Librarian;
import LibraryManagementProject.models.Session;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 1982228,emmas
 */
public class LibrarianController {

    public LibrarianController() {

    }

    public boolean registerLibrarian(String username, String password) {
        String query = "INSERT INTO librarians (username, password) VALUES (?, ?)";
        try (Connection conn = DatabaseInitializer.getInstance().getConnection()) {
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

    public boolean logInLibrarian(String username, String password) {
        String query = "SELECT * FROM Librarians WHERE username = ? AND password = ?";
        try (Connection conn = DatabaseInitializer.getInstance().getConnection(); PreparedStatement pstmt = conn.prepareStatement(query)) {
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

    public boolean addStudent(int studentId, String studentName, String contactNumber, int librarianId) {
        String checkQuery = "SELECT * FROM Students WHERE student_id = ?";
        try (Connection conn = DatabaseInitializer.getInstance().getConnection(); PreparedStatement checkStmt = conn.prepareStatement(checkQuery)) {
            checkStmt.setInt(1, studentId);
            ResultSet rs = checkStmt.executeQuery();
            if (rs.next()) {
                System.err.println("Student with ID " + studentId + " already exists.");
                return false;
            }

            String query = "INSERT INTO Students (student_id, student_name, contact_number, added_by_librarian) VALUES (?, ?, ?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(query)) {
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

    public void logOut() {
        Session.clearCurrentLibrarian();
        System.out.println("Librarian logged out.");
    }

    //NEWBOOK MANIPULATION
    //Method do check if book title exists in the new book table
    public boolean bookExistsInNewBooks(String bookTitle) {
        String query = SQLCommands.checkNewBookExists;

        try ( Connection conn = DatabaseInitializer.getInstance().getConnection();  PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, bookTitle);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                int count = rs.getInt(1);
                return count > 0;
            }
        } catch (SQLException e) {
            System.err.println("Error checking book existence in newBooks: " + e.getMessage());
        }
        return false; // Default return value if an error occurs
    }

    //Method do check if book title exists in the book table
    public boolean bookExistsInBooks(String bookTitle) {
        String query = SQLCommands.checkBookExists;

        try ( Connection conn = DatabaseInitializer.getInstance().getConnection();  PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, bookTitle);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                int count = rs.getInt(1);
                return count > 0;
            }
        } catch (SQLException e) {
            System.err.println("Error checking book existence in newBooks: " + e.getMessage());
        }
        return false; // Default return value if an error occurs
    }

    public void addBooktoNewBooks(Book newBook) {
    String insertQuery = "INSERT INTO NEWBOOKS (SN,TITLE,AUTHOR,PUBLISHER,PRICE,QUANTITY,ISSUED) VALUES (?,?,?,?,?,?,?)";

    try (Connection conn = DatabaseInitializer.getInstance().getConnection();
         PreparedStatement insertStmt = conn.prepareStatement(insertQuery)) {
        if (bookExistsInNewBooks(newBook.getTitle())) {
            updateBookQuantityByOne(newBook.getTitle());
        } else {
            // Set parameters for the insert statement
            insertStmt.setString(1, newBook.getSN());
            insertStmt.setString(2, newBook.getTitle());
            insertStmt.setString(3, newBook.getAuthor());
            insertStmt.setString(4, newBook.getPublisher());
            insertStmt.setDouble(5, (double) newBook.getPrice());
            insertStmt.setInt(6, newBook.getQte());
            insertStmt.setInt(7, newBook.getQteIssued());

            // Execute the insert statement
            int rowsInserted = insertStmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Book added to newBooks table.");
            } else {
                System.out.println("Failed to add book to newBooks table.");
            }
        }
    } catch (SQLException ex) {
        System.out.println("Cannot add to newBooks: " + ex.getMessage());
    }
}

    //add book form newBooks to the library(books)
    public void addBookToBooks(String bookTitle) {
        String selectQuery = "SELECT * FROM newBooks WHERE title = ?";
        String insertQuery = "INSERT INTO books (sn, title, author, publisher, price, quantity, issued, addedDate) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try ( Connection conn = DatabaseInitializer.getInstance().getConnection();  PreparedStatement selectStmt = conn.prepareStatement(selectQuery);  PreparedStatement insertStmt = conn.prepareStatement(insertQuery)) {

            selectStmt.setString(1, bookTitle);

            ResultSet rs = selectStmt.executeQuery();
            // Check if a record with the given title exists in newBooks table
            if (rs.next()) {
                // Get the book details from the newBooks table
                String title = rs.getString("title");
                String author = rs.getString("author");
                String publisher = rs.getString("publisher");
                double price = rs.getDouble("price");
                int qte = rs.getInt("quantity");
                int issuedQte = rs.getInt("issued");
                LocalDateTime currentDate = LocalDateTime.now();
                Timestamp timestamp = Timestamp.valueOf(currentDate);

                // Set parameters for the insert statement
                insertStmt.setString(1, rs.getString("sn"));
                insertStmt.setString(2, title);
                insertStmt.setString(3, author);
                insertStmt.setString(4, publisher);
                insertStmt.setDouble(5, price);
                insertStmt.setInt(6, qte);
                insertStmt.setInt(7, issuedQte);
                insertStmt.setTimestamp(8, timestamp);

                // Execute the insert query
                int rowsInserted = insertStmt.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("Book '" + title + "' added to books table with addedDate: " + currentDate);
                } else {
                    System.out.println("Failed to add book to books table.");
                }
            } else {
                System.out.println("Book with title '" + bookTitle + "' not found in newBooks table.");
            }
        } catch (SQLException e) {
            System.err.println("Error adding book to books table: " + e.getMessage());
        }
    }

    //ill fix this tmr
    public void updateBookQuantityByOne(String bookTitle) {
    String query = "UPDATE BOOKS SET QUANTITY = QUANTITY + 1 WHERE TITLE = ?";
    
    try (Connection conn = DatabaseInitializer.getInstance().getConnection();
         PreparedStatement pstmt = conn.prepareStatement(query)) {
        pstmt.setString(1, bookTitle);
        int rowsUpdated = pstmt.executeUpdate();
        if (rowsUpdated > 0) {
            System.out.println("Quantity Updated");
        } else {
            System.out.println("No book found with title: " + bookTitle);
        }
    } catch (SQLException e) {
        System.err.println("Error updating book quantity: " + e.getMessage());
    }
}


    public void removeBookFromNewBooks(String bookTitle) {
        String query = "DELETE FROM newBooks WHERE title = ?";
        try ( Connection conn = DatabaseInitializer.getInstance().getConnection();  PreparedStatement pstmt = conn.prepareStatement(query)) {
            // Set the book title parameter
            pstmt.setString(1, bookTitle);
            // Execute the delete query
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Book '" + bookTitle + "' removed from newBooks table.");
            } else {
                System.out.println("No book with title '" + bookTitle + "' found in newBooks table.");
            }
        } catch (SQLException e) {
            System.err.println("Error removing book from newBooks table: " + e.getMessage());
        }

    }

    /*
    KEPT BOOKS TABLE BC I COULD NOT ADD CHAR TYPE BC IT CANT BE NULL ON TABLE SO I DID IT VIA SQLITE
     */
    public boolean addBook(Book book) {
        String query = "INSERT INTO Books (SN, title, author, publisher, price, quantity, issued, addedDate, type) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseInitializer.getInstance().getConnection()) {
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

    public Map<String, Book> getBookCatalog() {
        Map<String, Book> books = new HashMap<>();
        String query = "SELECT * FROM Books";
        try (Connection conn = DatabaseInitializer.getInstance().getConnection(); PreparedStatement pstmt = conn.prepareStatement(query); ResultSet rs = pstmt.executeQuery()) {
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
}

//    //NEWBOOK MANIPULATION
//    //Method do check if book title exists in the new book table
//    public boolean bookExistsInNewBooks(String bookTitle) {
//        String query = SQLCommands.checkNewBookExists;
//
//        try ( Connection conn = DatabaseInitializer.getInstance().getConnection();  PreparedStatement pstmt = conn.prepareStatement(query)) {
//            pstmt.setString(1, bookTitle);
//            ResultSet rs = pstmt.executeQuery();
//            if (rs.next()) {
//                int count = rs.getInt(1);
//                return count > 0;
//            }
//        } catch (SQLException e) {
//            System.err.println("Error checking book existence in newBooks: " + e.getMessage());
//        }
//        return false; // Default return value if an error occurs
//    }
//
//    //Method do check if book title exists in the book table
//    public boolean bookExistsInBooks(String bookTitle) {
//        String query = SQLCommands.checkBookExists;
//
//        try ( Connection conn = DatabaseInitializer.getInstance().getConnection();  PreparedStatement pstmt = conn.prepareStatement(query)) {
//            pstmt.setString(1, bookTitle);
//            ResultSet rs = pstmt.executeQuery();
//            if (rs.next()) {
//                int count = rs.getInt(1);
//                return count > 0;
//            }
//        } catch (SQLException e) {
//            System.err.println("Error checking book existence in newBooks: " + e.getMessage());
//        }
//        return false; // Default return value if an error occurs
//    }
//
//    public void addBooktoNewBooks(Book newBook) {
//    String insertQuery = "INSERT INTO NEWBOOKS (SN,TITLE,AUTHOR,PUBLISHER,PRICE,QUANTITY,ISSUED) VALUES (?,?,?,?,?,?,?)";
//
//    try (Connection conn = DatabaseInitializer.getInstance().getConnection();
//         PreparedStatement insertStmt = conn.prepareStatement(insertQuery)) {
//        if (bookExistsInNewBooks(newBook.getTitle())) {
//            updateBookQuantityByOne(newBook.getTitle());
//        } else {
//            // Set parameters for the insert statement
//            insertStmt.setInt(1, newBook.getSN());
//            insertStmt.setString(2, newBook.getTitle());
//            insertStmt.setString(3, newBook.getAuthor());
//            insertStmt.setString(4, newBook.getPublisher());
//            insertStmt.setDouble(5, (double) newBook.getPrice());
//            insertStmt.setInt(6, newBook.getQte());
//            insertStmt.setInt(7, newBook.getQteIssued());
//
//            // Execute the insert statement
//            int rowsInserted = insertStmt.executeUpdate();
//            if (rowsInserted > 0) {
//                System.out.println("Book added to newBooks table.");
//            } else {
//                System.out.println("Failed to add book to newBooks table.");
//            }
//        }
//    } catch (SQLException ex) {
//        System.out.println("Cannot add to newBooks: " + ex.getMessage());
//    }
//}
//
//    //add book form newBooks to the library(books)
//    public void addBookToBooks(String bookTitle) {
//        String selectQuery = "SELECT * FROM newBooks WHERE title = ?";
//        String insertQuery = "INSERT INTO books (sn, title, author, publisher, price, quantity, issued, addedDate) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
//
//        try ( Connection conn = DatabaseInitializer.getInstance().getConnection();  PreparedStatement selectStmt = conn.prepareStatement(selectQuery);  PreparedStatement insertStmt = conn.prepareStatement(insertQuery)) {
//
//            selectStmt.setString(1, bookTitle);
//
//            ResultSet rs = selectStmt.executeQuery();
//            // Check if a record with the given title exists in newBooks table
//            if (rs.next()) {
//                // Get the book details from the newBooks table
//                String title = rs.getString("title");
//                String author = rs.getString("author");
//                String publisher = rs.getString("publisher");
//                double price = rs.getDouble("price");
//                int qte = rs.getInt("quantity");
//                int issuedQte = rs.getInt("issued");
//                LocalDateTime currentDate = LocalDateTime.now();
//                Timestamp timestamp = Timestamp.valueOf(currentDate);
//
//                // Set parameters for the insert statement
//                insertStmt.setString(1, rs.getString("sn"));
//                insertStmt.setString(2, title);
//                insertStmt.setString(3, author);
//                insertStmt.setString(4, publisher);
//                insertStmt.setDouble(5, price);
//                insertStmt.setInt(6, qte);
//                insertStmt.setInt(7, issuedQte);
//                insertStmt.setTimestamp(8, timestamp);
//
//                // Execute the insert query
//                int rowsInserted = insertStmt.executeUpdate();
//                if (rowsInserted > 0) {
//                    System.out.println("Book '" + title + "' added to books table with addedDate: " + currentDate);
//                } else {
//                    System.out.println("Failed to add book to books table.");
//                }
//            } else {
//                System.out.println("Book with title '" + bookTitle + "' not found in newBooks table.");
//            }
//        } catch (SQLException e) {
//            System.err.println("Error adding book to books table: " + e.getMessage());
//        }
//    }
//
//    //ill fix this tmr
//    public void updateBookQuantityByOne(String bookTitle) {
//    String query = "UPDATE BOOKS SET QUANTITY = QUANTITY + 1 WHERE TITLE = ?";
//    
//    try (Connection conn = DatabaseInitializer.getInstance().getConnection();
//         PreparedStatement pstmt = conn.prepareStatement(query)) {
//        pstmt.setString(1, bookTitle);
//        int rowsUpdated = pstmt.executeUpdate();
//        if (rowsUpdated > 0) {
//            System.out.println("Quantity Updated");
//        } else {
//            System.out.println("No book found with title: " + bookTitle);
//        }
//    } catch (SQLException e) {
//        System.err.println("Error updating book quantity: " + e.getMessage());
//    }
//}
//
//
//    public void removeBookFromNewBooks(String bookTitle) {
//        String query = "DELETE FROM newBooks WHERE title = ?";
//        try ( Connection conn = DatabaseInitializer.getInstance().getConnection();  PreparedStatement pstmt = conn.prepareStatement(query)) {
//            // Set the book title parameter
//            pstmt.setString(1, bookTitle);
//            // Execute the delete query
//            int rowsAffected = pstmt.executeUpdate();
//            if (rowsAffected > 0) {
//                System.out.println("Book '" + bookTitle + "' removed from newBooks table.");
//            } else {
//                System.out.println("No book with title '" + bookTitle + "' found in newBooks table.");
//            }
//        } catch (SQLException e) {
//            System.err.println("Error removing book from newBooks table: " + e.getMessage());
//        }
//
//    }

