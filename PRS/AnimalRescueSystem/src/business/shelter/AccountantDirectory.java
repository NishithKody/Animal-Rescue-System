/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.shelter;

import java.util.ArrayList;

/**
 *
 * @author nishi
 */
public class AccountantDirectory {
    ArrayList<Accountant> accountantList;
    
    public AccountantDirectory(){
        accountantList = new ArrayList<Accountant>();
    }

    public ArrayList<Accountant> getAccountant() {
        return accountantList;
    }

    public void setAccountant(ArrayList<Accountant> accountantList) {
        this.accountantList = accountantList;
    }
    
    public Accountant addAccountant(){
        Accountant accountant = new Accountant();
        accountantList.add(accountant);
        return accountant;
    }
    
    public void removeAccountant(Accountant accountant){
        accountantList.remove(accountant);
    }
}
