/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.MedicalDevice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Martin
 */
public class MedicalDeviceInventory {
    
    private Map<MedicalDevice, Integer> medicalDeviceList;

    public MedicalDeviceInventory() {
        medicalDeviceList = new HashMap<>();
    }

    public Map<MedicalDevice, Integer> getMedicalDeviceList() {
        return medicalDeviceList;
    }
    
    
    
}
