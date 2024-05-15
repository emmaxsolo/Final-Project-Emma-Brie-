package LibraryManagementProject.factory;

/**
 *
 * @author 1982228,emmas
 */
public class Paperback implements Book {
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
        return "Paperback";
    }

    public Paperback() {
        
    }

    public Paperback(String sn, String title, String author, String publisher, double price, int quantity, int issued, String addedDate) {
        this.sn = sn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.quantity = quantity;
        this.issued = issued;
        this.addedDate = addedDate;
    }
    
    public Paperback(String sn, String title, String author, String publisher, double price, int quantity) {
        this.sn = sn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.quantity = quantity;
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
