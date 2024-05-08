/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryManagementProject.factory;

import LibraryManagementProject.models.Book;

/**
 *
 * @author 1982228
 */
public class BookFactory {
    private int SN;
    private String title;
    private String publisher;
    private double price;
    private int qte;
    private int issuedQte;
    private String dateOfPurchase;
    private boolean isBookAvailable;
    private Book book;
    private String bookType;

    public BookFactory(int SN, String title, String publisher, double price, int qte, int issuedQte, String dateOfPurchase, boolean isBookAvailable, Book book, String bookType) {
        this.SN = SN;
        this.title = title;
        this.publisher = publisher;
        this.price = price;
        this.qte = qte;
        this.issuedQte = issuedQte;
        this.dateOfPurchase = dateOfPurchase;
        this.isBookAvailable = isBookAvailable;
        this.book = book;
        this.bookType = bookType;
    }

    public int getSN() {
        return SN;
    }

    public void setSN(int SN) {
        this.SN = SN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public boolean isIsBookAvailable() {
        return isBookAvailable;
    }

    public void setIsBookAvailable(boolean isBookAvailable) {
        this.isBookAvailable = isBookAvailable;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    
    
    
    
   
}
