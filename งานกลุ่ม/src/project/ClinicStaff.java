package project;

public class ClinicStaff {

    private String staffId;
    private String name;
    private String position;
    private String shift;
    private String phone;
    private String status;
    private String roomNumber;

    public ClinicStaff() {
    }

    public ClinicStaff(String staffId, String name, String position,
            String shift, String phone, String status, String roomNumber) {
        this.staffId = staffId;
        this.name = name;
        this.position = position;
        this.shift = shift;
        this.phone = phone;
        this.status = status;
        this.roomNumber = roomNumber;
    }

    public String getstaffId() {
        return staffId;
    }

    public void setstaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getposition() {
        return position;
    }

    public void setposition(String position) {
        this.position = position;
    }

    public String getshift() {
        return shift;
    }

    public void setshift(String shift) {
        this.shift = shift;
    }

    public String getphone() {
        return phone;
    }

    public void setphone(String phone) {
        this.phone = phone;
    }

    public String getstatus() {
        return status;
    }

    public void setstatus(String status) {
        this.status = status;
    }

    public String getroomNumber() {
        return roomNumber;
    }

    public void setroomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void checkIn() {
        try {
            System.out.println("from class ClinicStaff = checkIn");
        } catch (Exception e) {
            System.out.println("Error in checkIn");
        }
    }

    public void checkOut() {
        try {
            System.out.println("from class ClinicStaff = checkOut");
        } catch (Exception e) {
            System.out.println("Error in checkOut");
        }
    }

    public void updateStatus() {
        try {
            System.out.println("from class ClinicStaff = updateStatus");
        } catch (Exception e) {
            System.out.println("Error in updateStatus");
        }
    }

    public static void main(String[] args) {

        ClinicStaff staff = new ClinicStaff(
                "S001",
                "Somchai",
                "Nurse",
                "Morning",
                "0899999999",
                "Working",
                "101");

        staff.checkIn();
        staff.updateStatus();
        staff.checkOut();

        System.out.println("Name: " + staff.getname());
        System.out.println("Position: " + staff.getposition());
    }
}