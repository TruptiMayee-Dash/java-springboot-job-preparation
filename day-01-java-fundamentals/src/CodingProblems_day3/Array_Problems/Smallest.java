package CodingProblems_day3.Array_Problems;

public class Smallest {

    public static void main(String[] args){


        int[] num={30,40,59,67,78,89};

        int smallest=num[0];

        for(int nums:num){
            if(smallest>nums){

                smallest=nums;

            }
        }

        System.out.println(smallest);
    }
}
