/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.MarineSquadOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.Rescue.MarineSquad.MarineWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Vishnu
 */
public class MarineSquadRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization,Enterprise enterprise, EcoSystem system) {
        return new MarineWorkAreaJPanel(userProcessContainer, account, (MarineSquadOrganization)organization, enterprise,system);
    }
    
}
