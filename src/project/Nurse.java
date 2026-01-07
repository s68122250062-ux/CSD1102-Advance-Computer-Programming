package project;

public class Nurse {
    private String nurseId;
    private String licenseNumber;
    private int experienceYear;
    private double temperature;
    private String bloodPressure;
    private int heartRate;
    private double weight;
    public Nurse () {}
    public Nurse (String nurseId , String licenseNumber , int experienceYear ,
     double temperature , String bloodPressure , int heartRate , double weight) {

        this.nurseId = nurseId;
        this.licenseNumber = licenseNumber;
        this.experienceYear = experienceYear;
        this.temperature = temperature;
        this.bloodPressure = bloodPressure;
        this.heartRate = heartRate;
        this.weight = weight;
    }
    public String getnurseId() {
        return  nurseId;
    }
    public void setnurseId(String nurseId) {
        this.nurseId = nurseId;
    }
    public String getlicenseNumber() {
        return  licenseNumber;
    }
    public void setlicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
            public int getexperienceYear() {
        return experienceYear;
    }
            public void setexperienceYear(int experienceYear) {
        this.experienceYear = experienceYear;
    }    
    public double gettemperature() {
        return  temperature;
    }
    public void settemperature(double temperature) {
        this.temperature = temperature;
    }    
    public String getbloodPressure() {
        return  bloodPressure;
    }
    public void setbloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }
            public int getheartRate() {
        return heartRate;
    }
            public void setheartRate(int heartRate) {
        this.heartRate = heartRate;
    }
    public double getweight() {
        return  weight;
    }
    public void setweight(double weight) {
        this.weight = weight;
    }
    public void checkInitialSymptoms() {
        System.out.println("From class Nurse = checkInitialSymptoms" );
    }
    public void checkVitalSigns() {
        System.out.println("From class Nurse = checkVitalSigns" );
    }
    public void recordSymptoms() {
        System.out.println("From class Nurse = recordSymptoms" );
    }
    public void provideFirstAid() {
        System.out.println("From class Nurse = provideFirstAid" );
    }
    public void referToDoctor() {
        System.out.println("From class Nurse = referToDoctor" );
    }                    
}