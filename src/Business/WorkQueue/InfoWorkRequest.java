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
public class InfoWorkRequest extends WorkRequest {
    
   
    private String info;
    private int savedPeople;
    private int deadPeople;
    private String areaSafe;
    private String backup;
    private String descActivity;
    
    public InfoWorkRequest(){
     super();
    }


    public int getSavedPeople() {
        return savedPeople;
    }

    public void setSavedPeople(int savedPeople) {
        this.savedPeople = savedPeople;
    }

    public int getDeadPeople() {
        return deadPeople;
    }

    public void setDeadPeople(int deadPeople) {
        this.deadPeople = deadPeople;
    }

    public String getAreaSafe() {
        return areaSafe;
    }

    public void setAreaSafe(String areaSafe) {
        this.areaSafe = areaSafe;
    }

    public String getBackup() {
        return backup;
    }

    public void setBackup(String backup) {
        this.backup = backup;
    }

    public String getDescActivity() {
        return descActivity;
    }

    public void setDescActivity(String descActivity) {
        this.descActivity = descActivity;
    }
    

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

//    @Override
//    public String toString() {
//        return "InfoWorkRequest{" + "info=" + info + ", savedPeople=" + savedPeople + ", deadPeople=" + deadPeople + ", areaSafe=" + areaSafe + ", backup=" + backup + ", descActivity=" + descActivity + '}';
//    }


    
    
}
