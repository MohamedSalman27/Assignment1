package entityclassassignment2;

//Define the Product class
public class Product {
 // Private instance variables
 private String productName;
 private String productCode;
 private double price;

 // Constructor to initialize product details
 public Product(String productName, String productCode, double price) {
     this.productName = productName;
     this.productCode = productCode;
     this.price = price;
 }

 // Getter for productName
 public String getProductName() {
     return productName;
 }

 // Setter for productName
 public void setProductName(String productName) {
     this.productName = productName;
 }

 // Getter for productCode
 public String getProductCode() {
     return productCode;
 }

 // Setter for productCode
 public void setProductCode(String productCode) {
     this.productCode = productCode;
 }

 // Getter for price
 public double getPrice() {
     return price;
 }

 // Setter for price
 public void setPrice(double price) {
     this.price = price;
 }

 // Method to display product details
 public void displayProductDetails() {
     System.out.println("Product Name: " + productName);
     System.out.println("Product Code: " + productCode);
     System.out.println("Price: ₹" + price);
     System.out.println("---------------------------");
 }
}
