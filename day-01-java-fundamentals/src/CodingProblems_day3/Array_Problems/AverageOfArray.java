package CodingProblems_day3.Array_Problems;

public class AverageOfArray {

  public static void main(String[] args){
      int[] marks={45,56,67,78,89};
      int sum=0;

      for(int mark:marks){

          sum+=mark;
      }

      double average=(double)sum/marks.length;
      System.out.println(average);

    }

}
