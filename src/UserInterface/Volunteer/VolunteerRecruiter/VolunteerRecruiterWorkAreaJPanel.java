/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Volunteer.VolunteerRecruiter;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.VolunteerRecruiterOrganization;
import Business.UserAccount.UserAccount;
import Business.Volunteer.Volunteer;
import Business.Volunteer.VolunteerDirectory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Vishnu
 */
public class VolunteerRecruiterWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VolunteerRecriterWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private Organization organization;
    private Enterprise enterprise;
    private EcoSystem business;
    public VolunteerRecruiterWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, VolunteerRecruiterOrganization organization, Enterprise enterprise,EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.business = business;
                
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        signUpBtngrp = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        rbtnYes = new javax.swing.JRadioButton();
        rbtnNo = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ageSpinner = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        saveDetailsBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("VolunteerRecruiterWorkArea");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 22, -1, -1));

        rbtnYes.setText("Yes");
        rbtnYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnYesActionPerformed(evt);
            }
        });
        add(rbtnYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 69, -1, -1));

        rbtnNo.setText("No");
        rbtnNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnNoActionPerformed(evt);
            }
        });
        add(rbtnNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 69, -1, -1));

        jLabel3.setText("First Name:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 116, -1, -1));

        txtFirstName.setEnabled(false);
        add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 110, 159, -1));

        jLabel4.setText("Last Name:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 151, -1, -1));

        txtLastName.setEnabled(false);
        add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 148, 160, -1));

        jLabel5.setText("Age:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 189, -1, -1));

        ageSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        ageSpinner.setEnabled(false);
        add(ageSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 186, -1, -1));

        jLabel6.setText("E-mail:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 227, -1, -1));

        txtEmail.setEnabled(false);
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 224, 160, -1));

        jLabel7.setText("Address:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 265, -1, -1));

        txtAddress.setEnabled(false);
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 262, 160, -1));

        saveDetailsBtn.setText("Save Details");
        saveDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveDetailsBtnActionPerformed(evt);
            }
        });
        add(saveDetailsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 360, 160, 43));

        jLabel8.setText("City:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 303, -1, -1));

        txtCity.setEnabled(false);
        add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 300, 160, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnYesActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Great! Start volunteering now");
    }//GEN-LAST:event_rbtnYesActionPerformed

    private void rbtnNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnNoActionPerformed
        // TODO add your handling code here:
        txtFirstName.setEnabled(true);
        txtLastName.setEnabled(true);
        txtCity.setEnabled(true);
        txtEmail.setEnabled(true);
        txtAddress.setEnabled(true);
        ageSpinner.setEnabled(true);
        
        
    }//GEN-LAST:event_rbtnNoActionPerformed

    private void saveDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveDetailsBtnActionPerformed
        // TODO add your handling code here:
        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText();
        String city = txtCity.getText();
        String address = txtAddress.getText();
        String email = txtEmail.getText();
        int age = (int)ageSpinner.getValue();
        
        Volunteer volunteer = new Volunteer(firstName,lastName,email,address,city,age);
        VolunteerDirectory vd = organization.getVolunteerDirectory();
        vd.getVolunteerDirectory().add(volunteer);
        organization.setVolunteerDirectory(vd);
        
        JOptionPane.showMessageDialog(this, "Volunteer Details saved successfully");
    }//GEN-LAST:event_saveDetailsBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner ageSpinner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton rbtnNo;
    private javax.swing.JRadioButton rbtnYes;
    private javax.swing.JButton saveDetailsBtn;
    private javax.swing.ButtonGroup signUpBtngrp;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    // End of variables declaration//GEN-END:variables
}
