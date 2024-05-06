/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import DataAccessObject.ConnectionProvider;
import DataAccessObject.tables;
import UI.Login;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class RestaurangtManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        adminExists(args);
    }
     private static void adminExists(String[] args) {
        try {
            Connection con = ConnectionProvider.getCon();
            if (con != null) {
                Login login = new Login();
                login.setVisible(true);
            } else {
                new tables();
                Login login = new Login();
                login.setVisible(true);
            }
        } catch (Exception e) {
        }
    }
}
