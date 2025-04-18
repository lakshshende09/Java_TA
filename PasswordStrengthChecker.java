import java.util.Scanner;

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (password.length() >= 8 && password.matches(".*[A-Z].*") &&
            password.matches(".*[a-z].*") && password.matches(".*\\d.*") &&
            password.matches(".*[@#$%^&+=!].*")) {
            System.out.println("Strong password.");
        } else {
            System.out.println("Weak password. Use uppercase, lowercase, numbers, symbols & min 8 chars.");
        }
    }
}
