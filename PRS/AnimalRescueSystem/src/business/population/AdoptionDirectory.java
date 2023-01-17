/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.population;

import java.util.ArrayList;

/**
 *
 * @author nishi
 */
public class AdoptionDirectory {
    
    ArrayList<Adoption> adoptionList;
    
    public AdoptionDirectory(){
        adoptionList = new ArrayList<Adoption>();
    }

    public ArrayList<Adoption> getAdoptionList() {
        return adoptionList;
    }

    public void setAdoptionList(ArrayList<Adoption> fundDonationList) {
        this.adoptionList = fundDonationList;
    }
    
    public Adoption addNewAdoption(){
        Adoption fundDonation = new Adoption();
        adoptionList.add(fundDonation);
        return fundDonation;
    }
    
    public void removeAdoption(Adoption fundDonation){
        adoptionList.remove(fundDonation);
    }
    
}
