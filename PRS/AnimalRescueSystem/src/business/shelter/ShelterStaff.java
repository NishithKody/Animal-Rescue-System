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
public class ShelterStaff extends Person {
    
    String shelterStaffId;
    int yearsOfExperience;
    String phoneNumber;
    int salary;

    public String getShelterStaffId() {
        return shelterStaffId;
    }

    public void setShelterStaffId(String shelterStaffId) {
        this.shelterStaffId = shelterStaffId;
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

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = (int) salary;
    }
    
    @Override
    public String toString(){ 
        return this.shelterStaffId; 
    }
    
}
