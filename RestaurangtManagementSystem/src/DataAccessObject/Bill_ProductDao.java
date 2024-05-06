/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccessObject;

import model.Bill_Product;



/**
 *
 * @author VAN
 */
public class Bill_ProductDao {
    public static void save(Bill_Product bill_Product){
        String query = "insert into bill_product (BillID, ProductID) value('"+bill_Product.getBillID()+"', '"+bill_Product.getProductID()+"')";
        DbOperation.setDataOrDelete(query, "Bill_Product saved Successfully");
    }
    
    public static void update(Bill_Product bill_Product) {
        String query = "update Bill_Product set BillID = '"+bill_Product.getBillID()+"', ProductID = '"+bill_Product.getBillID()+"'";
        DbOperation.setDataOrDelete(query, "Bill_Product Update Successfully");
    }
}
