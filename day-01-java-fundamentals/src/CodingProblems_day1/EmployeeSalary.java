package CodingProblems_day1;

import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args){


            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter employee name: ");
            String name = scanner.nextLine();

            System.out.print("Enter basic salary: ");
            double basicSalary = scanner.nextDouble();

            System.out.print("Enter bonus: ");
            double bonus = scanner.nextDouble();

            double totalSalary = basicSalary + bonus;

            System.out.println("\n===== Salary Details =====");
            System.out.println("Employee: " + name);
            System.out.println("Basic Salary: " + basicSalary);
            System.out.println("Bonus: " + bonus);
            System.out.println("Total Salary: " + totalSalary);

            scanner.close();
    }


}
