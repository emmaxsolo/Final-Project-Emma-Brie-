/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryManagementProject.models;

/**
 *
 * @author bridj
 */
public class Librarian extends User {
    private int librarianID;
    private String librarianName;
    
    public Librarian(User user) {
        super(user.getId(), user.getUsername(), user.getPassword(), "Librarian");
    }

    public Librarian(int id, String username, String password, String role) {
        super(id, username, password, role);
    }
       

    public int getLibrarianID() {
        return librarianID;
    }

    public void setLibrarianID(int librarianID) {
        this.librarianID = librarianID;
    }

    public String getLibrarianName() {
        return librarianName;
    }

    public void setLibrarianName(String librarianName) {
        this.librarianName = librarianName;
    }
    
}
