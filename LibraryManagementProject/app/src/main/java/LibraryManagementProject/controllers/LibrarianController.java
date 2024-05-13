/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryManagementProject.controllers;

import LibraryManagementProject.models.*;
import LibraryManagementProject.*;
import LibraryManagementProject.models.Librarian;
import LibraryManagementProject.DatabaseInitializer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author emmas
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
                System.out.println("Successful login for student ID: " + loggedInLibrarian.getLibrarianID());
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
        System.out.println("Logging out Librarian: " + (Session.getCurrentLibrarian() != null ? Session.getCurrentLibrarian().getLibrarianID() : "No student logged in"));
        Session.clearCurrentLibrarian();
    }

}
