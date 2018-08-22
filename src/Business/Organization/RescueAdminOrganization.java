/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author Vishnu
 */
public class RescueAdminOrganization extends Organization {
    
    public RescueAdminOrganization(){
        super(Organization.Type.RescueAdmin.getValue());
    }
    
    @Override
    public HashSet<Role> getSupportedRole() {     
//        roles.add(new DoctorRole() );
//        roles.add(new PharmaManagerRole());
        return roles;
    }
    
}
