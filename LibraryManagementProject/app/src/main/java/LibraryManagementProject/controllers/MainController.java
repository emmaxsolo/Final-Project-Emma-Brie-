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
    HashMap<Integer, String> newBooks = new HashMap<>() ;
    MainController main;

    public MainController(LibrarianController librarianController,StudentController studentController,HashMap<Integer, String> newBooks) {
        this.librarianController = librarianController;
        this.studentController = studentController;
        this.newBooks = newBooks;
    }
    
     public MainController getInstance(LibrarianController librarianController,StudentController studentController,HashMap<Integer, String> newBooks) {
        if(main == null) {
           main = new MainController(librarianController,studentController,newBooks);
        }
         return main;
    }
    
}
