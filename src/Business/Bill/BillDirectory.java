/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Bill;

import Business.Order.Order;
import java.util.ArrayList;

/**
 *
 * @author Martin
 */
public class BillDirectory {
    private ArrayList<Bill> billList;

    public BillDirectory() {
        billList = new ArrayList<>();
    }

    public ArrayList<Bill> getBillList() {
        return billList;
    }

    public double getRevenue() {
        double rev = 0;
        for(Bill bill : billList){
            rev = rev + bill.getAmount();
        }
        return rev;
    }
    
    public Bill createBill(Order order){
        Bill bill = new Bill(order);
        billList.add(bill);
        return bill;
    }
}
