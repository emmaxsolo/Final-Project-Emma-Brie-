/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryManagementProject.controllers;

import LibraryManagementProject.factory.Book;
import LibraryManagementProject.factory.BookFactory;
import java.util.HashMap;

/**
 *
 * @author 1982228,emmas
 */
public class MainController {

    private LibrarianController librarianController = new LibrarianController();
    private StudentController studentController = new StudentController();
    private static MainController main;

   public  MainController() {
        this.librarianController = new LibrarianController();
        this.studentController = new StudentController();
    }

    public static MainController getInstance() {
        if (main == null) {
            main = new MainController();
        }
        return main;
    }
    
    //LIBRARIAN 
    
    //method to add book to catalog
    public void addBook(String bookTitle) {
        if (librarianController.bookExistsInNewBooks(bookTitle)) {
            if(librarianController.bookExistsInBooks(bookTitle)){
               librarianController.updateBookQuantityByOne(bookTitle); 
            }else{
                librarianController.addBookToBooks(bookTitle);
            }
            librarianController.removeBookFromNewBooks(bookTitle);
        } else {
            System.out.println("Book Does not Exist");
        }
        
    }
    
   //method to order Books
    //ORDER BOOKS (create books)
    public void orderBook(char c, int sn,String title,String author,String publisher, double price, int quantity, int issued){
        BookFactory factory = new BookFactory();
        Book book = (Book) factory.createBook(c,sn, title, author, publisher, price, quantity, issued);
        librarianController.addBooktoNewBooks(book);
    }
}
