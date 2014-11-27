/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.SurgeryRoom;

import Business.Surgery.SurgerySchedule;
import Business.Surgery.SurgeryScheduleDirectory;

/**
 *
 * @author Martin
 */
public class SurgeryRoom {
    
    private String roomnumber;
    private String floor;
    private String address;
    private SurgeryScheduleDirectory sgyScheduleDirectory;

    public SurgeryRoom() {
        sgyScheduleDirectory = new SurgeryScheduleDirectory();
    }

    public SurgeryScheduleDirectory getSgyScheduleDirectory() {
        return sgyScheduleDirectory;
    }
    
    
    public String getRoomnumber() {
        return roomnumber;
    }

    public void setRoomnumber(String roomnumber) {
        this.roomnumber = roomnumber;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
}
