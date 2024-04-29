/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package LibraryManagementProject.dao;

import LibraryManagementProject.models.User;
import LibraryManagementProject.models.Librarian;
import LibraryManagementProject.models.Student;
import java.sql.SQLException;

/**
 *
 * @author bridj
 */
public interface UserDAO {

    User findUserByUsername(String username) throws SQLException;

    boolean createUser(User user) throws SQLException;

    boolean updateUser(User user) throws SQLException;

    boolean deleteUser(User user) throws SQLException;
    
    
}
