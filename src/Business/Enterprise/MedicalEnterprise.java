/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.MedicalAdminRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author incha
 */
public class MedicalEnterprise extends Enterprise{
    public MedicalEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Medical);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
         roles= new HashSet<>();
        roles.add(new MedicalAdminRole());
        return roles;
    }
}
