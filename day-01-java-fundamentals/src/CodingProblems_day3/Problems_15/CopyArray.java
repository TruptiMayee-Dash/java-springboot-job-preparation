package CodingProblems_day3.Problems_15;

public class CopyArray {

    public static void main(String[] args) {


        int[] original = {30, 40, 59, 67, 78, 89};

        int[] copy=new int[original.length];



        for (int i=0;i<original.length;i++){

            copy[i]=original[i];

//            System.out.print(copy[i]+"  ") ;

        }

        System.out.println("Copied Array");

        for (int copyy:copy){
            System.out.print(copyy+"  ");
        }
    }
}
