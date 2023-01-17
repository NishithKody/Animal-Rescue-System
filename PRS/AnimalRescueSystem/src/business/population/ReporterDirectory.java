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
public class ReporterDirectory {
    
    ArrayList<Reporter> reporterList;
    
    public ReporterDirectory(){
        reporterList = new ArrayList<Reporter>();
    }

    public ArrayList<Reporter> getReporterList() {
        return reporterList;
    }

    public void setReporterList(ArrayList<Reporter> reporterList) {
        this.reporterList = reporterList;
    }
    
    public Reporter addNewReporter(){
        Reporter reporter = new Reporter();
        reporterList.add(reporter);
        return reporter;
    }
    
    public void removeReporter(Reporter reporter){
        reporterList.remove(reporter);
    }
    
}
