import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter birth year: ");
        int year = sc.nextInt();
        System.out.print("Enter birth month: ");
        int month = sc.nextInt();
        System.out.print("Enter birth day: ");
        int day = sc.nextInt();

        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        Period age = Period.between(birthDate, today);

        System.out.println("Your age is: " + age.getYears() + " years, " + 
                           age.getMonths() + " months, " + age.getDays() + " days.");
    }
}
