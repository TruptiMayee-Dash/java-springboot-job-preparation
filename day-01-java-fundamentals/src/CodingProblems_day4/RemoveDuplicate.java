package CodingProblems_day4;

public class RemoveDuplicate{

    public static void main(String[] args){

        String text="programming";
        String result="";

        for (int i=0;i<text.length();i++){
            char character=text.charAt(i);
            boolean alreadyExist=false;
            for (int j=0;j<result.length();j++){

                if (result.charAt(j)==character){
                    alreadyExist=true;
                    break;
                }
            }

            if (!alreadyExist){
                result=result+character;
            }
        }
        System.out.println("Original : "+text);
        System.out.println("Without Duplicate : "+result);
    }


}
