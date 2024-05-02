package DataAccessObject;

import javax.swing.JOptionPane;
import java.sql.*;
public class tables {
    public static void main(String[] args) {
        try {
            // Create user table
            Connection con1 = ConnectionProvider.getCon_initial();
            Statement st = con1.createStatement();
            st.executeUpdate("CREATE SCHEMA rms");
            String userTableQuery = "CREATE TABLE IF NOT EXISTS user("
                                    + "id INT AUTO_INCREMENT PRIMARY KEY, "
                                    + "name VARCHAR(200), "
                                    + "email VARCHAR(200) UNIQUE, "
                                    + "mobileNumber VARCHAR(10), "
                                    + "address VARCHAR(200), "
                                    + "password VARCHAR(200), "
                                    + "securityQuestion VARCHAR(200), "
                                    + "answer VARCHAR(200), "
                                    + "status VARCHAR(200))";
            String categoryTable = "create table category(id int AUTO_INCREMENT primary key, name varchar(200) )";
            String productTable = "create table product(id int AUTO_INCREMENT primary key, name varchar(200), category varchar(200), price varchar(200))";
            DbOperation.setDataOrDelete(userTableQuery, "User Table Created Successfully");
            String billTable = "create table bill(id int primary key, name varchar(200), mobileNumber varchar(200), email varchar(200), date varchar(50), total varchar(200), createdBy varchar(200))";
            String adminDetailsQuery = "INSERT INTO user(name, email, mobileNumber, address, password, securityQuestion, answer, status) "
                                     + "VALUES('Admin', 'admin@gmail.com', '1234567890', 'Vietnam', 'admin', 'What school?', 'IU', 'true')";
            DbOperation.setDataOrDelete(adminDetailsQuery, "Admin Details Added Successfully");
            DbOperation.setDataOrDelete(categoryTable, "Category Table Created Successfully");
            DbOperation.setDataOrDelete(productTable, "Product Table Created Successfully");
            DbOperation.setDataOrDelete(billTable, "Bill Table Created Successfully");
            JOptionPane.showMessageDialog(null, "User table and Admin details initialized successfully.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error initializing user table and admin details: " + e.getMessage());
        }
    }
}
