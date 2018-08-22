/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author Vishnu
 */
public class QuantityBloodWorkRequest extends WorkRequest {
    private Float bloodQuantity;
    
    public QuantityBloodWorkRequest(){
        super();
    }

    public Float getBloodQuantity() {
        return bloodQuantity;
    }

    public void setBloodQuantity(Float bloodQuantity) {
        this.bloodQuantity = bloodQuantity;
    }
    
    
}
