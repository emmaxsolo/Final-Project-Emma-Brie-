/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryManagementProject.controllers;

import LibraryManagementProject.models.*;
import LibraryManagementProject.views.*;
import java.util.List;
import java.util.Map;

/**
 *
 * @author emmas
 */
public class StudentController {
    private Student student;
    private StudentView view;

    public StudentController(Student student, StudentView view) {
        this.student = student;
        this.view = view;
    }
    
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
            
}
