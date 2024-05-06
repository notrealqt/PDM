package DataAccessObject;

import javax.swing.JOptionPane;
import java.sql.*;

public class tables {
    public tables() {
        try {
            // Drop existing database if it exists
            Connection con1 = ConnectionProvider.getCon();
            Statement dropDbStatement = con1.createStatement();
            dropDbStatement.executeUpdate("DROP DATABASE IF EXISTS rms");

            // Create new database
            Statement createDbStatement = con1.createStatement();
            createDbStatement.executeUpdate("CREATE DATABASE rms");

            // Create schema
            Connection con2 = ConnectionProvider.getCon();
            Statement createSchemaStatement = con2.createStatement();
            createSchemaStatement.executeUpdate("CREATE SCHEMA IF NOT EXISTS rms");

            // Create user table
            Connection con3 = ConnectionProvider.getCon();
            Statement st = con3.createStatement();
            String userTableQuery = "CREATE TABLE IF NOT EXISTS rms.user("
                                    + "id INT AUTO_INCREMENT PRIMARY KEY, "
                                    + "name VARCHAR(200), "
                                    + "email VARCHAR(200) UNIQUE, "
                                    + "mobileNumber VARCHAR(10), "
                                    + "address VARCHAR(200), "
                                    + "password VARCHAR(200), "
                                    + "securityQuestion VARCHAR(200), "
                                    + "answer VARCHAR(200), "
                                    + "status VARCHAR(200))";
                                    
            String categoryTable = "CREATE TABLE IF NOT EXISTS rms.category(id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(200))";
            String productTable = "CREATE TABLE IF NOT EXISTS rms.product(id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(200), category VARCHAR(200), price DECIMAL(10, 2), UNIQUE(name, category))";            
            String billTable = "CREATE TABLE IF NOT EXISTS rms.bill(id INT PRIMARY KEY, name VARCHAR(200), mobileNumber VARCHAR(200), email VARCHAR(200), date VARCHAR(50), total VARCHAR(200),SellerId INT, FOREIGN KEY (SellerId) REFERENCES rms.user(id))";
            String Bill_ProductTable = "CREATE TABLE IF NOT EXISTS rms.Bill_Product(BillID INT, FOREIGN KEY (BillID) REFERENCES rms.bill(id), ProductID INT, FOREIGN KEY (ProductID) REFERENCES rms.product(id))";
            
            DbOperation.setDataOrDelete(userTableQuery, "User Table Added Successfully");
            DbOperation.setDataOrDelete(categoryTable, "Category Table Created Successfully");
            DbOperation.setDataOrDelete(productTable, "Product Table Created Successfully");
            DbOperation.setDataOrDelete(billTable, "Bill Table Created Successfully");

            String adminDetailsQuery = "INSERT INTO rms.user(name, email, mobileNumber, address, password, securityQuestion, answer, status) "
                                     + "VALUES('Admin', 'admin@gmail.com', '1234567890', 'Vietnam', 'admin', 'What school?', 'IU', 'true')";
                                     
            DbOperation.setDataOrDelete(adminDetailsQuery, "Admin Details Added Successfully");
            DbOperation.setDataOrDelete(Bill_ProductTable, "Bill_Product Table Added Successfully");
            JOptionPane.showMessageDialog(null, "User table and Admin details initialized successfully.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error initializing user table and admin details: " + e.getMessage());
        }
    }
}
