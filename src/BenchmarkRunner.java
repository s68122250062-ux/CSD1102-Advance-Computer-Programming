import java.util.Random;

/**
 * คลาสสำหรับทำรันทดสอบวัดเวลาประมวลผลจริง (Benchmark)
 */
public class BenchmarkRunner {

    public static void main(String[] args) {
        int[] sizes = {100, 1000, 10000, 100000};
        int runs = 5;

        System.out.println("=== BENCHMARK PROBLEM 1: STRING REVERSAL ===");
        for (int n : sizes) {
            String str = generateRandomString(n);

            // Iterative
            long totalTimeIterative = 0;
            for (int r = 0; r < runs; r++) {
                long start = System.nanoTime();
                Problem1_StringReversal.reverseIterative(str);
                long end = System.nanoTime();
                totalTimeIterative += (end - start);
            }
            long avgIterative = totalTimeIterative / runs;

            // Recursive (Skip n=100000 to prevent StackOverflowError)
            long avgRecursive = -1;
            if (n <= 10000) {
                long totalTimeRecursive = 0;
                for (int r = 0; r < runs; r++) {
                    long start = System.nanoTime();
                    Problem1_StringReversal.reverseRecursive(str);
                    long end = System.nanoTime();
                    totalTimeRecursive += (end - start);
                }
                avgRecursive = totalTimeRecursive / runs;
            }

            System.out.printf("N=%-6d | Iterative: %10d ns | Recursive: %s%n",
                    n, avgIterative, (avgRecursive == -1 ? "StackOverflow" : avgRecursive + " ns"));
        }
    }

    private static String generateRandomString(int length) {
        StringBuilder sb = new StringBuilder(length);
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            sb.append((char) ('a' + rand.nextInt(26)));
        }
        return sb.toString();
    }
}

