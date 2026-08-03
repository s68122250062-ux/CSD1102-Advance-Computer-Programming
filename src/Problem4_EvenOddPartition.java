import java.util.Arrays;

/**
 * ข้อ 4: การจัดกลุ่มจำนวนคู่และจำนวนคี่
 */
public class Problem4_EvenOddPartition {

    /**
     * อัลกอริทึมที่ 1: Recursive Two-Pointer
     * Base Case: left >= right
     * Recursive Case: ปรับตำแหน่ง left/right หรือสลับค่า และเรียกเวียนเกิดในช่วงถัดไป
     */
    public static void rearrangeRecursive(int[] a, int left, int right) {
        if (a == null || left >= right) { // Base Case
            return;
        }
        if (a[left] % 2 == 0) {
            rearrangeRecursive(a, left + 1, right);
        } else if (a[right] % 2 != 0) {
            rearrangeRecursive(a, left, right - 1);
        } else {
            // สลับเมื่อ left เป็นคี่ และ right เป็นคู่
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            rearrangeRecursive(a, left + 1, right - 1);
        }
    }

    /**
     * อัลกอริทึมที่ 2: Iterative Two-Pointer
     */
    public static void rearrangeTwoPointer(int[] a) {
        if (a == null) return;
        int left = 0, right = a.length - 1;
        while (left < right) {
            while (left < right && a[left] % 2 == 0) left++;
            while (left < right && a[right] % 2 != 0) right--;
            if (left < right) {
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }
        }
    }

    /**
     * อัลกอริทึมที่ 3: Extra Array (รักษา ลำดับเดิม - Stable Algorithm)
     */
    public static int[] rearrangeExtraArray(int[] a) {
        if (a == null) return new int[0];
        int[] result = new int[a.length];
        int idx = 0;
        // ใส่จำนวนคู่ก่อน
        for (int val : a) {
            if (val % 2 == 0) result[idx++] = val;
        }
        // ใส่จำนวนคี่ตามหลัง
        for (int val : a) {
            if (val % 2 != 0) result[idx++] = val;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {7, 2, 9, 4, 1, 6, 3, 8};
        rearrangeTwoPointer(arr1);
        System.out.println("Iterative Two-Pointer: " + Arrays.toString(arr1));

        int[] arr2 = {5, 2, 7, 4, 9, 6};
        int[] stableOutput = rearrangeExtraArray(arr2);
        System.out.println("Stable Extra Array Output: " + Arrays.toString(stableOutput));
    }
}