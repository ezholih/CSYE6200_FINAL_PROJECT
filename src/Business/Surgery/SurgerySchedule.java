/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Surgery;

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
    private ArrayList<UserAccount> team;

    public SurgerySchedule() {
        team = new ArrayList<>();
        date = new Date();
    }
    
    public void addTeamMember(UserAccount ua){
        for(UserAccount u:team){
            if( ua.getEmployee().getId() == u.getEmployee().getId()){
                JOptionPane.showMessageDialog(null, "This user is already a team member!");
                return;
            }
        }
        team.add(ua);
    }
    
    public SurgerySchedule(Date date) {
        this.date = date;
    }
    
    
}
