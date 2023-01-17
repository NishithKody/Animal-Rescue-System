/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.distribution;

import business.population.Person;

/**
 *
 * @author adity
 */
public class DistributionManager extends Person {
        String distributionManagerId;
    int yearsOfExperience;
    String phoneNumber;
    int salary;  

    public String getDistributionManagerId() {
        return distributionManagerId;
    }

    public void setDistributionManagerId(String distributionManagerId) {
        this.distributionManagerId = distributionManagerId;
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
    
}
