/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Surgery;

import Business.MedicalDevice.MedicalDevice;
import Business.UserAccount.SurgicalTeam;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Martin
 */
public class SurgerySchedule {
    
    private Date date;
    private SurgicalTeam surgicalTeam;
    private MedicalDevice medicalDevice;

    public SurgerySchedule(SurgicalTeam team, Date d, MedicalDevice md) {
        this.surgicalTeam = team;
        this.date = d;
        this.medicalDevice = md;
        
    }

    public Date getDate() {
        return date;
    }

    public MedicalDevice getMedicalDevice() {
        return medicalDevice;
    }
    

    public SurgicalTeam getSurgicalTeam() {
        return surgicalTeam;
    }
    
    
    
}
