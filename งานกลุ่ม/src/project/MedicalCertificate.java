package project;

import java.util.Date;

public class MedicalCertificate {

    private String certificateId;
    private Date issueDate;
    private Date expireDate;
    private String diagnosisSummary;
    private int restDays;
    private boolean isPrinted;
    private boolean isValid;

    public MedicalCertificate() {
        this.isPrinted = false;
        this.isValid = false;
    }

    public MedicalCertificate(String certificateId, Date issueDate,
            Date expireDate, String diagnosisSummary,
            int restDays) {

        this.certificateId = certificateId;
        this.issueDate = issueDate;
        this.expireDate = expireDate;
        this.diagnosisSummary = diagnosisSummary;
        this.restDays = restDays;
        this.isPrinted = false;
        this.isValid = true;
    }

    public String getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public String getDiagnosisSummary() {
        return diagnosisSummary;
    }

    public void setDiagnosisSummary(String diagnosisSummary) {
        this.diagnosisSummary = diagnosisSummary;
    }

    public int getRestDays() {
        return restDays;
    }

    public void setRestDays(int restDays) {
        this.restDays = restDays;
    }

    public boolean isPrinted() {
        return isPrinted;
    }

    public boolean isValid() {
        return isValid;
    }

    public void generateCertificate() {
        try {
            this.issueDate = new Date();
            this.isValid = true;
            this.isPrinted = false;
            System.out.println("from class MedicalCertificate = generateCertificate");
        } catch (Exception e) {
            System.out.println("Error in generateCertificate");
        }
    }

    public void printCertificate() {
        try {
            System.out.println("from class MedicalCertificate = printCertificate");
            System.out.println("Certificate ID: " + certificateId);
            System.out.println("Diagnosis: " + diagnosisSummary);
            System.out.println("Rest Days: " + restDays);
        } catch (Exception e) {
            System.out.println("Error in printCertificate");
        }
    }

    public boolean verifyCertificate() {
        try {
            return isValid;
        } catch (Exception e) {
            System.out.println("Error in verifyCertificate");
            return false;
        }
    }

    public void invalidateCertificate() {
        try {
            this.isValid = false;
            System.out.println("from class MedicalCertificate = invalidateCertificate");
        } catch (Exception e) {
            System.out.println("Error in invalidateCertificate");
        }
    }

    public static void main(String[] args) {

        MedicalCertificate mc = new MedicalCertificate(
                "MC001",
                new Date(),
                new Date(),
                "Common Cold",
                3);

        mc.generateCertificate();
        mc.printCertificate();
        mc.verifyCertificate();
        mc.invalidateCertificate();
    }
}