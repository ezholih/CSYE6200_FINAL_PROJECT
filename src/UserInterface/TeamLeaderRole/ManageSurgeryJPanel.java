/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.TeamLeaderRole;

import Business.EcoSystem;
import Business.EnterPrise.Enterprise;
import Business.EnterPrise.HospitalEnterpise;
import Business.EnterPrise.PHSEnterpise;
import Business.MedicalDevice.MedicalDevice;
import Business.Network.Network;
import Business.Organization.AssetMgtOrganization;
import Business.Organization.MedStaffOrganization;
import Business.Organization.Organization;
import Business.Surgery.SurgeryRequest;
import Business.Surgery.SurgerySchedule;
import Business.SurgeryRoom.SurgeryRoom;
import Business.SurgeryRoom.SurgeryRoomDirectory;
import Business.UserAccount.SurgicalTeam;
import Business.UserAccount.UserAccount;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Martin
 */
public class ManageSurgeryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageSurgeryJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    private PHSEnterpise phsEnterprise;
    private UserAccount userAccount;
    private Organization organization;
    private SurgeryRoomDirectory surgeryRoomDirectory;
    private HospitalEnterpise hspEnterpise;
    
    public ManageSurgeryJPanel(JPanel upc, UserAccount account, Organization organization, EcoSystem business) {
        initComponents();
        this.userProcessContainer = upc;
        this.ecoSystem = business;
        this.userAccount = account;
        this.organization = organization;
        
        this.phsEnterprise = getPHSEnterprise();
        this.surgeryRoomDirectory = getSurgeryRoomDirectory();
        this.hspEnterpise = getHospitalEnterprise();
        populateDeviceTable();
        populateRoomTable();
        
        jDateChooser.addPropertyChangeListener("date", new PropertyChangeListener() {
        @Override
        public void propertyChange(PropertyChangeEvent evt) {
                Date date = (Date)evt.getNewValue();
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                String szDate = dateFormat.format(date);
                populateDeviceTableByDate(szDate);
                populateRoomTableByDate(szDate);
            }
        });
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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        roomJTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        deviceJTable = new javax.swing.JTable();
        BackJButton = new javax.swing.JButton();
        reserveJButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Manage Surgery Schedule");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Room Table");

        roomJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Room Number", "Hospital", "Floor"
            }
        ));
        jScrollPane1.setViewportView(roomJTable);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Select Date");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Medical Device Table");

        deviceJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Device ID", "Name", "Model"
            }
        ));
        jScrollPane2.setViewportView(deviceJTable);

        BackJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BackJButton.setText("<< Back");
        BackJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackJButtonActionPerformed(evt);
            }
        });

        reserveJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        reserveJButton.setText("Request");
        reserveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserveJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(BackJButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(reserveJButton))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 34, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackJButton)
                    .addComponent(reserveJButton))
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackJButtonActionPerformed

    }//GEN-LAST:event_BackJButtonActionPerformed

    private void reserveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserveJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRoom = roomJTable.getSelectedRow();
        int selectedDevice = deviceJTable.getSelectedRow();
        if(selectedRoom <0 || selectedDevice <0){
            JOptionPane.showMessageDialog(null, "No room or device is selected");
            return;
        }
        
        Date date = jDateChooser.getDate();
        if(null == date || date.before(new Date())){
            JOptionPane.showMessageDialog(null, "Invalid date!");
            return;
        }
        SurgeryRoom room = (SurgeryRoom)roomJTable.getValueAt(selectedRoom, 0);
        MedicalDevice md = (MedicalDevice)deviceJTable.getValueAt(selectedDevice, 0);
        SurgerySchedule surgerySchedule = new SurgerySchedule(getMyTeam(), date, md);
        for(Organization org : phsEnterprise.getOrganazDirectory().getOrganizationList()){
            if(org instanceof AssetMgtOrganization){
                SurgeryRequest request = ((AssetMgtOrganization)org).createRequest(surgerySchedule);
                request.setSurgeryRoom(room);
                request.setHospitalEnterpise(hspEnterpise);
            }
        }
        
    }//GEN-LAST:event_reserveJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackJButton;
    private javax.swing.JTable deviceJTable;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton reserveJButton;
    private javax.swing.JTable roomJTable;
    // End of variables declaration//GEN-END:variables

    private PHSEnterpise getPHSEnterprise() {
        PHSEnterpise ent = null;
        for(Network nw : ecoSystem.getNetworkList()){
            for(Enterprise ep : nw.getEnterpriseDirectory().getEnterpriseList()){
                if(ep instanceof PHSEnterpise){
                    ent = (PHSEnterpise)ep;
                    break;
                }
            }
        }
        return ent;
    }

    private void populateDeviceTable() {
        DefaultTableModel dtm = (DefaultTableModel) deviceJTable.getModel();
        dtm.setRowCount(0);
        
        for(Organization org : phsEnterprise.getOrganazDirectory().getOrganizationList()){
            if(org instanceof AssetMgtOrganization){
                for(MedicalDevice medicalDevice : ((AssetMgtOrganization)org).getMedicalDeviceInventory().getMedicalDeviceList()){
                    if((medicalDevice.getStatus().equals("Operational"))){
                        Object[] row = new Object[3];
                        
                        row[0] = medicalDevice;
                        row[1] = medicalDevice.getName();
                        row[2] = medicalDevice.getModel();
                        
                        dtm.addRow(row);
                    }
                }
            }
        }
    }
    
    private SurgeryRoomDirectory getSurgeryRoomDirectory(){
        SurgeryRoomDirectory surgRoomDirectory = null;
        for(Network nw : ecoSystem.getNetworkList()){
            for(Enterprise ep : nw.getEnterpriseDirectory().getEnterpriseList()){
                if(ep instanceof HospitalEnterpise){
                    for(Organization org : ep.getOrganazDirectory().getOrganizationList()){
                        if(org instanceof MedStaffOrganization){
                            for(UserAccount ua : org.getUserAccountDirectory().getUserAccountList()){
                                if(ua.equals(userAccount)){
                                    surgRoomDirectory = ((HospitalEnterpise)ep).getSurgeryRoomDirectory();
                                }
                            }
                        }
                    }
                }
            }
        }
        return surgRoomDirectory;
    }

    private HospitalEnterpise getHospitalEnterprise(){
        HospitalEnterpise hspEnterprise = null;
        for(Network nw : ecoSystem.getNetworkList()){
            for(Enterprise ep : nw.getEnterpriseDirectory().getEnterpriseList()){
                if(ep instanceof HospitalEnterpise){
                    for(Organization org : ep.getOrganazDirectory().getOrganizationList()){
                        if(org instanceof MedStaffOrganization){
                            for(UserAccount ua : org.getUserAccountDirectory().getUserAccountList()){
                                if(ua.equals(userAccount)){
                                    hspEnterprise = (HospitalEnterpise)ep;
                                }
                            }
                        }
                    }
                }
            }
        }
        return hspEnterprise;
    }
    
    private void populateDeviceTableByDate(String date){
        DefaultTableModel dtm = (DefaultTableModel) deviceJTable.getModel();
        dtm.setRowCount(0);
        
        for(Organization org : phsEnterprise.getOrganazDirectory().getOrganizationList()){
            if(org instanceof AssetMgtOrganization){
                AssetMgtOrganization astMgtOrg = (AssetMgtOrganization)org;
                for(MedicalDevice medicalDevice : ((AssetMgtOrganization)org).getMedicalDeviceInventory().getMedicalDeviceList()){
                    if((medicalDevice.getStatus().equals("Operational"))){
                        if(!(astMgtOrg.searchDeviceByDate(medicalDevice, date))){
                            Object[] row = new Object[3];

                            row[0] = medicalDevice;
                            row[1] = medicalDevice.getName();
                            row[2] = medicalDevice.getModel();

                            dtm.addRow(row);
                        }
                    }
                }
            }
        }
    }
    
    private void populateRoomTable() {
        DefaultTableModel dtm = (DefaultTableModel) roomJTable.getModel();
        dtm.setRowCount(0);
        
        for(SurgeryRoom room : surgeryRoomDirectory.getSurgeryRoomList()){
            Object[] row = new Object[3];
            row[0] = room;
            row[1] = hspEnterpise.toString();
            row[2] = room.getFloor();
            
            dtm.addRow(row);
        }
    }
    
    
    private void populateRoomTableByDate(String szDate) {
        DefaultTableModel dtm = (DefaultTableModel) roomJTable.getModel();
        dtm.setRowCount(0);
        
        for(SurgeryRoom room : surgeryRoomDirectory.getSurgeryRoomList()){
            if(!(surgeryRoomDirectory.searchRoom(room, szDate))){
                Object[] row = new Object[3];
                row[0] = room;
                row[1] = hspEnterpise.toString();
                row[2] = room.getFloor();

                dtm.addRow(row);
            }
        }
    }
    
    private SurgicalTeam getMyTeam(){
        SurgicalTeam myTeam = null;
        for(SurgicalTeam team : ((MedStaffOrganization)organization).getSurgicalTeamList()){
            if(team.getTeamLeader().equals(userAccount)){
                myTeam = team;
            }
        }
        return myTeam;
    }
}
