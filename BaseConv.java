
/*4. Write a program to perform base conversion
a) Integer to binary
b) Integer to Octal
c) Integer to Hexadecimal
 */
public class BaseConv {
    public static void main(String[] a) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        while (true) {
            System.out.println("\nChoose a conversion option:");
            System.out.println("1. Convert to Binary");
            System.out.println("2. Convert to Octal");
            System.out.println("3. Convert to Hexadecimal");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int c = sc.nextInt();
            if (c == 4) break;
            System.out.print("Number: ");
            int n = sc.nextInt();
            switch (c) {
                case 1:
                    System.out.println("Binary:      " + Integer.toBinaryString(n));
                    break;
                case 2:
                    System.out.println("Octal:       " + Integer.toOctalString(n));
                    break;
                case 3:
                    System.out.println("Hexadecimal: " + Integer.toHexString(n).toUpperCase());
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            System.out.println();
            sc.close();
        }
    }
}
