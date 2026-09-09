package CodingProblems_day4;

import java.util.Scanner;

public class CharacterFrequency {

    public static void main(String[] args){



        String text="Truptimayee";
        char  ch='e';
        int count=0;

        for (int i=0;i<text.length();i++){

            if(text.charAt(i)==ch){
                count++;
            }
        }
        System.out.println("Frequency : " +count);
    }
}
