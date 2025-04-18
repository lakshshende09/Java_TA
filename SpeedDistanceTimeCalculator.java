import java.util.Scanner;

public class SpeedDistanceTimeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Calculate Speed\n2. Calculate Distance\n3. Calculate Time");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter Distance (km): ");
                double dist = sc.nextDouble();
                System.out.print("Enter Time (hours): ");
                double time = sc.nextDouble();
                System.out.println("Speed = " + (dist / time) + " km/h");
                break;

            case 2:
                System.out.print("Enter Speed (km/h): ");
                double speed = sc.nextDouble();
                System.out.print("Enter Time (hours): ");
                time = sc.nextDouble();
                System.out.println("Distance = " + (speed * time) + " km");
                break;

            case 3:
                System.out.print("Enter Distance (km): ");
                dist = sc.nextDouble();
                System.out.print("Enter Speed (km/h): ");
                speed = sc.nextDouble();
                System.out.println("Time = " + (dist / speed) + " hours");
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }
}
