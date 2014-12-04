/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.SurgeryRoom;

import Business.MedicalDevice.MedicalDevice;
import Business.Surgery.SurgerySchedule;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

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
    
    public boolean searchDevice(MedicalDevice medicalDevice, String date){
        boolean result = false;
        String scheduleDate;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        for(SurgeryRoom room : surgeryRoomList){
            for(SurgerySchedule surgerySchedule : room.getSgyScheduleDirectory().getSurgeryScheduleList()){
                scheduleDate = dateFormat.format(surgerySchedule.getDate());
               if((surgerySchedule.getMedicalDevice().equals(medicalDevice)) && (scheduleDate.equals(date))){
                   result = true;
                   break;
               }
            }
        }
        return result;
    }
    
    public boolean searchRoom(SurgeryRoom room, String date){
        boolean result = false;
        String scheduleDate;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        for(SurgeryRoom r : surgeryRoomList){
            if(r.equals(room)){
                for(SurgerySchedule schedule : r.getSgyScheduleDirectory().getSurgeryScheduleList()){
                    scheduleDate = dateFormat.format(schedule.getDate());
                    if(scheduleDate.equals(date)){
                        result = true;
                        break;
                    }
                }
            }
        }
        return result;
    }
    
}
