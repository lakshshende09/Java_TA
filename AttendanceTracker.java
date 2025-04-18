import java.util.Scanner;

public class AttendanceTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalDays, presentDays;

        System.out.print("Enter total working days: ");
        totalDays = sc.nextInt();
        System.out.print("Enter days attended: ");
        presentDays = sc.nextInt();

        double percentage = (presentDays * 100.0) / totalDays;
        System.out.println("Attendance: " + percentage + "%");

        if (percentage >= 75)
            System.out.println("Eligible for exam.");
        else
            System.out.println("Not eligible for exam.");
    }
}
