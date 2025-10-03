import java.util.Scanner;

public class BaseConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\nChoose a conversion option:");
            System.out.println("1. Convert to Binary");
            System.out.println("2. Convert to Octal");
            System.out.println("3. Convert to Hexadecimal");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            System.out.print("Enter an integer: ");
            int number1 = scanner.nextInt();
            switch (choice) {
                case 1:
                    String binaryString = Integer.toBinaryString(number1);
                    System.out.println("Binary: " + binaryString);
                    break;

                case 2:

                    String octalString = Integer.toOctalString(number1);
                    System.out.println("Octal: " + octalString);
                    break;

                case 3:

                    String hexString = Integer.toHexString(number1).toUpperCase();
                    System.out.println("Hexadecimal: " + hexString);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
