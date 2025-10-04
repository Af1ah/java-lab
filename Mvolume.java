//14.Write a java program to find the volume of cube, rectangular box, cylinder using function overloading.

import java.io.File;
import java.util.Scanner;

interface Volume {
  double pi = 3.1416;

  void readData();

  void dispvolume();

}

class Cylinder implements Volume {
  Scanner scanner = new Scanner(System.in);
  float radius, height;

  public void readData() {
    System.out.println("Enter radius and height of cylinder:");
    radius = scanner.nextFloat();
    height = scanner.nextFloat();
  }

  public void dispvolume() {
    double volume = pi * radius * radius * height;
    System.out.println("Volume of cylinder = " + volume);
  }
}

class Sphere implements Volume {
  Scanner scanner = new Scanner(System.in);
  double r = 0;
  double v = 0;

  public void readData() {
    System.out.println("enter the size of a radius");
    r = scanner.nextDouble();
  }

  public void dispvolume() {
    v = (4.0 / 3.0) * pi * Math.pow(r, 3);
    System.out.println("Volume of sphere = " + v);

  }
}

public class Mvolume {

  public static void main(String[] args) {      
    Scanner scanner = new Scanner(System.in);
    int choice;
    Cylinder cylinder = new Cylinder();
    Sphere sphere = new Sphere();

    while (true) {
      System.out.println("\nChoose a shape to calculate volume:");
      System.out.println("1. Cylinder");
      System.out.println("2. Sphere");
      System.out.println("3. Exit");
      System.out.print("Enter your choice: ");
      choice = scanner.nextInt();

      switch (choice) {
        case 1:
          cylinder.readData();
          cylinder.dispvolume();
          break;

        case 2:
          sphere.readData();
          sphere.dispvolume();

          break;

        case 3:
          System.out.println("Exiting...");
          System.exit(0);
          break;

        default:
          System.out.println("Try again");
      }

    }

  }

}