/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.SurgeryRoom;

import java.util.ArrayList;

/**
 *
 * @author Martin
 */
public class SurgeryRoomDirectory {
    
    private ArrayList<SurgeryRoom> surgeryRoomList;

    public SurgeryRoomDirectory() {
        surgeryRoomList = new ArrayList<SurgeryRoom>();
    }
    
    public SurgeryRoom createSurgeryRoom(){
        SurgeryRoom sgyroom = new SurgeryRoom();
        surgeryRoomList.add(sgyroom);
        return sgyroom;
    }
    
    public void delSurgeryRoom(SurgeryRoom sgyroom){
        surgeryRoomList.remove(sgyroom);
    }

    public ArrayList<SurgeryRoom> getSurgeryRoomList() {
        return surgeryRoomList;
    }
    
    
    
}
