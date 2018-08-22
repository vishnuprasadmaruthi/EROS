/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

/**
 *
 * @author Vishnu
 */
public class Patient {
    private String name;
    private int age;
    private int mobileNo;

    public enum Gender {
        Male,
        Female
    }
    private String email;
    private Gender gender;
    private String state;
    private String city;
    
    public Patient(String name, int age, int mobileNo, String email, Gender gender,String state,String city) {
        this.name = name;
        this.age = age;
        this.mobileNo = mobileNo;
        this.email = email;
        this.gender = gender;
        this.state = state;
        this.city =city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(int mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    
    @Override
    public String toString() {
        return name;
    }
    
    
    
    
}
