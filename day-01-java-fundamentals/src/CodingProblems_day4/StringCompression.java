package CodingProblems_day4;

public class StringCompression {

    public static void main(String[] args) {

        String text = "aaabbc";

        String result = "";

        int count = 1;

        for (int i = 0; i < text.length(); i++) {

            if (i < text.length() - 1 &&
                    text.charAt(i) == text.charAt(i + 1)) {

                count++;

            } else {

                result = result + text.charAt(i) + count;

                count = 1;
            }
        }

        System.out.println("Original = " + text);
        System.out.println("Compressed = " + result);
    }
}
