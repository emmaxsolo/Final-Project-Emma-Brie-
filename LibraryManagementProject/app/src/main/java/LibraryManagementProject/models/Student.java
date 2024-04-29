/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryManagementProject.models;

import java.util.List;

/**
 *
 * @author bridj
 */
public class Student extends User {
    private int studentID;
    private String studentName;
    private String contactNumber;
    private int bookLimit;
    
    public Student(int id, String username, String password, String role) {
        super(id, username, password, role);
    }
//    public Student(User user) {
//        super(user.getId(), user.getUsername(), user.getPassword(), "Student");
//    }
    
    public List<Book> searchBookByTitle(String title){
        return null;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setName(String studentName) {
        this.studentName = studentName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public int getBookLimit() {
        return bookLimit;
    }

    public void setBookLimit(int bookLimit) {
        this.bookLimit = bookLimit;
    }
}
