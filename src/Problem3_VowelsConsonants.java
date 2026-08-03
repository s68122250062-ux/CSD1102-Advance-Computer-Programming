/**
 * ข้อ 3: การเปรียบเทียบจำนวนสระและพยัญชนะ
 */
public class Problem3_VowelsConsonants {

    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    private static boolean isConsonant(char c) {
        c = Character.toLowerCase(c);
        return c >= 'a' && c <= 'z' && !isVowel(c);
    }

    /**
     * อัลกอริทึมที่ 1: Recursive Counting
     */
    private static int[] countRecursiveHelper(String s, int index) {
        if (s == null || index >= s.length()) { // Base Case
            return new int[]{0, 0}; // [vowels, consonants]
        }
        int[] counts = countRecursiveHelper(s, index + 1); // Recursive Case
        char c = s.charAt(index);
        if (isVowel(c)) counts[0]++;
        else if (isConsonant(c)) counts[1]++;
        return counts;
    }

    public static boolean hasMoreVowelsRecursive(String s) {
        int[] counts = countRecursiveHelper(s, 0);
        return counts[0] > counts[1];
    }

    /**
     * อัลกอริทึมที่ 2: Iterative Counting
     */
    public static boolean hasMoreVowelsIterative(String s) {
        if (s == null) return false;
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isVowel(c)) vowels++;
            else if (isConsonant(c)) consonants++;
        }
        return vowels > consonants;
    }

    public static void main(String[] args) {
        String input = "education";
        System.out.println("Input: " + input);
        System.out.println("Recursive Result: " + hasMoreVowelsRecursive(input));
        System.out.println("Iterative Result: " + hasMoreVowelsIterative(input));
    }
}