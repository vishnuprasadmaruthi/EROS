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
public class PatientStatusWorkRequest extends WorkRequest{
    private Float bloodPressure;
    private Float temperature;
    private Float weight;
    private String injury;
    
    public PatientStatusWorkRequest(){
        super();
    }

    public Float getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(Float bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public Float getTemperature() {
        return temperature;
    }

    public void setTemperature(Float temperature) {
        this.temperature = temperature;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }
    
    
    
    public String getInjury() {
        return injury;
    }

    public void setInjury(String injury) {
        this.injury = injury;
    }
    
    
    
    
}
