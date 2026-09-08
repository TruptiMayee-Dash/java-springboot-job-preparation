package CodingProblems_day1;

import java.util.Scanner;

public class Problem01_PersonalProfile {
public static void main(String[] args){

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Your name ");
    String name=sc.nextLine();

    System.out.println("Enter Your Age ");
    int age=sc.nextInt();

    System.out.println("Enter Your City ");
    String city=sc.nextLine();

    System.out.println("Enter Your email ");
    String email=sc.nextLine();

    System.out.println("Personal Profile");
    System.out.println(name);
    System.out.println(age);
    System.out.println(city);
    System.out.println(email);
    sc.close();

}
}
