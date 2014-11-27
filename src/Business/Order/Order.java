/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Order;

import Business.MedicalDevice.MedicalDevice;
import java.util.ArrayList;

/**
 *
 * @author Martin
 */
public class Order {
    
    private ArrayList<OrderItem> oiList;
    private static int orderID = 100;
    private String status;

    public Order() {
        oiList = new ArrayList<>();
        orderID = orderID++;
    }

    public static int getOrderID() {
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
    
    public OrderItem addOrderItem(MedicalDevice device, int quantity){
        OrderItem oi = new OrderItem();
        oi.setQuantity(quantity);
        oi.setMedicalDevice(device);
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
            total = total + oi.getMedicalDevice().getPrice();
        }
        return total;
    }
    
    public String toString(){
        return String.valueOf(orderID);
    }
}
