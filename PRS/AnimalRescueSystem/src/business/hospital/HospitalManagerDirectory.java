/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.hospital;

import java.util.ArrayList;

/**
 *
 * @author nishi
 */
public class HospitalManagerDirectory {
    ArrayList<HospitalManager> hospitalManagerList;
    
    public HospitalManagerDirectory(){
        hospitalManagerList = new ArrayList<HospitalManager>();
    }

    public ArrayList<HospitalManager> getHospitalManager() {
        return hospitalManagerList;
    }

    public void setHospitalManager(ArrayList<HospitalManager> hospitalManagerList) {
        this.hospitalManagerList = hospitalManagerList;
    }
    
    public HospitalManager addHospitalManager(){
        HospitalManager hospitalManager = new HospitalManager();
        hospitalManagerList.add(hospitalManager);
        return hospitalManager;
    }
    
    public void removeHospitalManager(HospitalManager hospitalManager){
        hospitalManagerList.remove(hospitalManager);
    }
    
}
