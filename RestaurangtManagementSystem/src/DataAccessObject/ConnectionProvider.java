package DataAccessObject;
import java.sql.*;

public class ConnectionProvider {
    public static Connection getCon() {
        try {
            String user = "root";
            String password = "01102000";
            String url = "jdbc:mysql://localhost:3306/rms";
            Connection con = DriverManager.getConnection(url, user, password);
            return con;
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
