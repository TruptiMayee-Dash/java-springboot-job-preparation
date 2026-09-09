package CodingProblems_day4;

import java.util.Locale;

public class CheckVowels {

  public static void main(String[] args){
      String text="Truptimayee";
      int vowels=0;

      text.toLowerCase(Locale.ROOT);

      for (int i=0;i<text.length();i++){
           char character=text.charAt(i);

           if (character == 'a' ||
                  character == 'e' ||
                  character == 'i' ||
                  character == 'o' ||
                  character == 'u') {

              vowels++;
          }
      }
      System.out.println("Vowels = " + vowels);

  }



}
