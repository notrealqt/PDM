package DataAccessObject;

import java.sql.*;
import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;
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

    public static ArrayList<User> getAllRecords(String email) {
        ArrayList<User> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DbOperation.getData("select * from user where email like '%"+email+"%' ");
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName (rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setMobileNumber(rs.getString("mobileNumber"));
                user.setAddress(rs.getString("address"));
                user.setSecurityQuestion(rs.getString("securityQuestion"));
                user.setStatus(rs.getString("status"));
                arrayList.add(user);

            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
        return arrayList;

    }

    public static void changeStatus(String email, String status) {
        String query = "update user set status = '"+status+"' where email = '"+email+"' ";
        DbOperation.setDataOrDelete(query, "Status Changed Successfully");
    }

    public static void ChangePassword( String email, String oldPassword, String newPassword) {
        try {
            ResultSet rs = DbOperation.getData("select * from user where email = '"+email+"' and password = '"+oldPassword+"' ");
            if (rs.next()) {
                update(email, newPassword);
            }
            else {
                JOptionPane.showMessageDialog(null, "Old password is wrong");
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public static void ChangeSecurityQuestion(String email, String password, String securityQuestion, String answer) {
        try {
            ResultSet rs = DbOperation.getData("select * from user where email = '"+email+"' and password = '"+password+"'  ");
            if (rs.next()) {
                update(email, securityQuestion, answer);
            }   
            else {
                JOptionPane.showMessageDialog(null, "Password is wrong");
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public static void update(String email, String securityQuestion, String answer) {
        String query = "update user set securityQuestion = '"+securityQuestion+"', answer = '"+answer+"' where email = '"+email+"' ";
        DbOperation.setDataOrDelete(query, "Security Question Changed Successfully");
    }
}
