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
    v = (4.0 / 3.0 )*pi * Math.pow(r , 3);
    System.out.println("Volume of sphere = " + v);

  }
}

public class Mvolume {
  public static void main(String[] args) {
    Cylinder cylinder = new Cylinder();
    Sphere sphere = new Sphere();

    cylinder.readData();
    cylinder.dispvolume();

    sphere.readData();
    sphere.dispvolume();

  }

}