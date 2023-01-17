/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.shelter;

import java.util.ArrayList;

/**
 *
 * @author nishi
 */
public class ShelterStaffDirectory {
    
    ArrayList<ShelterStaff> shelterStaffList;
    
    public ShelterStaffDirectory(){
        shelterStaffList = new ArrayList<ShelterStaff>();
    }

    public ArrayList<ShelterStaff> getShelterStaff() {
        return shelterStaffList;
    }

    public void setShelterStaff(ArrayList<ShelterStaff> shelterStaffList) {
        this.shelterStaffList = shelterStaffList;
    }
    
    public ShelterStaff addShelterStaff(){
        ShelterStaff shelterStaff = new ShelterStaff();
        shelterStaffList.add(shelterStaff);
        return shelterStaff;
    }
    
    public void removeShelterStaff(ShelterStaff shelterStaff){
        shelterStaffList.remove(shelterStaff);
    }
    
}
