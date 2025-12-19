import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int marks[] = new int[n];
        int total = 0;

        // Input marks
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        // Calculate percentage
        double percentage = (double) total / n;

        // Calculate grade
        String grade;
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "F (Fail)";
        }

        // Display result
        System.out.println("\n--- Student Result ---");
        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage + "%");
        System.out.println("Grade = " + grade);

        sc.close();
    }
}