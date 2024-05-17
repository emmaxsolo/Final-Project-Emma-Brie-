package LibraryManagementProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseInitializer {
    private static DatabaseInitializer instance;
    private Connection connection;
    private final String url = "jdbc:sqlite:ourdatabase.db";

    private DatabaseInitializer() {
        establishConnection();
    }

    public static synchronized DatabaseInitializer getInstance() {
        if (instance == null) {
            instance = new DatabaseInitializer();
        }
        return instance;
    }

    public Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                establishConnection();
            }
        } catch (SQLException e) {
            System.err.println("Failed to re-establish connection: " + e.getMessage());
        }
        return connection;
    }
    
     private void establishConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(url);
                initializeDatabase();
            }
        } catch (SQLException e) {
            System.err.println("Error connecting to the database: " + e.getMessage());
            throw new RuntimeException("Error connecting to the database", e);
        }
    }

    private void initializeDatabase() {
        try (Statement stmt = connection.createStatement()) {
            
            stmt.execute("CREATE TABLE IF NOT EXISTS Librarians (" +
                    "librarian_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "username TEXT NOT NULL UNIQUE, " +
                    "password TEXT NOT NULL);");

            stmt.execute("CREATE TABLE IF NOT EXISTS Students (" +
                    "student_id INTEGER PRIMARY KEY, " +
                    "student_name TEXT NOT NULL, " +
                    "contact_number TEXT NOT NULL, " +
                    "username TEXT, " +
                    "password TEXT, " +
                    "added_by_librarian INTEGER, " +
                    "is_approved_by_librarian BOOLEAN, " +
                    "FOREIGN KEY (added_by_librarian) REFERENCES Librarians(librarian_id));");

            stmt.execute("CREATE TABLE IF NOT EXISTS Books (" +
                    "SN TEXT PRIMARY KEY, " +
                    "title TEXT NOT NULL, " +
                    "author TEXT NOT NULL, " +
                    "publisher TEXT NOT NULL, " +
                    "price REAL NOT NULL, " +
                    "quantity INTEGER NOT NULL, " +
                    "issued INTEGER NOT NULL DEFAULT 0, " +
                    "addedDate TEXT NOT NULL, " +
                    "type CHAR(1) NOT NULL);");

            stmt.execute("CREATE TABLE IF NOT EXISTS IssuedBooks (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "SN TEXT NOT NULL, " +
                    "StId TEXT NOT NULL, " +
                    "IssueDate TEXT NOT NULL, " +
                    "FOREIGN KEY (SN) REFERENCES Books(SN), " +
                    "FOREIGN KEY (StId) REFERENCES Students(student_id));");

            System.out.println("Tables updated.");
        } catch (SQLException e) {
            System.err.println("Error creating tables: " + e.getMessage());
        }
    }

    public static void closeConnection() {
        try {
            if (instance != null && instance.connection != null) {
                instance.connection.close();
                instance = null;
            }
        } catch (SQLException e) {
            System.err.println("Error closing the database connection: " + e.getMessage());
        }
    }
}
