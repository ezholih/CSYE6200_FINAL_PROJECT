/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Maintenance.MaintRequestList;
import Business.MedicalDevice.MDProductCatalog;
import Business.MedicalDevice.MedicalDevice;
import Business.Order.OrderCatalog;
import Business.Role.DoctorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class SupplierOrganization extends Organization{

    private MaintRequestList maintRequestList;
    private MDProductCatalog mDProductCatalog;
    private OrderCatalog orderLis; 
   
    public SupplierOrganization() {
        super(Organization.Type.Supplier.getValue());
        maintRequestList = new MaintRequestList();
        mDProductCatalog = new MDProductCatalog();
        orderLis = new OrderCatalog();
    }

    public OrderCatalog getOrderLis() {
        return orderLis;
    }
    

    public MaintRequestList getMaintRequestList() {
        return maintRequestList;
    }

    public MDProductCatalog getmDProductCatalog() {
        return mDProductCatalog;
    }
    
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DoctorRole());
        return roles;
    }
     
}