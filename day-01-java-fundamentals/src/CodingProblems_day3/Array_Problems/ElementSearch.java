package CodingProblems_day3.Array_Problems;

public class ElementSearch {

    public static void main(String[] args) {


        int[] num = {30, 40, 59, 67, 78, 89};

        int target=67;

        boolean found=false;

        for (int nums:num){

            if(nums==target){
                found=true;
                break;
            }

        }

        if(found){
            System.out.println("Element Found");
        }
        else{
            System.out.println("Element Not Found");
        }

    }

}
