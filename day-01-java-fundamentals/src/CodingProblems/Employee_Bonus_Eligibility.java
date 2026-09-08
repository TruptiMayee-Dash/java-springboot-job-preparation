package CodingProblems;

import java.util.Scanner;

public class Employee_Bonus_Eligibility {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter years of experience: ");
        int experience = scanner.nextInt();

        if (salary >= 50000 && experience >= 3) {
            System.out.println(name + " is eligible for bonus.");
        } else {
            System.out.println(name + " is not eligible for bonus.");
        }

        scanner.close();
    }
}
