package DataAccessObject;
import javax.swing.JOptionPane;

public class tables {
    public static void main(String[] args) {
        try{
            String userTable = "create table user(id int AUTO_INCREMENT primary key, name varchar(200), email varchar (200) , mobileNumber varchar(10), address varchar(200),password varchar (200), securityQuestion varchar (200), answer varchar(200), status varchar (200), UNIQUE (email))";
            DbOperation.setDataOrDelete(userTable, "User Table Created Successfully");
        }
        catch ( Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }
}
