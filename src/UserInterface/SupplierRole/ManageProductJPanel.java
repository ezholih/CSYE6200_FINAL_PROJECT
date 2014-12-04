/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.SupplierRole;

import Business.MedicalDevice.MedicalDeviceProduct;
import Business.Organization.SupplierOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Martin
 */
public class ManageProductJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageProductJPanel
     */
    private JPanel userProcessContainer;
    private SupplierOrganization supplierOrganization;
    private UserAccount userAccount;
    
    public ManageProductJPanel(JPanel upc, SupplierOrganization supOrg, UserAccount ua) {
        initComponents();
        this.userProcessContainer = upc;
        this.supplierOrganization = supOrg;
        this.userAccount = ua;
        
        populateTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        productJTable = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        addProductJButton = new javax.swing.JButton();
        delProductJButton2 = new javax.swing.JButton();
        viewProductJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();

        setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Product Management");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 12, 0, 0);
        add(jLabel1, gridBagConstraints);

        productJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Model", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(productJTable);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 425;
        gridBagConstraints.ipady = 128;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(18, 12, 0, 60);
        add(jScrollPane1, gridBagConstraints);

        backJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 12, 62, 0);
        add(backJButton, gridBagConstraints);

        addProductJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addProductJButton.setText("Add Product >>");
        addProductJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductJButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 89, 0, 60);
        add(addProductJButton, gridBagConstraints);

        delProductJButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        delProductJButton2.setText("Delete Product");
        delProductJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delProductJButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 12, 0, 0);
        add(delProductJButton2, gridBagConstraints);

        viewProductJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        viewProductJButton.setText("View Product >>");
        viewProductJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProductJButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 89, 62, 60);
        add(viewProductJButton, gridBagConstraints);

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 149, 0, 60);
        add(refreshJButton, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void addProductJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductJButtonActionPerformed
        // TODO add your handling code here:
        ManageNewProductJPanel mnpjp = new ManageNewProductJPanel(userProcessContainer, supplierOrganization, userAccount);
        userProcessContainer.add("ManageNewProductJPanel", mnpjp);
        ((CardLayout)userProcessContainer.getLayout()).next(userProcessContainer);
    }//GEN-LAST:event_addProductJButtonActionPerformed

    private void viewProductJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProductJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = productJTable.getSelectedRow();
        if(selectedRow < 0 ){
            JOptionPane.showMessageDialog(null, "Please select a product to continue!");
            return;
        }
        MedicalDeviceProduct mdp = (MedicalDeviceProduct)productJTable.getValueAt(selectedRow, 0);
        ViewProductJPanel vpjp = new ViewProductJPanel(userProcessContainer, mdp);
        userProcessContainer.add("ViewProductJPanel", vpjp);
        ((CardLayout)userProcessContainer.getLayout()).next(userProcessContainer);
    }//GEN-LAST:event_viewProductJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        ((CardLayout)userProcessContainer.getLayout()).previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void delProductJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delProductJButton2ActionPerformed
        // TODO add your handling code here:
        int selectedRow = productJTable.getSelectedRow();
        if(selectedRow < 0 ){
            JOptionPane.showMessageDialog(null, "Please select a product to continue!");
            return;
        }
        MedicalDeviceProduct mdp = (MedicalDeviceProduct)productJTable.getValueAt(selectedRow, 0);        
        supplierOrganization.getmDProductCatalog().delProduct(mdp);
    }//GEN-LAST:event_delProductJButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProductJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton delProductJButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable productJTable;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton viewProductJButton;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel)productJTable.getModel();
        dtm.setRowCount(0);
        
        for(MedicalDeviceProduct mdp : supplierOrganization.getmDProductCatalog().getMdProductList()){
            Object[] row = new Object[4];
            row[0] = mdp;
            row[1] = mdp.getName();
            row[2] = mdp.getModel();
            row[3] = mdp.getPrice();
            
            dtm.addRow(row);
        }
    }
}
