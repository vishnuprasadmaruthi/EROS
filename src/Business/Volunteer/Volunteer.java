/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Volunteer;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Vishnu
 */
public class Volunteer {
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String city;
    private int age;
    private ArrayList<Donations> mydonations;
    private UserAccount userAccount;
    

    public Volunteer(String firstName, String lastName, String email, String address, String city, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.city = city;
        this.age = age;
        this.mydonations = new ArrayList<>();
    }
    
    public Volunteer(){
        
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Donations> getMydonations() {
        return mydonations;
    }

    public void setMydonations(ArrayList<Donations> mydonations) {
        this.mydonations = mydonations;
    }
    
    

    @Override
    public String toString() {
        return "Volunteer{" + "firstName=" + firstName + ", lastName=" + lastName + '}';
    }
    
    
}
