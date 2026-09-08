package CodingProblems_day2;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();

        int original=number;
        int temp=0;

        while (number!=0){
            int digits=number%10;
            temp=temp*10+digits;
            number=number/10;
        }

        if(original==temp){
            System.out.println("Is palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}
