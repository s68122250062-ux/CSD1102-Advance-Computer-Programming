public class Applicant {

    private int applicant_id;
    private String applicant_name;
    private String applicant_job;
    private String applicant_address;
    private Gender applicant_gender;
    private String applicant_tel;

    public Applicant(int applicant_id, String applicant_name,
                     String applicant_job, String applicant_address,
                     Gender applicant_gender, String applicant_tel) {

        this.applicant_id = applicant_id;
        this.applicant_name = applicant_name;
        this.applicant_job = applicant_job;
        this.applicant_address = applicant_address;
        this.applicant_gender = applicant_gender;
        this.applicant_tel = applicant_tel;
    }

    public void insertApplicant() {
        System.out.println("Insert Applicant");
    }

    public void updateApplicant() {
        System.out.println("Update Applicant");
    }

    public void deleteApplicant() {
        System.out.println("Delete Applicant");
    }
}
