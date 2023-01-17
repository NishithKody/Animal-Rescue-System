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
public class ShelterManagerDirectory {
    
    ArrayList<ShelterManager> shelterManagerList;
    
    public ShelterManagerDirectory(){
        shelterManagerList = new ArrayList<ShelterManager>();
    }

    public ArrayList<ShelterManager> getShelterManager() {
        return shelterManagerList;
    }

    public void setShelterManager(ArrayList<ShelterManager> shelterManagerList) {
        this.shelterManagerList = shelterManagerList;
    }
    
    public ShelterManager addShelterManager(){
        ShelterManager shelterManager = new ShelterManager();
        shelterManagerList.add(shelterManager);
        return shelterManager;
    }
    
    public void removeShelterManager(ShelterManager shelterManager){
        shelterManagerList.remove(shelterManager);
    }
    
}
