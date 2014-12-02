/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Payment.PaymentDirectory;
import Business.Role.DoctorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class FinaceOrganization extends Organization{
    
    private PaymentDirectory paymentDirectory;
    
    public FinaceOrganization() {
        super(Organization.Type.Finace.getValue());
        paymentDirectory = new PaymentDirectory();
    }

    public PaymentDirectory getPaymentDirectory() {
        return paymentDirectory;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DoctorRole());
        return roles;
    }
     
}