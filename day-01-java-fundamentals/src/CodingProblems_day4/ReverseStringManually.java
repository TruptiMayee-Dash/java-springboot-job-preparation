package CodingProblems_day4;

public class ReverseStringManually {

    public static  void main(String[] args){

        String text="Truptimayee";
        String reverse="";

        for (int i=text.length()-1;i>=0;i--){

            reverse=reverse+text.charAt(i);
        }

        System.out.println(reverse);
    }
}
