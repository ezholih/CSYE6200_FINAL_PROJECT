/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Order;

import java.util.ArrayList;

/**
 *
 * @author Martin
 */
public class OrderCatalog {
    
    private int orderCatID;
    private static int count = 1000;
    private ArrayList<Order> orderList;

    public OrderCatalog() {
        orderList = new ArrayList<>();
        orderCatID = count;
        count++;
    }


    public ArrayList<Order> getOrderList() {
        return orderList;
    }
    
    public Order createOrder(){
        Order order = new Order();
        order.setOrderID(orderCatID);
        orderList.add(order);
        return order;
    }
    
    public Order searchOrderItem(OrderItem orderItem){
        Order od = null;
        for(Order order : orderList){
            for(OrderItem oi : order.getOiList())
                if(oi.getID() == orderItem.getID()){
                    od = order;
                    break;
                }
        }
        return od;
    }
}
