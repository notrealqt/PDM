package DataAccessObject;
import java.sql.*;
//Change both password in getcon and getCon_initial
public class ConnectionProvider {
    static String user = "root";
    static String url = "jdbc:mysql://localhost:3306/rms";
    static String url2 = "jdbc:mysql://localhost:3306";
    static String password = "VLNVLTT112702t18@";
    static String passwordHost = "Fbq9AhjIdg";
    //static String password = "01102000";
    public static Connection getCon() {
        try {            
            Connection con = DriverManager.getConnection(url, user, password);
            return con;
        }
        catch (Exception e) {
            return null;
        }
    }
    public static Connection getCon_initial() {
        try {            
            Connection con = DriverManager.getConnection(url2, user, password);
            return con;
        }
        catch (Exception e) {
            return null;
        }
    }
}
