/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryManagementProject.factory;

/**
 *
 * @author 1982228,emmas
 */
public class HardCover implements Book{
    private String sn;
    private String title;
    private String author;
    private String publisher;
    private double price;
    private int quantity;
    private int issued;
    private String addedDate;

    @Override
    public String getType() {
        return "Hardcover";
    }

    public HardCover() {}

    public HardCover(String sn, String title, String author, String publisher, double price, int quantity, int issued, String addedDate) {
        this.sn = sn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.quantity = quantity;
        this.issued = issued;
        this.addedDate = addedDate;
    }

    @Override
    public String getSN() {
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

    @Override
    public String getAddedDate() {
        return addedDate;
    }
    
}
