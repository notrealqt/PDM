package main;

import DataAccessObject.*;

public class RestaurangtManagementSystem {
    public static void main(String[] args) {
        // Initialize the database connection
        new tables();

        // Create an instance of the login screen
        new Signup().setVisible(true);;
        
    }
    
}
