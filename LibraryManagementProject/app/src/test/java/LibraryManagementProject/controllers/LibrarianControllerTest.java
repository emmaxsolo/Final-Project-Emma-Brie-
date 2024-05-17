/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package LibraryManagementProject.controllers;


import LibraryManagementProject.factory.Book;
import LibraryManagementProject.factory.BookFactory;
import LibraryManagementProject.models.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class LibrarianControllerTest {
    private Connection connection;
    private LibrarianController librarianController;

    @Before
    public void setUp() throws SQLException {
        connection = Dbtest.getConnection();
        Dbtest.setUpDatabase(connection);

        librarianController = new LibrarianController();
    }

    @After
    public void tearDown() throws SQLException {
        // Tear down the in-memory database
        Dbtest.tearDownDatabase(connection);
        connection.close();
    }

    @Test
    public void testRegisterLibrarian() throws SQLException {
        String username = "testLibrarian";
        String password = "password";

        assertTrue(librarianController.registerLibrarian(username, password));

        try (PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM Librarians WHERE username = ?")) {
            pstmt.setString(1, username);
            ResultSet rs = pstmt.executeQuery();
            assertTrue(rs.next());
            assertEquals(username, rs.getString("username"));
        }
    }

    @Test
    public void testLogInLibrarian() {
        String username = "testLibrarian";
        String password = "password";
        librarianController.registerLibrarian(username, password); 

        assertTrue(librarianController.logInLibrarian(username, password));
    }

    /**
     * Test of addStudent method, of class LibrarianController.
     */
    @Test
    public void testAddStudent() throws SQLException {
         int studentId = 1;
        String studentName = "Bri";
        String contactNumber = "1234567";
        int librarianId = 1;

        try (PreparedStatement pstmt = connection.prepareStatement("INSERT INTO librarians (librarian_id, username, password) VALUES (?, ?, ?)")) {
            pstmt.setInt(1, librarianId);
            pstmt.setString(2, "librarian");
            pstmt.setString(3, "password");
            pstmt.executeUpdate();
        }
        
        assertTrue(librarianController.addStudent(studentId, studentName, contactNumber, librarianId));
        
        try (PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM students WHERE student_id = ?")) {
            pstmt.setInt(1, studentId);
            ResultSet rs = pstmt.executeQuery();
            assertTrue(rs.next());
            assertEquals(studentName, rs.getString("student_name"));
        }
    }

    /**
     * Test of logOut method, of class LibrarianController.
     */
    @Test
    public void testLogOut() {
        librarianController.logOut();
        assertNull(Session.getCurrentLibrarian());
    }
    
    /**
     * Test of addBook method, of class LibrarianController.
     */
    @Test
    public void testAddBook() {
        BookFactory bookFactory = new BookFactory();
        Book eBook = bookFactory.createBook("123456", "E-Book Title", "E-Book Author", "E-Book Publisher", 19.99, 100, 10, "2024-05-18", 'E');
        assertTrue(librarianController.addBook(eBook));
    }

    /**
     * Test of returnBook method, of class LibrarianController.
     */
    @Test
    public void testReturnBook() {
        int issuedBookId = 1;
        assertTrue(librarianController.returnBook(issuedBookId));
        
    
    }
    
    /**
     * Test of getAllIssuedBooks method, of class LibrarianController.
     */
    @Test
    public void testGetAllIssuedBooks() {
        List<Map<String, Object>> issuedBooks = librarianController.getAllIssuedBooks();
        assertNotNull(issuedBooks);
    }

   
}
