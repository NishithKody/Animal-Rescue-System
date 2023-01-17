/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Government;

import business.population.Person;

/**
 *
 * @author nishi
 */
public class AnalyticsManager extends Person{
    String analyticsManagerId;
    int yearsOfExperience;
    String phoneNumber;
    int salary;

    public String getAnalyticsManagerId() {
        return analyticsManagerId;
    }

    public void setAnalyticsManagerId(String analyticsManagerId) {
        this.analyticsManagerId = analyticsManagerId;
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
        return this.analyticsManagerId; 
    }
    
}
