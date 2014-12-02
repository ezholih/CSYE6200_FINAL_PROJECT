/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Payment;

import Business.Bill.Bill;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Martin
 */
public class Payment {
    
    private Bill bill;
    private UserAccount payBy;
    private UserAccount payTo;
    private Date paymentDate;
    private String paymentType;

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    
    public Payment(Bill bill) {
        this.bill = bill;
        paymentDate = new Date();
        bill.getOrder().setStatus("Payed");
    }

    public UserAccount getPayBy() {
        return payBy;
    }

    public void setPayBy(UserAccount payBy) {
        this.payBy = payBy;
    }

    public UserAccount getPayTo() {
        return payTo;
    }

    public void setPayTo(UserAccount payTo) {
        this.payTo = payTo;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public Bill getBill() {
        return bill;
    }
    
    public String toString (){
        return bill.toString();
    }
}
