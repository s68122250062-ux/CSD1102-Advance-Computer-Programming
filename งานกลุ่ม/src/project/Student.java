package project;

import java.time.LocalTime;
import java.util.Date;

public class Student {
    private String studentId;
    private String name;
    private String faculty;
    private String major;
    private int year;
    private String phone;
    private String emergencycontact;
    private String medicalcondition;
    private String allergy;
    private String bloodtype;
    private String symptom;
    private Date visitdate;
    private LocalTime visittime;
    public Student () {}

    public Student (String studentId , String name , String faculty , String major , int year , String phone , String emergencycontact ,
     String medicalcondition , String allergy , String bloodtype , String symptom , Date visitdate , LocalTime visittime) {

        this.studentId = studentId;
        this.name = name;
        this.faculty = faculty;
        this.major = major;
        this.year = year;
        this.phone = phone;
        this.emergencycontact = emergencycontact;
        this.medicalcondition = medicalcondition;
        this.allergy = allergy;
        this.bloodtype = bloodtype;
        this.symptom = symptom;
        this.visitdate = visitdate;
        this.visittime = visittime;
    }
    public String getstudentId() {
        return  studentId;
    }
    public void setstudentId(String studentId) {
        this.studentId = studentId;
    }
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public String getfaculty() {
        return faculty;
    }
    public void setfaculty(String faculty) {
        this.faculty = faculty;
    }
    public String getmajor() {
        return major;
    }
    public void setmajor(String major) {
        this.major = major;
    }
        public int getyear() {
        return year;
    }
        public void setyear(int year) {
        this.year = year;
    }
            public String getphone() {
        return phone;
    }
            public void setphone(String phone) {
        this.phone = phone;
    }
        public String getemergencycontact() {
        return emergencycontact;
    }
        public void setemergencycontact(String emergencycontact) {
        this.emergencycontact = emergencycontact;
    }
        public String getmedicalcondition() {
        return medicalcondition;
    }
        public void setmedicalcondition(String medicalcondition) {
        this.medicalcondition = medicalcondition;
    }
        public String getallergy() {
        return allergy;
    }
        public void setallergy(String allergy) {
        this.allergy = allergy;
    }
        public String getbloodtype() {
        return bloodtype;
    }
        public void setbloodtype(String bloodtype) {
        this.bloodtype = bloodtype;
    }
        public String getsymptom() {
        return symptom;
    }
        public void setsymptom(String symptom) {
        this.symptom = symptom;
    }
        public Date getvisitdate() {
        return visitdate;
    }
        public void setvisitdate(Date visitdate) {
        this.visitdate = visitdate;
    }   
        public LocalTime getvisittime() {
        return visittime;
    }    
        public void setvisittime(LocalTime visittime) {
        this.visittime = visittime;
    }
   public void registerVisit() {
    try {
        System.out.println("From class Student = registerVisit");
    } catch (Exception e) {
        System.out.println("Error in registerVisit");
    }
}

public void updateHealthInfo() {
    try {
        System.out.println("From class Student = updateHealthInfo");
    } catch (Exception e) {
        System.out.println("Error in updateHealthInfo");
    }
}

public void requestMedicalCertificate() {
    try {
        System.out.println("From class Student = requestMedicalCertificate");
    } catch (Exception e) {
        System.out.println("Error in requestMedicalCertificate");
    }
}

public void viewVisitHistory() {
    try {
        System.out.println("From class Student = viewVisitHistory");
    } catch (Exception e) {
        System.out.println("Error in viewVisitHistory");
    }
}
}