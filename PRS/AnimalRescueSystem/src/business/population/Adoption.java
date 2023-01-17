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
public class Adoption {
    
    String adoptionId;
    String user;
    String caseId;
    String petName;

    public String getAdoptionId() {
        return adoptionId;
    }

    public void setAdoptionId(String adoptionId) {
        this.adoptionId = adoptionId;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }
    
    @Override
    public String toString(){ 
        return this.adoptionId; 
    }

    
}
