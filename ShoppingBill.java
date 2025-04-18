import java.util.Scanner;

public class ShoppingBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter price of item " + i + ": ");
            double price = sc.nextDouble();
            total += price;
        }

        System.out.println("Total bill amount: ₹" + total);
    }
}
