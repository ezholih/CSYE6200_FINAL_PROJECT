/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.FinaceRole;

import Business.Bill.Bill;
import Business.EnterPrise.Enterprise;
import Business.Network.Network;
import Business.Order.Order;
import Business.Organization.FinanceOrganization;
import Business.Organization.Organization;
import Business.Payment.Payment;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Martin
 */
public class ManagePaymentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagePaymentJPanel
     */
    private JPanel userProcessContainer;
    private Organization organization;
    private Network network;
    private String paymentType;
    private UserAccount userAccount;
    
    public ManagePaymentJPanel(JPanel upc, Organization org, UserAccount ua, Network nw) {
        initComponents();
        this.userProcessContainer = upc;
        this.organization = org;
        this.userAccount = ua;
        this.network = nw;
        populateBillTable();
        
        buttonGroup.add(cashJRadioButton);
        buttonGroup.add(checkJRadioButton);
        buttonGroup.add(transferJRadioButton);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        paymentJTable = new javax.swing.JTable();
        makePaymentJButton = new javax.swing.JButton();
        accountJLabel = new javax.swing.JLabel();
        cashJRadioButton = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        txtAccount = new javax.swing.JTextField();
        checkJRadioButton = new javax.swing.JRadioButton();
        transferJRadioButton = new javax.swing.JRadioButton();
        viewOrderJButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Manage Payment");

        backJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backJButton.setText("<< Back");

        paymentJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Total", "Originator", "Supplier", "Account"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(paymentJTable);

        makePaymentJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        makePaymentJButton.setText("Commit Payment");
        makePaymentJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makePaymentJButtonActionPerformed(evt);
            }
        });

        accountJLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        accountJLabel.setText("Account");
        accountJLabel.setEnabled(false);

        cashJRadioButton.setText("Cash");
        cashJRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashJRadioButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Payment Type");

        txtAccount.setEditable(false);

        checkJRadioButton.setText("Check");
        checkJRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkJRadioButtonActionPerformed(evt);
            }
        });

        transferJRadioButton.setText("Transfer");
        transferJRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferJRadioButtonActionPerformed(evt);
            }
        });

        viewOrderJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        viewOrderJButton.setText("View Order Detail >>");
        viewOrderJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOrderJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton)
                        .addGap(228, 228, 228)
                        .addComponent(makePaymentJButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cashJRadioButton)
                            .addGap(18, 18, 18)
                            .addComponent(checkJRadioButton)
                            .addGap(18, 18, 18)
                            .addComponent(transferJRadioButton)
                            .addGap(18, 18, 18)
                            .addComponent(accountJLabel)
                            .addGap(18, 18, 18)
                            .addComponent(txtAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(viewOrderJButton))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(viewOrderJButton)
                        .addComponent(jLabel2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cashJRadioButton)
                    .addComponent(checkJRadioButton)
                    .addComponent(transferJRadioButton)
                    .addComponent(txtAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountJLabel))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton)
                    .addComponent(makePaymentJButton))
                .addContainerGap(42, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void checkJRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkJRadioButtonActionPerformed
        // TODO add your handling code here:
        paymentType = "Check";
    }//GEN-LAST:event_checkJRadioButtonActionPerformed

    private void transferJRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferJRadioButtonActionPerformed
        // TODO add your handling code here:
        accountJLabel.setEnabled(true);
        txtAccount.setEditable(true);
        paymentType = "Transfer";
    }//GEN-LAST:event_transferJRadioButtonActionPerformed

    private void viewOrderJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewOrderJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = paymentJTable.getSelectedRow();
        if(selectedRow <0){
            JOptionPane.showMessageDialog(null, "No bill is selected");
            return;
        }        
        Bill bill = (Bill)paymentJTable.getValueAt(selectedRow, 0);
        Order order = bill.getOrder();
        ViewOrderDetailJPanel jp = new ViewOrderDetailJPanel(userProcessContainer,order);
        userProcessContainer.add("ViewOrderDetailJPanel", jp);
        ((CardLayout)userProcessContainer.getLayout()).next(userProcessContainer);
        
    }//GEN-LAST:event_viewOrderJButtonActionPerformed

    private void makePaymentJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makePaymentJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = paymentJTable.getSelectedRow();
        int account;
        if(selectedRow <0){
            JOptionPane.showMessageDialog(null, "No bill is selected");
            return;
        }   
        try{
            account = Integer.parseInt(txtAccount.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Bank account number can only be numbers.");
            return;
        }
        Bill bill = (Bill)paymentJTable.getValueAt(selectedRow, 0);
        Payment payment = ((FinanceOrganization)organization).getPaymentDirectory().createPayment(bill);
        payment.setPaymentType(paymentType);
        payment.setPayBy(userAccount);
        payment.setPayTo(bill.getBillBy());
        payment.setAccount(account);
    }//GEN-LAST:event_makePaymentJButtonActionPerformed

    private void cashJRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashJRadioButtonActionPerformed
        // TODO add your handling code here:
        paymentType = "Cash";
    }//GEN-LAST:event_cashJRadioButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountJLabel;
    private javax.swing.JButton backJButton;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JRadioButton cashJRadioButton;
    private javax.swing.JRadioButton checkJRadioButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton makePaymentJButton;
    private javax.swing.JTable paymentJTable;
    private javax.swing.JRadioButton transferJRadioButton;
    private javax.swing.JTextField txtAccount;
    private javax.swing.JButton viewOrderJButton;
    // End of variables declaration//GEN-END:variables

    private void populateBillTable() {
        DefaultTableModel dtm = (DefaultTableModel)paymentJTable.getModel();
        dtm.setRowCount(0);
        
        for(Bill bill : ((FinanceOrganization)organization).getBillDirectory().getBillList()){
            Object[] row = new Object[5];
            row[0] = bill;
            row[1] = bill.getAmount();
            row[2] = bill.getBillBy().getEmployee().getName();
            Enterprise ep = network.getEnterpriseDirectory().getEnterpriseByUserAccount(bill.getBillBy());
            row[3] = ep.toString();
            row[4] = bill.getAccountNumber();
            
            dtm.addRow(row);
        }
    }
}
