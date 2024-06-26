package DataAccessObject;

import javax.swing.JOptionPane;
import java.sql.*;
import java.util.ArrayList;
import model.Bill;

public class BillDao {
    public static String getID(){
        int id = 1;
        try{
            ResultSet rs = DbOperation.getData("select max(id) from bill");
            if(rs.next()){
                id = rs.getInt(1);
                id = id + 1;
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return String.valueOf(id);
    }
    
    public static void save(Bill bill){
        String query = "INSERT INTO bill (id, name, mobileNumber, email, date, total, SellerID) VALUES ('" + bill.getId() + "', '" 
                        + bill.getName() + "', '" 
                        + bill.getMobileNumber() + "', '" 
                        + bill.getEmail() + "', '" 
                        + bill.getDate() + "', '" 
                        + bill.getTotal() + "', '" 
                        + bill.getSellerID() + "')";
        DbOperation.setDataOrDelete(query, "Bill Detail Added Successfully");
    }

    public static ArrayList<Bill> getAllRecordsByInc (String date) {
        ArrayList<Bill> arrList = new ArrayList<>();
        try {
            ResultSet rs = DbOperation.getData("select * from bill where date like '%"+date+"%' ");
            while (rs.next()) {
                Bill bill = new Bill();
                bill.setId(rs.getInt("id"));
                bill.setName(rs.getString("name"));
                bill.setMobileNumber(rs.getString("mobileNumber"));
                bill.setEmail(rs.getString("email"));
                bill.setDate(rs.getString("date"));
                bill.setTotal(rs.getString("total"));
                bill.setSellerID(rs.getInt("SellerID"));
                arrList.add(bill);

            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrList;
    }

    public static ArrayList<Bill> getAllRecordsByDesc (String date) {
        ArrayList<Bill> arrList = new ArrayList<>();
        try {
            ResultSet rs = DbOperation.getData("select * from bill where date like '%"+date+"%' order by id DESC");
            while (rs.next()) {
                Bill bill = new Bill();
                bill.setId(rs.getInt("id"));
                bill.setName(rs.getString("name"));
                bill.setMobileNumber(rs.getString("mobileNumber"));
                bill.setEmail(rs.getString("email"));
                bill.setDate(rs.getString("date"));
                bill.setTotal(rs.getString("total"));
                bill.setSellerID(rs.getInt("SellerID"));
                arrList.add(bill);

            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrList;
    }
    
}
