/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Payment;

import Business.Bill.Bill;
import java.util.ArrayList;

/**
 *
 * @author Martin
 */
public class PaymentDirectory {
    
    private ArrayList<Payment> paymentList;

    public PaymentDirectory() {
        paymentList = new ArrayList<>();
    }

    public ArrayList<Payment> getPaymentList() {
        return paymentList;
    }
    
    public Payment createPayment(Bill bill){
        Payment pay = new Payment(bill);
        paymentList.add(pay);
        return pay;
    }
    
}
