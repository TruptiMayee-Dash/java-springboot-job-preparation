package CodingProblems_day4;

import java.util.Scanner;

public class CountWords {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a sentence :");

        String text=sc.nextLine().trim();

        if(text.isEmpty()){
            System.out.println("Words = 0");
        }
        else {
            String[] words=text.split("\\s+");
            System.out.println("Words ="+words.length);
        }
        sc.close();
    }


}
