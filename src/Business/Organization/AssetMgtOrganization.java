/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Order.OrderCatalog;
import Business.Role.DoctorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class AssetMgtOrganization extends Organization{
    
    private OrderCatalog orderList;

    public AssetMgtOrganization() {
        super(Organization.Type.AssetMgt.getValue());
        orderList = new OrderCatalog();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DoctorRole());
        return roles;
    }
     
}