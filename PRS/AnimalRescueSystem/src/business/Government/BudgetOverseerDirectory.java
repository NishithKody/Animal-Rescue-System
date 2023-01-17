/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Government;

import java.util.ArrayList;

/**
 *
 * @author nishi
 */
public class BudgetOverseerDirectory {
    
    ArrayList<BudgetOverseer> budgetOverseetList;
    
    public BudgetOverseerDirectory(){
        budgetOverseetList = new ArrayList<BudgetOverseer>();
    }

    public ArrayList<BudgetOverseer> getBudgetOverseerList() {
        return budgetOverseetList;
    }

    public void setBudgetOverseerList(ArrayList<BudgetOverseer> budgetOverseetList) {
        this.budgetOverseetList = budgetOverseetList;
    }
    
    public BudgetOverseer addNewBudgetOverseer(){
        BudgetOverseer budgetOverseer = new BudgetOverseer();
        budgetOverseetList.add(budgetOverseer);
        return budgetOverseer;
    }
    
    public void removeBudgetOverseer(BudgetOverseer budgetOverseer){
        budgetOverseetList.remove(budgetOverseer);
    }
    
}
