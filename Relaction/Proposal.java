import java.util.Date;

public class Proposal {

    private String proposal_code;
    private String proposal_title;
    private String proposal_text;
    private Date proposal_date;
    private StatusProposal proposal_status = StatusProposal.Waiting;

    private Applicant applicant;

    public Proposal(String proposal_code, String proposal_title,
                    String proposal_text, Date proposal_date,
                    Applicant applicant) {

        this.proposal_code = proposal_code;
        this.proposal_title = proposal_title;
        this.proposal_text = proposal_text;
        this.proposal_date = proposal_date;
        this.applicant = applicant;
    }

    public void viewProposal() {
        System.out.println(proposal_title);
    }

    public StatusProposal viewStatus() {
        return proposal_status;
    }

    public void updateProposal(String text) {
        this.proposal_text = text;
    }

    public void deleteProposal() {
        System.out.println("Proposal deleted");
    }

    public void archiveProposal() {
        System.out.println("Proposal archived");
    }

    public Applicant viewApplicant() {
        return applicant;
    }

    public void setProposal_status(StatusProposal status) {
        this.proposal_status = status;
    }
}
