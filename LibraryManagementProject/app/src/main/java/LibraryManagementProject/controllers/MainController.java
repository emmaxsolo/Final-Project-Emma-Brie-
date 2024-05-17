package LibraryManagementProject.controllers;

import LibraryManagementProject.factory.Book;
import LibraryManagementProject.factory.BookFactory;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

/**
 * The main controller encapsulates the librarian and student controllers.
 * 
 * @author emmas, bridj
 */

public class MainController {
    public LibrarianController librarianController;
    public StudentController studentController;
    private static MainController mainController;

    /**
     * The main controller constructor takes new instances of the librarian and student
     * controllers.
     * 
     */
    public MainController() {
        this.librarianController = new LibrarianController();
        this.studentController = new StudentController();
    }

    /**
     * If there are no instances of main controller, it creates a new instance.
     * @return mainController instance
     */
    public static MainController getInstance() {
        if (mainController == null) {
            mainController = new MainController();
        }
        return mainController;
    }

    /**
     * The method returns the librarianController obj.
     * @return librarianController
     */
    public LibrarianController getLibrarianController() {
        return librarianController;
    }
    
    /**
     * The method returns the studentController obj.
     * @return studentController
     */
    public StudentController getStudentController() {
        return studentController;
    }
    
    /**
     * The method returns the book catalog that of the books that had been added
     * or created based on their book types as per the createBook() method in factory.
     * 
     * @return books 
     */
    public Map<String, Book> getBookCatalogLibrarian() {
        return librarianController.getBookCatalogLibrarian();
    }

    /**
     * The method allows the librarian to add the book to the catalog for the librarians to view.
     * Once the book has been created with specific details about the book. 
     * 
     * @param sn
     * @param title
     * @param author
     * @param publisher
     * @param price
     * @param quantity
     * @param type
     * @return true if book has been added to the catalog.
     */
    public boolean addBookToCatalog(String sn, String title, String author, String publisher, double price, int quantity, char type) {
        String addedDate = Timestamp.valueOf(LocalDateTime.now()).toString();
        Book book = new BookFactory().createBook(sn, title, author, publisher, price, quantity, 0, addedDate, type);
        return librarianController.addBook(book);
    }
    
    /**
     * The method allows the librarian to return the books specified in the method by calling the return book method
     * from the librarianController.
     * @param issuedBookId
     * @return true if librarian has returned books (issuedId of the books)
     */
     public boolean returnBookLibrarian(int issuedBookId) {
        return librarianController.returnBook(issuedBookId);
    }
     
    /**
     * The method returns all the books and the student info
     * that were issued to any students who have borrowed the books for librarians to see.
     * @return 
     */
    public List<Map<String, Object>> getIssuedIssuedBooksForLibrarian(){
        return librarianController.getAllIssuedBooks();
    }
    

    // STUDENT
    
    /**
     * The method returns all the available books for students to borrow which is presented 
     * the book catalog
     * @return available books
     */
    public Map<String, Book> getAvailableBooks() {
        return studentController.getAvailableBooks();
    }

    /**
     * The method allows the student user to search books from the studentController.
     * @param searchText the string input
     * @param searchCriteria the criteria of search (author, title, publisher)
     * @return books that apply to the searchText and searchCriteria.
     */
    public Map<String, Book> searchBooks(String searchText, String searchCriteria) {
        return studentController.searchBooks(searchText, searchCriteria);
    }
    
    /**
     * The method allows the student user to borrow a book based on the sn and the quantity they input.
     * The row value takes the sn where the student choose the book they would like to borrow.
     * 
     * @param sn
     * @param quantity
     * @return true if the student has borrowed.
     */
    public boolean borrowBook(String sn, int quantity) {
        return studentController.borrowBook(sn, quantity);
    }

    /**
     *The method allows the student to return the book based on the issue id.
     * The student can only return the whole book quantity they borrowed.
     * @param issuedBookId
     * @return true if stufdent has returned book.
     */
    public boolean returnBook(int issuedBookId) {
        return studentController.returnBook(issuedBookId);
    }
   
    /**
     * The method gets all the books that the students have borrowed specifically to them
     * @return list of books (sn-bookob)
     */
    public List<Map<String, Object>> getIssuedBooksForStudent() {
        return studentController.getIssuedBooksForStudent();
    }
    
}

