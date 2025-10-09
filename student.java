/*11.Create a class Student to read and display the student details. Create another class
mark inherit from student to read marks of 5 subjects and find total and average.
Write a Java program to display the result of a student.  */

import java.util.Scanner;

class Student {
    String name;
    int roll;
    String course;
    Scanner sc = new Scanner(System.in);

    void readStudent() {
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter roll number: ");
        roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter course: ");
        course = sc.nextLine();
    }

    void showStudent() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Course: " + course);
    }
}

class Mark extends Student {
    int[] marks = new int[5];
    int total = 0;
    float avg;

    void readMarks() {
        System.out.println("Enter marks of 5 subjects:");
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
            total += marks[i];
        }
        avg = total / 5f;
    }

    void showMarks() {
        System.out.println("Marks:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
    }
}

public class student {
    public static void main(String[] args) {
        Mark m = new Mark();
        m.readStudent();
        m.readMarks();
        m.showStudent();
        m.showMarks();
    }
}
