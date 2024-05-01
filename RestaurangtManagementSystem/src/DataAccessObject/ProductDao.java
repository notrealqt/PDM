/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccessObject;
import model.Product;
/**
 *
 * @author VAN
 */
public class ProductDao {
    
    public static void save(Product product){
        String query = "insert into product (name, category, price) value('"+product.getName()+"', '"+product.getCategory()+"', '"+product.getPrice()+"')";
        DbOperation.setDataOrDelete(query, "Product Added Successfully");
    }
}
