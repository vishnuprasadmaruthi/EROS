/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.RescueAdminOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.Rescue.RescueAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Vishnu
 */
public class RescueAdminRole  extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new RescueAdminWorkAreaJPanel(userProcessContainer,  account, (RescueAdminOrganization) organization, enterprise,  system);
    }
}