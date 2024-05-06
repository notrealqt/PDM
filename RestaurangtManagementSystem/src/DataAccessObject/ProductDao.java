package DataAccessObject;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Product;

public class ProductDao {
    
    public static void save(Product product){
        String query = "insert into product (name, category, price) value('"+product.getName()+"', '"+product.getCategory()+"', '"+product.getPrice()+"')";
        DbOperation.setDataOrDelete(query, "Product Added Successfully");
    }
    public static ArrayList<Product> getAllRecords() {
        ArrayList<Product> arrList = new ArrayList<>();
        try {
            ResultSet rs = DbOperation.getData("select * from product");
            while (rs.next()) {
                Product product = new Product();
                product.setId(rs.getInt("id"));
                product.setName(rs.getString("name"));
                product.setCategory(rs.getString("category"));
                product.setPrice(rs.getInt("price"));
                arrList.add(product);

            }
        }
        catch( Exception e) {
            JOptionPane.showMessageDialog(null, e  );
        }
        return arrList;

    }

    public static void update(Product product) {
        String query = "update product set name = '"+product.getName()+"', category = '"+product.getCategory()+"', price = '"+product.getPrice()+"' where id = '"+product.getId()+"' ";
        DbOperation.setDataOrDelete(query, "Product Update Successfully");
    }

    public static void delete(String id) {
        
        //String query1 = "delete from bill_product where ProductID = '"+id+"'";
        //DbOperation.setDataOrDelete(query1, "");
        String query = "delete from product where id = '"+id+"'";
        DbOperation.setDataOrDelete(query, "Product Deleted Successfully");
    }
    
    public static ArrayList<Product> getAllRecordsByCategory(String category){
        ArrayList<Product> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DbOperation.getData("select * from product where category = '"+category+"'");
            while (rs.next()){
                Product product = new Product();
                product.setName(rs.getString("name"));
                arrayList.add(product);
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
    public static ArrayList<Product> fillterProductByName(String name, String category){
        ArrayList<Product> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DbOperation.getData("select * from product where name like '%"+name+"%' and category = '"+category+"' ");
            while (rs.next()){
                Product product = new Product();
                product.setName(rs.getString("name"));
                arrayList.add(product);
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
    public static Product getProductByname (String name){
        Product product = new Product();
        try{
            ResultSet rs = DbOperation.getData("select * from product where name = '"+name+"'");
            while (rs.next()){
                product.setName(rs.getString(2));
                product.setCategory(rs.getString(3));
                product.setPrice(rs.getDouble(4));
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return product;
    }
}
