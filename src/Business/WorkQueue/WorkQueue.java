/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author Vishnu
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList<>();
    }
    
    

    public ArrayList<WorkRequest> getWorkRequestList() {
        for(WorkRequest wr : workRequestList){
        System.out.println(wr);
        }
        return workRequestList;
    }
}