package LibraryManagementProject.factory;

/**
 *
 * @author 1982228,emmas
 */
public class BookFactory {

    /**
     * Creates a new Book instance based on the provided parameters.
     * @param sn
     * @param title
     * @param author
     * @param publisher
     * @param price
     * @param quantity
     * @param issued
     * @param addedDate
     * @param type
     * @return Book
     */
    public Book createBook(String sn, String title, String author, String publisher, double price, int quantity, int issued, String addedDate, char type) {
        switch (type) {
            case 'E':
                return new EBook(sn, title, author, publisher, price, quantity, issued, addedDate);
            case 'H':
                return new HardCover(sn, title, author, publisher, price, quantity, issued, addedDate);
            case 'P':
                return new Paperback(sn, title, author, publisher, price, quantity, issued, addedDate);
            default:
                throw new IllegalArgumentException("Invalid book type: " + type);
        }
    }
    /**
     * Allows user to see Book object and all of its information.
     * @param sn
     * @param title
     * @param author
     * @param publisher
     * @param price
     * @param quantity
     * @param type
     * @return 
     */
    public Book viewBook(String sn, String title, String author, String publisher, double price, int quantity, char type) {
        switch (type) {
            case 'E':
                return new EBook(sn, title, author, publisher, price, quantity);
            case 'H':
                return new HardCover(sn, title, author, publisher, price, quantity);
            case 'P':
                return new Paperback(sn, title, author, publisher, price, quantity);
            default:
                throw new IllegalArgumentException("Invalid book type: " + type);
        }
    }

}
