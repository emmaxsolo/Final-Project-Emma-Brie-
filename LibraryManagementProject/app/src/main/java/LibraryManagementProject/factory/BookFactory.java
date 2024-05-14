package LibraryManagementProject.factory;

/**
 *
 * @author 1982228,emmas
 */
public class BookFactory {

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

}
