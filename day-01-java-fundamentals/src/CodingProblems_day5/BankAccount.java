package CodingProblems_day5;

public class BankAccount {

    private int accountNumber;
    private  String accountHolder;
    private double balance;

    BankAccount(int accountNumber,String accountHolder,double balance){
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
        this.balance=balance;
    }

    public void deposit(double amount){

        if(amount>0){
            balance=+amount;

            System.out.println("Deposited Successfully");
        }

        else {
            System.out.println("Invalid deposit amount");
        }

    }

    public void withdraw(double amount){
        if(amount<=0){
            System.out.println("Invalid withdraw amount");
        } else if (amount>balance) {
            System.out.println("Insufficient balance");
        }
        else {
            balance-=amount;
            System.out.println("Withdraw Successfull");
        }
    }

    public void displayDetails(){
        System.out.println();
        System.out.println("====== Account Details======");

        System.out.println("Account Number : "+accountNumber);
        System.out.println("Account Holder : "+accountHolder);
        System.out.println("Account Blance : "+balance);
    }

    public static void main(String[] args) {
        BankAccount ba=new BankAccount(101,"trupti",600009);

        ba.displayDetails();
    }
}
