/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryManagementProject.factory;

import LibraryManagementProject.models.*;

/**
 *
 * @author bridj
 */
public class UserFactory {

    public static User createUser(String username, String password, String role) {
        return new User(0, username, password, role);
    }
    
    public static Librarian createLibrarian(String username, String password) {
        Librarian librarian = new Librarian(0, username, password, "Librarian");
        return librarian;
    }
    
    public static Student createStudent(String username, String password) {
        Student student = new Student(0, username, password, "Student");
        return student;
    }
}
