/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Bill.BillDirectory;
import Business.Payment.PaymentDirectory;
import Business.Role.AccountingRole;
import Business.Role.DoctorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class FinanceOrganization extends Organization{
    
    private PaymentDirectory paymentDirectory;
    private BillDirectory billDirectory;
    
    public FinanceOrganization() {
        super(Organization.Type.Finace.getValue());
        paymentDirectory = new PaymentDirectory();
        billDirectory = new BillDirectory();
    }

    public PaymentDirectory getPaymentDirectory() {
        return paymentDirectory;
    }

    public BillDirectory getBillDirectory() {
        return billDirectory;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AccountingRole());
        return roles;
    }
     
}