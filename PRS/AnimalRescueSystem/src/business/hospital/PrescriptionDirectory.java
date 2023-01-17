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
public class PrescriptionDirectory {
    
    ArrayList<Prescription> prescriptionDirectory;

    public ArrayList<Prescription> getPrescriptionDirectory() {
        return prescriptionDirectory;
    }

    public void setPrescriptionDirectory(ArrayList<Prescription> prescriptionDirectory) {
        this.prescriptionDirectory = prescriptionDirectory;
    }
    
    public Prescription addPrescription(){
        Prescription prescription = new Prescription();
        prescriptionDirectory.add(prescription);
        return prescription;
    }
    
    public void removePrescription(Prescription prescription){
        prescriptionDirectory.remove(prescription);
    }
}
