/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryManagementProject.factory;

/**
 *
 * @author 1982228,emmas
 */
public class EBook implements Book {
    private int sn;
    private String title;
    private String author;
    private String publisher;
    private double price;
    private int quantity;
    private int issued;
    
    @Override
    public String getType() {
        return "EBook";
    }

    public EBook() {
    }

    public EBook(int sn,String title,String author,String publisher, double price, int quantity, int issued) {
        this.sn = sn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.quantity = quantity;
        this.issued = issued;
    }

   
    @Override
    public int getSN() {
        return sn;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getPublisher() {
        return publisher;
    }

    

    @Override
    public int getQte() {
        return quantity;
    }

    @Override
    public int getQteIssued() {
        return issued;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getAuthor() {
       return author;
    }
    
}
