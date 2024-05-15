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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author emmas
 */
public class StudentController {

    public StudentController() {

    }

    public boolean registerStudent(int studentId, String username, String password) {
        try (Connection conn = DatabaseInitializer.getInstance().getConnection()) {
            // Insert or update username and password
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
        try (Connection conn = DatabaseInitializer.getInstance().getConnection(); PreparedStatement pstmt = conn.prepareStatement(query)) {
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
        System.out.println("Logging out student: " + (Session.getCurrentStudent() != null ? Session.getCurrentStudent().getStudentName() : "No student logged in"));
        Session.clearCurrentStudent();
    }
    
    /*
    The getBookCatalog() method provides a function to fetch 
    */
    public Map<String, Book> getBookCatalogStudent() {
        Map<String, Book> books = new HashMap<>(); 
        String getQuery = "SELECT SN, title, author, publisher, price, quantity, type FROM Books";
        
        try (Connection conn = DatabaseInitializer.getInstance().getConnection(); PreparedStatement pstmt = conn.prepareStatement(getQuery); ResultSet rs = pstmt.executeQuery()) {
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
            System.err.println("Error fetching book catalog: " + e.getMessage());
        }
        return books;
    }

}
