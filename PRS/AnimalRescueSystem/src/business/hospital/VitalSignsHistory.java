/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.hospital;

import java.util.ArrayList;

/**
 *
 * @author adity
 */
public class VitalSignsHistory {
    
    ArrayList<VitalSigns> vitalSignsHistory;

    public ArrayList<VitalSigns> getVitalSignsHistory() {
        return vitalSignsHistory;
    }

    public void setVitalSignsHistory(ArrayList<VitalSigns> vitalSignsHistory) {
        this.vitalSignsHistory = vitalSignsHistory;
    }
    
    public VitalSigns addVitalSigns(){
        VitalSigns vitalSigns = new VitalSigns();
        vitalSignsHistory.add(vitalSigns);
        return vitalSigns;
    }
    
    public void removeVitalSigns(VitalSigns vitalSigns){
        vitalSignsHistory.remove(vitalSigns);
    }
}
