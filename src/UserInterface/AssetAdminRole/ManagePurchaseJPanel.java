/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.AssetAdminRole;

import Business.Bill.Bill;
import Business.EnterPrise.Enterprise;
import Business.EnterPrise.SupplierEnterpise;
import Business.MedicalDevice.MedicalDeviceProduct;
import Business.Network.Network;
import Business.Order.Order;
import Business.Order.OrderItem;
import Business.Organization.AssetMgtOrganization;
import Business.Organization.Organization;
import Business.Organization.SupplierOrganization;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Martin
 */
public class ManagePurchaseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PurchaseMgnJPanel
     */
    private JPanel userProcessContainer;
    private Network network;
    private Order order;
    
    public ManagePurchaseJPanel(JPanel upc, Network nw) {
        initComponents();
        this.userProcessContainer = upc;
        this.network = nw;
        order = getOrderFromPHS();
        
        populateComboBox();
        refreshProductTable();
        refreshOrderItemTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBTAddToCart = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableOrderItem = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jSpinnerQuantity = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jBTViewProduct = new javax.swing.JButton();
        jTFModQuantity = new javax.swing.JTextField();
        jBTModQuantity = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        productJTable = new javax.swing.JTable();
        jBTRemoveItem = new javax.swing.JButton();
        jBTCheckOut = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jCBSupplier = new javax.swing.JComboBox();
        jBTBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jBTAddToCart.setText("Add to shopping cart");
        jBTAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTAddToCartActionPerformed(evt);
            }
        });

        jTableOrderItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Item Name", "Price", "Quantity", "Total Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTableOrderItem);

        jLabel4.setText("Quantity");

        jSpinnerQuantity.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), null, null, Integer.valueOf(1)));

        jLabel6.setText("Modify Quantity");

        jBTViewProduct.setText("View Product Detail");
        jBTViewProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTViewProductActionPerformed(evt);
            }
        });

        jTFModQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFModQuantityActionPerformed(evt);
            }
        });

        jBTModQuantity.setText("Update");
        jBTModQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTModQuantityActionPerformed(evt);
            }
        });

        productJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product ID", "Name", "Model", "Price"
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

        jBTRemoveItem.setText("Remove Item");
        jBTRemoveItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTRemoveItemActionPerformed(evt);
            }
        });

        jBTCheckOut.setText("Send Order");
        jBTCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTCheckOutActionPerformed(evt);
            }
        });

        jLabel5.setText("Items in shopping cart");

        jCBSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBSupplierActionPerformed(evt);
            }
        });

        jBTBack.setText("<< Back");
        jBTBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTBackActionPerformed(evt);
            }
        });

        jLabel2.setText("Supplier");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("New Device Purchase");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                        .addGap(374, 374, 374))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBTViewProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(86, 86, 86)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinnerQuantity)
                                .addGap(18, 18, 18)
                                .addComponent(jBTAddToCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBTRemoveItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBTBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(61, 61, 61)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTFModQuantity)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBTModQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBTCheckOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jCBSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCBSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBTViewProduct)
                            .addComponent(jBTAddToCart)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jSpinnerQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBTModQuantity)
                        .addComponent(jTFModQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addComponent(jBTRemoveItem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBTBack)
                    .addComponent(jBTCheckOut))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBTAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTAddToCartActionPerformed
        // TODO add your handling code here:
        int selectedRow = productJTable.getSelectedRow();
        if (selectedRow < 0) {
            return;
        }

        MedicalDeviceProduct p = (MedicalDeviceProduct) productJTable.getValueAt(selectedRow, 0);
        int quantity = (Integer) jSpinnerQuantity.getValue();
        
//        Object selected = jCBSupplier.getSelectedItem();
//        if (selected instanceof Enterprise) {
//            for(Organization org : ((SupplierEnterpise)selected).getOrganazDirectory().getOrganizationList()){
//                order = ((SupplierOrganization)org).getOrderLis().createOrder();
//            }
//        }
        OrderItem oi = order.createOrderItem(p, quantity);
        oi.setEnterprise(((SupplierEnterpise)jCBSupplier.getSelectedItem()));
        refreshOrderItemTable();
    }//GEN-LAST:event_jBTAddToCartActionPerformed

    private void jBTViewProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTViewProductActionPerformed
        // TODO add your handling code here:
        int selectedRow = productJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "No product is selected!");
            return;
        }

        MedicalDeviceProduct p = (MedicalDeviceProduct) productJTable.getValueAt(selectedRow, 0);
        ViewProductJPanel vpdjp = new ViewProductJPanel(userProcessContainer, p);
        userProcessContainer.add("ViewProductJPanel", vpdjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jBTViewProductActionPerformed

    private void jTFModQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFModQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFModQuantityActionPerformed

    private void jBTModQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTModQuantityActionPerformed
        int selectedRow = jTableOrderItem.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "You haven't selected any oder yet! Please select at least one order!", "WARNING", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int newQuantity;
        try {
            newQuantity = Integer.parseInt(jTFModQuantity.getText());
        } catch (NumberFormatException e) {
            String message = e.getMessage().toLowerCase();
            JOptionPane.showMessageDialog(null, "The format " + message + " is not correct, only numbers are allowed!", "WARNING", JOptionPane.WARNING_MESSAGE);
            return;
        }
        OrderItem oi = (OrderItem) jTableOrderItem.getValueAt(selectedRow, 0);
        oi.setQuantity(newQuantity);
        refreshOrderItemTable();
    }//GEN-LAST:event_jBTModQuantityActionPerformed

    private void jBTRemoveItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTRemoveItemActionPerformed
        int selectedRow = jTableOrderItem.getSelectedRow();
        if (selectedRow < 0) {
            return;
        }

        int result = JOptionPane.showConfirmDialog(null, "Would you like to delete this order item?", "Warning", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            OrderItem oi = (OrderItem) jTableOrderItem.getValueAt(selectedRow, 0);
            order.deleteOI(oi);
            for (Enterprise ep : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (ep.getEnterpriseType().equals(Enterprise.EnterpriseType.Supplier)) {
                    for (Organization org : ep.getOrganazDirectory().getOrganizationList()) {
                        if (org instanceof SupplierOrganization) {
                            Order od = ((SupplierOrganization)org).getOrderLis().searchOrderItem(oi);
                            od.deleteOI(oi);
                        }
                    }
                }
            }
            refreshOrderItemTable();
        }
    }//GEN-LAST:event_jBTRemoveItemActionPerformed

    private void jBTCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTCheckOutActionPerformed
        if (order == null || order.getOiList().size() <= 0) {
            JOptionPane.showConfirmDialog(null, "Shopping cart is enmpty!", "WARNING", JOptionPane.OK_OPTION);
        } else {
            Order od = null;
            for (Enterprise ep : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (ep.getEnterpriseType().equals(Enterprise.EnterpriseType.Supplier)) {
                    for (Organization org : ep.getOrganazDirectory().getOrganizationList()) {
                        if (org instanceof SupplierOrganization) {
                            od = ((SupplierOrganization) org).getOrderLis().createOrder();
                            for(OrderItem oi : order.getOiList()){
                                if(oi.getEnterprise().equals(ep)){
                                    od.getOiList().add(oi);
                                }
                            }
                        }
                    }
                }
            }

            JOptionPane.showMessageDialog(null, "Order has been created!", "Thanks", JOptionPane.YES_OPTION);
            refreshOrderItemTableByOrder(new Order());
        }
    }//GEN-LAST:event_jBTCheckOutActionPerformed

    private void jCBSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBSupplierActionPerformed
        Object selected = jCBSupplier.getSelectedItem();
        if (selected instanceof Enterprise) {
            refreshProductTableBySupplier((SupplierEnterpise)selected);
        } else {
            refreshProductTable();
        }
    }//GEN-LAST:event_jCBSupplierActionPerformed

    private void jBTBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jBTBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBTAddToCart;
    private javax.swing.JButton jBTBack;
    private javax.swing.JButton jBTCheckOut;
    private javax.swing.JButton jBTModQuantity;
    private javax.swing.JButton jBTRemoveItem;
    private javax.swing.JButton jBTViewProduct;
    private javax.swing.JComboBox jCBSupplier;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinnerQuantity;
    private javax.swing.JTextField jTFModQuantity;
    private javax.swing.JTable jTableOrderItem;
    private javax.swing.JTable productJTable;
    // End of variables declaration//GEN-END:variables

    private void refreshProductTable() {
        DefaultTableModel dtm = (DefaultTableModel)productJTable.getModel();
        dtm.setRowCount(0);
        
        for(Enterprise ep : network.getEnterpriseDirectory().getEnterpriseList()){
            if(ep.getEnterpriseType().equals(Enterprise.EnterpriseType.Supplier)){
                for(Organization org : ep.getOrganazDirectory().getOrganizationList()){
                    if(org instanceof SupplierOrganization){
                        for(MedicalDeviceProduct mdp : ((SupplierOrganization)org).getmDProductCatalog().getMdProductList()){
                            Object[] row = new Object[4];
                            row[0] = mdp;
                            row[1] = mdp.getName();
                            row[2] = mdp.getModel();
                            row[3] = mdp.getPrice();
                            
                            dtm.addRow(row);
                        }
                    }
                }
            }
        }
    }
    
    private void populateComboBox(){
        jCBSupplier.removeAllItems();
        
        for(Enterprise ep : network.getEnterpriseDirectory().getEnterpriseList()){
            if(ep.getEnterpriseType().equals(Enterprise.EnterpriseType.Supplier)){
                        jCBSupplier.addItem(ep);
            }
        }
    
    }

    private void refreshProductTableBySupplier(Enterprise ep) {
        DefaultTableModel dtm = (DefaultTableModel)productJTable.getModel();
        dtm.setRowCount(0);
        
        for(Organization org : ep.getOrganazDirectory().getOrganizationList()){
            if (org instanceof SupplierOrganization) {
                for (MedicalDeviceProduct mdp : ((SupplierOrganization) org).getmDProductCatalog().getMdProductList()) {
                    Object[] row = new Object[4];
                    row[0] = mdp;
                    row[1] = mdp.getName();
                    row[2] = mdp.getModel();
                    row[3] = mdp.getPrice();

                    dtm.addRow(row);
                }
            }
        }
    }

    private Order getOrderFromPHS() {
        Order od = null;
        for (Enterprise ep : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (ep.getEnterpriseType().equals(Enterprise.EnterpriseType.PHS)) {
                for (Organization org : ep.getOrganazDirectory().getOrganizationList()) {
                    if (org instanceof AssetMgtOrganization) {
                        od = ((AssetMgtOrganization)org).getOrderList().createOrder();
                    }
                }
                break;
            }
        }
        return od;
    }

    private  void refreshOrderItemTable() {
        DefaultTableModel dtm = (DefaultTableModel) jTableOrderItem.getModel();
        dtm.setRowCount(0);
        
        if(order != null){
            for (OrderItem oi : order.getOiList()) {
                Object[] row = new Object[4];
                row[0] = oi;
                row[1] = oi.getMdProduct().getPrice();
                row[2] = oi.getQuantity();
                row[3] = oi.getMdProduct().getPrice() * oi.getQuantity();

                dtm.addRow(row);
            }
        }
    }
    
    private void refreshOrderItemTableByOrder(Order od){
        DefaultTableModel dtm = (DefaultTableModel) jTableOrderItem.getModel();
        dtm.setRowCount(0);

        for (OrderItem oi : od.getOiList()) {
            Object[] row = new Object[4];
            row[0] = oi;
            row[1] = oi.getMdProduct().getPrice();
            row[2] = oi.getQuantity();
            row[3] = oi.getMdProduct().getPrice() * oi.getQuantity();

            dtm.addRow(row);
        }
    } 
}
