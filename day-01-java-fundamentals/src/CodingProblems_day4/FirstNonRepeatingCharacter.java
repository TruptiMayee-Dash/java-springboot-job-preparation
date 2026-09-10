package CodingProblems_day4;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args){

        String text="swiss";
        char result = '\0';

        for (int i=0;i<text.length();i++){
            char current=text.charAt(i);
            int count=0;

            for (int j=0;j<text.length();j++){
                if(text.charAt(j)==current){
                    count++;
                }
            }
            if(count==1){
               result=current;
               break;
            }
        }
        if (result != '\0') {
            System.out.println("First Non Reapeting Character :"+result);

        }
    }
}
