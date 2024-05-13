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
    private int sN;
    private String title;
    private String publisher;
    private boolean isBookAvailable;
    private int qte;
    private int qteIssued;
    
    @Override
    public String getType() {
        return "EBook";
    }

    public EBook() {
    }

    public EBook(int sN, String title, String publisher, boolean isBookAvailable,int qte, int qteIssued) {
        this.sN = sN;
        this.title = title;
        this.publisher = publisher;
        this.isBookAvailable = isBookAvailable;
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
    public boolean isAvailable() {
        return isBookAvailable;
    }

    @Override
    public int getQte() {
        return qte;
    }

    @Override
    public int getQteIssued() {
        return qteIssued;
    }
    
}
