/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Volunteer;

import java.util.Date;

/**
 *
 * @author Vishnu
 */
public abstract class Donations {

    private double quantity;
    private Date donatedDate;
    private String cause;
    private String donationType;

    public Date getDonatedDate() {
        return donatedDate;
    }

    public void setDonatedDate(Date donatedDate) {
        this.donatedDate = donatedDate;
    }

    public String getDonationType() {
        return donationType;
    }

    public void setDonationType(String donationType) {
        this.donationType = donationType;
    }
    
    

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }
    
    public Donations(){
       donatedDate = new Date();
    }
    
    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
    
}
