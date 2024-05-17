/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package LibraryManagementProject;

import LibraryManagementProject.controllers.LibrarianController;
import LibraryManagementProject.controllers.MainController;
import LibraryManagementProject.controllers.StudentController;
import LibraryManagementProject.factory.Book;
import org.junit.jupiter.api.*;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author emmas
 */
public class LibraryManagementTests {
    
  
    private LibrarianController librarianControl;
    private StudentController studentController;
    private MainController mainController;
    
    public LibraryManagementTests() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        librarianControl = new LibrarianController();
        studentController = new StudentController();
        mainController = MainController.getInstance();
        mainController.librarianController = librarianControl;
        mainController.studentController = studentController;
    }
    
    @AfterEach
    public void tearDown() {
        mainController = null;
        librarianControl = null;
        studentController = null;
    }

    //addBookToCatalog test
     @Test
    public void testAddBookToCatalog() {
         boolean result = mainController.addBookToCatalog("12345", "The Giver", "Lois Lowry", "Houghton Mifflin", 20.00, 10, 'H');
        assertTrue(result, "Book should be added successfully");
        
        Map<String, Book> bookCatalog = mainController.getBookCatalogLibrarian();
        assertTrue(bookCatalog.containsKey("12345"), "Book catalog should contain the newly added book");
        
        Book addedBook = bookCatalog.get("12345");
        assertNotNull(addedBook, "Added book should not be null");
        assertEquals("The Giver", addedBook.getTitle(), "Book title should match");
        assertEquals("Lois Lowry", addedBook.getAuthor(), "Book author should match");
        assertEquals("Houghton Mifflin", addedBook.getPublisher(), "Book publisher should match");
        assertEquals(20.00, addedBook.getPrice(), 0.001, "Book price should match");
        assertEquals(10, addedBook.getQte(), "Book quantity should match");
    }
}
