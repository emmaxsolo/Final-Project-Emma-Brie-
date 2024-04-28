package LibraryManagementProject;

/**
 *
 * @author bridj
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseInitializer {

    private static final String url = "jdbc:sqlite:database.db";
    private static Connection connection = null;

    private DatabaseInitializer() {
        // private empty constructor to prevent multiple instances of the databases
    }
    
    /**
     * Function: Instantiate the database connection using singleton pattern and applying thread-safety.
     * It throws an exception if there is an error to establish a connection with the database.
     * @return the connected database
     */
    public static Connection getConnection() {
        if (connection == null) {
            synchronized (DatabaseInitializer.class) { // enable multithreading and allowing synchronization
                if (connection == null) {
                    try {
                        connection = DriverManager.getConnection(url); // try to connect via the jdbc database path
                    } catch (SQLException e) {
                        e.printStackTrace();
                        throw new RuntimeException("Error: Cannot connect to database", e);
                    }
                }
            }
        }
        return connection;
    }

    /**
     * Function: Initialize our database and creating the database tables for Users, Students, Books, IssuedBooks
     * It throws an error if it can not create a database using the tables provided.
     */
    public static void initializeDatabase() {
        Connection connect = getConnection();
        try (Statement stmt = connect.createStatement()) {

            stmt.execute("CREATE TABLE IF NOT EXISTS Users("
                    + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "username TEXT NOT NULL UNIQUE,"
                    + "password TEXT NOT NULL,"
                    + "role TEXT NOT NULL CHECK(role IN('Librarian', 'Student'))" + ");"
            );

            stmt.execute("CREATE TABLE IF NOT EXISTS Students("
                    + "studentID TEXT PRIMARY KEY"
                    + "studentName TEXT NOT NULL,"
                    + "contactNumber TEXT NOT NULL" + ");"
            );

            stmt.execute("CREATE TABLE IF NOT EXISTS Books("
                    + "SN TEXT PRIMARY KEY,"
                    + "title TEXT NOT NULL,"
                    + "author TEXT NOT NULL,"
                    + "publisher TEXT NOT NULL,"
                    + "price REAL NOT NULL,"
                    + "quanity INTEGER NOT NULL,"
                    + "issued INTEGER NOT NULL DEFAULT 0,"
                    + "addedDate INTEGER TEXT NOT NULL"
                    + ");"
            );

            stmt.execute("CREATE TABLE IF NOT EXISTS IssuedBooks ("
                    + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "SN TEXT NOT NULL,"
                    + "StId TEXT NOT NULL,"
                    + "IssueDate TEXT NOT NULL,"
                    + "FOREIGN KEY (SN) REFERENCES Books(SN),"
                    + "FOREIGN KEY (stID) REFERENCES Students(studentID)"
                    + ");");

            System.out.println("Tables created successfully.");
        } catch (SQLException e) {
            System.err.println("Error creating tables: " + e.getMessage());
        }
    }

    /**
     * Function: To close the database connection.
     */
    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                connection = null;
            } catch (SQLException e) {
                System.err.println("Error closing the database connection: " + e.getMessage());
            }
        }
    }
}

