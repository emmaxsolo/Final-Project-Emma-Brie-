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

    public static void setCurrentLibrarian(Librarian librarian) {
        currentLibrarian = librarian;
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

}
