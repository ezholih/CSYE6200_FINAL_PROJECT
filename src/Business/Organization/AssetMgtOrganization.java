/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Maintenance.MaintRequestList;
import Business.MedicalDevice.MedicalDevice;
import Business.MedicalDevice.MedicalDeviceInventory;
import Business.Order.OrderCatalog;
import Business.Role.AssetMgtRole;
import Business.Role.Role;
import Business.Surgery.SurgeryRequest;
import Business.Surgery.SurgerySchedule;
import Business.SurgeryRoom.SurgeryRoom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class AssetMgtOrganization extends Organization{
    
    private OrderCatalog orderList;
    private MedicalDeviceInventory medicalDeviceInventory;
    private MaintRequestList maintRequestList;
    private ArrayList<SurgeryRequest> surgeryRequestList;

    public AssetMgtOrganization() {
        super(Organization.Type.AssetMgt.getValue());
        orderList = new OrderCatalog();
        medicalDeviceInventory = new MedicalDeviceInventory();
        maintRequestList = new MaintRequestList();
        surgeryRequestList = new ArrayList<>();
    }

    public ArrayList<SurgeryRequest> getSurgeryRequestList() {
        return surgeryRequestList;
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
    
    public SurgeryRequest createRequest(SurgerySchedule schedule){
        SurgeryRequest request = new SurgeryRequest(schedule);
        surgeryRequestList.add(request);
        return request;
    }
    
    public SurgeryRequest getRequestByDate(String date){
        SurgeryRequest request = null;
        String scheduleDate;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        for(SurgeryRequest req : surgeryRequestList){
            scheduleDate = dateFormat.format(req.getSurgerySchedule().getDate());
           if(scheduleDate.equals(date)){
               request = req;
               break;
           }
        }
        return request;
    }
    
    public boolean searchDeviceByDate(MedicalDevice device, String date){
        boolean result = false;
        String scheduleDate;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        for(SurgeryRequest request : surgeryRequestList){
            scheduleDate = dateFormat.format(request.getSurgerySchedule().getDate());
            if(request.getSurgerySchedule().getMedicalDevice().equals(device) 
                    && scheduleDate.equals(date) && request.getStatus().equals("Approved")){
                result = true;
                break;
            }
        }
        return result;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AssetMgtRole());
        return roles;
    }
     
}