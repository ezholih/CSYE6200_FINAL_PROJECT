/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Maintenance.MaintRequestList;
import Business.MedicalDevice.MedicalDevice;
import Business.Role.DoctorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class SupplierOrganization extends Organization{

    private MaintRequestList maintRequestList;
    private ArrayList<MedicalDevice> productList;
    
    public SupplierOrganization() {
        super(Organization.Type.Supplier.getValue());
        maintRequestList = new MaintRequestList();
        productList = new ArrayList<>();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DoctorRole());
        return roles;
    }
     
}