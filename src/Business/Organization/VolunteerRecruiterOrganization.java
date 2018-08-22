/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.VolunteerRecruiterRole;
import java.util.HashSet;

/**
 *
 * @author Vishnu
 */
public class VolunteerRecruiterOrganization extends Organization{
       public VolunteerRecruiterOrganization() {
        super(Organization.Type.VolunteerRecruiter.getValue());
    }

    @Override
    public HashSet<Role> getSupportedRole() {
         roles = new HashSet<>();
        roles.add(new VolunteerRecruiterRole());
        return roles;
    }
     
}
