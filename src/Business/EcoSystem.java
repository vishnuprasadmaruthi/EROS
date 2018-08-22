package Business;

import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.DoctorRole;
import Business.Role.MedicalAdminRole;
import Business.Role.RescueAdminRole;
//import Business.Role.CDCAdminRole;
//import Business.Role.DistributorAdminRole;
//import Business.Role.HospitalAdminRole;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.Role.VolunteerAdminRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author Vishnu
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private ArrayList<Network> networkList;


    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<>();

    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }


    public static void setInstance(EcoSystem system) {
        business=system;
    }
    


    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new SystemAdminRole());
        roles.add(new RescueAdminRole());
        roles.add(new VolunteerAdminRole());
        roles.add(new MedicalAdminRole());
       

        return roles;
    }

    public static boolean checkIfUsernameIsUnique(String username) {

      //  if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
             for (Network network : business.getNetworkList()) {
                 
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    for (UserAccount ua : enterprise.getUserAccountDirectory().getUserAccountList()) {
                        if(ua.getUsername().equals(username)){
                            return false;
                        }
                    }
                    
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                                 if(ua.getUsername().equals(username)){
                            return false;
                        }
                    }
                            }
                        }
                    }
            
      //  }
     return true;
    }
}