/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Patient.PatientDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.Volunteer.VolunteerDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.HashSet;

/**
 *
 * @author Vishnu
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private PatientDirectory patientDirectory;
    private VolunteerDirectory volunteerDirectory;
    private int organizationID;
    private static int counter = 0;
    public HashSet<Role> roles;

    public enum Type {
        RescueAdmin("RescueAdmin Organization") {
//            //@Override
//            public Organization createOrganization() {
//                return new AdminOrganization();
//            }
        }, Chief("Chief Organization") {
//            public Organization createOrganization() {
//                return new TechnicalStaffOrganization();
//            }
        }, MarineSquad("MarineSquad Organization") {
//            public Organization createOrganization() {
//                return new marineSquadOrganization();
//            }
        }, GroundSquad("GroundSquad Organization") {
//            public Organization createOrganization() {
//                return new groundSquadOrganization();
//            }
        }, Operator("Operator Organization") {

        }, MedicalAdmin("MedicalAdmin Organization") {

        }, Doctor("Doctor Organization") {

        }, Nurse("Nurse Organization") {

        }, VolunteerAdmin("Volunteer Organization") {

        }, Donor("Donor Organization") {

        }, FundRaiser("FundRaiser Organization") {

        }, VolunteerRecruiter("VolunteerRecruiter Organization") {

        }, Volunteer("Volunteer Organization");
        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
//        public Organization createOrganization(Type t) {
//            return t.createOrganization();
//        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        patientDirectory = new PatientDirectory();
        volunteerDirectory = new VolunteerDirectory();
        organizationID = counter;
        roles = new HashSet<>();
        ++counter;
    }

    public abstract HashSet<Role> getSupportedRole();

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }

    public void setRoles(HashSet<Role> roles) {
        this.roles = roles;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public VolunteerDirectory getVolunteerDirectory() {
        return volunteerDirectory;
    }

    public void setVolunteerDirectory(VolunteerDirectory volunteerDirectory) {
        this.volunteerDirectory = volunteerDirectory;
    }
    
    

    @Override
    public String toString() {
        return name;
    }

}
