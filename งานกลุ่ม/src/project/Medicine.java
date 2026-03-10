package project;

import java.util.Date;

public class Medicine {
    private String medicineId;
    private String medicineName;
    private String type;
    private String dosage;
    private int quantity;
    private String Warning;
    private String allergyRisk;
    private int Stock;
    private Date expireDate;

    public Medicine () {}
    
    public Medicine (String medicineId , String medicineName , String type , String dosage ,int quantity , String Warning , String allergyRisk , int Stock ,Date expireDate) {
        this.medicineId = medicineId;
        this.medicineName = medicineName;
        this.type = type;
        this.dosage = dosage;
        this.quantity = quantity;
        this.Warning = Warning;
        this.allergyRisk = allergyRisk;
        this.Stock = Stock;
        this.expireDate = expireDate;
    }
    
    public String getmedicineId() { return  medicineId; }
    public void setmedicineId(String medicineId) { this.medicineId = medicineId; }
    
    public String getmedicineName() { return  medicineName; }
    public void setmedicineName(String medicineName) { this.medicineName = medicineName; }
    
    public String gettype() { return  type; }
    public void settype(String type) { this.type = type; }
    
    public String getdosage() { return  dosage; }
    public void setdosage(String dosage) { this.dosage = dosage; }
    
    public int getquantity() { return  quantity; }
    public void setquantity(int quantity) { this.quantity = quantity; }
    
    public String getWarning() { return  Warning; }
    public void setWarning(String Warning) { this.Warning = Warning; }
    
    public String getallergyRisk() { return  allergyRisk; }
    public void setallergyRisk(String allergyRisk) { this.allergyRisk = allergyRisk; }
    
    public int getStock() { return  Stock; }
    public void setStock(int Stock) { this.Stock = Stock; }
    
    public Date getexpireDate() { return  expireDate; }
    public void setexpireDate(Date expireDate) { this.expireDate = expireDate; }
    
    public void dispense() {
        try {
            System.out.println("From class Medicine = dispense" );
        } catch (Exception e) {
            System.out.println("Error in dispense");
        }
    }
    
    public void checkStock() {
        try {
            System.out.println("From class Medicine = checkStock" );
        } catch (Exception e) {
            System.out.println("Error in checkStock");
        }
    }
    
    public void updateStock() {
        try {
            System.out.println("From class Medicine = updateStock" );
        } catch (Exception e) {
            System.out.println("Error in updateStock");
        }
    }
    
    public void isExpired() {
        try {
            System.out.println("From class Medicine = isExpired" );
        } catch (Exception e) {
            System.out.println("Error in isExpired");
        }
    }

    public static void main(String[] args) {
        Medicine med = new Medicine(
                "M002", 
                "Paracetamol", 
                "Tablet",
                "500mg", 
                10, 
                "Do not overdose", 
                "None",
                100, 
                new Date()
        );

        med.checkStock();
        med.dispense();
        med.updateStock();

        System.out.println("Medicine Name: " + med.getmedicineName());
        System.out.println("Stock remaining: " + med.getStock());
    }
}