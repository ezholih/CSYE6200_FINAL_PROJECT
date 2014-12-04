/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Order;

import Business.EnterPrise.SupplierEnterpise;
import Business.MedicalDevice.MedicalDevice;
import Business.MedicalDevice.MedicalDeviceProduct;
import java.util.ArrayList;

/**
 *
 * @author Martin
 */
public class Order {
    
    private ArrayList<OrderItem> oiList;
    private static int count = 100;
    private int orderID;
    private String status;

    public Order() {
        oiList = new ArrayList<>();
        orderID = count;
        count++;
        
        status = "Ordered";
    }

    public void setOrderID(int prefix) {
        orderID = prefix+count;
    }
    
    public int getOrderID() {
        return orderID;
    }

    public ArrayList<OrderItem> getOiList() {
        return oiList;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public OrderItem createOrderItem(MedicalDeviceProduct device, int quantity){
        OrderItem oi = new OrderItem();
        oi.setQuantity(quantity);
        oi.setMdProduct(device);
        oiList.add(oi);
        return oi;
    }
    
    public void deleteOI(OrderItem oi){
        oiList.remove(oi);
    }
    
    public void copyOiList(ArrayList<OrderItem> oilist){
        this.oiList = new ArrayList<OrderItem>(oilist);
    }
    
    public double getTotalPrice(){
        double total = 0;
        for(OrderItem oi : this.oiList){
            total = total+oi.getQuantity()*oi.getMdProduct().getPrice();
        }
        return total;
    }
    
    public String toString(){
        return String.valueOf(orderID);
    }
}
