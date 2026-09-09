package CodingProblems_day3.Problems_15;

public class FrequencyOfElement {
    public static void main(String[] args) {


        int[] arr = {23, 56, 67, 89, 35, 334, 56, 67, 56, 0};
        int count=0;

        int target=67;

        for (int i=0;i<arr.length;i++) {
            if(arr[i]==target){
                count++;
            }
        }
        System.out.print(target+"occurs"+count+"times");

    }


    }
