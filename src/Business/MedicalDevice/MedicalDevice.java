/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.MedicalDevice;

import Business.Maintenance.MaintSchedule;
import Business.Maintenance.MaintHistory;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Martin
 */
public class MedicalDevice extends MedicalDeviceProduct{
    
    private static int deviceID = 1;
    private MaintHistory maintScheduleHistory;
    private Date manufactureDate;
    private String status;
    private String location;

    public MedicalDevice(MaintSchedule.MaintType mType, int interval) {
        deviceID++;
        deviceID = super.getProductID()*100+deviceID;
        maintScheduleHistory = new MaintHistory(mType, interval);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    public MaintHistory getMaintScheduleHistory() {
        return maintScheduleHistory;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String toString(){
        return String.valueOf(deviceID);
    }

    public int getDeviceID() {
        return deviceID;
    }

    
    
}
