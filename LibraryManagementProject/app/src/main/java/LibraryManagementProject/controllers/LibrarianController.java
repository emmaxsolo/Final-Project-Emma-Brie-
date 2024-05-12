/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryManagementProject.controllers;

import LibraryManagementProject.models.*;
import LibraryManagementProject.views.*;

import LibraryManagementProject.dao.UserDAO;
import LibraryManagementProject.dao.UserDAOManagement;
import LibraryManagementProject.models.Librarian;
import LibraryManagementProject.DatabaseInitializer;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author 1982228,emmas
 */
public class LibrarianController {
    
    private UserDAO userDAO;
    private Connection connection;

    // Constructor to initialize the controller and establish the connection
    public LibrarianController() {
        this.connection = DatabaseInitializer.getConnection();
        this.userDAO = new UserDAOManagement(connection);
    }

    // Method to authenticate the librarian using username and password
    public Librarian login(String username, String password) {
        try {
            // Find user by username
            User user = userDAO.findUserByUsername(username);
            
            // Check if the user exists
            if (user != null && user.getPassword().equals(password) && "Librarian".equals(user.getRole())) {
                return new Librarian(user.getId(), user.getUsername(), user.getPassword(), user.getRole());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null; 
    }

    // Method to sign up a new librarian with their details
    public boolean signUpLibrarian(String username, String password, String librarianName, int librarianID) {
        try {
            // Create a new Librarian instance with the given details
            Librarian newLibrarian = new Librarian(librarianID, username, password, "Librarian");
            newLibrarian.setLibrarianName(librarianName);
            return userDAO.createLibrarian(newLibrarian);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
//    private Librarian librarian;
//    private LibrarianView view;
 
    // add userDAO userDAO and Connection connection with db
    
    // constructor
    
    //login
    
    //sign up
    
    //register student
    
    // other methods related to librarian specific actions
}
