/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.population;

import business.population.Report;
import java.util.ArrayList;

/**
 *
 * @author nishi
 */
public class ReportDirectory {
    
    ArrayList<Report> reportList;
    
    public ReportDirectory(){
        reportList = new ArrayList<Report>();
    }

    public ArrayList<Report> getReportList() {
        return reportList;
    }

    public void setReportList(ArrayList<Report> reportList) {
        this.reportList = reportList;
    }
    
    public Report addNewReport(){
        Report report = new Report();
        reportList.add(report);
        return report;
    }
    
    public void removeReport(Report report){
        reportList.remove(report);
    }
    
}
