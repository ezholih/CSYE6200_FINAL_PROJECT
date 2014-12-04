/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.NurseRole;
import Business.Role.Role;
import Business.Role.TeamLeaderRole;
import Business.UserAccount.SurgicalTeam;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class MedStaffOrganization extends Organization{
    
    private ArrayList<SurgicalTeam> surgicalTeamList;
    

    public MedStaffOrganization() {
        super(Organization.Type.MedStaff.getValue());
        surgicalTeamList = new ArrayList<>();
    }

    public ArrayList<SurgicalTeam> getSurgicalTeamList() {
        return surgicalTeamList;
    }

    
    
    public SurgicalTeam createTeam(UserAccount leader){
        SurgicalTeam team = new SurgicalTeam(leader);
        team.addTeamMember(leader);
        surgicalTeamList.add(team);
        return team;
    } 
   
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DoctorRole());
        roles.add(new TeamLeaderRole());
        roles.add(new NurseRole());
        return roles;
    }
     
}