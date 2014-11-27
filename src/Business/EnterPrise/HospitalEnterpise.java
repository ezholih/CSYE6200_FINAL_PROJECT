/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.EnterPrise;

import Business.Role.Role;
import Business.SurgeryRoom.SurgeryRoomDirectory;
import java.util.ArrayList;

/**
 *
 * @author Martin
 */
public class HospitalEnterpise extends Enterprise{
    
    private SurgeryRoomDirectory surgeryRoomDirectory;

    public HospitalEnterpise(String name) {
        super(name, EnterpriseType.Hospital);
        surgeryRoomDirectory = new SurgeryRoomDirectory();
    }

    public SurgeryRoomDirectory getSurgeryRoomDirectory() {
        return surgeryRoomDirectory;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    
    
}
