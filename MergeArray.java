//5. Write a program to merge two arrays
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        System.out.println("enter the size of two arrays to merge :");
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();
        int[] array1 = new int[size1];
        int[] array2 = new int[size2];
        System.out.println("enter elements of first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = sc.nextInt();
        }
        System.out.println("enter elements of second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = sc.nextInt();
        }
        int length1 = array1.length;
        int length2 = array2.length;
        int[] mergedArray = new int[length1 + length2];

        for (int i = 0; i < length1; i++) {
            mergedArray[i] = array1[i];
        }

        for (int j = 0; j < length2; j++) {
            mergedArray[length1 + j] = array2[j];
        }

        System.out.println("Merged Array:");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }
}
