/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Maintenance.MaintRequestList;
import Business.MedicalDevice.MDProductCatalog;
import Business.Order.OrderCatalog;
import Business.Role.Role;
import Business.Role.SupplierRole;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class SupplierOrganization extends Organization{

    private MaintRequestList maintRequestList;
    private MDProductCatalog mDProductCatalog;
    private OrderCatalog orderList; 
   
    public SupplierOrganization() {
        super(Organization.Type.Supplier.getValue());
        maintRequestList = new MaintRequestList();
        mDProductCatalog = new MDProductCatalog();
        orderList = new OrderCatalog();
    }

    public OrderCatalog getOrderList() {
        return orderList;
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
        roles.add(new SupplierRole());
        return roles;
    }
     
}