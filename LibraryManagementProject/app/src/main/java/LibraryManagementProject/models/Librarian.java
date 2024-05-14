package LibraryManagementProject.models;

public class Librarian {
    private int librarianID;
    private String username;
    private String password;

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

}
