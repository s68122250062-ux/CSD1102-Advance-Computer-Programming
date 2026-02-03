import java.util.ArrayList;
import java.util.List;

public class User extends Login {

    private int user_id;
    private Department department;
    private String user_name;
    private Gender user_gender;
    private String user_email;
    private RoleUser user_role;

    private List<Proposal> proposals = new ArrayList<>();
    private List<Report> reports = new ArrayList<>();

    public User(int user_id, String username, String password,
                String user_name, Gender user_gender,
                String user_email, RoleUser user_role) {

        super(username, password);
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_gender = user_gender;
        this.user_email = user_email;
        this.user_role = user_role;
    }

    public boolean userLogin() {
        return loginStatus();
    }

    public void addProposal(Proposal proposal) {
        proposals.add(proposal);
    }

    public void viewProposal() {
        for (Proposal p : proposals) {
            p.viewProposal();
        }
    }

    public void confirmProposal(Proposal proposal, StatusProposal status) {
        proposal.setProposal_status(status);
    }

    public void createReports(Report report) {
        reports.add(report);
    }

    public void viewReports() {
        for (Report r : reports) {
            r.viewReports();
        }
    }

    public void updateDepartment(Department department) {
        this.department = department;
    }
}
