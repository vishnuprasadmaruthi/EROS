/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;

import Business.Organization.Organization;
import Business.Organization.VolunteerAdminOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.Volunteer.VolunteerAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author incha
 */
public class VolunteerAdminRole  extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization,Enterprise enterprise, EcoSystem system) {
       return new VolunteerAdminWorkAreaJPanel(userProcessContainer, account, (VolunteerAdminOrganization)organization,enterprise,system);
    
    }
    
}
