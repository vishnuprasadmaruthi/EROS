/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.ChiefOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.Rescue.Chief.ChiefWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Vishnu
 */
public class ChiefRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization,Enterprise enterprise, EcoSystem system) {
        return new ChiefWorkAreaJPanel(userProcessContainer, account, (ChiefOrganization)organization, enterprise,system);
    }
    
    
}
