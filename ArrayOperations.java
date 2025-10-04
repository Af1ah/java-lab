
/*3. Read an array of 10 or more numbers and write a program to find the
a) Smallest element in the array
b) Largest element in the array
c) Second largest element in the array */

import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = scanner.nextInt();

        if (size < 10) {
            System.out.println("Array must contain at least ten .");
            return;
        }

        int[] arr = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int small = arr[0];
        int large = arr[0];
        int secondLarge = 0;

        for (int i = 1; i < size; i++) {
            if (arr[i] > large) {
                secondLarge = large;
                large = arr[i];
            } else if (arr[i] > secondLarge && arr[i] != large) {
                secondLarge = arr[i];
            }

            if (arr[i] < small) {
                small = arr[i];
            }
        }

        System.out.println("Smallest element in the array: " + small);
        System.out.println("Largest element in the array: " + large);

       
            System.out.println("Second largest element in the array: " + secondLarge);
        
    }
}
