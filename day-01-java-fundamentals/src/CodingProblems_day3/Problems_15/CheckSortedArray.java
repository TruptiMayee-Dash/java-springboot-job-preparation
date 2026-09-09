package CodingProblems_day3.Problems_15;

public class CheckSortedArray {

    public static void main(String[] args) {


        int[] arr = {23, 56, 67, 89, 35, 334, 56, 67, 56, 0};

        boolean isSorted=true;

        for (int i=0;i<arr.length;i++){

            if(arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }
        if(isSorted){
            System.out.print("Sorted array");
        }else {
            System.out.print("Not Sorted");
        }

    }


    }
