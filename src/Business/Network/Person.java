/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

/**
 *
 * @author Vishnu
 */
public class Person {
    private String name;
    private int age;
    private int mobileNo;
    private enum Gender{
        Male,
        Female
    }
    private String email;
    private Gender gender;
    

    public Person(String name, int age, int mobileNo, String email) {
        this.name = name;
        this.age = age;
        this.mobileNo = mobileNo;
        this.email = email;
        this.gender = Gender.Male;
    }
    
    public Person(){
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
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




    @Override
    public String toString() {
        return "Person{" + "name=" + name + '}';
    }
    
    
}
