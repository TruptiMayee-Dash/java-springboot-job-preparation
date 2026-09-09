package CodingProblems_day4;

public class CountCharacters {

    public static void main(String[] args){
        String text="Trupti";
        int count=0;
        for (char character:text.toCharArray()){
            count++;
        }
        System.out.println("Number of Character"+count);
    }
}
