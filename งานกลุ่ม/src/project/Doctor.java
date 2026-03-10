package project;

public class Doctor {

    private String doctorId;
    private String licenseNumber;
    private String specialty;
    private String experienceYear;
    private String diagnosis;
    private String treatmentPlan;
    private String prescription;

    public static int doctorCount = 0;

    public Doctor() {
        doctorCount++;
    }

    public Doctor(String doctorId, String licenseNumber, String specialty,
            String experienceYear, String diagnosis,
            String treatmentPlan, String prescription) {

        this.doctorId = doctorId;
        this.licenseNumber = licenseNumber;
        this.specialty = specialty;
        this.experienceYear = experienceYear;
        this.diagnosis = diagnosis;
        this.treatmentPlan = treatmentPlan;
        this.prescription = prescription;
        doctorCount++;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getExperienceYear() {
        return experienceYear;
    }

    public void setExperienceYear(String experienceYear) {
        this.experienceYear = experienceYear;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setTreatmentPlan(String treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public void examinePatient() {
        try {
            System.out.println("from class Doctor = examinePatient");
        } catch (Exception e) {
            System.out.println("Error in examinePatient");
        }
    }

    public void diagnose() {
        try {
            System.out.println("from class Doctor = diagnose");
        } catch (Exception e) {
            System.out.println("Error in diagnose");
        }
    }

    public void prescribeMedicine() {
        try {
            System.out.println("from class Doctor = prescribeMedicine");
        } catch (Exception e) {
            System.out.println("Error in prescribeMedicine");
        }
    }

    public void issueMedicalCertificate() {
        try {
            System.out.println("from class Doctor = issueMedicalCertificate");
        } catch (Exception e) {
            System.out.println("Error in issueMedicalCertificate");
        }
    }

    public void approveLeave() {
        try {
            System.out.println("from class Doctor = approveLeave");
        } catch (Exception e) {
            System.out.println("Error in approveLeave");
        }
    }

    public static void main(String[] args) {

        Doctor doc = new Doctor(
                "D001",
                "LIC12345",
                "General Medicine",
                "10",
                "Flu",
                "Rest",
                "Paracetamol");

        doc.examinePatient();
        doc.diagnose();
        doc.prescribeMedicine();
        doc.issueMedicalCertificate();
        doc.approveLeave();

        System.out.println("Doctor ID: " + doc.getDoctorId());
        System.out.println("Total Doctors: " + Doctor.doctorCount);
    }
}