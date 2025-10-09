//2. Given the sides of a triangle, write a program to check whether the triangle is equilateral, isosceles or scalene and find its area.

public class triangle {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if (args.length != 3) {
            System.out.println("Please provide exactly 3 integer arguments.");
            return;
        } 
         if (a + b >= c && b + c >= a && c + a >= b) {
            if (a == b && b == c) {
                System.out.println("the triangle is equilateral");
            } else if (a == b || a == c || b == c) {
                System.out.println("the triangle is Isosceles");

            } else {
                System.out.println("the triangle is scalene");

            }

            int s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            System.out.println("area of triangle = " + area);
        } else {

            System.out.println("invalid triangle");
            return;
        }

    }
}