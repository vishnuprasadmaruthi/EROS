/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.GroundSquadRole;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author Vishnu
 */
public class GroundSquadOrganization extends Organization{

    public GroundSquadOrganization() {
        super(Organization.Type.GroundSquad.getValue());
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles = new HashSet<>();
        roles.add(new GroundSquadRole());
        return roles;
    }
     
   
    
    
}
