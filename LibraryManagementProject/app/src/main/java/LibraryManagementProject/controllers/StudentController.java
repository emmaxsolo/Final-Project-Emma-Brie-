/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryManagementProject.controllers;

import LibraryManagementProject.DatabaseInitializer;
import LibraryManagementProject.dao.UserDAO;
import LibraryManagementProject.dao.UserDAOManagement;
import LibraryManagementProject.models.*;
import LibraryManagementProject.views.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 *
 * @author emmas
 */
public class StudentController {

     private UserDAO userDAO;
     private Connection connection;


    public StudentController() {
        this.connection = DatabaseInitializer.getConnection();
        this.userDAO = new UserDAOManagement(connection);
    }

    // private Student student;
    // private StudentView view;
    /*public StudentController(Student student, StudentView view) {
        this.student = student;
        this.view = view;
    }*/
    
    public List<Book> searchBookByTitle(String title){
        return null;
    }
    
    public List<Book> searchBookByName(String name){
        return null;
    }
    
    public List<Book> searchBookByPublisher(String publisher){
        return null;
    }
    
    public Map<String,String> viewCatalog(){
        return null;
    }
    
    public boolean borrow(Book book){
        return false;
    }
    
    public boolean toReturn(Book book){
        return false;
    }
     
    // Authenticate student using studentID, username, and password
    public Student login(int studentID, String username, String password) {
        try {
            Student student = userDAO.findStudentByID(studentID);
            if (student != null && student.getUsername().equals(username) && student.getPassword().equals(password)) {
                return student;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Register a new student
    public boolean signUpStudent(int studentID, String username, String password, String studentName, String contactNumber) {
        try {
            Student newStudent = new Student(studentID, username, password, "Student");
            newStudent.setStudentName(studentName);
            newStudent.setContactNumber(contactNumber);
            return userDAO.createStudent(newStudent);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
