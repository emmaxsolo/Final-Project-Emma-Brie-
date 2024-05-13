/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryManagementProject.models;

import LibraryManagementProject.models.Librarian;
import LibraryManagementProject.models.Student;

/**
 *
 * @author bridj
 */
public class Session {

    private static Librarian currentLibrarian;
    private static Student currentStudent;

    public static void setCurrentStudent(Student student) {
        currentStudent = student;
        currentLibrarian = null;
    }

    public static Student getCurrentStudent() {
        return currentStudent;
    }

    public static int getCurrentStudentId() {
        if (currentStudent != null) {
            return currentStudent.getStudentID();
        }
        return -1; 
    }

    public static void setCurrentLibrarian(Librarian librarian) {
        currentLibrarian = librarian;
        currentStudent = null; 
    }

    public static Librarian getCurrentLibrarian() {
        return currentLibrarian;
    }

    public static int getCurrentLibrarianId() {
        if (currentLibrarian != null) {
            return currentLibrarian.getLibrarianID();
        }
        return -1; 
    }

    public static boolean isLibrarian() {
        return currentLibrarian != null;
    }

    public static boolean isStudent() {
        return currentStudent != null;
    }

    public static void clearCurrentLibrarian() {
        currentLibrarian = null;
    }

    public static void clearCurrentStudent() {
        currentStudent = null;
    }

}
