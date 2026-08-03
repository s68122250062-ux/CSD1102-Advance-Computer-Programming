public class Problem1_StringReversal {

    /**
     * อัลกอริทึมที่ 1: Recursive Algorithm
     * Base Case: สตริงมีความยาว <= 1 (คืนค่าเดิม)
     * Recursive Case: ดึงตัวอักษรสุดท้าย + เรียกเมธอดเวียนเกิดกับสตริงส่วนที่เหลือ
     */
    public static String reverseRecursive(String s) {
        if (s == null || s.length() <= 1) { // Base Case
            return s == null ? "" : s;
        }
        // Recursive Case: last char + reverseRecursive(substring excluding last char)
        return s.charAt(s.length() - 1) + reverseRecursive(s.substring(0, s.length() - 1));
    }

    /**
     * อัลกอริทึมที่ 2: Iterative Algorithm (ใช้ StringBuilder เพื่อประสิทธิภาพ O(N))
     */
    public static String reverseIterative(String s) {
        if (s == null) return "";
        StringBuilder sb = new StringBuilder(s.length());
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "pots&pans";
        System.out.println("Input: " + input);
        System.out.println("Recursive Output: " + reverseRecursive(input));
        System.out.println("Iterative Output: " + reverseIterative(input));
    }
}
