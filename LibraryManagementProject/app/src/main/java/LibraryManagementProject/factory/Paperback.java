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
    private String publisher;
    private boolean isBookAvailable;
    
    @Override
    public String getType() {
        return "PaperBack";
    }

    public Paperback() {
    }

    public Paperback(int sN, String title, String publisher,boolean isBookAvailable) {
        this.sN = sN;
        this.title = title;
        this.publisher = publisher;
        this.isBookAvailable = isBookAvailable;
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
    
    
}
