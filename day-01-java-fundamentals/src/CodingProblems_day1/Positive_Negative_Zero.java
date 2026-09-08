package CodingProblems_day1;

import java.util.Scanner;

public class Positive_Negative_Zero {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A number: ");

        int number= sc.nextInt();

        if(number>0){
            System.out.println("Positive number");
        }else if(number<0){
            System.out.println("Negative Number");
        }else {
            System.out.println("Number is zero");
        }

    }
}
