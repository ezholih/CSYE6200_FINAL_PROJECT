/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Maintenance;

import Business.MedicalDevice.MedicalDevice;
import java.util.ArrayList;

/**
 *
 * @author Martin
 */
public class MaintRequestList {
    private ArrayList<MedicalDevice> maintDevicesList;

    public MaintRequestList() {
        maintDevicesList = new ArrayList<>();
    }

    public ArrayList<MedicalDevice> getMaintDevicesList() {
        return maintDevicesList;
    }

}
