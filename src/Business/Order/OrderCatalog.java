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
    
    private ArrayList<Order> orderList;

    public OrderCatalog() {
        orderList = new ArrayList<>();
    }


    public ArrayList<Order> getOrderList() {
        return orderList;
    }
    
}
