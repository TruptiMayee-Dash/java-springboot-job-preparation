package CodingProblems_day3;

public class Basics {
    //Print Even Odd Using Methods
    public static boolean isEven(int number){
        return number%2==0;
    }

    //Find Largest Number Using method

    static int findLargest(int a ,int b){
        if(a>b){
            return a;
        }
        return b;
    }

//    invalid - we can't overload return statement

//    static int calculate(int a) {
//        return a;
//    }
//
//    static double calculate(int a) {
//        return a;
//    }

    public static void main(String[] args){

        int number=20;
        if (isEven(number)) {
            System.out.println("Even Number");
        }else {
            System.out.println("Odd Number");
        }


        int result=findLargest(20,30);
        System.out.println(result);
    }




}
