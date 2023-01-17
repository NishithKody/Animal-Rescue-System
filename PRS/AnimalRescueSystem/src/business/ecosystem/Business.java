/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.ecosystem;

import business.Government.BudgetOverseerDirectory;
import business.Government.AnalyticsManager;
import business.Government.AnalyticsManagerDirectory;
import business.hospital.DoctorDirectory;
import business.hospital.EncounterHistory;
import business.hospital.HospitalManagerDirectory;
import business.distribution.InventoryDirectory;
import business.distribution.DeliveryAssociateDirectory;
import business.distribution.DistributionManagerDirectory;
import business.population.AdoptionDirectory;
import business.population.FundDonationDirectory;
import business.population.PersonDirectory;
import business.population.ReportDirectory;
import business.population.ReporterDirectory;
import business.shelter.AccountantDirectory;
import business.shelter.CaseFileDirectory;
import business.shelter.FundRequestDirectory;
import business.shelter.ShelterManagerDirectory;
import business.shelter.ShelterStaffDirectory;
import business.distribution.OrderDirectory;
import business.hospital.VitalSignsHistory;
import business.hospital.PrescriptionDirectory;


/**
 *
 * @author nishi
 */

public class Business {
    
    static Business business;
    PersonDirectory personDirectory;
    DoctorDirectory doctorDirectory;
    HospitalManagerDirectory hospitalManagerDirectory;
    EncounterHistory encounterHistory;
    UserAccountDirectory userAccountDirectory;
    ReportDirectory reportDirectory;
    InventoryDirectory inventoryDirectory;
    DeliveryAssociateDirectory deliveryAssociateDirectory;
    FundDonationDirectory fundDonationDirectory; 
    ReporterDirectory reporterDirectory;
    AccountantDirectory accountantDirectory;
    CaseFileDirectory caseFileDirectory;
    FundRequestDirectory fundRequestDirectory;
    ShelterManagerDirectory ShelterManagerDirectory;
    ShelterStaffDirectory shelterStaffDirectory;
    AnalyticsManagerDirectory analyticsManagerDirectory;
    BudgetOverseerDirectory budgetOverseerDirectory;
    OrderDirectory orderDirectory;
    AdoptionDirectory adoptionDirectory;
    VitalSignsHistory vitalSignsHistory;
    PrescriptionDirectory prescriptionDirectory;
    DistributionManagerDirectory distributionManagerDirectory;
    
    //Current user
    String currentUserId;
    String currentUserName;
    String currentUserEmail;
    String currentRole;

    public String getCurrentRole() {
        return currentRole;
    }

    public void setCurrentRole(String currentRole) {
        this.currentRole = currentRole;
    }
    
    
    
    //Funding
    int curAmount;
    
    public Business (){
        personDirectory = new PersonDirectory();
        doctorDirectory = new DoctorDirectory();
        hospitalManagerDirectory = new HospitalManagerDirectory();
        encounterHistory = new EncounterHistory();
        userAccountDirectory = new UserAccountDirectory();
        reportDirectory = new ReportDirectory();
        inventoryDirectory =new InventoryDirectory();
        deliveryAssociateDirectory = new DeliveryAssociateDirectory();
        fundDonationDirectory = new FundDonationDirectory();
        reporterDirectory = new ReporterDirectory();
        accountantDirectory = new AccountantDirectory();
        caseFileDirectory= new CaseFileDirectory();
        fundRequestDirectory = new FundRequestDirectory();
        ShelterManagerDirectory = new ShelterManagerDirectory();
                
        shelterStaffDirectory = new ShelterStaffDirectory();
        analyticsManagerDirectory = new AnalyticsManagerDirectory();
        budgetOverseerDirectory = new BudgetOverseerDirectory();   
        orderDirectory = new OrderDirectory();
        
        budgetOverseerDirectory = new BudgetOverseerDirectory();    
        adoptionDirectory = new AdoptionDirectory();
        vitalSignsHistory = new VitalSignsHistory();
        prescriptionDirectory = new PrescriptionDirectory();
        distributionManagerDirectory = new DistributionManagerDirectory();

        
        
        //Current user init
        this.currentUserId = "";
        this.currentUserEmail = "";
        this.currentUserName = "";
        this.curAmount = 0;
        
        
    }

    public VitalSignsHistory getVitalSignsHistory() {
        return vitalSignsHistory;
    }

    public void setVitalSignsHistory(VitalSignsHistory vitalSignsHistory) {
        this.vitalSignsHistory = vitalSignsHistory;
    }

    public PrescriptionDirectory getPrescriptionDirectory() {
        return prescriptionDirectory;
    }

    public void setPrescriptionDirectory(PrescriptionDirectory prescriptionDirectory) {
        this.prescriptionDirectory = prescriptionDirectory;
    }
    
        


    public AdoptionDirectory getAdoptionDirectory() {
        return adoptionDirectory;
    }

    public void setAdoptionDirectory(AdoptionDirectory adoptionDirectory) {
        this.adoptionDirectory = adoptionDirectory;
    }
    
    

    public AnalyticsManagerDirectory getAnalyticsManagerDirectory() {
        return analyticsManagerDirectory;
    }

    public void setAnalyticsManagerDirectory(AnalyticsManagerDirectory analyticsManagerDirectory) {
        this.analyticsManagerDirectory = analyticsManagerDirectory;
    }

    public BudgetOverseerDirectory getBudgetOverseerDirectory() {
        return budgetOverseerDirectory;
    }

    public void setBudgetOverseerDirectory(BudgetOverseerDirectory budgetOverseerDirectory) {
        this.budgetOverseerDirectory = budgetOverseerDirectory;
    }
    
    public OrderDirectory getOrderDirectory() {
        return orderDirectory;
    }

    public void setOrderDirectory(OrderDirectory orderDirectory) {
        this.orderDirectory = orderDirectory;
    }

    public int getCurAmount() {
        return curAmount;
    }

    public void setCurAmount(int curAmount) {
        this.curAmount = curAmount;
    }

    public String getCurrentUserId() {
        return currentUserId;
    }

    public void setCurrentUserId(String currentUserId) {
        this.currentUserId = currentUserId;
    }

    public String getCurrentUserName() {
        return currentUserName;
    }

    public void setCurrentUserName(String currentUserName) {
        this.currentUserName = currentUserName;
    }

    public String getCurrentUserEmail() {
        return currentUserEmail;
    }

    public void setCurrentUserEmail(String currentUserEmail) {
        this.currentUserEmail = currentUserEmail;
    }

    
    public FundDonationDirectory getFundDonationDirectory() {
        return fundDonationDirectory;
    }

    public void setFundDonationDirectory(FundDonationDirectory fundDonationDirectory) {
        this.fundDonationDirectory = fundDonationDirectory;
    }

    public ReporterDirectory getReporterDirectory() {
        return reporterDirectory;
    }

    public void setReporterDirectory(ReporterDirectory reporterDirectory) {
        this.reporterDirectory = reporterDirectory;
    }

    public AccountantDirectory getAccountantDirectory() {
        return accountantDirectory;
    }

    public void setAccountantDirectory(AccountantDirectory accountantDirectory) {
        this.accountantDirectory = accountantDirectory;
    }

    public CaseFileDirectory getCaseFileDirectory() {
        return caseFileDirectory;
    }

    public void setCaseFileDirectory(CaseFileDirectory caseFileDirectory) {
        this.caseFileDirectory = caseFileDirectory;
    }

    public FundRequestDirectory getFundRequestDirectory() {
        return fundRequestDirectory;
    }

    public void setFundRequestDirectory(FundRequestDirectory fundRequestDirectory) {
        this.fundRequestDirectory = fundRequestDirectory;
    }

    public ShelterManagerDirectory getShelterManagerDirectory() {
        return ShelterManagerDirectory;
    }

    public void setShelterManagerDirectory(ShelterManagerDirectory ShelterManagerDirectory) {
        this.ShelterManagerDirectory = ShelterManagerDirectory;
    }

    public ShelterStaffDirectory getShelterStaffDirectory() {
        return shelterStaffDirectory;
    }

    public void setShelterStaffDirectory(ShelterStaffDirectory ShelterStaffDirectory) {
        this.shelterStaffDirectory = ShelterStaffDirectory;
    }

    public DistributionManagerDirectory getDistributionManagerDirectory() {
        return distributionManagerDirectory;
    }

    public void setDistributionManagerDirectory(DistributionManagerDirectory distributionManagerDirectory) {
        this.distributionManagerDirectory = distributionManagerDirectory;
    }
    
    
    

    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

    public HospitalManagerDirectory getHospitalManagerDirectory() {
        return hospitalManagerDirectory;
    }

    public void setHospitalManagerDirectory(HospitalManagerDirectory hospitalManagerDirectory) {
        this.hospitalManagerDirectory = hospitalManagerDirectory;
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    
    public InventoryDirectory getInventoryDirectory() {
        return inventoryDirectory;
    }

    public void setInventoryDirectory(InventoryDirectory inventoryDirectory) {
        this.inventoryDirectory = inventoryDirectory;
    }
    
    public DeliveryAssociateDirectory getDeliveryAssociateDirectory() {
        return deliveryAssociateDirectory;
    }

    public void setDeliveryAssociateDirectory(DeliveryAssociateDirectory deliveryAssociateDirectory) {
        this.deliveryAssociateDirectory = deliveryAssociateDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public ReportDirectory getReportDirectory() {
        return reportDirectory;
    }

    public void setReportDirectory(ReportDirectory reportDirectory) {
        this.reportDirectory = reportDirectory;
    }
    
    public static Business getInstance() {
        if (business == null) {
            business = new Business();
        }
        return business;
    }

    
    
    
    
}
