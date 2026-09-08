package CodingProblems_day1;

import java.util.Scanner;

public class Temperature_Converter {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the temperature in celcius");
        double celsius=sc.nextDouble();

        double fahrenheit=(celsius*9/5)+32;

        System.out.println("Fahrenheit"+fahrenheit);
    }
}
