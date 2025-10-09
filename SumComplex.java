/*12.Using class and objects, write a java program to find the sum of two complex
numbers 
(Hint: Use object as parameter to function).*/

import java.util.Scanner;

class Complex {
     double real;
     double imag;

     Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imag + other.imag);
    }

     void display() {
        System.out.println(real + " + " + imag + "i");
    }
}

public class SumComplex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real part of first complex number: ");
        double real1 = sc.nextDouble();
        System.out.print("Enter imaginary part of first complex number: ");
        double imag1 = sc.nextDouble();
        System.out.print("Enter real part of second complex number: ");
        double real2 = sc.nextDouble();
        System.out.print("Enter imaginary part of second complex number: ");
        double imag2 = sc.nextDouble();

        Complex c1 = new Complex(real1, imag1);
        Complex c2 = new Complex(real2, imag2);
        Complex sum = c1.add(c2);
        System.out.print("Sum of complex numbers: ");
        sum.display();
    }
}
