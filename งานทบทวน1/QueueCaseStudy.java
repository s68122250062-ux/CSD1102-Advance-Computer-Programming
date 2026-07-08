import java.util.LinkedList;
import java.util.Queue;

public class QueueCaseStudy {
    public static void main(String[] args) {
        Queue<String> patientQueue = new LinkedList<>();

        // 1. เพิ่มผู้ป่วย P001 ถึง P005 ลงใน Queue
        patientQueue.add("P001");
        patientQueue.add("P002");
        patientQueue.add("P003");
        patientQueue.add("P004");
        patientQueue.add("P005");
        System.out.println("ลงทะเบียนผู้ป่วยเริ่มต้น: " + patientQueue);

        // 2. เรียกผู้ป่วยออกจากคิว 2 คน (พร้อมตรวจสอบก่อน remove)
        System.out.println("\n--- เรียกผู้ป่วยเข้ารับบริการ ---");
        for (int i = 0; i < 2; i++) {
            if (!patientQueue.isEmpty()) {
                String servedPatient = patientQueue.remove();
                System.out.println("ผู้ป่วย " + servedPatient + " เข้ารับบริการแล้ว");
            } else {
                System.out.println("ไม่มีผู้ป่วยในคิว");
            }
        }

        // 3. เพิ่มผู้ป่วยใหม่ P006 และ P007 เข้า Queue
        patientQueue.add("P006");
        patientQueue.add("P007");
        System.out.println("\nผู้ป่วยใหม่ (P006, P007) ลงทะเบียนเพิ่ม...");

        // 4. แสดงผู้ป่วยคนถัดไปโดยใช้ peek()
        if (!patientQueue.isEmpty()) {
            System.out.println("4. ผู้ป่วยคิวถัดไปที่จะถูกเรียก (peek): " + patientQueue.peek());
        } else {
            System.out.println("4. ไม่มีผู้ป่วยรอในคิว");
        }

        // 5. แสดงจำนวนผู้ป่วยที่ยังรออยู่ด้วย size()
        System.out.println("5. จำนวนผู้ป่วยที่ยังรออยู่ในคิว (size): " + patientQueue.size() + " คน");

        // 6. แสดงสถานะของ Queue หลังจากดำเนินการทั้งหมด
        System.out.println("6. สถานะคิวปัจจุบันทั้งหมด: " + patientQueue);
    }
}