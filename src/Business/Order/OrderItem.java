/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Order;

import Business.EnterPrise.SupplierEnterpise;
import Business.MedicalDevice.MedicalDevice;
import Business.MedicalDevice.MedicalDeviceProduct;

/**
 *
 * @author Martin
 */
public class OrderItem {
    
    private static int ID = 100;
    private MedicalDeviceProduct mdProduct;
    private int quantity;
    private SupplierEnterpise enterpise;

    public OrderItem() {
        ID = ID+1;
    }

    public int getID() {
        return ID;
    }
    
    

    public MedicalDeviceProduct getMdProduct() {
        return mdProduct;
    }

    public void setMdProduct(MedicalDeviceProduct mdProduct) {
        this.mdProduct = mdProduct;
    }
    
    public SupplierEnterpise getEnterprise() {
        return enterpise;
    }

    public void setEnterprise(SupplierEnterpise enterprise) {
        this.enterpise = enterprise;
    }    

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public String toString(){
        return this.mdProduct.toString();
    }
    
}
