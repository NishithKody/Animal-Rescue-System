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
public class RescueAnimalDirectory {
    
     ArrayList<RescueAnimal> rescueAnimalfList;
    
    public RescueAnimalDirectory(){
        rescueAnimalfList = new ArrayList<RescueAnimal>();
    }

    public ArrayList<RescueAnimal> getRescueAnimal() {
        return rescueAnimalfList;
    }

    public void setRescueAnimal(ArrayList<RescueAnimal> rescueAnimalfList) {
        this.rescueAnimalfList = rescueAnimalfList;
    }
    
    public RescueAnimal addRescueAnimal(){
        RescueAnimal rescueAnimal = new RescueAnimal();
        rescueAnimalfList.add(rescueAnimal);
        return rescueAnimal;
    }
    
    public void removeRescueAnimal(RescueAnimal rescueAnimal){
        rescueAnimalfList.remove(rescueAnimal);
    }
    
}
