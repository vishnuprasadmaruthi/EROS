/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author incha
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
       public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Rescue){
            enterprise = new RescueEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if (type == Enterprise.EnterpriseType.Medical){
            enterprise = new MedicalEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else  if (type == Enterprise.EnterpriseType.Volunteer){
            enterprise = new VolunteerEnterprise(name);
            enterpriseList.add(enterprise);
        }
            
        return enterprise;
    }
    
}

