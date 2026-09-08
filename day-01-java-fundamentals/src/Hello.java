import java.util.Scanner;

public class Hello {
    public static void main(String[] args){
        System.out.println("Hello trupti");

        //Widening
        int number=10;
        double result=number;
        System.out.println(number);
        //this is safe because an int can be represented by an number.

        //Narrowing
        //going in the oposite direction can lose information.

        double price=99.99;
        int rounded=(int)price;
        System.out.println(rounded);

        int a=10;
        int b=0;
//        int result1=a/b;


        //Sometimes we don't want to change the values at that time we should go for constants
        final double PI=3.14159;
        //Constants normally use UPPER_SNAKE_CASE

        //Data types
        byte age=25;
        short population=30000;
        int salary=2500;
        long worldPopulation=8000000000L;



        //It means we assign the value here
        int age1 = 30;

        //Here we check the age is equal to 30 or not (Comparison)
        System.out.println(age1==30);

        //Left Shift - means multiplying by two where overflow isn't  an issues.

        int x=20;
        System.out.println(x<<1);


        //Operator Precedence - means when an expression contain multiple operators ,java follows a specific order


        //use of scanner

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your age");
        int age2=sc.nextInt();

        System.out.println("Your Age is "+ age2);
        sc.close();




    }
}
