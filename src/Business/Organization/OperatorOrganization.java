/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Role.OperatorRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author incha
 */
public class OperatorOrganization extends Organization{
        public OperatorOrganization() {
        super(Organization.Type.Operator.getValue());
    }
    
    @Override
    public HashSet<Role> getSupportedRole() {
        roles = new HashSet<>();
        roles.add(new OperatorRole());
        return roles;
    }
}
