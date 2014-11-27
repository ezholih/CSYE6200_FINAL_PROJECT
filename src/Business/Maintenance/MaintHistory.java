/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Maintenance;

import java.util.ArrayList;

/**
 *
 * @author Martin
 */
public class MaintHistory {
    private ArrayList<MaintSchedule> maintHistory;

    public MaintHistory() {
        maintHistory = new ArrayList<>();
    }

    public ArrayList<MaintSchedule> getMaintHistory() {
        return maintHistory;
    }
    
}
