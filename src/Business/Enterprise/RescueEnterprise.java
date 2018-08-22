/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.ChiefRole;
import Business.Role.GroundSquadRole;
import Business.Role.MarineSquadRole;
import Business.Role.RescueAdminRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author Vishnu
 */
public class RescueEnterprise extends Enterprise{
    
    public RescueEnterprise(String name) {
        super(name, EnterpriseType.Rescue);
    }
    
     @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new ChiefRole());
        roles.add(new RescueAdminRole());
        roles.add(new GroundSquadRole());
        roles.add(new MarineSquadRole());
        return roles;
    }
    
    
}
