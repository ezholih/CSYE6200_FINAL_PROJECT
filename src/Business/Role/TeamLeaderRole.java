/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.EnterPrise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.SurgicalTeam;
import Business.UserAccount.UserAccount;
import UserInterface.TeamLeaderRole.TeamLeaderWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class TeamLeaderRole extends Role{
    
    private SurgicalTeam surgicalTeam;

    public TeamLeaderRole() {
        surgicalTeam = new SurgicalTeam();
    }

    public SurgicalTeam getSurgicalTeam() {
        return surgicalTeam;
    }
    

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new TeamLeaderWorkAreaJPanel(userProcessContainer, account, (DoctorOrganization)organization, business);
    }
    
    
}
