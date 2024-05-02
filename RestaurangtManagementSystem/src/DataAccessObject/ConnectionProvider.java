package DataAccessObject;
import java.sql.*;

public class ConnectionProvider {
    public static Connection getCon() {
        try {
            String user = "root";
            String url = "jdbc:mysql://localhost:3306/rms";
            
            //String password = "01102000";
            String password = "VLNVLTT112702t18@";

            Connection con = DriverManager.getConnection(url, user, password);
            return con;
        }
        catch (Exception e) {
            return null;
        }
    }
    public static Connection getCon_initial() {
        try {
            String user = "root";
            String url = "jdbc:mysql://localhost:3306";
            
            //String password = "01102000";
            String password = "VLNVLTT112702t18@";

            Connection con = DriverManager.getConnection(url, user, password);
            return con;
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
