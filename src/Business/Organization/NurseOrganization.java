/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.NurseRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author Vishnu
 */
public class NurseOrganization extends Organization {

    public NurseOrganization() {
        super(Organization.Type.Nurse.getValue());
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles = new HashSet<>();
        roles.add(new NurseRole());
        return roles;
    }
}

