package DataAccessObject;

import java.sql.*;

import javax.swing.JOptionPane;

import model.User;

public class UserDao {
    public static void save(User user) {
        String query = "insert into user ( name, email, mobileNumber, address, password, securityQuestion, answer, status) values('"+user.getName()+"','"+user.getEmail()+"', '"+user.getMobileNumber()+"', '"+user.getAddress()+"', '"+user.getPassword()+"', '"+user.getSecurityQuestion()+"', '"+user.getAnswer()+"', 'false')";    
        DbOperation.setDataOrDelete(query, "Register Successfully! Wait for Admin Approval!");
    }

public static User logIn(String email, String password) {
    User user = null;
    try {
        String query = "SELECT * FROM user WHERE email = '"+email+"' AND password = '"+password+"' ";
        System.out.println("Query: " + query); // Print the query for debugging
        ResultSet rs = DbOperation.getData(query);
        if (rs.next()) {
            user = new User();
            user.setStatus(rs.getString("status"));
            System.out.println("User status: " + user.getStatus()); // Print user status for debugging
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e, "Message", JOptionPane.ERROR_MESSAGE);
    }
    return user;
}

    public static User getSecurityQuestion (String email) {
        User user = null;
        try {
            ResultSet rs = DbOperation.getData("Select * from user where email = '"+email+ "' ");
            while (rs.next() ) {
                user = new User();
                user.setSecurityQuestion(rs.getString("securityQuestion"));
                user.setAnswer(rs.getString("answer"));
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
            
        }
        return user;
    }

    public static void update(String email, String newPassword) {
        String query = "update user set password = '"+newPassword+"' where email = '"+email+"'  ";
        DbOperation.setDataOrDelete(query, "Password changed successfully");
    }
}
