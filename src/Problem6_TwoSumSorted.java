import java.util.Arrays;

/**
 * ข้อ 6: การค้นหาคู่จำนวนที่มีผลรวมเท่ากับ k บน Sorted Array
 */
public class Problem6_TwoSumSorted {

    /**
     * อัลกอริทึมที่ 1: Brute Force O(N^2)
     */
    public static boolean findPairBruteForce(int[] a, int k) {
        if (a == null) return false;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == k) {
                    System.out.println("Pair found: " + a[i] + " and " + a[j]);
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * อัลกอริทึมที่ 2: Recursive Two-Pointer O(N)
     * Base Case: left >= right (ไม่พบคู่ที่รวมได้ k)
     * Recursive Case:
     * - sum == k : คืนค่า true
     * - sum < k  : เลื่อน left ขึ้น (left + 1)
     * - sum > k  : เลื่อน right ลง (right - 1)
     */
    public static boolean findPairRecursive(int[] a, int k, int left, int right) {
        if (a == null || left >= right) return false; // Base Case
        int sum = a[left] + a[right];
        if (sum == k) {
            System.out.println("Pair found: " + a[left] + " and " + a[right]);
            return true;
        } else if (sum < k) {
            return findPairRecursive(a, k, left + 1, right);
        } else {
            return findPairRecursive(a, k, left, right - 1);
        }
    }

    /**
     * อัลกอริทึมที่ 3: Binary Search O(N log N)
     */
    public static boolean findPairBinarySearch(int[] a, int k) {
        if (a == null) return false;
        for (int i = 0; i < a.length; i++) {
            int target = k - a[i];
            int index = Arrays.binarySearch(a, i + 1, a.length, target);
            if (index >= 0) {
                System.out.println("Pair found: " + a[i] + " and " + a[index]);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {2, 4, 7, 11, 15, 20};
        int k = 18;
        findPairRecursive(a, k, 0, a.length - 1);
    }
}