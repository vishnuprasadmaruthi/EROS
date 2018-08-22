/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.MedicalAdminOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.Medical.MedicalAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author incha
 */
public class MedicalAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,EcoSystem business) {
        return new MedicalAdminWorkAreaJPanel(userProcessContainer, account,(MedicalAdminOrganization)organization,enterprise,business);
            
    }
    
//    @Override
//    public String toString(){
//        return RoleType.MedicalAdmin.getValue();
//    }
}
