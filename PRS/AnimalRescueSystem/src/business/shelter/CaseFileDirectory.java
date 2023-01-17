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
public class CaseFileDirectory {
    
    ArrayList<CaseFile> caseFilefList;
    
    public CaseFileDirectory(){
        caseFilefList = new ArrayList<CaseFile>();
    }

    public ArrayList<CaseFile> getCaseFile() {
        return caseFilefList;
    }

    public void setCaseFile(ArrayList<CaseFile> caseFilefList) {
        this.caseFilefList = caseFilefList;
    }
    
    public CaseFile addCaseFile(){
        CaseFile caseFile = new CaseFile();
        caseFilefList.add(caseFile);
        return caseFile;
    }
    
    public void removeCaseFile(CaseFile caseFile){
        caseFilefList.remove(caseFile);
    }
    
}
