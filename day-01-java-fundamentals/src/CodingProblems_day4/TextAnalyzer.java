package CodingProblems_day4;

import java.util.Scanner;

public class TextAnalyzer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        int vowels = 0;
        int consonants = 0;
        int spaces = 0;

        String lowerText = text.toLowerCase();

        for (int i = 0; i < lowerText.length(); i++) {

            char character = lowerText.charAt(i);

            if (character == ' ') {

                spaces++;

            } else if (character == 'a' ||
                    character == 'e' ||
                    character == 'i' ||
                    character == 'o' ||
                    character == 'u') {

                vowels++;

            } else if (character >= 'a' && character <= 'z') {

                consonants++;
            }
        }

        int wordCount;

        if (text.trim().isEmpty()) {

            wordCount = 0;

        } else {

            wordCount = text.trim().split("\\s+").length;
        }

        System.out.println();
        System.out.println("===== TEXT ANALYZER =====");

        System.out.println("Original text: " + text);

        System.out.println("Length: " + text.length());

        System.out.println("Words: " + wordCount);

        System.out.println("Uppercase: " + text.toUpperCase());

        System.out.println("Lowercase: " + text.toLowerCase());

        System.out.println("Vowels: " + vowels);

        System.out.println("Consonants: " + consonants);

        System.out.println("Spaces: " + spaces);

        scanner.close();
    }
}