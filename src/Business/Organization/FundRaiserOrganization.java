/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.FundRaiserRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author Vishnu
 */
public class FundRaiserOrganization extends Organization{
       public FundRaiserOrganization() {
        super(Organization.Type.FundRaiser.getValue());
    }

    @Override
    public HashSet<Role> getSupportedRole() {
         roles = new HashSet<>();
        roles.add(new FundRaiserRole());
        return roles;
    }
     
    
}
