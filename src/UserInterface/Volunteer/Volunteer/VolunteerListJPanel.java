/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Volunteer.Volunteer;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.VolunteerOrganization;
import Business.UserAccount.UserAccount;
import Business.Volunteer.Donations;
import Business.Volunteer.Volunteer;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vishnu
 */
public class VolunteerListJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VolunteerListJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private VolunteerOrganization organization;
    private Enterprise enterprise;
    private Volunteer volunteer;
    public VolunteerListJPanel(JPanel userProcessContainer,UserAccount account,VolunteerOrganization organization,Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        System.out.println("org" + organization);
        volunteerList();
    }
    
    
    public void volunteerList(){
        DefaultTableModel dtm = (DefaultTableModel)volunteerListTable.getModel();
        dtm.setRowCount(0);
        
//        for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
//            if (o instanceof VolunteerOrganization) {
                System.out.println(" org "+ organization);
                System.out.println(" ud "+ organization.getUserAccountDirectory());
                System.out.println(" ual "+ organization.getUserAccountDirectory().getUserAccountList());
                
            for(UserAccount acc : organization.getUserAccountDirectory().getUserAccountList()){
                System.out.println("acc = "+acc);
                System.out.println("donations = "+acc.getEmployee().getMydonations().size());
                if(acc.getEmployee().getMydonations().size()> 0){
                  for (Donations d : acc.getEmployee().getMydonations()) {
                    Object row[] = new Object[4];
                    row[0] =acc.getEmployee();
                    row[1] = d.getDonationType();
                    row[2] = d.getQuantity();
                    row[3] = d.getCause();
                     dtm.addRow(row);
                }  
               
                }
            }
                
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
        volunteerListTable = new javax.swing.JTable();
        backjButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Contributions by Volunteers:");
        add(jLabel1);
        jLabel1.setBounds(510, 160, 258, 22);

        volunteerListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Volunteer", "Donation Type", "Quantiy/Amount", "Cause"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(volunteerListTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(510, 200, 520, 332);

        backjButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backjButton.setText("<<Back");
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });
        add(backjButton);
        backjButton.setBounds(100, 510, 120, 31);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Volunteer/volunteerImage.JPG"))); // NOI18N
        jLabel13.setText("jLabel2");
        add(jLabel13);
        jLabel13.setBounds(0, 550, 600, 450);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Volunteer/volunteerImage.JPG"))); // NOI18N
        jLabel14.setText("jLabel2");
        add(jLabel14);
        jLabel14.setBounds(600, 550, 600, 450);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Volunteer/volunteerImage.JPG"))); // NOI18N
        jLabel15.setText("jLabel2");
        add(jLabel15);
        jLabel15.setBounds(1190, 550, 770, 450);
    }// </editor-fold>//GEN-END:initComponents

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable volunteerListTable;
    // End of variables declaration//GEN-END:variables
}
