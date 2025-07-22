package entityclassassignment2;

//Import necessary classes
import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
     // Create a Scanner object for user input
     Scanner scanner = new Scanner(System.in);

     // Array to hold 4 Product objects
     Product[] products = new Product[4];

     // Loop to collect details for 4 products
     for (int i = 0; i < products.length; i++) {
         System.out.println("Enter details for Product " + (i + 1) + ":");

         // Prompt user for product name
         System.out.print("Product Name: ");
         String name = scanner.nextLine();

         // Prompt user for product code
         System.out.print("Product Code: ");
         String code = scanner.nextLine();

         // Prompt user for product price
         System.out.print("Price: ₹");
         double price = scanner.nextDouble();
         scanner.nextLine(); // Consume the newline character

         // Create a new Product object and add it to the array
         products[i] = new Product(name, code, price);
         System.out.println();
     }

     // Close the scanner
     scanner.close();

     // Display details of all products
     System.out.println("Product Details:");
     System.out.println("---------------------------");
     for (Product product : products) {
         product.displayProductDetails();
     }
 }
}
