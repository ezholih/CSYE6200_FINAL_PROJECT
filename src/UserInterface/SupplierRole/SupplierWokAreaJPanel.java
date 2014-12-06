/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.SupplierRole;

import Business.EcoSystem;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.SupplierOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Martin
 */
public class SupplierWokAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SupplierWokAreaJPanel
     */
    private JPanel userProcessContainer;
    private SupplierOrganization supplierOrganization;
    private EcoSystem ecoSystem;
    private UserAccount userAccount;
    private Network network;
   
    public SupplierWokAreaJPanel(JPanel upc, Organization supOrg, EcoSystem ecosys, UserAccount ua, Network nw) {
        initComponents();
        this.userProcessContainer = upc;
        this.network = nw;
        if(supOrg instanceof SupplierOrganization){
            this.supplierOrganization = (SupplierOrganization)supOrg;
        }else{
            JOptionPane.showMessageDialog(null, "Invalid Organization!");
        }
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
        mgnProductJButton = new javax.swing.JButton();
        mgnMaintJButton = new javax.swing.JButton();
        mgnOrderJButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Supplier Work Area");

        mgnProductJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mgnProductJButton.setText("Product Management >>");
        mgnProductJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgnProductJButtonActionPerformed(evt);
            }
        });

        mgnMaintJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mgnMaintJButton.setText("Maintenance Service >>");
        mgnMaintJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgnMaintJButtonActionPerformed(evt);
            }
        });

        mgnOrderJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mgnOrderJButton.setText("Order Management >>");
        mgnOrderJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgnOrderJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mgnProductJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mgnOrderJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(16, 16, 16))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mgnMaintJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(8, 8, 8))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(139, 139, 139))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(91, 91, 91)
                .addComponent(mgnProductJButton)
                .addGap(31, 31, 31)
                .addComponent(mgnOrderJButton)
                .addGap(32, 32, 32)
                .addComponent(mgnMaintJButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void mgnProductJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgnProductJButtonActionPerformed
        // TODO add your handling code here:
        ManageProductJPanel mnpjp = new ManageProductJPanel(userProcessContainer, supplierOrganization, userAccount);
        userProcessContainer.add("ManageProductJPanel", mnpjp);
        ((CardLayout)userProcessContainer.getLayout()).next(userProcessContainer);
    }//GEN-LAST:event_mgnProductJButtonActionPerformed

    private void mgnOrderJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgnOrderJButtonActionPerformed
        // TODO add your handling code here:
        ManageOrderJPanel mojp = new ManageOrderJPanel(userProcessContainer, supplierOrganization, network,userAccount);
        userProcessContainer.add("ManageOrderJPanel", mojp);
        ((CardLayout)userProcessContainer.getLayout()).next(userProcessContainer);
    }//GEN-LAST:event_mgnOrderJButtonActionPerformed

    private void mgnMaintJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgnMaintJButtonActionPerformed
        // TODO add your handling code here:
        ManageMaintJPanel mmjp = new ManageMaintJPanel(userProcessContainer, userAccount);
        userProcessContainer.add("ManageMaintJPanel", mmjp);
        ((CardLayout)userProcessContainer.getLayout()).next(userProcessContainer);
    }//GEN-LAST:event_mgnMaintJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton mgnMaintJButton;
    private javax.swing.JButton mgnOrderJButton;
    private javax.swing.JButton mgnProductJButton;
    // End of variables declaration//GEN-END:variables
}
