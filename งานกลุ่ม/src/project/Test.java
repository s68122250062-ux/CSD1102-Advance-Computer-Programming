package project;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Test {
    public static void main(String[] args) {

       
        Student st1 = new Student();
        st1.setstudentId("68122250065");
        System.out.println(st1.getstudentId());

        Student st2 = new Student("68122250065","Raphiphat","Science","Computer Science",1,"0813802368",
        "Mom 0100000000","None","None","B","Fever",new Date(),LocalTime.now());
        System.out.println(
            st2.getstudentId() + " " +
            st2.getname() + " " +
            st2.getfaculty() + " " +
            st2.getmajor() + " " +
            st2.getyear() + " " +
            st2.getphone() + " " +
            st2.getemergencycontact() + " " +
            st2.getmedicalcondition() + " " +
            st2.getallergy() + " " +
            st2.getbloodtype() + " " +
            st2.getvisitdate() + " " +
            st2.getvisittime() + " "
        );

        Student s = new Student();
        s.registerVisit();
        s.updateHealthInfo();
        s.requestMedicalCertificate();
        s.viewVisitHistory();


       
        Nurse n1 = new Nurse();
        n1.setnurseId("N001");
        System.out.println(n1.getnurseId());

        Nurse n2 = new Nurse("N002","LIC123",5,
        37.2,"120/80",72,75.0);
        System.out.println(
                n2.getnurseId() + " " +
                n2.getlicenseNumber() + " " +
                n2.getexperienceYear() + " " +
                n2.gettemperature() + " " +
                n2.getbloodPressure() + " " +
                n2.getheartRate() + " " +
                n2.getweight() + " " 
        );
        Nurse n = new Nurse();
        n.checkInitialSymptoms();
        n.checkVitalSigns();
        n.recordSymptoms();
        n.provideFirstAid();
        n.referToDoctor();


       
        Doctor d1 = new Doctor();
        d1.setDoctorId("D001");
        System.out.println(d1.getDoctorId());

        Doctor d2 = new Doctor("D002","DOC999","General","12",
        "Acute upper respiratory infection",
        "Rest, drink plenty of fluids, and monitor symptoms for 3 days",
        "Paracetamol 500 mg, 1 tablet every 6 hours after meals") ;
        System.out.println(
        d2.getDoctorId() + " " +
        d2.getLicenseNumber() + " " + 
        d2.getSpecialty() + " " +
        d2.getExperienceYear()+ " " +
        d2.getDiagnosis() + " " +
        d2.getTreatmentPlan() + " " +
        d2.getPrescription() + " " 
        );

        Doctor d = new  Doctor();
        d.examinePatient();
        d.diagnose();
        d.prescribeMedicine();
        d.issueMedicalCertificate();
        d.approveLeave();
        


       
        ClinicStaff cs1 = new ClinicStaff();
        cs1.setstaffId("C001");
        System.out.println(cs1.getstaffId());

        ClinicStaff cs2 = new ClinicStaff("C002","Raphiphat","Reception",
        "Morning","0813802368","Active","Room101");
        System.out.println(
            cs2.getstaffId() + " " + 
            cs2.getname() + " " + 
            cs2.getposition() + " " + 
            cs2.getshift() + " " +
            cs2.getphone() + " " +
            cs2.getstatus() + " " +
            cs2.getroomNumber() + " "  
            );

        ClinicStaff c = new ClinicStaff();
        c.checkIn();
        c.checkOut();
        c.updateStatus();


       
        Medicine m1 = new Medicine();
        m1.setmedicineId("M001");
        System.out.println(m1.getmedicineId());

        Medicine m2 = new Medicine("M002", "Paracetamol", "Tablet",
                "500mg", 10, "Do not overdose", "None",
                100, new Date()
        );
        System.out.println(
                m2.getmedicineId() + " " + 
                m2.getmedicineName() + " " +
                m2.gettype() + " " +
                m2.getdosage() + " " +
                m2.getquantity() + " " +
                m2.getWarning() + " " +
                m2.getallergyRisk() + " " +
                m2.getStock() + " " +
                m2.getexpireDate() + " " 
        );

        Medicine m = new Medicine();
        m.dispense();
        m.checkStock();
        m.updateStock();
        m.isExpired();


     
        Visit v1 = new Visit();
        v1.setvisitId(1);
        System.out.println(v1.getvisitId());

        Visit v2 = new Visit(
                2, new Date(), LocalTime.now(), "Waiting", "Headache",
                "Stress", 2, "Migraine", "Rest",
                "Paracetamol", false, "No remark"
        );
        System.out.println(
                v2.getvisitId() + " " +
                v2.getvisitDate() + " " + 
                v2.getvisitTime() + " " + 
                v2.getstatus() + " " + 
                v2.getsymptom() + " " +
                v2.getcause() + " " +
                v2.getseverityLevel() + " " +
                v2.getdiagnosis() + " " +
                v2.gettreatment() + " " +
                v2.getmedicineGiven() + " " +
                v2.getmedicineCertificate() + " " +
                v2.getnote() + " " 
        );
        Visit v = new Visit();
        v.createVisit();
        v.updateStatus();
        v.addDiagnosis();
        v.addTreatment();
        v.issueMedicalCertificate();
        v.closeVisit();



        MedicalRecord r1 = new MedicalRecord();
        r1.setRecordId("R001");
        System.out.println(r1.getRecordId());

        MedicalRecord r2 = new MedicalRecord("R002", "Fever, sore throat, headache", "Viral upper respiratory infection", 
        "Rest, hydration, and symptomatic treatment", "Paracetamol 500 mg, 1 tablet every 6 hours", 
        "No known drug allergies", LocalDate.now(), LocalTime.now(), true, 
        "Patient advised to rest for 2 days");

        System.out.println(
            r2.getRecordId() + " " +
            r2.getSymptom() + " " +
            r2.getDiagnosis() +  " " +
            r2.getTreatment() + " " +
            r2.getMedicine() + " " +
            r2.getAllergyNote() + " " +
            r2.getRecordDate() + " " +
            r2.getRecordTime() + " " +
            r2.getRemark() + " " +
            r2.getmedicalCertificateIssued() + " " 
            );
        r2.saveRecord();
        r2.updateRecord();
        r2.viewRecord();
        r2.printMedicalCertificate();




        MedicalCertificate mc1 = new MedicalCertificate();
        mc1.setCertificateId("MC001");
        System.out.println(mc1.getCertificateId());

        MedicalCertificate mc2 = new MedicalCertificate(
                "MC002",
                new Date(),
                new Date(System.currentTimeMillis() + 86400000),// + 1 วันนะจ๊ะ
                "Acute viral fever with mild symptoms",
                2
        );
        System.out.println(
                mc2.getCertificateId() + " " +
                mc2.getIssueDate() + " " +
                mc2.getExpireDate() + " " +
                mc2.getDiagnosisSummary() + " " +
                mc2.getRestDays() + " " 
        );
        mc2.generateCertificate();
        mc2.printCertificate();
        mc2.verifyCertificate();
        mc2.invalidateCertificate();
    }
}
