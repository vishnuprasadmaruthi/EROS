/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DonorRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author Vishnu
 */
public class DonorOrganization extends Organization{
       public DonorOrganization() {
        super(Organization.Type.Donor.getValue());
    }

    @Override
    public HashSet<Role> getSupportedRole() {
         roles = new HashSet<>();
        roles.add(new DonorRole());
        return roles;
    }
     
}
