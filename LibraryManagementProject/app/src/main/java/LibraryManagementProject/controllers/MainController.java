package LibraryManagementProject.controllers;

import LibraryManagementProject.factory.Book;
import LibraryManagementProject.factory.BookFactory;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Map;

public class MainController {

    private LibrarianController librarianController;
    private StudentController studentController;
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

    //LIBRARIAN 
    public boolean addBookToCatalog(String sn, String title, String author, String publisher, double price, int quantity, char type) {
        String addedDate = Timestamp.valueOf(LocalDateTime.now()).toString();
        Book book = new BookFactory().createBook(sn, title, author, publisher, price, quantity, 0, addedDate, type);
        return librarianController.addBook(book);
    }

    public Map<String, Book> getBookCatalogLibarian() {
        return librarianController.getBookCatalogLibrarian();
    }
    
    public Map<String, Book> getBookCatalogStudent() {
        return studentController.getBookCatalogStudent();
    }
}
//    //method to add book to catalog
//    public void addBook(String bookTitle) {
//        if (librarianController.bookExistsInNewBooks(bookTitle)) {
//            if(librarianController.bookExistsInBooks(bookTitle)){
//               librarianController.updateBookQuantityByOne(bookTitle); 
//            }else{
//                librarianController.addBookToBooks(bookTitle);
//            }
//            librarianController.removeBookFromNewBooks(bookTitle);
//        } else {
//            System.out.println("Book Does not Exist");
//        }
//    }
//    
//   //method to order Books
//    //ORDER BOOKS (create books)
//    public void orderBook(char c, int sn,String title,String author,String publisher, double price, int quantity, int issued){
//        BookFactory factory = new BookFactory();
//        Book book = (Book) factory.createBook(c,sn, title, author, publisher, price, quantity, issued);
//        librarianController.addBooktoNewBooks(book);
//    }

