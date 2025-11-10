//8.write java program to find sum of the digit and reverse of a given number using class and object
import java.util.Scanner;
class sumClass{
     void sumDigi(int num){
        int sum=0;
        int rev= 0;
        while(num!=0){
            sum+=num%10;
            rev=rev*10+num%10;
            num=num/10;

        }
         System.out.println("sum of digits =" + sum);
         System.out.println("reverse of digits =" + rev);
    }
}

public class SumReverse{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number: ");
        int number = scanner.nextInt();
        sumClass obj = new sumClass();
        obj.sumDigi(number);
    }
    
}
