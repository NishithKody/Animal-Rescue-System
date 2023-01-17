/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Government;

import business.hospital.Doctor;
import java.util.ArrayList;

/**
 *
 * @author nishi
 */
public class AnalyticsManagerDirectory {
    ArrayList<AnalyticsManager> analyticsManagerList;
    
    public AnalyticsManagerDirectory(){
        analyticsManagerList = new ArrayList<AnalyticsManager>();
    }

    public ArrayList<AnalyticsManager> getanalyticsManagerList() {
        return analyticsManagerList;
    }

    public void setAnalyticsManagerList(ArrayList<AnalyticsManager> analyticsManagerList) {
        this.analyticsManagerList = analyticsManagerList;
    }
    
    public AnalyticsManager addNewAnalyticsManager(){
        AnalyticsManager analyticsManager = new AnalyticsManager();
        analyticsManagerList.add(analyticsManager);
        return analyticsManager;
    }
    
    public void removeAnalyticsManager(AnalyticsManager analyticsManager){
        analyticsManagerList.remove(analyticsManager);
    }
    
//        public AnalyticsManager userCheck(Integer id){
//        for (AnalyticsManager user : analyticsManagerList)
//            if (user.getAnalyticsManagerId() == id){
//                return user;
//            }
//        return null;
//    }
    
}
