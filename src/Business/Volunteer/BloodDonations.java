/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Volunteer;

/**
 *
 * @author Vishnu
 */
public class BloodDonations extends Donations{
       
    public enum BloodType{
        A_POS("A+ve"),
        A_NEG("A-ve"),
        B_POS("B+ve"),
        B_NEG("B-ve"),
        O_POS("O+ve"),
        O_NEG("O-ve"),
        AB_POS("AB+ve"),
        AB_NEG("AB-ve")
        ;
        
        
        private String value;
        private BloodType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }
        
        
        
        

        @Override
        public String toString() {
            return value;
        }
        
    }
    
    private BloodType bloodType;
    
    public BloodDonations(BloodType bloodType) {
        this.bloodType=bloodType;
    }

    public BloodType getBloodType() {
        return bloodType;
    }

    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }
    
//    public BloodDonations(String bloodType) {
//        this.BloodType=bloodType;
//    }

//   public enum BoodGroup{
//       Apos,Aneg,Bpos,Bneg,Opos,Oneg
//   };
   
   
   
}
