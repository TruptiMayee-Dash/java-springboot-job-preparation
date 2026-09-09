package CodingProblems_day4;

public class ReverseString {

    public static void main(String[] args){

        String txt="java";

        StringBuilder sb=new StringBuilder(txt);

        sb.reverse();

        System.out.print(sb);
    }
}
