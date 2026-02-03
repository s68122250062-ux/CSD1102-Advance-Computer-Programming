public enum StatusProposal {
    Waiting("Waiting"),
    Rejected("Rejected"),
    Accepted("Accepted");

    private String value;

    StatusProposal(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public StatusProposal changeStatus(StatusProposal newStatus) {
        return newStatus;
    }
}
