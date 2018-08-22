/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author Vishnu
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Chief.getValue())){
            organization = new ChiefOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.MarineSquad.getValue())){
            organization = new MarineSquadOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.GroundSquad.getValue())){
            organization = new GroundSquadOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Operator.getValue())){
            organization = new OperatorOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Nurse.getValue())){
            organization = new NurseOrganization();
            organizationList.add(organization);
        
        
        }else if (type.getValue().equals(Type.Volunteer.getValue())){
            organization = new VolunteerOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}