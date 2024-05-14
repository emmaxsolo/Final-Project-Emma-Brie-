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

    public BookFactory() {
    }
        
      public Book createBook(char c, int sn,String title,String author,String publisher, double price, int quantity, int issued) {
        switch(c) {
            case 'E' -> {
                return new EBook(sn, title, author, publisher,price,quantity,issued);
              }
            case 'H' -> {
                return new HardCover(sn, title, author, publisher,price,quantity,issued);
              }
            case 'P' -> {
                return new Paperback(sn, title, author, publisher,price,quantity,issued);
              }
            default -> throw new IllegalArgumentException("Invalid book type: " + c);
        }
    }
}
