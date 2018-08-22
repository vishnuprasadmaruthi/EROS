/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ChiefRole;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author Vishnu
 */
public class ChiefOrganization extends Organization{

    public ChiefOrganization() {
        super(Organization.Type.Chief.getValue());
    }
    
    @Override
    public HashSet<Role> getSupportedRole() {
        roles = new HashSet<>();
        roles.add(new ChiefRole());
        return roles;
    }
     
}