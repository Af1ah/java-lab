
/*15.Create an abstract class shape and create TwoDim and ThreeDim as sub classes.
Create classes square and triangle derived from TwoDim and sphere and cube
derived from ThreeDim. Write a program to determinethe area of various shapes.
 */
import java.util.Scanner;


abstract class Shape {
    abstract void area();
}

abstract class TwoDim extends Shape {
    Scanner scanner = new Scanner(System.in);
    int tdim1, tdim2;

    void readData() {
        System.out.println("Enter 2 dimensions for 2D shape:");
        tdim1 = scanner.nextInt();
        tdim2 = scanner.nextInt();
    }

    abstract void area();
}
abstract class ThreeDim extends Shape {
    Scanner scanner = new Scanner(System.in);
    float thrdim1;


    abstract void area();
}
class Square extends TwoDim {
    @Override
    void area() {
        int area = tdim1 * tdim2;
        System.out.println("Area of square = " + area);
    }
}

class Triangle extends TwoDim {
    @Override
    void area() {
        float area = 0.5f * tdim1 * tdim2;
        System.out.println("Area of triangle = " + area);
    }
}

class Cube extends ThreeDim {
    @Override
    void area() {
        float area = 6 * thrdim1 * thrdim1;
        System.out.println("area of cube = " + area);
    }
}


class Sphere extends ThreeDim {
    @Override
    void area() {
        float area = (float) (4 * Math.PI * thrdim1 * thrdim1);
        System.out.println("area of sphere = " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nChoose a shape to calculate area:");
            System.out.println("1. Square");
            System.out.println("2. Triangle");
            System.out.println("3. Cube");
            System.out.println("4. Sphere");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Square square = new Square();
                    square.readData();
                    square.area();
                    break;

                case 2:
                    Triangle triangle = new Triangle();
                    triangle.readData();
                    triangle.area();
                    break;

                case 3:
                    Cube cube = new Cube();
                    System.out.println("Enter side of cube:");
                    cube.thrdim1 = scanner.nextFloat();
                    cube.area();
                    break;

                case 4:
                    Sphere sphere = new Sphere();
                    System.out.println("Enter radius of sphere:");
                    sphere.thrdim1 = scanner.nextFloat();
                    sphere.area();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Try again");
            }

        } while (choice != 5);

        scanner.close();
    }
}
