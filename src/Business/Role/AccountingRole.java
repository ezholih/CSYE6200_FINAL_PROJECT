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
import Business.UserAccount.UserAccount;
import UserInterface.FinaceRole.AccountingWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class AccountingRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new AccountingWorkAreaJPanel(userProcessContainer, organization, business,account,network);
    }
    
    
}
