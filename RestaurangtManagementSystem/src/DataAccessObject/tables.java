package DataAccessObject;

import javax.swing.JOptionPane;

public class tables {
    public static void main(String[] args) {
        try {
            // Create user table
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
            DbOperation.setDataOrDelete(userTableQuery, "User Table Created Successfully");

            // Insert initial admin details
            String adminDetailsQuery = "INSERT INTO user(name, email, mobileNumber, address, password, securityQuestion, answer, status) "
                                     + "VALUES('Admin', 'admin@gmail.com', '1234567890', 'Vietnam', 'admin', 'What school?', 'IU', 'true')";
            DbOperation.setDataOrDelete(adminDetailsQuery, "Admin Details Added Successfully");

            JOptionPane.showMessageDialog(null, "User table and Admin details initialized successfully.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error initializing user table and admin details: " + e.getMessage());
        }
    }
}
