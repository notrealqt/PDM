package DataAccessObject;

import javax.swing.JOptionPane;
import java.sql.*;

public class tables {
    public tables() {
        try {
           // Drop existing database if it exists
            Connection con1 = ConnectionProvider.getCon_initial();
            Statement st = con1.createStatement();
            st.executeUpdate("CREATE SCHEMA rms");
            //Connection con1 = ConnectionProvider.getCon();
            //Statement st = con1.createStatement();
            //st.executeUpdate("DROP DATABASE IF EXISTS rms");
            //st.executeUpdate("CREATE SCHEMA rms");
            /*// Create new database
            Statement createDbStatement = con1.createStatement();
            createDbStatement.executeUpdate("CREATE DATABASE rms");

            // Create schema
            Connection con2 = ConnectionProvider.getCon();
            Statement createSchemaStatement = con2.createStatement();
            createSchemaStatement.executeUpdate("CREATE SCHEMA IF NOT EXISTS rms");

            // Create user table
            Connection con3 = ConnectionProvider.getCon();
            Statement st = con3.createStatement();*/
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
                                    
            String categoryTable = "create table category(id int AUTO_INCREMENT primary key, name varchar(200) )";
            String productTable = "create table product(id int AUTO_INCREMENT primary key, name varchar(200), category varchar(200), price DECIMAL(10, 2), UNIQUE(name, category))";            
            String billTable = "create table bill(id int primary key, name varchar(200), mobileNumber varchar(200), email varchar(200), date varchar(50), total varchar(200),SellerId INT, FOREIGN KEY (SellerId) REFERENCES user(id))";
            String Bill_ProductTable = "create table Bill_Product(BillID INT, FOREIGN KEY (BillID) REFERENCES bill(id), ProductID INT, FOREIGN KEY (ProductID) REFERENCES product(id))ON DELETE NO ACTION";
            
            DbOperation.setDataOrDelete(userTableQuery, "User Table Added Successfully");
            DbOperation.setDataOrDelete(categoryTable, "Category Table Created Successfully");
            DbOperation.setDataOrDelete(productTable, "Product Table Created Successfully");
            DbOperation.setDataOrDelete(billTable, "Bill Table Created Successfully");

            String adminDetailsQuery = "INSERT INTO user(name, email, mobileNumber, address, password, securityQuestion, answer, status) "
                                     + "VALUES('Admin', 'admin@gmail.com', '1234567890', 'Vietnam', 'admin', 'What school?', 'IU', 'true')";
                                     
            DbOperation.setDataOrDelete(adminDetailsQuery, "Admin Details Added Successfully");
            DbOperation.setDataOrDelete(Bill_ProductTable, "Bill_Product Table Added Successfully");
            JOptionPane.showMessageDialog(null, "User table and Admin details initialized successfully.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error initializing user table and admin details: " + e.getMessage());
        }
    }
}
