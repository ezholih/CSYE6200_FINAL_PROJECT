/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.AdministrativeRole;

import Business.EnterPrise.Enterprise;
import Business.EnterPrise.HospitalEnterpise;
import Business.SurgeryRoom.SurgeryRoom;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Martin
 */
public class ManageSurgicalRoomJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageSurgicalRoomJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    
    public ManageSurgicalRoomJPanel(JPanel upc, Enterprise ep) {
        initComponents();
        this.userProcessContainer = upc;
        this.enterprise = ep;
        
        populateRoomTable();
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
        roomJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtRoomNumber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFloor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        backjButton1 = new javax.swing.JButton();
        addRoomJButton = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(500, 450));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Manage Surgicial Room");

        roomJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Room Number", "Address", "Floor", "Hospital"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(roomJTable);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Room Number");

        txtRoomNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Floor");

        txtFloor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFloor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFloorActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Address");

        txtAddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        backjButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backjButton1.setText("<< Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });

        addRoomJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addRoomJButton.setText("Add Room");
        addRoomJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRoomJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(backjButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(298, 298, 298)
                                .addComponent(addRoomJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(txtAddress))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(txtRoomNumber)
                                .addGap(126, 126, 126)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(txtFloor)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(txtFloor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backjButton1)
                    .addComponent(addRoomJButton))
                .addGap(59, 59, 59))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton1ActionPerformed

    private void addRoomJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRoomJButtonActionPerformed
        // TODO add your handling code here:
        int floor = 1;
        try{
            floor = Integer.parseInt(txtFloor.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Only numbers are allowed for floor number.");
            return;
        }        
        SurgeryRoom room = ((HospitalEnterpise)enterprise).getSurgeryRoomDirectory().createSurgeryRoom();
        room.setFloor(floor);
        room.setRoomnumber(txtRoomNumber.getText());
        room.setAddress(txtAddress.getText());
        populateRoomTable();
    }//GEN-LAST:event_addRoomJButtonActionPerformed

    private void txtFloorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFloorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFloorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addRoomJButton;
    private javax.swing.JButton backjButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable roomJTable;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtFloor;
    private javax.swing.JTextField txtRoomNumber;
    // End of variables declaration//GEN-END:variables

    private void populateRoomTable() {
        DefaultTableModel dtm = (DefaultTableModel)roomJTable.getModel();
        dtm.setRowCount(0);
        
        for(SurgeryRoom room : ((HospitalEnterpise)enterprise).getSurgeryRoomDirectory().getSurgeryRoomList()){
            Object[] row = new Object[4];
            
            row[0] = room;
            row[1] = room.getAddress();
            row[2] = room.getFloor();
            row[3] = enterprise.toString();
            
            dtm.addRow(row);
        }
    }
}
