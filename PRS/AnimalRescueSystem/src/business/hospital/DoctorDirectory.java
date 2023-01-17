/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.hospital;

import business.hospital.Doctor;
import java.util.ArrayList;

/**
 *
 * @author nishi
 */
public class DoctorDirectory {
    ArrayList<Doctor> doctorList;
    
    public DoctorDirectory(){
        doctorList = new ArrayList<Doctor>();
    }

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }
    
    public Doctor addNewDoctor(){
        Doctor doctor = new Doctor();
        doctorList.add(doctor);
        return doctor;
    }
    
    public void removeDoctor(Doctor doc){
        doctorList.remove(doc);
    }
    
}
