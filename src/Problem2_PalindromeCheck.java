/**
 * ข้อ 2: การตรวจสอบ Palindrome
 */
public class Problem2_PalindromeCheck {

    // เมธอดช่วยในการปรับรูปแบบสตริง ตัดเครื่องหมาย/ช่องว่าง และแปลงเป็นอักษรตัวเล็ก
    private static String preprocess(String s) {
        if (s == null) return "";
        return s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }

    /**
     * อัลกอริทึมที่ 1: Reverse and Compare
     */
    public static boolean isPalindromeByReverse(String s) {
        String clean = preprocess(s);
        StringBuilder sb = new StringBuilder(clean);
        String reversed = sb.reverse().toString();
        return clean.equals(reversed);
    }

    /**
     * อัลกอริทึมที่ 2: Recursive Two-Pointer
     * Base Case: left >= right (ตรวจสอบครบแล้ว เป็น Palindrome)
     * Recursive Case: หากอักขระตำแหน่ง left เท่ากับ right ให้ตรวจสอบคู่ถัดไป (left + 1, right - 1)
     */
    public static boolean isPalindromeRecursive(String s, int left, int right) {
        if (left >= right) { // Base Case 1: ตัวชี้ชนกันหรือสวนกัน
            return true;
        }
        if (s.charAt(left) != s.charAt(right)) { // Base Case 2: พบคู่ที่ไม่ตรงกัน (หยุดทำทันที)
            return false;
        }
        // Recursive Case
        return isPalindromeRecursive(s, left + 1, right - 1);
    }

    // Overload helper method เพื่อให้ใช้งานง่าย
    public static boolean isPalindromeRecursive(String s) {
        String clean = preprocess(s);
        return isPalindromeRecursive(clean, 0, clean.length() - 1);
    }

    public static void main(String[] args) {
        String[] testCases = {"racecar", "level", "algorithm", "A man, a plan, a canal: Panama"};
        for (String test : testCases) {
            System.out.println("Input: \"" + test + "\"");
            System.out.println("  By Reverse: " + isPalindromeByReverse(test));
            System.out.println("  By Recursive Two-Pointer: " + isPalindromeRecursive(test));
        }
    }
}