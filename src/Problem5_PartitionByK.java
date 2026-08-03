import java.util.Arrays;

/**
 * ข้อ 5: การแบ่งอาร์เรย์ตามค่า k
 */
public class Problem5_PartitionByK {

    /**
     * อัลกอริทึมที่ 1: Recursive Partition (Hoare-style)
     * Base Case: left >= right
     */
    public static void partitionRecursive(int[] a, int k, int left, int right) {
        if (a == null || left >= right) return; // Base Case

        if (a[left] <= k) {
            partitionRecursive(a, k, left + 1, right);
        } else if (a[right] > k) {
            partitionRecursive(a, k, left, right - 1);
        } else {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            partitionRecursive(a, k, left + 1, right - 1);
        }
    }

    /**
     * อัลกอริทึมที่ 2: Iterative Partition (In-place Lomuto-style)
     */
    public static void partitionIterative(int[] a, int k) {
        if (a == null) return;
        int pivotIndex = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= k) {
                int temp = a[i];
                a[i] = a[pivotIndex];
                a[pivotIndex] = temp;
                pivotIndex++;
            }
        }
    }

    /**
     * อัลกอริทึมที่ 3: Sorting-Based Algorithm
     */
    public static void partitionBySorting(int[] a, int k) {
        if (a == null) return;
        Arrays.sort(a); // เรียงลำดับ O(N log N)
    }

    public static void main(String[] args) {
        int[] a = {12, 4, 7, 15, 3, 10, 8};
        int k = 8;
        partitionIterative(a, k);
        System.out.println("Partitioned around k=" + k + ": " + Arrays.toString(a));
    }
}