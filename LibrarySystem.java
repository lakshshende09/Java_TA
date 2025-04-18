import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        String[] books = {"Java Basics", "Python 101", "C Programming"};
        boolean[] issued = new boolean[books.length];
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. View Books\n2. Issue Book\n3. Return Book\n4. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Available Books:");
                    for (int i = 0; i < books.length; i++) {
                        if (!issued[i])
                            System.out.println((i + 1) + ". " + books[i]);
                    }
                    break;

                case 2:
                    System.out.print("Enter book number to issue: ");
                    int issue = sc.nextInt() - 1;
                    if (!issued[issue]) {
                        issued[issue] = true;
                        System.out.println("Book issued successfully.");
                    } else {
                        System.out.println("Book already issued.");
                    }
                    break;

                case 3:
                    System.out.print("Enter book number to return: ");
                    int ret = sc.nextInt() - 1;
                    if (issued[ret]) {
                        issued[ret] = false;
                        System.out.println("Book returned.");
                    } else {
                        System.out.println("This book was not issued.");
                    }
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    System.exit(0);
            }
        }
    }
}
