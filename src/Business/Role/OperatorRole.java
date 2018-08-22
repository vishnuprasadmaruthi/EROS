/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.OperatorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.Rescue.Operator.OperatorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Vishnu
 */
public class OperatorRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization,Enterprise enterprise, EcoSystem system) {
        return new OperatorWorkAreaJPanel(userProcessContainer, account, (OperatorOrganization)organization, enterprise,system);
    }
    
}
