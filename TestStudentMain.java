public class TestStudentMain {
    public static void main(String[] args) {

        Student s1 = new Student("64001", "Somchai", "Computer Science", 3.45);
        Student s2 = new Student("64002", "Suda", "Information Tech", 3.80);


        s1.displayInfo();
        s2.displayInfo();

        Student[] students = new Student[3];
        students[0] = new Student("64003", "Anan", "Business", 3.20);
        students[1] = new Student("64004", "Malee", "Engineering", 3.60);
        students[2] = new Student("64005", "Krit", "Computer Science", 3.10);

        System.out.println("=== All Students in Array ===");
        for (Student s : students) {
            s.displayInfo();
        }
    }
}
