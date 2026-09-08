package CodingProblems_day2;

import java.util.Scanner;

public class LargestDigits_In_Number {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();
        int largest=0;

        while (number!=0){
            int digits=number%10;

            if(largest<digits){
                largest=digits;
            }
            number=number/10;
        }
        System.out.println(largest);


        sc.close();
    }
}
