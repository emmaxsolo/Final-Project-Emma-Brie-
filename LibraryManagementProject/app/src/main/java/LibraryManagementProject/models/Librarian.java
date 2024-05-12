/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryManagementProject.models;

/**
 *
 * @author bridj
 */
public class Librarian {
// extends user
    private int librarianID;
    private String username;
    private String password;

//    public Librarian(int id, String username, String password) {
//        super(id, username, password, "Librarian");
//    }

    public Librarian(int librarianID, String username, String password) {
        this.librarianID = librarianID;
        this.username = username;
        this.password = password;
    }

    public int getLibrarianID() {
        return librarianID;
    }

    public void setLibrarianID(int librarianID) {
        this.librarianID = librarianID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    int getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
