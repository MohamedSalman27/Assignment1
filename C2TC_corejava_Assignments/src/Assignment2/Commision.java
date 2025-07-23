package Assignment2;

import java.util.Scanner;

public class Commission {
    // Data Members
    private String name;
    private String address;
    private String phone;
    private double salesAmount;

    // (i) Accept employee details
    public void acceptDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Address: ");
        address = sc.nextLine();

        System.out.print("Enter Phone: ");
        phone = sc.nextLine();

        System.out.print("Enter Sales Amount: ");
        salesAmount = sc.nextDouble();

        // sc.close(); // optional: avoid closing if using shared scanner
    }

    // (ii) Calculate commission based on salesAmount
    public double calculateCommission() {
        if (salesAmount >= 100000) {
            return salesAmount * 0.10;
        } else if (salesAmount >= 50000) {
            return salesAmount * 0.05;
        } else if (salesAmount >= 30000) {
            return salesAmount * 0.03;
        } else {
            return 0.0;
        }
    }

    // Method to display employee details and commission
    public void displayInfo() {
        System.out.println("\nEmployee Details:");
        System.out.println("Name         : " + name);
        System.out.println("Address      : " + address);
        System.out.println("Phone        : " + phone);
        System.out.println("Sales Amount : " + salesAmount);

        double commission = calculateCommission();
        System.out.println("Commission   : " + commission);
    }

    // Main method to test Commission class
    public static void main(String[] args) {
        Commission emp = new Commission();
        emp.acceptDetails();
        emp.displayInfo();
    }
}