import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Convert INR to:\n1. USD\n2. EUR");
        int choice = sc.nextInt();

        System.out.print("Enter amount in INR: ");
        double inr = sc.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("USD = $" + (inr / 83.0));
                break;
            case 2:
                System.out.println("EUR = €" + (inr / 90.0));
                break;
            default:
                System.out.println("Invalid option.");
        }
    }
}
