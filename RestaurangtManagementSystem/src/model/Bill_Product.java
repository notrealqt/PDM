/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Bill_Product {
    private int BillID;
    private int ProductID;
    private int Quatity;
    private Double Paid;

    public int getQuatity() {
        return Quatity;
    }

    public void setQuatity(int Quatity) {
        this.Quatity = Quatity;
    }

    public Double getPaid() {
        return Paid;
    }

    public void setPaid(Double Paid) {
        this.Paid = Paid;
    }
    
    public int getBillID() {
        return BillID;
    }

    public void setBillID(int BillID) {
        this.BillID = BillID;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }
    
    
}
