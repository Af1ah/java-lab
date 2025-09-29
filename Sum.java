public class Sum {
   public static void main(String args[]) {
      int num1 = Integer.parseInt(args[0]);
      int num2 = Integer.parseInt(args[1]);
      int sum = num1 + num2;
      int diff = num1 - num2;
      int product = num1 * num2;
      int qoat = num1 / num2;
      int rem = num1 % num2;
      System.out.println("sum = " + sum);
      System.out.println("difference = " + diff);
      System.out.println("product = " + product);
      System.out.println("quotient = " + qoat);
      System.out.println("remainder = " + rem);
   }

}
