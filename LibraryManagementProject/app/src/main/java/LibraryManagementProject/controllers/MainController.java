/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryManagementProject.controllers;

import java.util.HashMap;

/**
 *
 * @author 1982228,emmas
 */
public class MainController {

    LibrarianController librarianController = new LibrarianController();
    StudentController studentController = new StudentController();
    MainController main;

   public MainController() {
        this.librarianController = new LibrarianController();
        this.studentController = new StudentController();
    }

    public MainController getInstance() {
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
}
