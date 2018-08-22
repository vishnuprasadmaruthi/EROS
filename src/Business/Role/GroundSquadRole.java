/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.GroundSquadOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.Rescue.GroundSquad.GroundSquadWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Vishnu
 */
public class GroundSquadRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization,Enterprise enterprise, EcoSystem system) {
        return new GroundSquadWorkAreaJPanel(userProcessContainer, account, (GroundSquadOrganization)organization,enterprise, system);
    }
    
}
