/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Surgery;

import Business.EnterPrise.HospitalEnterpise;
import Business.SurgeryRoom.SurgeryRoom;
import java.text.SimpleDateFormat;

/**
 *
 * @author Martin
 */
public class SurgeryRequest {
    
    private SurgerySchedule surgerySchedule;
    private String  status;
    private SurgeryRoom surgeryRoom;
    private HospitalEnterpise hospitalEnterpise;

    public SurgeryRequest(SurgerySchedule surgerySchedule) {
        this.surgerySchedule = surgerySchedule;
        this.status = "Created";
    }

    public HospitalEnterpise getHospitalEnterpise() {
        return hospitalEnterpise;
    }

    public void setHospitalEnterpise(HospitalEnterpise hospitalEnterpise) {
        this.hospitalEnterpise = hospitalEnterpise;
    }

    public SurgeryRoom getSurgeryRoom() {
        return surgeryRoom;
    }

    public void setSurgeryRoom(SurgeryRoom surgeryRoom) {
        this.surgeryRoom = surgeryRoom;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SurgerySchedule getSurgerySchedule() {
        return surgerySchedule;
    }
    
    public String toString(){
        SimpleDateFormat dateformatter = new SimpleDateFormat("dd/MM/yyyy");
        return dateformatter.format(surgerySchedule.getDate());
    }
    
}
