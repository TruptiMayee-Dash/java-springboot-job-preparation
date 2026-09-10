package CodingProblems_day5;

public class Constructor_Overloading {

    String name;
    double price;


    Constructor_Overloading(double price){
        this.price=price;
    }

    Constructor_Overloading(){
        name="Trupti";


    }
    Constructor_Overloading(String name,double price){

        this.name=name;
        this.price=price;
    }


    public static void main(String[] args) {

        Constructor_Overloading cd = new Constructor_Overloading();

        cd.name = "trupti";

    }
}
