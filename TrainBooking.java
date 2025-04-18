import java.util.Scanner;

public class TrainBooking {
    public static void main(String[] args) {
        int seats = 50;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter number of seats to book (0 to exit): ");
            int book = sc.nextInt();

            if (book == 0) {
                System.out.println("Booking closed.");
                break;
            }

            if (book <= seats) {
                seats -= book;
                System.out.println("Successfully booked " + book + " seat(s). Remaining: " + seats);
            } else {
                System.out.println("Only " + seats + " seat(s) available.");
            }

            if (seats == 0) {
                System.out.println("Train is fully booked.");
                break;
            }
        }
    }
}
