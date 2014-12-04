/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.UserAccount;

import java.util.ArrayList;

/**
 *
 * @author Martin
 */
public class SurgicalTeam {
    
    private UserAccount teamLeader;
    private ArrayList<UserAccount> surgicalTeamList;

    public SurgicalTeam(UserAccount leader) {
        teamLeader = leader;
        surgicalTeamList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getSurgicalTeamList() {
        return surgicalTeamList;
    }
    
    public void addTeamMember(UserAccount ua){
        surgicalTeamList.add(ua);
    }
    
    public UserAccount searchMember(UserAccount ua){
        UserAccount userAccount = null;
        for(UserAccount u : surgicalTeamList){
            if(u.getEmployee().getId() == ua.getEmployee().getId())
                return u;
        }
        return userAccount;
    }

    public UserAccount getTeamLeader() {
        return teamLeader;
    }
    
    
}
