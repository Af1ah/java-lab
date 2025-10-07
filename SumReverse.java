import java.util.Scanner;
class sumClass{
     int sumDigi(int num){
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num=num/10;

        }
        return sum;
        
    }
}

public class SumReverse{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number: ");
        int number = scanner.nextInt();
        sumClass s=new sumClass();
        int sum = s.sumDigi(number);
        System.out.println("sum of digits ="+sum);
        String digi= Integer.toString(number);
        String reverse = new StringBuilder(digi).reverse().toString();
    
        System.out.println("reverse of "+number+" number is :"+reverse );
    }
    
}
