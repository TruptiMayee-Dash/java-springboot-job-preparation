package CodingProblems_day5;

public class EmployeeManagementSystem {
    private int id;
    private String name;
    private String department;
    private double salary;

    EmployeeManagementSystem(int id,String name,String department,double salary){
        this.id=id;
        this.name=name;
        this.department=department;
        this.salary=salary;
    }

    public double calculateAnnualSalary(){
        return 12*salary;
    }

    public void displayDetails() {

        System.out.println(
                "===== EMPLOYEE DETAILS ====="
        );

        System.out.println(
                "ID: " + id
        );

        System.out.println(
                "Name: " + name
        );

        System.out.println(
                "Department: " + department
        );

        System.out.println(
                "Monthly Salary: " + salary
        );

        System.out.println(
                "Annual Salary: "
                        + calculateAnnualSalary()
        );

        System.out.println();
    }

    public static void main(String[] args) {
        EmployeeManagementSystem employee1 =
                new EmployeeManagementSystem(
                        101,
                        "Rahul",
                        "IT",
                        50000
                );


        EmployeeManagementSystem employee2 =
                new EmployeeManagementSystem(
                        102,
                        "Amit",
                        "HR",
                        45000
                );


        EmployeeManagementSystem employee3 =
                new EmployeeManagementSystem(
                        103,
                        "Priya",
                        "Finance",
                        60000
                );


        employee1.displayDetails();

        employee2.displayDetails();

        employee3.displayDetails();
    }
}
