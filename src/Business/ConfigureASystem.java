package Business;

import Business.Employee.Employee;
import Business.Network.Network;
import Business.Network.Person;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Vishnu
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("VP");
//        Employee employee2 = system.getEmployeeDirectory().createEmployee("Operator");

        UserAccount ua = system.getUserAccountDirectory().createUserAccount("admin", "admin", employee, new SystemAdminRole());
//        UserAccount ua1 = system.getUserAccountDirectory().createUserAccount("o", "o", employee2, new OperatorRole());
        
        
        return system;
    }
    
}
