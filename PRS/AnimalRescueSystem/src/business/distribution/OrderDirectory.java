/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.distribution;

import java.util.ArrayList;

/**
 *
 * @author adity
 */
public class OrderDirectory {
       public ArrayList<Order> orderDirectory;
    
    public OrderDirectory() {
    orderDirectory = new ArrayList<Order>();
    }
    
    public ArrayList<Order> getOrder() {
        return  orderDirectory;
    }
    
    public void setOrder(ArrayList<Order> orderDirectory){
        this.orderDirectory = orderDirectory; 
    }
    
    public void deleteOrder (Order order) {
        
        orderDirectory.remove(order);
    }
    
    public Order addOrder(){
        Order order = new Order();
        orderDirectory.add(order);
        return order;
    }
    
//    public DeliveryAssociate checkDeliveryAssociate(Integer deliveryAssociateID){
//        DeliveryAssociate da = new DeliveryAssociate();
//        for (DeliveryAssociate d : deliveryAssociateDirectory)
//            if (d.getDeliveryAssociateID() == deliveryAssociateID){
//                 da = d;
//            }               
//        return da;
//    }
}
