/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.AssetAdminRole;

import Business.EcoSystem;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Martin
 */
public class AssetAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AssetAdminWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private Organization organization;
    private EcoSystem ecoSystem;
    private UserAccount userAccount;
    
    public AssetAdminWorkAreaJPanel(JPanel upc, Organization org, EcoSystem ecosys, UserAccount ua) {
        initComponents();
        this.userProcessContainer = upc;
        this.organization = org;
        this.ecoSystem = ecosys;
        this.userAccount = ua;
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
        newDeviceJButton = new javax.swing.JButton();
        reservationJButton = new javax.swing.JButton();
        reservationJButton1 = new javax.swing.JButton();
        viewDeviceJButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Asset Admin Work Area");

        newDeviceJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        newDeviceJButton.setText("Device Purchase Management >>");

        reservationJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        reservationJButton.setText("Device Reservation Management >>");

        reservationJButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        reservationJButton1.setText("Device Maintenance Management >>");

        viewDeviceJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewDeviceJButton.setText("View Inventory >>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(reservationJButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(newDeviceJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(reservationJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewDeviceJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(69, 69, 69)
                .addComponent(newDeviceJButton)
                .addGap(43, 43, 43)
                .addComponent(reservationJButton)
                .addGap(44, 44, 44)
                .addComponent(reservationJButton1)
                .addGap(41, 41, 41)
                .addComponent(viewDeviceJButton)
                .addContainerGap(75, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton newDeviceJButton;
    private javax.swing.JButton reservationJButton;
    private javax.swing.JButton reservationJButton1;
    private javax.swing.JButton viewDeviceJButton;
    // End of variables declaration//GEN-END:variables
}
