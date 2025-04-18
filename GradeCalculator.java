import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalMarks = 0;
        int subjects = 5;

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks of subject " + i + ": ");
            totalMarks += sc.nextInt();
        }

        double avg = totalMarks / (double) subjects;

        System.out.println("Average Marks: " + avg);

        if (avg >= 90) System.out.println("Grade: A+");
        else if (avg >= 80) System.out.println("Grade: A");
        else if (avg >= 70) System.out.println("Grade: B");
        else if (avg >= 60) System.out.println("Grade: C");
        else System.out.println("Grade: F");
    }
}
