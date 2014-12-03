/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Maintenance;

import Business.MedicalDevice.MedicalDevice;

/**
 *
 * @author Martin
 */
public class MaintRequest {
    
    private MedicalDevice medicalDevice;
    private String status;

    public MaintRequest(MedicalDevice md) {
        this.medicalDevice = md;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public MedicalDevice getMedicalDevice() {
        return medicalDevice;
    }
    
    
    
}
