package DataAccessObject;

import model.User;

public class UserDao {
    public static void save(User user) {
        String query = "insert into user ( name, email, mobileNumber, address, password, securityQuestion, answer, status) values('"+user.getName()+"','"+user.getEmail()+"', '"+user.getMobileNumber()+"', '"+user.getAddress()+"', '"+user.getPassword()+"', '"+user.getSecurityQuestion()+"', '"+user.getAnswer()+"', 'false')";    
        DbOperation.setDataOrDelete(query, "Register Successfully! Wait for Admin Approval!");
    }
}
