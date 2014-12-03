/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Maintenance;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Martin
 */
public class MaintHistory {
    private MaintSchedule lastMaintenace;
    private ArrayList<MaintSchedule> maintHistory;

    public MaintHistory(MaintSchedule.MaintType mType, int interval) {
        lastMaintenace = new MaintSchedule(MaintSchedule.MaintType.REG, interval);
        maintHistory = new ArrayList<>();
    }

    public ArrayList<MaintSchedule> getMaintHistory() {
        return maintHistory;
    }
    
    public void createFirstSchedule(Date date){
        lastMaintenace.setLastMaintDate(date);
        lastMaintenace.setNextMaintDate();
        maintHistory.add(lastMaintenace);
    }
    
    public MaintSchedule newMaintenance(){
        MaintSchedule maintSchedule = new MaintSchedule(lastMaintenace);
        maintHistory.add(maintSchedule);
        return lastMaintenace;
    }

    public MaintSchedule getLastMaintenace() {
        return lastMaintenace;
    }
    
}
