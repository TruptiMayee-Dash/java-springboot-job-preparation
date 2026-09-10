package CodingProblems_day5;

public class EmployeeDetails {



    private int id;
    private String name;
    private double salary;

    EmployeeDetails(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public void employeeDetails(){
        System.out.println("Employee_id : " +id);
        System.out.println("Employee Name : "+name);
        System.out.println("Employee salary : "+salary);
    }
    public static void main(String[] args) {

        EmployeeDetails ed=new EmployeeDetails(10,"rahul",20000);
       ed.employeeDetails();


    }
}
