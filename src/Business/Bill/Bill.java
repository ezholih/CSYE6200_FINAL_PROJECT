/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Bill;

import Business.Order.Order;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Martin
 */
public class Bill {
    
    private Order order;
    private double amount;
    private UserAccount billBy;
    private UserAccount billTo;
    private int accountNumber;
    private String bankName;
    private Date billDate;

    public Bill(Order order) {
        this.order = order;
        amount = order.getTotalPrice();
        billDate = new Date();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    
    public Order getOrder() {
        return order;
    }

    public double getAmount() {
        return amount;
    }

    public UserAccount getBillTo() {
        return billTo;
    }

    public void setBillTo(UserAccount billTo) {
        this.billTo = billTo;
    }

    public UserAccount getBillBy() {
        return billBy;
    }

    public void setBillBy(UserAccount billBy) {
        this.billBy = billBy;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public String toString(){
        return order.toString();
    }
}
