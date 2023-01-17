/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.hospital;

import business.population.Person;

/**
 *
 * @author nishi
 */
public class HospitalManager extends Person{
    
    String hospitalManagerId;
    int yearsOfExperience;
    String phoneNumber;
    int salary;

    public String getHospitalManagerId() {
        return hospitalManagerId;
    }

    public void setHospitalManagerId(String hospitalManagerId) {
        this.hospitalManagerId = hospitalManagerId;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    @Override
    public String toString(){ 
        return this.hospitalManagerId; 
    }
    
}
