/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.hospital;

import java.util.ArrayList;

/**
 *
 * @author sinchanakumar
 */
public class VitalSignsDirectory {
    ArrayList<VitalSigns> vitalSignsList;
    
    public VitalSignsDirectory(){
        vitalSignsList = new ArrayList<VitalSigns>();
    }

    public ArrayList<VitalSigns> getVitalSigns() {
        return vitalSignsList;
    }

    public void setVitalSigns(ArrayList<VitalSigns> vitalSignsList) {
        this.vitalSignsList = vitalSignsList;
    }
    
    public VitalSigns addVitalSigns(){
        VitalSigns vitalSigns = new VitalSigns();
        vitalSignsList.add(vitalSigns);
        return vitalSigns;
    }
    
    public void removeVitalSigns(VitalSigns vitalSigns){
        vitalSignsList.remove(vitalSigns);
    }
}
