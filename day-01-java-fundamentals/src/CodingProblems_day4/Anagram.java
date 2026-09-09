package CodingProblems_day4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter First Sentence : ");
        String  first=sc.nextLine().toLowerCase().replace(" ","");

        System.out.println("Enter Second Sentence : ");
        String  second=sc.nextLine().toLowerCase().replace(" ","");

        if(first.length()!=second.length()){
            System.out.println("Not a anagram");
        }
        else {
            char [] firstArray=first.toCharArray();
            char [] secondArray=second.toCharArray();

            Arrays.sort(firstArray);
            Arrays.sort(secondArray);

            if (Arrays.equals(firstArray, secondArray)) {

                System.out.println("Anagram");
            }
            else {
                System.out.println("Not Anagram");
            }

        }
        sc.close();
    }
}
