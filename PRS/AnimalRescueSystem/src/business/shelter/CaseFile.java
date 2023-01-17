 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.shelter;

import java.util.Date;

/**
 *
 * @author nishi
 */
public class CaseFile {
    
    String caseId;
    String reportId;
    String staffId;
    String status;
    String desciption;
    Date date;
    
    Boolean medRecieved;
    String med;

    public Boolean getMedRecieved() {
        return medRecieved;
    }

    public void setMedRecieved(Boolean medRecieved) {
        this.medRecieved = medRecieved;
    }

    public String getMed() {
        return med;
    }

    public void setMed(String med) {
        this.med = med;
    }
    
    

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }


    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    @Override
    public String toString(){ 
        return this.caseId; 
    }
    
    
}
