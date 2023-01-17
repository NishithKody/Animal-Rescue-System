/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.population;

import java.util.ArrayList;

/**
 *
 * @author nishi
 */
public class FundDonationDirectory {
    
    ArrayList<FundDonation> fundDonationList;
    
    public FundDonationDirectory(){
        fundDonationList = new ArrayList<FundDonation>();
    }

    public ArrayList<FundDonation> getFundDonationList() {
        return fundDonationList;
    }

    public void setFundDonationList(ArrayList<FundDonation> fundDonationList) {
        this.fundDonationList = fundDonationList;
    }
    
    public FundDonation addNewFundDonation(){
        FundDonation fundDonation = new FundDonation();
        fundDonationList.add(fundDonation);
        return fundDonation;
    }
    
    public void removeFundDonation(FundDonation fundDonation){
        fundDonationList.remove(fundDonation);
    }
    
}
