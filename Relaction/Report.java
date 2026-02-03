import java.util.Date;

public class Report {

    private int report_code;
    private Date report_date;
    private Proposal proposal;

    public Report(int report_code, Date report_date, Proposal proposal) {
        this.report_code = report_code;
        this.report_date = report_date;
        this.proposal = proposal;
    }

    public void viewReports() {
        System.out.println("Report Code: " + report_code);
    }

    public void createReports() {
        System.out.println("Create Report");
    }
}
