/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.SupplierRole;

import Business.Bill.Bill;
import Business.EcoSystem;
import Business.EnterPrise.Enterprise;
import Business.EnterPrise.PHSEnterpise;
import Business.Network.Network;
import Business.Order.Order;
import Business.Order.OrderItem;
import Business.Organization.AssetMgtOrganization;
import Business.Organization.FinaceOrganization;
import Business.Organization.Organization;
import Business.Organization.SupplierOrganization;
import Business.Payment.Payment;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Martin
 */
public class ManageOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrderJPanel
     */
    private JPanel userProcessContainer;
    private SupplierOrganization supplierOrganization;
    private FinaceOrganization finaceOrganization;
    private EcoSystem ecoSystem;
    
    public ManageOrderJPanel(JPanel upc, SupplierOrganization supOrg, EcoSystem ecosys) {
        initComponents();
        this.userProcessContainer = upc;
        this.supplierOrganization = supOrg;
        this.ecoSystem = ecosys;
        this.finaceOrganization = getFinaceOrganization();
        populateOrderTable();
        populateOrderItemTable(new Order());
        orderJTable.setCellSelectionEnabled(true);
        ListSelectionModel cellSelectionModel = orderJTable.getSelectionModel();
        cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        cellSelectionModel.addListSelectionListener(new myListSelectionListener());
        
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
        orderDetailJTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderJTable = new javax.swing.JTable();
        deliverJButton1 = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        billJButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtAccountNumber = new javax.swing.JTextField();
        txtBankName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Order Management");
        jLabel1.setToolTipText("");

        orderDetailJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Item Name", "Model", "Price", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orderDetailJTable);

        orderJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Total", "Payment Status", "Payment Type", "Delivery"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(orderJTable);

        deliverJButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deliverJButton1.setText("Deliver Order >>");
        deliverJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deliverJButton1ActionPerformed(evt);
            }
        });

        backJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Order Table");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Order Item Table");

        billJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        billJButton.setText("Create Bill");
        billJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billJButtonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Account Number");

        txtAccountNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtBankName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Bank Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtBankName, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(billJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backJButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deliverJButton1))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(49, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(billJButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtBankName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deliverJButton1)
                    .addComponent(backJButton))
                .addContainerGap(46, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        ((CardLayout)userProcessContainer.getLayout()).previous(userProcessContainer);        
    }//GEN-LAST:event_backJButtonActionPerformed

    private void billJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = orderJTable.getSelectedRow();
        Order order = (Order)orderDetailJTable.getValueAt(selectedRow, 0);
        int accountNumber = 00000000;
        if(txtBankName.getText()==null || txtAccountNumber.getText()==null){
            JOptionPane.showMessageDialog(null, "Bank info is not complete.");
            return;
        }
        try{
            accountNumber = Integer.parseInt(txtAccountNumber.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Bank account number can only be numbers.");
            return;
        }
        
        for(Network nw:ecoSystem.getNetworkList()){
            for(Enterprise ep : nw.getEnterpriseDirectory().getEnterpriseList()){
                if(ep instanceof PHSEnterpise){
                    for(Organization org : ep.getOrganazDirectory().getOrganizationList()){
                        if(org instanceof FinaceOrganization){
                            Bill bill = ((FinaceOrganization)org).getBillDirectory().createBill(order);
                            bill.setAccountNumber(accountNumber);
                            bill.setBankName(txtBankName.getText());
                        }
                    }
                }
            }
        }
        order.setStatus("Billed");
    }//GEN-LAST:event_billJButtonActionPerformed

    private void deliverJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deliverJButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = orderJTable.getSelectedRow();
        Order order = (Order)orderDetailJTable.getValueAt(selectedRow, 0);
        if( order != null){
            ManageDeliveryJPanel mdjp = new ManageDeliveryJPanel(userProcessContainer, order, ecoSystem);
            userProcessContainer.add("ManageDeliveryJPanel",mdjp);
            ((CardLayout)userProcessContainer.getLayout()).next(userProcessContainer);
        }else{
            JOptionPane.showMessageDialog(null, "No order is selected!");
        }
    }//GEN-LAST:event_deliverJButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton billJButton;
    private javax.swing.JButton deliverJButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable orderDetailJTable;
    private javax.swing.JTable orderJTable;
    private javax.swing.JTextField txtAccountNumber;
    private javax.swing.JTextField txtBankName;
    // End of variables declaration//GEN-END:variables

    
    private void populateOrderTable() {
        DefaultTableModel orderTable = (DefaultTableModel)orderJTable.getModel();
        orderTable.setRowCount(0);
        
        for(Order od:supplierOrganization.getOrderLis().getOrderList()){
            boolean flag = false;
            Object[] row = new Object[5];
            row[0] = od;
            row[1] = od.getTotalPrice();
            
            
            for(Payment pay : finaceOrganization.getPaymentDirectory().getPaymentList()){
                if(pay.getBill().getOrder().getOrderID() == od.getOrderID()){
                    row[2] = "Payed";
                    row[3] = pay.getPaymentType();
                    flag = true;
                }
            }
            if(flag == false){
                row[2] = od.getStatus();
                row[3] = "N/A";
            }
            if(od.getStatus() != "Delivered"){
                row[4] = "No";
            }else row[4] = "Yes";
            orderTable.addRow(row);
        }
    }
    
    private void populateOrderItemTable(Order order){
        DefaultTableModel orderItemTable = (DefaultTableModel)orderJTable.getModel();
        orderItemTable.setRowCount(0);
        
        for(OrderItem oi : order.getOiList()){
            Object[] row = new Object[5];
            row[0] = order.getOrderID();
            row[1] = oi.getMdProduct().getName();
            row[2] = oi.getMdProduct().getModel();
            row[3] = oi.getMdProduct().getPrice();
            row[4] = oi.getQuantity();
            
            orderItemTable.addRow(row);
        }
        
    }
    
    private FinaceOrganization getFinaceOrganization(){
        for(Network nw : ecoSystem.getNetworkList()){
            for(Enterprise ep : nw.getEnterpriseDirectory().getEnterpriseList()){
                if (ep.getEnterpriseType().equals(Enterprise.EnterpriseType.PHS)){
                    for(Organization org : ep.getOrganazDirectory().getOrganizationList()){
                        if(org instanceof FinaceOrganization){
                            return (FinaceOrganization)org;
                        }
                    }
                }
            }
        }
        return null;
    }
    
    class myListSelectionListener implements ListSelectionListener{
        public void valueChanged(ListSelectionEvent e) {
            int selectedRow = orderJTable.getSelectedRow();
            Order od = (Order)orderJTable.getValueAt(selectedRow, 0);
            if(od == null){
                JOptionPane.showMessageDialog(null, "No order is selected!");
                return;
            }
            populateOrderItemTable(od);
        }
    }
}
