package CodingProblems_day3.Problems_15;

public class FindSecondLargest {
    public static void main(String[] args){


        int[] arr={23,56,67,89,35,334,56,0};

        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for (int number:arr){

            if(number>largest){
                secondLargest=largest;
                largest=number;

            }
            else if (number>secondLargest && number!=largest) {

                secondLargest=number;
                
            }
        }

        System.out.println("Second Largest : " +secondLargest);
    }
}
