/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.EnterPrise.Enterprise;
import Business.Network.Network;
import Business.Organization.MedStaffOrganization;
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
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new TeamLeaderWorkAreaJPanel(userProcessContainer, account, (MedStaffOrganization)organization, business, network);
    }
    
    
}
