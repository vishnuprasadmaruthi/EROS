/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Volunteer.Donations;
import java.util.ArrayList;

/**
 *
 * @author Vishnu
 */
public class Employee {
    
    private String name;
    private int id;
    private static int count = 1;
    
    private ArrayList<Donations> mydonations;

    public Employee() {
        id = count;
        count++;
        this.mydonations = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public ArrayList<Donations> getMydonations() {
        return mydonations;
    }

    public void setMydonations(ArrayList<Donations> mydonations) {
        this.mydonations = mydonations;
    }
    
    

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
