package CodingProblems_day3.Problems_15;

public class RemoveDuplicates {

    public static void main(String[] args) {


        int[] arr = {23, 56, 67, 89, 35, 334, 56,67,56, 0};

        int[] unique=new int[arr.length];
        int uniqueCount=0;

        for (int i=0;i<arr.length;i++){
            boolean alreadyExists=false;

            for (int j=0;j<uniqueCount;j++){

                if(arr[i]==unique[j]){
                       alreadyExists=true;
                       break;
                }
            }


            if(!alreadyExists){
                unique[uniqueCount]=arr[i];
                uniqueCount++;
            }
        }

        for (int i=0;i<uniqueCount;i++){
            System.out.print("  "+unique[i]);
        }


    }

}
