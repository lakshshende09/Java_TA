import java.util.Scanner;

public class LoanCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter loan amount: ");
        double loan = sc.nextDouble();
        System.out.print("Enter annual interest rate (%): ");
        double rate = sc.nextDouble();
        System.out.print("Enter loan tenure (years): ");
        int years = sc.nextInt();

        double monthlyRate = rate / (12 * 100);
        int months = years * 12;

        double emi = (loan * monthlyRate * Math.pow(1 + monthlyRate, months)) / 
                     (Math.pow(1 + monthlyRate, months) - 1);

        System.out.printf("Monthly EMI: ₹%.2f%n", emi);
    }
}
