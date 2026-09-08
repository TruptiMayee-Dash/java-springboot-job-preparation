package CodingProblems_day2;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();
        int sum=0;

        while (number!=0){

          int digits=number%10;
            sum+=digits;

            number=number/10;

        }
        System.out.println("Sum of digits :" +sum);
        sc.close();
    }
}
