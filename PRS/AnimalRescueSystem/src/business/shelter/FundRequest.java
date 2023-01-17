/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.shelter;

/**
 *
 * @author nishi
 */
public class FundRequest {
    
    String fundRequestId;
    int amount;
    String status;
    String description;

    public String getFundRequestId() {
        return fundRequestId;
    }

    public void setFundRequestId(String fundRequestId) {
        this.fundRequestId = fundRequestId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    @Override
    public String toString(){ 
        return this.fundRequestId; 
    }
    
    
}
