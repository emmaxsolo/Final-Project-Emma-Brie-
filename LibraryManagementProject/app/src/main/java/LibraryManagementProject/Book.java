/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryManagementProject;


import java.util.Map;

/**
 *
 * @author emmas
 */
public class Book {
    private int sn;
    private String title;
    private String author;
    private String publisher;
    private double price;
    private int qte;
    private int issuedQte;
    private String dateOfPurchase;

    public Book(int sn, String title, String author, String publisher, double price, int qte, int issuedQte, String dateOfPurchase) {
        this.sn = sn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.qte = qte;
        this.issuedQte = issuedQte;
        this.dateOfPurchase = dateOfPurchase;
    }
    
    public void addBook(Book book){
        //Adds it to th edatabase
    }
    
    public boolean issueBook(Book book, Student student){
        return false;
    }
    
    public boolean returnBook(Book book, Student student){
        return false;
    }
    
    public static Map<String,String> viewCatalog(){
        return null;
    }
    
    public static Map<String,String> viewIssuedBooks(){
        return null;
    }

    public int getSn() {
        return sn;
    }

    public void setSn(int sn) {
        this.sn = sn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public int getIssuedQte() {
        return issuedQte;
    }

    public void setIssuedQte(int issuedQte) {
        this.issuedQte = issuedQte;
    }

    public String getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(String dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }
    
}
