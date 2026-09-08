package CodingProblems_day1;

import java.util.Scanner;

public class Shopping_Bill {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();

        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        double total = price * quantity;

        System.out.println("\n===== Shopping Bill =====");
        System.out.println("Product: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: " + total);

        scanner.close();
    }
}
