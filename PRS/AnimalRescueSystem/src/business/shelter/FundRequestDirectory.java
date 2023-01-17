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
public class FundRequestDirectory {
    
    ArrayList<FundRequest> fundRequestlfList;
    
    public FundRequestDirectory(){
        fundRequestlfList = new ArrayList<FundRequest>();
    }

    public ArrayList<FundRequest> getFundRequest() {
        return fundRequestlfList;
    }

    public void setFundRequest(ArrayList<FundRequest> fundRequestlfList) {
        this.fundRequestlfList = fundRequestlfList;
    }
    
    public FundRequest addFundRequest(){
        FundRequest fundRequest = new FundRequest();
        fundRequestlfList.add(fundRequest);
        return fundRequest;
    }
    
    public void removeFundRequest(FundRequest fundRequest){
        fundRequestlfList.remove(fundRequest);
    }
    
}
