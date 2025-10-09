/*  14.Write a java program to find the volume of cube, rectangular box, cylinder using
function overloading*/

import java.util.Scanner;
class VolumeCalculator {
   
    int volume(int side) {
        return side * side * side;
    }
    int volume(int length, int width, int height) {
        return length * width * height;
    }

    double volume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }
}

public class FindVol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VolumeCalculator vol = new VolumeCalculator();
        while (true) {
            System.out.println("1. cube 2. rectangular box 3. cylinder 4. exit");
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("enter side of cube:");
                    int side = sc.nextInt();
                    System.out.println("Volume of cube: " + vol.volume(side));
                    break;
                case 2:
                    System.out.println("enter length, widt and height of rectangular box:");
                    int length = sc.nextInt();
                    int width = sc.nextInt();
                    int height = sc.nextInt();
                    System.out.println("Volume of rectangular box: " + vol.volume(length, width, height));
                    break;
                case 3:
                    System.out.println("enter radius and height of cylinder:");
                    double radius = sc.nextDouble();
                    double h = sc.nextDouble();
                    System.out.println("Volumeof cylinder: " + vol.volume(radius, h));
                    break;
                case 4:
                    System.out.println("exiting...");
                    System.exit(0);
                default:
                    System.out.println("invalid");
            }
            
        }
       
    }
}
