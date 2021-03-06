/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.TeamLeaderRole;

import Business.EnterPrise.Enterprise;
import Business.EnterPrise.PHSEnterpise;
import Business.Network.Network;
import Business.Organization.AssetMgtOrganization;
import Business.Organization.Organization;
import Business.Surgery.SurgeryRequest;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Martin
 */
public class ViewSurgerySchedulsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewSurgeryJPanel
     */
    private JPanel userProcessContainer;
    private Network network;
    private AssetMgtOrganization assMgtOrganization;
    private UserAccount userAccount;
    
    public ViewSurgerySchedulsJPanel(JPanel upc, UserAccount ua, Network nw) {
        initComponents();
        this.userProcessContainer= upc;
        this.userAccount = ua;
        this.network = nw;
        this.assMgtOrganization = getAssetMgtOrganization();
        
        populateScheduleTable();
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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        schedulesJTable = new javax.swing.JTable();
        BackJButton = new javax.swing.JButton();
        viewDetailJButton = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("View Surgery Schedule");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 12, 0, 0);
        add(jLabel2, gridBagConstraints);

        schedulesJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Date", "Room Number", "Medical Device", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(schedulesJTable);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 412;
        gridBagConstraints.ipady = 162;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(18, 12, 0, 36);
        add(jScrollPane1, gridBagConstraints);

        BackJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BackJButton.setText("<< Back");
        BackJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackJButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(57, 12, 55, 0);
        add(BackJButton, gridBagConstraints);

        viewDetailJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        viewDetailJButton.setText("View Detail");
        viewDetailJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailJButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(57, 100, 55, 36);
        add(viewDetailJButton, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void viewDetailJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = schedulesJTable.getSelectedRow();
        if(selectedRow <0 ){
            JOptionPane.showMessageDialog(null, "No schedule is selected");
            return;
        } 
        
        SurgeryRequest request = (SurgeryRequest)schedulesJTable.getValueAt(selectedRow, 0);
        ViewSurgeryDetailJPanel jp = new ViewSurgeryDetailJPanel(userProcessContainer, request);
        userProcessContainer.add("ManageSurgeryJPanel", jp);
        ((CardLayout)userProcessContainer.getLayout()).next(userProcessContainer);                
    }//GEN-LAST:event_viewDetailJButtonActionPerformed

    private void BackJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackJButtonActionPerformed
        userProcessContainer.remove(this);
        ((CardLayout)userProcessContainer.getLayout()).previous(userProcessContainer);        // TODO add your handling code here:
    }//GEN-LAST:event_BackJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable schedulesJTable;
    private javax.swing.JButton viewDetailJButton;
    // End of variables declaration//GEN-END:variables

    private AssetMgtOrganization getAssetMgtOrganization() {
        AssetMgtOrganization organization = null;
        for(Enterprise ep : network.getEnterpriseDirectory().getEnterpriseList()){
            if(ep instanceof PHSEnterpise){
                for(Organization org : ep.getOrganazDirectory().getOrganizationList()){
                    if(org instanceof AssetMgtOrganization){
                        organization = (AssetMgtOrganization)org;
                    }
                }
            }
        }
        return organization;
    }

    private void populateScheduleTable() {
        DefaultTableModel dtm = (DefaultTableModel) schedulesJTable.getModel();
        dtm.setRowCount(0);
        
        for(SurgeryRequest request : assMgtOrganization.getSurgeryRequestList()){
            if(request.getSurgerySchedule().getSurgicalTeam().getTeamLeader().equals(userAccount)){
                Object[] row = new Object[4];
                row[0] = request;
                row[1] = request.getSurgeryRoom().getRoomnumber();
                row[2] = request.getSurgerySchedule().getMedicalDevice().getName();
                row[3] = request.getStatus();
                
                dtm.addRow(row);
            }
        }
    }
}
