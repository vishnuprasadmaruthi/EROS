/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Volunteer;

import java.util.ArrayList;

/**
 *
 * @author Vishnu
 */
public class VolunteerDirectory {
    private ArrayList<Volunteer> volunteerDirectory;

    public VolunteerDirectory() {
        this.volunteerDirectory = new ArrayList<>();
    }

    public ArrayList<Volunteer> getVolunteerDirectory() {
        return volunteerDirectory;
    }

    public void setVolunteerDirectory(ArrayList<Volunteer> volunteerDirectory) {
        this.volunteerDirectory = volunteerDirectory;
    }
    
    
}
