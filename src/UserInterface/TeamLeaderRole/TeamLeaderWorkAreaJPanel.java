/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.TeamLeaderRole;

import Business.EcoSystem;
import Business.Network.Network;
import Business.Organization.MedStaffOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class TeamLeaderWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private MedStaffOrganization organization;
    private EcoSystem business;
    private UserAccount userAccount;
    private Network network;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public TeamLeaderWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem ecosys, Network nw) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = (MedStaffOrganization)organization;
        this.business = ecosys;
        this.network = nw;
        this.userAccount = account;
        
    }
    

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        teamMgnJButton = new javax.swing.JButton();
        surgeryMgnJButton = new javax.swing.JButton();
        surgeryMgnJButton1 = new javax.swing.JButton();

        setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Team Leader Work Area");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 12, 0, 0);
        add(jLabel1, gridBagConstraints);

        teamMgnJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        teamMgnJButton.setText("Manage Team Member >>");
        teamMgnJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamMgnJButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(81, 105, 0, 108);
        add(teamMgnJButton, gridBagConstraints);

        surgeryMgnJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        surgeryMgnJButton.setText("Manage Surgery Schedule>>");
        surgeryMgnJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surgeryMgnJButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 105, 0, 108);
        add(surgeryMgnJButton, gridBagConstraints);

        surgeryMgnJButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        surgeryMgnJButton1.setText("View Surgery Schedul >>");
        surgeryMgnJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surgeryMgnJButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 26;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 105, 112, 108);
        add(surgeryMgnJButton1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void teamMgnJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamMgnJButtonActionPerformed
        // TODO add your handling code here:
        
        ManageTeamJPanel mnpjp = new ManageTeamJPanel(userProcessContainer, organization, userAccount);
        userProcessContainer.add("ManageTeamJPanel", mnpjp);
        ((CardLayout)userProcessContainer.getLayout()).next(userProcessContainer);
    }//GEN-LAST:event_teamMgnJButtonActionPerformed

    private void surgeryMgnJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surgeryMgnJButtonActionPerformed
        // TODO add your handling code here:
        ManageSurgeryJPanel mnpjp = new ManageSurgeryJPanel(userProcessContainer, userAccount, organization, business);
        userProcessContainer.add("ManageSurgeryJPanel", mnpjp);
        ((CardLayout)userProcessContainer.getLayout()).next(userProcessContainer);        
    }//GEN-LAST:event_surgeryMgnJButtonActionPerformed

    private void surgeryMgnJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surgeryMgnJButton1ActionPerformed
        // TODO add your handling code here:
        ViewSurgerySchedulsJPanel mnpjp = new ViewSurgerySchedulsJPanel(userProcessContainer, userAccount, network);
        userProcessContainer.add("ViewSurgerySchedulsJPanel", mnpjp);
        ((CardLayout)userProcessContainer.getLayout()).next(userProcessContainer);               
    }//GEN-LAST:event_surgeryMgnJButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton surgeryMgnJButton;
    private javax.swing.JButton surgeryMgnJButton1;
    private javax.swing.JButton teamMgnJButton;
    // End of variables declaration//GEN-END:variables
}
