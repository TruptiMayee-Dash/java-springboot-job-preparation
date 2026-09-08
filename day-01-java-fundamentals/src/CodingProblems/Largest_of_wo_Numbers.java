package CodingProblems;

import java.util.Scanner;

public class Largest_of_wo_Numbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("Largest: " + firstNumber);
        } else if (secondNumber > firstNumber) {
            System.out.println("Largest: " + secondNumber);
        } else {
            System.out.println("Both numbers are equal");
        }

        scanner.close();
    }
}
