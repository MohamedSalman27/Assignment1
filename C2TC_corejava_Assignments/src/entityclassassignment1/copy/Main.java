package entityclassassignment1.copy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];

        System.out.println("Enter details for 3 students:");
        for (int i = 0; i < students.length; i++) {
            System.out.printf("Student %d:%n", i + 1);
            System.out.print("  Roll No: ");
            int roll = sc.nextInt();
            sc.nextLine();  // clear buffer

            System.out.print("  Name   : ");
            String name = sc.nextLine();

            System.out.print("  Age    : ");
            int age = sc.nextInt();
            sc.nextLine();

            students[i] = new Student(roll, name, age);
        }

        System.out.println("\n--- Student Details ---");
        for (Student s : students) {
            s.displayDetails();
        }

        sc.close();
    }
}