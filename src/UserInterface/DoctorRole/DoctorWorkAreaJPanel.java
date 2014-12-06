/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.DoctorRole;

import Business.EnterPrise.Enterprise;
import Business.EnterPrise.PHSEnterpise;
import Business.Network.Network;
import Business.Organization.AssetMgtOrganization;
import Business.Organization.Organization;
import Business.Surgery.SurgeryRequest;
import Business.UserAccount.UserAccount;
import java.text.SimpleDateFormat;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Martin
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private Network network;
    private UserAccount userAccount;
    
    public DoctorWorkAreaJPanel(JPanel upc, UserAccount ua, Network nw) {
        initComponents();
        this.userProcessContainer = upc;
        this.network = nw;
        this.userAccount = ua;
        
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        myScheduleJTable = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("View My Schedule");

        myScheduleJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Date", "Room", "Team Leader"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(myScheduleJTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 289, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable myScheduleJTable;
    // End of variables declaration//GEN-END:variables

    private void populateScheduleTable() {
        DefaultTableModel dtm = (DefaultTableModel)myScheduleJTable.getModel();
        dtm.setRowCount(0);
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
        
        for (Enterprise ep : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (ep instanceof PHSEnterpise) {
                for (Organization org : ep.getOrganazDirectory().getOrganizationList()) {
                    if (org instanceof AssetMgtOrganization) {
                        for (SurgeryRequest request : ((AssetMgtOrganization) org).getSurgeryRequestList()) {
                            if (request.getStatus().equals("Approved")) {
                                for (UserAccount ua : request.getSurgerySchedule().getSurgicalTeam().getSurgicalTeamList()) {
                                    if (ua.equals(userAccount)) {
                                        Object[] row = new Object[3];

                                        row[0] = fmt.format(request.getSurgerySchedule().getDate());
                                        row[1] = request.getSurgeryRoom().getRoomnumber();
                                        row[2] = request.getSurgerySchedule().getSurgicalTeam().getTeamLeader();
                                        
                                        dtm.addRow(row);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
