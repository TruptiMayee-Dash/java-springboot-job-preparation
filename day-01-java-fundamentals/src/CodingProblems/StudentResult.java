package CodingProblems;

import java.util.Scanner;

public class StudentResult {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter English marks: ");
        double english = scanner.nextDouble();

        System.out.print("Enter Math marks: ");
        double math = scanner.nextDouble();

        System.out.print("Enter Science marks: ");
        double science = scanner.nextDouble();

        double total = english + math + science;
        double average = total / 3;

        String grade;

        if (average >= 90) {
            grade = "Excellent";
        } else if (average >= 75) {
            grade = "Very Good";
        } else if (average >= 60) {
            grade = "Good";
        } else if (average >= 40) {
            grade = "Pass";
        } else {
            grade = "Fail";
        }

        System.out.println("\n===== Student Result =====");
        System.out.println("Name: " + name);
        System.out.println("English: " + english);
        System.out.println("Math: " + math);
        System.out.println("Science: " + science);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}