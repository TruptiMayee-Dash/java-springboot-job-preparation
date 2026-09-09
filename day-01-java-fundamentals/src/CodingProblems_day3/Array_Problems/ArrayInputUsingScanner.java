package CodingProblems_day3.Array_Problems;

import java.util.Scanner;

public class ArrayInputUsingScanner {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array");

        int  size= sc.nextInt();


        int[] numbers=new int[size];


        for(int i=0;i<numbers.length;i++){

            System.out.println("Enter Number"+ (i+1)+": ");
            numbers[i]=sc.nextInt();
        }

        for (int number:numbers){
            System.out.println(number);
        }

        sc.close();
    }
}
