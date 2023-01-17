/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.shelter;

import business.population.Person;

/**
 *
 * @author nishi
 */
public class ShelterManager extends Person {
    
    String shelterManagerId;
    int yearsOfExperience;
    String phoneNumber;
    int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getShelterManagerId() {
        return shelterManagerId;
    }

    public void setShelterManagerId(String shelterManagerId) {
        this.shelterManagerId = shelterManagerId;
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
    
    @Override
    public String toString(){ 
        return this.shelterManagerId; 
    }

    
    
    
}
