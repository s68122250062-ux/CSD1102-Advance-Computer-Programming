public class ArrayCaseStudy {
    public static void main(String[] args) {
        // ข้อมูลคะแนนสอบของนักศึกษา 10 คน
        int[] scores = {6, 8, 4, 9, 7, 5, 10, 3, 8, 2};

        int totalScore = 0;
        int maxScore = scores[0];
        int minScore = scores[0];
        int passedStudents = 0;

        // คำนวณหาค่าต่างๆ ด้วย Loop เดียว
        for (int score : scores) {
            totalScore += score;
            
            if (score > maxScore) {
                maxScore = score;
            }
            if (score < minScore) {
                minScore = score;
            }
            if (score >= 7) {
                passedStudents++;
            }
        }

        double averageScore = (double) totalScore / scores.length;

        // แสดงผลลัพธ์ทางคอนโซล
        System.out.println("=== ระบบวิเคราะห์คะแนนสอบก่อนเรียน ===");
        System.out.println("1. คะแนนรวมของนักศึกษาทั้งหมด: " + totalScore + " คะแนน");
        System.out.println("2. คะแนนเฉลี่ย: " + averageScore + " คะแนน");
        System.out.println("3. คะแนนสูงสุด: " + maxScore + " คะแนน");
        System.out.println("4. คะแนนต่ำสุด: " + minScore + " คะแนน");
        System.out.println("5. จำนวนนักศึกษาที่ได้คะแนนตั้งแต่ 7 คะแนนขึ้นไป: " + passedStudents + " คน");
        
        System.out.print("6. รายชื่อนักศึกษาที่ควรได้รับการทบทวนเพิ่มเติม (คะแนน < 5): ");
        boolean hasReviewee = false;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 5) {
                System.out.print("คนที่ " + (i + 1) + " (ได้ " + scores[i] + " คะแนน) ");
                hasReviewee = true;
            }
        }
        if (!hasReviewee) {
            System.out.print("ไม่มี");
        }
        System.out.println("\n=================================");
    }
}