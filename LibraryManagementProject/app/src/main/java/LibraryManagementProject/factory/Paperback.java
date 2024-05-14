/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryManagementProject.factory;

/**
 *
 * @author 1982228,emmas
 */
public class Paperback implements Book {
     private int sN;
    private String title;
    private String author;
    private String publisher;
    private double price;
    private int qte;
    private int qteIssued;
    
    @Override
    public String getType() {
        return "PaperBack";
    }

    public Paperback() {
    }

    public Paperback(int sN, String title, String author, String publisher, double price,int qte, int qteIssued) {
        this.sN = sN;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.qte = qte;
        this.qteIssued = qteIssued;
    }

   

     
    @Override
    public int getSN() {
        return sN;
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
        return qte;
    }

    @Override
    public int getQteIssued() {
        return qteIssued;
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
