import java.util.Stack;

public class StackCaseStudy {
    public static void main(String[] args) {
        Stack<String> commandStack = new Stack<>();

        // 1. เพิ่มคำสั่งทั้งหมดลงใน Stack
        commandStack.push("Type Data");
        commandStack.push("Type Structure");
        commandStack.push("Delete Structure");
        commandStack.push("Type Algorithm");
        commandStack.push("Type Java");

        // 2. แสดงคำสั่งทั้งหมดใน Stack
        System.out.println("=== สถานะ Stack เริ่มต้น ===");
        System.out.println("คำสั่งใน Stack (ล่าง -> บน): " + commandStack);
        System.out.println("=========================\n");

        // 3. Undo คำสั่งล่าสุด 2 ครั้ง พร้อมตรวจสอบก่อน pop()
        System.out.println("=== เริ่มกระบวนการ Undo ===");
        for (int i = 1; i <= 2; i++) {
            if (!commandStack.isEmpty()) {
                String poppedCommand = commandStack.pop();
                System.out.println("Undo ครั้งที่ " + i + ": ยกเลิกคำสั่ง [" + poppedCommand + "]");
            } else {
                System.out.println("ไม่สามารถ Undo ได้ เนื่องจาก Stack ว่างเปล่า");
            }
        }
        System.out.println("=========================\n");

        // 4. แสดงสถานะของ Stack หลังจาก Undo
        System.out.println("=== สถานะ Stack ล่าสุด ===");
        System.out.println("คำสั่งคงเหลือใน Stack: " + commandStack);
        System.out.println("=========================");
    }
}