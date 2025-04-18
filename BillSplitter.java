import java.util.Scanner;

public class BillSplitter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total bill amount: ");
        double total = sc.nextDouble();
        System.out.print("Enter number of friends: ");
        int friends = sc.nextInt();

        if (friends > 0) {
            double each = total / friends;
            System.out.println("Each person should pay: ₹" + each);
        } else {
            System.out.println("Invalid number of friends.");
        }
    }
}
