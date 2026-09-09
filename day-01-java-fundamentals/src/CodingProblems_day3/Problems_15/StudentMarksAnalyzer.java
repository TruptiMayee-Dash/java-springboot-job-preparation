package CodingProblems_day3.Problems_15;

import java.util.Scanner;

public class StudentMarksAnalyzer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();

        int[] marks = new int[numberOfStudents];

        // Input marks
        for (int i = 0; i < marks.length; i++) {

            System.out.print("Enter marks for student " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        int total = 0;
        int highest = marks[0];
        int lowest = marks[0];

        int passed = 0;
        int failed = 0;

        // Analyze marks
        for (int mark : marks) {

            // Calculate total
            total = total + mark;

            // Find highest
            if (mark > highest) {
                highest = mark;
            }

            // Find lowest
            if (mark < lowest) {
                lowest = mark;
            }

            // Count pass/fail
            if (mark >= 40) {
                passed++;
            } else {
                failed++;
            }
        }

        double average = (double) total / marks.length;

        System.out.println("\n===== Student Marks Report =====");

        System.out.println("Total = " + total);
        System.out.println("Average = " + average);
        System.out.println("Highest = " + highest);
        System.out.println("Lowest = " + lowest);
        System.out.println("Passed = " + passed);
        System.out.println("Failed = " + failed);

        scanner.close();
    }
}