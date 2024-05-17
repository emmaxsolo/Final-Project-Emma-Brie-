package LibraryManagementProject.controllers;

import LibraryManagementProject.DatabaseInitializer;
import LibraryManagementProject.factory.Book;
import LibraryManagementProject.factory.BookFactory;
import LibraryManagementProject.models.*;
import LibraryManagementProject.views.*;
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

public class StudentController {

    public StudentController() {
        
    }

    public boolean registerStudent(int studentId, String username, String password) {
        try (Connection conn = DatabaseInitializer.getInstance().getConnection()) {
            String query = "UPDATE students SET username = ?, password = ? WHERE student_id = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                pstmt.setString(1, username);
                pstmt.setString(2, password);
                pstmt.setInt(3, studentId);
                int result = pstmt.executeUpdate();
                return result > 0;
            }
        } catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
            return false;
        }
    }

    public boolean logInStudent(String username, String password) {
        String query = "SELECT * FROM Students WHERE username = ? AND password = ?";
        try (Connection conn = DatabaseInitializer.getInstance().getConnection(); 
            PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                Student loggedInStudent = new Student(
                        rs.getInt("student_id"),
                        rs.getString("student_name"),
                        rs.getString("contact_number")
                );
                Session.setCurrentStudent(loggedInStudent);
                System.out.println("Successful login for student ID: " + loggedInStudent.getStudentID());
                return true;
            }
            System.out.println("Failed login for student: " + username);
            return false;
        } catch (SQLException e) {
            System.err.println("Failed login for student: " + e.getMessage());
            return false;
        }

    }

    public void logout() {
        Session.clearCurrentStudent();
        System.out.println("Student logged out.");
    }

    public Map<String, Book> searchBooks(String searchText, String searchCriteria) {
        Map<String, Book> books = new HashMap<>();
        String searchQuery = "SELECT SN, title, author, publisher, price, quantity, type FROM Books WHERE " + searchCriteria;

        try (Connection conn = DatabaseInitializer.getInstance().getConnection(); 
            PreparedStatement pstmt = conn.prepareStatement(searchQuery)) {
            pstmt.setString(1, "%" + searchText + "%");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Book book = new BookFactory().viewBook(
                        rs.getString("SN"),
                        rs.getString("title"),
                        rs.getString("author"),
                        rs.getString("publisher"),
                        rs.getDouble("price"),
                        rs.getInt("quantity"),
                        rs.getString("type").charAt(0)
                );
                books.put(rs.getString("SN"), book);
            }
        } catch (SQLException e) {
            System.err.println("Error searching books: " + e.getMessage());
        }
        return books;
    }

    public Map<String, Book> getAvailableBooks() {
        Map<String, Book> books = new HashMap<>();
        String getQuery = "SELECT SN, title, author, publisher, price, quantity, issued, type FROM Books WHERE quantity > issued";

        try (Connection conn = DatabaseInitializer.getInstance().getConnection(); PreparedStatement pstmt = conn.prepareStatement(getQuery); ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                int totalQuantity = rs.getInt("quantity");
                int issuedQuantity = rs.getInt("issued");
                int availableQuantity = totalQuantity - issuedQuantity;
                Book book = new BookFactory().viewBook(
                        rs.getString("SN"),
                        rs.getString("title"),
                        rs.getString("author"),
                        rs.getString("publisher"),
                        rs.getDouble("price"),
                        availableQuantity,
                        rs.getString("type").charAt(0)
                );
                books.put(rs.getString("SN"), book);
            }
        } catch (SQLException e) {
            System.err.println("Error fetching available books: " + e.getMessage());
        }
        return books;
    }

    public boolean borrowBook(String sn, int quantity) {
        Student currentStudent = Session.getCurrentStudent();
        if (currentStudent == null) {
            System.err.println("No student logged in.");
            return false;
        }

        try (Connection conn = DatabaseInitializer.getInstance().getConnection()) {
            // Check if the book is available
            String checkQuery = "SELECT title, quantity, issued FROM Books WHERE SN = ?";
            try (PreparedStatement checkStmt = conn.prepareStatement(checkQuery)) {
                checkStmt.setString(1, sn);
                ResultSet rs = checkStmt.executeQuery();
                if (rs.next()) {
                    int availableQuantity = rs.getInt("quantity") - rs.getInt("issued");
                    if (availableQuantity < quantity) {
                        System.err.println("Not enough quantity available.");
                        return false;
                    }

                    String title = rs.getString("title");

                    // Update the book quantities
                    String updateQuery = "UPDATE Books SET issued = issued + ? WHERE SN = ?";
                    try (PreparedStatement updateStmt = conn.prepareStatement(updateQuery)) {
                        updateStmt.setInt(1, quantity);
                        updateStmt.setString(2, sn);
                        updateStmt.executeUpdate();
                    }

                    // Insert into IssuedBooks
                    String insertQuery = "INSERT INTO IssuedBooks (SN, StId, title, quantity, IssueDate) VALUES (?, ?, ?, ?, ?)";
                    try (PreparedStatement insertStmt = conn.prepareStatement(insertQuery)) {
                        insertStmt.setString(1, sn);
                        insertStmt.setInt(2, currentStudent.getStudentID());
                        insertStmt.setString(3, title);
                        insertStmt.setInt(4, quantity);
                        insertStmt.setString(5, Timestamp.valueOf(LocalDateTime.now()).toString());
                        insertStmt.executeUpdate();
                    }

                    return true;
                } else {
                    System.err.println("Book not found.");
                    return false;
                }
            }
        } catch (SQLException e) {
            System.err.println("Error borrowing book: " + e.getMessage());
            return false;
        }
    }

    public boolean returnBook(int issuedBookId) {
        Student currentStudent = Session.getCurrentStudent();
        if (currentStudent == null) {
            System.err.println("No student logged in.");
            return false;
        }

        try (Connection conn = DatabaseInitializer.getInstance().getConnection()) {
            // Get the book details from IssuedBooks
            String selectQuery = "SELECT SN, quantity FROM IssuedBooks WHERE id = ? AND StId = ?";
            try (PreparedStatement selectStmt = conn.prepareStatement(selectQuery)) {
                selectStmt.setInt(1, issuedBookId);
                selectStmt.setInt(2, currentStudent.getStudentID());
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

    public List<Map<String, Object>> getIssuedBooksForStudent() {
        Student currentStudent = Session.getCurrentStudent();
        if (currentStudent == null) {
            System.err.println("No student logged in.");
            return new ArrayList<>();
        }

        List<Map<String, Object>> issuedBooks = new ArrayList<>();
        String query = "SELECT * FROM IssuedBooks WHERE StId = ?";

        try (Connection conn = DatabaseInitializer.getInstance().getConnection(); PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, currentStudent.getStudentID());
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Map<String, Object> issuedBook = new HashMap<>();
                issuedBook.put("id", rs.getInt("id"));
                issuedBook.put("SN", rs.getString("SN"));
                issuedBook.put("title", rs.getString("title"));
                issuedBook.put("quantity", rs.getInt("quantity"));
                issuedBook.put("IssueDate", rs.getString("IssueDate"));
                issuedBooks.add(issuedBook);
            }
        } catch (SQLException e) {
            System.err.println("Error fetching issued books: " + e.getMessage());
        }
        return issuedBooks;
    }
}
