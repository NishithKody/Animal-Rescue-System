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
public class DeliveryAssociate extends Person{
    
    String deliveryAssociateId;
    int yearsOfExperience;
    String phoneNumber;
    int salary;  

    public String getDeliveryAssociateId() {
        return deliveryAssociateId;
    }

    public void setDeliveryAssociateId(String deliveryAssociateId) {
        this.deliveryAssociateId = deliveryAssociateId;
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
        return this.deliveryAssociateId; 
    }

 
    

}
