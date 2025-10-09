//10.Write a Java Program to remove all vowels from a string

import java.util.Scanner;

public class RemChar {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter a string to remove vowels : ");
        String oString = sc.nextLine();
        String nString = oString.replaceAll("[aeiouAEIOU]", "");
        System.out.println("original String is  "+ oString);
        System.out.println("String without vowels :"+nString);
    }

}