/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccessObject;
import java.sql.*;
/**
 *
 * @author USER
 */
public class ConnectionProvider {
    public static Connection getCon() {
        try {
            Class.forName("com.mysql.jbdc.Driver");
            Connection con = DriverManager.getConnection("jbdc:mysql://localhost:3306/rms?useSSL=false", "root", "01102000");
            return con;
        }
        catch ( Exception e) {
            return null;
        }
    }
}
