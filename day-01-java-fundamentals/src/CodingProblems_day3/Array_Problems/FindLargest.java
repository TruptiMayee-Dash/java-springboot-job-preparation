package CodingProblems_day3.Array_Problems;

public class FindLargest {

    public static void main(String[] args){

        int[] arr={10,40,50,69,50};
        int largest=arr[0];

        for (int num:arr){

            if(num>largest){
                largest=num;
            }
        }
        System.out.println(largest);
    }
}
