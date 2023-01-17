/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.distribution;

import business.ecosystem.UserAccount;

/**
 *
 * @author adity
 */
public class Order {
    
    public String medicineName;
    public Integer quantity;
    public String orderID;
    public String  reciever;
    public UserAccount deliveryAssociate;
    public String orderStatus;
    public String sender;
    public String createdByID;

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getReciever() {
        return reciever;
    }

    public void setReciever(String reciever) {
        this.reciever = reciever;
    }

    public UserAccount getDeliveryAssociate() {
        return deliveryAssociate;
    }

    public void setDeliveryAssociate(UserAccount deliveryAssociate) {
        this.deliveryAssociate = deliveryAssociate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
   
    @Override
    public String toString(){
        return medicineName;
    }

    public String getCreatedByID() {
        return createdByID;
    }

    public void setCreatedByID(String createdByID) {
        this.createdByID = createdByID;
    }
    
}
