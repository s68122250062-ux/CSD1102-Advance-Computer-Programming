package project;

import java.time.LocalTime;
import java.util.Date;


public class Visit {
    private int visitId;
    private Date visitDate;
    private LocalTime visitTime;
    private String status;
    private String symptom;
    private String cause;
    private int severityLevel;
    private String diagnosis;
    private String treatment;
    private String medicineGiven;
    private boolean medicineCertificate;
    private String note;
    public Visit () {}

    public Visit (int visitId , Date visitDate , LocalTime visitTime , String status , String symptom , String cause ,
     int severityLevel , String diagnosis , String treatment , String medicineGiven , boolean medicineCertificate , String note) {

        this.visitId = visitId;
        this.visitDate = visitDate;
        this.visitTime = visitTime;
        this.status = status;
        this.symptom = symptom;
        this.cause = cause;
        this.severityLevel = severityLevel;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.medicineGiven = medicineGiven;
        this.medicineCertificate = medicineCertificate;
        this.note = note;
    }
    public int getvisitId() {
        return  visitId;
    }
    public void setvisitId(int visitId) {
        this.visitId = visitId;
    }    
        public Date getvisitDate() {
        return visitDate;
    }
        public void setvisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }     
        public LocalTime getvisitTime() {
        return visitTime;
    }    
        public void setvisitTime(LocalTime visitTime) {
        this.visitTime = visitTime;
    }
    public String getstatus() {
        return status;
    }
    public void setstatus(String status) {
        this.status = status;
    }
    public String getsymptom() {
        return symptom;
    }
    public void setsymptom(String symptom) {
        this.symptom = symptom;
    }
    public String getcause() {
        return cause;
    }
    public void setcause(String cause) {
        this.cause = cause;
    }
    public int getseverityLevel() {
        return  severityLevel;
    }
    public void setseverityLevel(int severityLevel) {
        this.severityLevel = severityLevel;
    }
    public String getdiagnosis() {
        return diagnosis;
    }
    public void setdiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
    public String gettreatment() {
        return treatment;
    }
    public void settreatment(String treatment) {
        this.treatment = treatment;
    }
    public String getmedicineGiven() {
        return medicineGiven;
    }
    public void setmedicineGiven(String medicineGiven) {
        this.medicineGiven = medicineGiven;
    }
    public boolean getmedicineCertificate() {
        return medicineCertificate;
    }
    public void setmedicineCertificate(boolean medicineCertificate) {
        this.medicineCertificate = medicineCertificate;
    }
    public String getnote() {
        return note;
    }
    public void setnote(String note) {
        this.note = note;
    }
    public void createVisit() {
        System.out.println("From class Visit = createVisit" );
    } 
    public void updateStatus() {
        System.out.println("From class Visit = updateStatus" );
    }
    public void addDiagnosis() {
        System.out.println("From class Visit = addDiagnosis" );
    }
    public void addTreatment() {
        System.out.println("From class Visit = addTreatment" );
    }
    public void issueMedicalCertificate() {
        System.out.println("From class Visit = issueMedicalCertificate" );
    }    
    public void closeVisit() {
        System.out.println("From class Visit = closeVisit" );
    }
}