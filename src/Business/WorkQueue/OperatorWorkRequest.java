/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Network.Network;


/**
 *
 * @author incha
 */
public class OperatorWorkRequest extends WorkRequest{
    private Network network;
    private String region;
    private String description;
    private String severity;
    private String address;
    private String reporterName;
    private String alert;

    public OperatorWorkRequest(Network network, String region, String description, String severity, String address, String reporterName,String alert) {
        this.network = network;
        this.region = region;
        this.description = description;
        this.severity = severity;
        this.address = address;
        this.reporterName = reporterName;
        this.alert = alert;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public String getAlert() {
        return alert;
    }

    public void setAlert(String alert) {
        this.alert = alert;
    }
 
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getReporterName() {
        return reporterName;
    }

    public void setReporterName(String reporterName) {
        this.reporterName = reporterName;
    }

    @Override
    public String toString() {
        return "OperatorWorkRequest{" + "alert=" + alert + '}';
    }
    
    
    
    
    
}
