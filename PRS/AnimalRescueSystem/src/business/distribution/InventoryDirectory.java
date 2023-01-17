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
public class InventoryDirectory {
    
        public ArrayList<Inventory> inventoryDirectory;
    
    public InventoryDirectory() {
    inventoryDirectory = new ArrayList<Inventory>();
    }
    
    public ArrayList<Inventory> getInventory() {
        return  inventoryDirectory;
    }
    
    public void setInventory(ArrayList<Inventory> inventoryDirectory){
        this.inventoryDirectory = inventoryDirectory; 
    }
    
    public void deleteInventory (Inventory inventory) {
        
        inventoryDirectory.remove(inventory);
    }
    
    public Inventory addInventory(){
        Inventory inventory = new Inventory();
        inventoryDirectory.add(inventory);
        return inventory;
    }
    
    public Inventory checkInventory(String name, Integer quantity){
        Inventory inv = new Inventory();
        for (Inventory inventory : inventoryDirectory)
            if (inventory.getName().equals(name)){
                 inv = inventory;
                 
        }
        return inv;
    }
}
