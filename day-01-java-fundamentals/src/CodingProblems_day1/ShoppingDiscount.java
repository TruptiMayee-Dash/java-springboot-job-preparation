package CodingProblems_day1;

import java.util.Scanner;

public class ShoppingDiscount {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter shopping amount: ");
        double amount = scanner.nextDouble();

        double discountRate;

        if (amount >= 5000) {
            discountRate = 0.20;
        } else if (amount >= 3000) {
            discountRate = 0.10;
        } else if (amount >= 1000) {
            discountRate = 0.05;
        } else {
            discountRate = 0.0;
        }

        double discount = amount * discountRate;
        double finalAmount = amount - discount;

        System.out.println("\n===== Shopping Bill =====");
        System.out.println("Original Amount: " + amount);
        System.out.println("Discount: " + discount);
        System.out.println("Final Amount: " + finalAmount);

        scanner.close();
    }
}