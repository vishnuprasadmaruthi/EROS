/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Organization.Organization;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author incha
 */
public class Network {

    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    private PersonDirectory personDirectory;
//    private String subnetwork;
    
    public Network() {
       
        enterpriseDirectory = new EnterpriseDirectory();
        personDirectory = new PersonDirectory();
        
       // initPersonDir();
        //initEnterpriseDirectory();
    }
    
    public void initEnterpriseDirectory(){
        Enterprise e = new Enterprise("boston", Enterprise.EnterpriseType.Rescue) ;
        enterpriseDirectory.getEnterpriseList().add(e);
        }
    
    public void initPersonDir(){
        
        for (int i=0;i<10;i++){
            Person p = new Person( "name"+i,  i+10,  99999,  "email"+i);
            this.personDirectory.getPersonDirectory().add(p);
        }
        
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }
    
    
    
    
//    public String getSubnetwork() {
//        return subnetwork;
//    }
//
//    public void setSubnetwork(String subnetwork) {
//        this.subnetwork = subnetwork;
//    }
    
    
    
    @Override
    public String toString() {
        return name;
    }
    
}
