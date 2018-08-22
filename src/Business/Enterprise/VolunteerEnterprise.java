/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;


import Business.Role.Role;
import Business.Role.VolunteerAdminRole;
import java.util.HashSet;

/**
 *
 * @author incha
 */
public class VolunteerEnterprise extends Enterprise{
    public VolunteerEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Volunteer);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
         roles= new HashSet<>();
        roles.add(new VolunteerAdminRole());
        return roles;
    }
}
