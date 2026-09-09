package CodingProblems_day3.Array_Problems;

public class SumOfArray {

    public static  void main(String[] args){
        int[] arr={10,20,30,40,56,67};

        int sum=0;

        for(int arrs:arr){

            sum=sum+arrs;
        }
        System.out.println(sum);
    }
}
