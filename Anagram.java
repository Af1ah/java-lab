/*9. Write a Java Programming Code to Check given string Anagram or Not. If the two
strings are anagram to each other, then one string can be rearranged to form the
other string. For Example: abc and cba are anagram. */
import java.util.Scanner;

class FindAnagram {
    boolean isAnagram(String w1, String w2) {
        if (w1.length() != w2.length())
            return false;

        char[] a = w1.toLowerCase().toCharArray();
        char[] b = w2.toLowerCase().toCharArray();

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    char temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (int i = 0; i < b.length; i++) {
            for (int j = i + 1; j < b.length; j++) {
                if (b[i] > b[j]) {
                    char temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }
}

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String w1 = sc.nextLine();
        System.out.print("Enter second word: ");
        String w2 = sc.nextLine();

        FindAnagram f = new FindAnagram();

        if (f.isAnagram(w1, w2))
            System.out.println("Words are anagrams.");
        else
            System.out.println("Words are not anagrams.");
    }
}
