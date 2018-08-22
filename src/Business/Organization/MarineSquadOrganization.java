/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.GroundSquadRole;
import Business.Role.MarineSquadRole;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author Vishnu
 */
public class MarineSquadOrganization extends Organization{

    public MarineSquadOrganization() {
        super(Organization.Type.MarineSquad.getValue());
    }

    @Override
    public HashSet<Role> getSupportedRole() {
         roles = new HashSet<>();
        roles.add(new MarineSquadRole());
        return roles;
    }
     
   
    
    
}
