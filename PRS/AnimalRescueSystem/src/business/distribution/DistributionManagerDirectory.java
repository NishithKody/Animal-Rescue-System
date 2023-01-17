/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.distribution;

import java.util.ArrayList;

/**
 *
 * @author adity
 */
public class DistributionManagerDirectory {
        public ArrayList<DistributionManager> distributionManagerDirectory;
    
    public DistributionManagerDirectory() {
    distributionManagerDirectory = new ArrayList<DistributionManager>();
    }
    
    public ArrayList<DistributionManager> getDistributionManager() {
        return  distributionManagerDirectory;
    }
    
    public void setDistributionManager(ArrayList<DistributionManager> distributionManagerDirectory){
        this.distributionManagerDirectory = distributionManagerDirectory; 
    }
    
    public void deleteDistributionManager (DistributionManager deliveryAssociate) {
        
        distributionManagerDirectory.remove(deliveryAssociate);
    }
    
    public DistributionManager addDistributionManager(){
        DistributionManager deliveryAssociate = new DistributionManager();
        distributionManagerDirectory.add(deliveryAssociate);
        return deliveryAssociate;
    }
}
