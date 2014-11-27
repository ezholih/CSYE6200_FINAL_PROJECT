package Business.Surgery;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import com.db4o.collections.ActivatableArrayList;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Martin
 */
public class SurgeryScheduleDirectory {
    
    private ArrayList<SurgerySchedule> surgeryScheduleList;

    public SurgeryScheduleDirectory() {
        surgeryScheduleList = new ActivatableArrayList<>();
    }

    public ArrayList<SurgerySchedule> getSurgeryScheduleList() {
        return surgeryScheduleList;
    }

    public void setSurgeryScheduleList(ArrayList<SurgerySchedule> surgeryScheduleList) {
        this.surgeryScheduleList = surgeryScheduleList;
    }
    
    public SurgerySchedule createSurgerySchedule(Date date){
        SurgerySchedule sgySchedule = new SurgerySchedule(date);
        surgeryScheduleList.add(sgySchedule);
        return sgySchedule;
    }
    
    public void delSurgerySchedule(SurgerySchedule sgyschedule){
        surgeryScheduleList.remove(sgyschedule);
    }
    
    
    
}
