/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryManagementProject.helpers;

/**
 *
 * @author bridj,emmas
 */
public class SQLCommands {
    // TBA query commands
    
    //BOOK MANIPULATION
    
    //CHECK IF BOOK IS IN NEW BOOKS
    public static final String checkNewBookExists = "SELECT COUNT(*) FROM newBooks WHERE title = ?";
    
    //CHECK IF BOOK IS IN BOOKS
    public static final String checkBookExists = "SELECT COUNT(*) FROM BOOKS WHERE title = ?";
    
    //GET QUANTITY OF BOOK
    public static final String getQuantity = "SELECT QUANTITY FROM BOOKS WHERE TITLE = ?";
    
   
}
