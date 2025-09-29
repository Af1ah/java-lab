import java.util.Scanner;

public class HCF_LCM {
    
    // Function to calculate HCF
    static int calculateHCF(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    // Function to calculate LCM
    static int calculateLCM(int num1, int num2, int hcf) {
        return (num1 * num2) / hcf;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        // Calculate HCF
        int hcf = calculateHCF(num1, num2);
        
        // Calculate LCM
        int lcm = calculateLCM(num1, num2, hcf);
        
        // Output the results
        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
        
        scanner.close();
    }
}

