package DataAccessObject;

import javax.swing.JOptionPane;
import java.sql.*;

public class tables {
    public tables() {
        try {
            Connection con1 = ConnectionProvider.getCon_initial();
            Statement st = con1.createStatement();
            st.executeUpdate("CREATE SCHEMA IF NOT EXISTS rms");

            // Create tables
            String userTableQuery = "CREATE TABLE IF NOT EXISTS rms.user("
                                    + "id INT AUTO_INCREMENT PRIMARY KEY, "
                                    + "name VARCHAR(200) UNIQUE, "
                                    + "email VARCHAR(200) UNIQUE, "
                                    + "mobileNumber VARCHAR(10), "
                                    + "address VARCHAR(200), "
                                    + "password VARCHAR(200), "
                                    + "securityQuestion VARCHAR(200), "
                                    + "answer VARCHAR(200), "
                                    + "status VARCHAR(200))";

            String categoryTable = "CREATE TABLE IF NOT EXISTS rms.category("
                                    +"id INT AUTO_INCREMENT PRIMARY KEY,"
                                    +"name VARCHAR(200))";
            
            String productTable = "CREATE TABLE IF NOT EXISTS rms.product("
                                    +"id INT AUTO_INCREMENT PRIMARY KEY,"
                                    +"name VARCHAR(200),"
                                    +"category VARCHAR(200),"
                                    +"price DECIMAL(10, 2),"
                                    +"UNIQUE(name, category),"
                                    +"Category_ID INT,"
                                    +"FOREIGN KEY (Category_ID) REFERENCES rms.category(id))";  
            
            String billTable = "CREATE TABLE IF NOT EXISTS rms.bill("
                                +"id INT PRIMARY KEY,"
                                +"name VARCHAR(200),"
                                +"mobileNumber VARCHAR(200),"
                                +"email VARCHAR(200),"
                                +"date VARCHAR(50),"
                                +"total VARCHAR(200),"
                                +"SellerID INT,"
                                +"FOREIGN KEY (SellerID) REFERENCES rms.user(id))";
            
            String Bill_ProductTable = "CREATE TABLE IF NOT EXISTS rms.Bill_Product ("
                                +"BillID INT,"
                                +"ProductID INT,"
                                +"FOREIGN KEY (BillID) REFERENCES rms.bill(id) ON DELETE NO ACTION,"
                                +"FOREIGN KEY (ProductID) REFERENCES rms.product(id) ON DELETE NO ACTION)";

            // Create tables
            DbOperation.setDataOrDelete(userTableQuery, "User Table Added Successfully");
            DbOperation.setDataOrDelete(categoryTable, "Category Table Created Successfully");
            DbOperation.setDataOrDelete(productTable, "Product Table Created Successfully");
            DbOperation.setDataOrDelete(billTable, "Bill Table Created Successfully");

            // Insert admin details
            String adminDetailsQuery = "INSERT INTO rms.user(name, email, mobileNumber, address, password, securityQuestion, answer, status) "
                                     + "VALUES('Admin', 'admin@gmail.com', '1234567890', 'Vietnam', 'admin', 'What school?', 'IU', 'true')";
            String soldOutCategoryQuery = "INSERT INTO rms.category(name) VALUES ('Sold out')";                         
            DbOperation.setDataOrDelete(adminDetailsQuery, "Admin Details Added Successfully");
            DbOperation.setDataOrDelete(soldOutCategoryQuery, "Category Added Successfully");
            // Create Bill_Product table
            DbOperation.setDataOrDelete(Bill_ProductTable, "Bill_Product Table Added Successfully");

            JOptionPane.showMessageDialog(null, "User table and Admin details initialized successfully.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error initializing user table and admin details: " + e.getMessage());
        }
    }
}

