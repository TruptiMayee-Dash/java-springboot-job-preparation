package CodingProblems_day3.Problems_15;

public class PositiveNagativeZero {

    public static void main(String[] args) {


        int[] num = {30, 40, 59, 67, 78, 89};


        int positive=0;
        int negative=0;
        int zero =0;

        for (int number:num){
            if(number>0){
                positive++;
            } else if (number<0)
            {
                negative++;
            }else {
                zero++;
            }
        }
        System.out.println("Positive : "+positive);
        System.out.println("Positive : "+negative);
        System.out.println("Positive : "+zero);
    }
}
