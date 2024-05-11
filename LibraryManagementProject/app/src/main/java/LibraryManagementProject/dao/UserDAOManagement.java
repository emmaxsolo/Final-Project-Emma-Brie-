/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryManagementProject.dao;
import LibraryManagementProject.models.Librarian;
import LibraryManagementProject.models.Student;
import LibraryManagementProject.models.User;
import java.sql.*;
/**
 *
 * @author bridj
 */
public class UserDAOManagement implements UserDAO {
     private Connection connection;

    public UserDAOManagement(Connection connection) {
        this.connection = connection;
    }

    @Override
    public User findUserByUsername(String username) throws SQLException {
        String query = "SELECT * FROM Users WHERE username = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return new User(
                        resultSet.getInt("id"),
                        resultSet.getString("username"),
                        resultSet.getString("password"),
                        resultSet.getString("role")
                );
            }
            return null;
        }
    }

    @Override
    public boolean createUser(User user) throws SQLException {
        String query = "INSERT INTO Users(username, password, role) VALUES(?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getRole());
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;
        }
    }

    @Override
    public boolean updateUser(User user) throws SQLException {
        String query = "UPDATE Users SET username = ?, password = ?, role = ? WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getRole());
            preparedStatement.setInt(4, user.getId());
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;
        }
    }

    @Override
    public boolean deleteUser(User user) throws SQLException {
        String query = "DELETE FROM Users WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, user.getId());
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;
        }
    }

    @Override
    public Librarian findLibrarianByID(int librarianID) throws SQLException {
        String query = "SELECT * FROM Librarians WHERE librarianID = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, librarianID);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return new Librarian(
                        librarianID,
                        resultSet.getString("librarianName"),
                        resultSet.getString("password"),
                        "Librarian"
                );
            }
            return null;
        }
    }

    @Override
    public Student findStudentByID(int studentID) throws SQLException {
        String query = "SELECT * FROM Students WHERE studentID = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, studentID);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return new Student(
                        studentID,
                        resultSet.getString("studentName"),
                        resultSet.getString("password"),
                        "Student"
                );
            }
            return null;
        }
    }

    @Override
    public boolean createLibrarian(Librarian librarian) throws SQLException {
        String userInsertQuery = "INSERT INTO Users(username, password, role) VALUES(?, ?, ?)";
        String librarianInsertQuery = "INSERT INTO Librarians(librarianID, librarianName) VALUES(?, ?)";

        try (PreparedStatement userStatement = connection.prepareStatement(userInsertQuery, Statement.RETURN_GENERATED_KEYS);
             PreparedStatement librarianStatement = connection.prepareStatement(librarianInsertQuery)) {

            // Insert into Users table
            userStatement.setString(1, librarian.getUsername());
            userStatement.setString(2, librarian.getPassword());
            userStatement.setString(3, librarian.getRole());
            int userRowsAffected = userStatement.executeUpdate();

            // Check if Users insertion was successful
            if (userRowsAffected > 0) {
                ResultSet generatedKeys = userStatement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    librarian.setId(generatedKeys.getInt(1));
                }

                // Insert into Librarians table
                librarianStatement.setInt(1, librarian.getLibrarianID());
                librarianStatement.setString(2, librarian.getLibrarianName());
                return librarianStatement.executeUpdate() > 0;
            }
            return false;
        }
    }

    @Override
    public boolean createStudent(Student student) throws SQLException {
    String userInsertQuery = "INSERT INTO Users(username, password, role) VALUES(?, ?, ?)";
    String studentInsertQuery = "INSERT INTO Students(studentID, studentName, contactNumber) VALUES(?, ?, ?)";

    try (PreparedStatement userStatement = connection.prepareStatement(userInsertQuery, Statement.RETURN_GENERATED_KEYS);
         PreparedStatement studentStatement = connection.prepareStatement(studentInsertQuery)) {

        userStatement.setString(1, student.getUsername());
        userStatement.setString(2, student.getPassword());
        userStatement.setString(3, student.getRole());
        int userRowsAffected = userStatement.executeUpdate();

        if (userRowsAffected > 0) {
            ResultSet generatedKeys = userStatement.getGeneratedKeys();
            if (generatedKeys.next()) {
                student.setId(generatedKeys.getInt(1));
            }

            studentStatement.setInt(1, student.getStudentID());
            studentStatement.setString(2, student.getStudentName());
            studentStatement.setString(3, student.getContactNumber());
            return studentStatement.executeUpdate() > 0;
        }

        return false;
        }
    }
}
