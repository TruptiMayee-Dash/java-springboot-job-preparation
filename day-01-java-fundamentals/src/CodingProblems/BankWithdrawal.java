package CodingProblems;

import java.util.Scanner;

public class BankWithdrawal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double balance = scanner.nextDouble();

        System.out.println("Current balance: " + balance);

        System.out.print("Enter withdrawal amount: ");
        double withdrawal = scanner.nextDouble();

        if (withdrawal > 0 && withdrawal <= balance) {

            balance = balance - withdrawal;

            System.out.println("Withdrawal successful");
            System.out.println("Withdrawn amount: " + withdrawal);
            System.out.println("Remaining balance: " + balance);

        } else {

            System.out.println("Insufficient balance or invalid amount");
        }

        scanner.close();
    }
}
