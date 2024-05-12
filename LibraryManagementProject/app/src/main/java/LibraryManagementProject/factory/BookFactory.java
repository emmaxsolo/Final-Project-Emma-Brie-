/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryManagementProject.factory;
/**
 *
 * @author 1982228,emmas
 */
public class BookFactory {
    
      public Book createBook(char c, int sN, String title, String publisher, boolean isBookAvailable) {
        switch(c) {
            case 'E' -> {
                return new EBook(sN, title, publisher, isBookAvailable);
              }
            case 'H' -> {
                return new HardCover(sN, title, publisher, isBookAvailable);
              }
            case 'P' -> {
                return new Paperback(sN, title, publisher, isBookAvailable);
              }
            default -> throw new IllegalArgumentException("Invalid book type: " + c);
        }
    }
}
