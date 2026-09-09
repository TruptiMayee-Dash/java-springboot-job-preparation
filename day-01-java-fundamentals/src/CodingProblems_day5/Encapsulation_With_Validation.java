package CodingProblems_day5;

public class Encapsulation_With_Validation {

    private double balance;

    public void setBalance(double balance){
        if (balance >= 0) {
            this.balance = balance;
        }
    }

    public double getBalance(){
        return balance;
    }

    public static void main(String[] args){

        Encapsulation_With_Validation en=new Encapsulation_With_Validation();
        en.setBalance(4000);
        System.out.println(en.getBalance());

    }
}
