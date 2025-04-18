import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        int balance = 10000, withdraw, deposit;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nATM MENU:");
            System.out.println("1. Withdraw\n2. Deposit\n3. Check Balance\n4. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    withdraw = sc.nextInt();
                    if (balance >= withdraw) {
                        balance -= withdraw;
                        System.out.println("Please collect your money.");
                    } else {
                        System.out.println("Insufficient Balance.");
                    }
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    deposit = sc.nextInt();
                    balance += deposit;
                    System.out.println("Money successfully deposited.");
                    break;

                case 3:
                    System.out.println("Current Balance: ₹" + balance);
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM.");
                    System.exit(0);
            }
        }
    }
}
