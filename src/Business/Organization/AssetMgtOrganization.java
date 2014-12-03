/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Bill.BillDirectory;
import Business.Maintenance.MaintRequestList;
import Business.MedicalDevice.MedicalDeviceInventory;
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
    private MedicalDeviceInventory medicalDeviceInventory;
    private MaintRequestList maintRequestList;

    public AssetMgtOrganization() {
        super(Organization.Type.AssetMgt.getValue());
        orderList = new OrderCatalog();
        medicalDeviceInventory = new MedicalDeviceInventory();
        maintRequestList = new MaintRequestList();
    }

    public MaintRequestList getMaintRequestList() {
        return maintRequestList;
    }
    
    public OrderCatalog getOrderList() {
        return orderList;
    }
    
    public MedicalDeviceInventory getMedicalDeviceInventory() {
        return medicalDeviceInventory;
    }
    
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DoctorRole());
        return roles;
    }
     
}