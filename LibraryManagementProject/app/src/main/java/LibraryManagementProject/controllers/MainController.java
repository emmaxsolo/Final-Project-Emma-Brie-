package LibraryManagementProject.controllers;

import LibraryManagementProject.factory.Book;
import LibraryManagementProject.factory.BookFactory;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class MainController {

    public LibrarianController librarianController;
    public StudentController studentController;
    private static MainController mainController;

    public MainController() {
        this.librarianController = new LibrarianController();
        this.studentController = new StudentController();
    }

    public static MainController getInstance() {
        if (mainController == null) {
            mainController = new MainController();
        }
        return mainController;
    }

    public LibrarianController getLibrarianController() {
        return librarianController;
    }

    public StudentController getStudentController() {
        return studentController;
    }
    
    public Map<String, Book> getBookCatalogLibrarian() {
        return librarianController.getBookCatalogLibrarian();
    }

    // LIBRARIAN
    public boolean addBookToCatalog(String sn, String title, String author, String publisher, double price, int quantity, char type) {
        String addedDate = Timestamp.valueOf(LocalDateTime.now()).toString();
        Book book = new BookFactory().createBook(sn, title, author, publisher, price, quantity, 0, addedDate, type);
        return librarianController.addBook(book);
    }
    
     public boolean returnBookLibrarian(int issuedBookId) {
        return librarianController.returnBook(issuedBookId);
    }
     
      public List<Map<String, Object>> getIssuedIssuedBooksForLibrarian(){
            return librarianController.getAllIssuedBooks();
    }
    

    // STUDENT
    public Map<String, Book> searchBooks(String searchText, String searchCriteria) {
        return studentController.searchBooks(searchText, searchCriteria);
    }

    public boolean borrowBook(String sn, int quantity) {
        return studentController.borrowBook(sn, quantity);
    }

    public boolean returnBook(int issuedBookId) {
        return studentController.returnBook(issuedBookId);
    }
   
    public List<Map<String, Object>> getIssuedBooksForStudent() {
        return studentController.getIssuedBooksForStudent();
    }

  public Map<String, Book> getAvailableBooks() {
    return studentController.getAvailableBooks();
  }
    
}

