package miniprojects.miniproject1_EmployeeManagementSystem;

public abstract class Employee {

    /*
    Create a program to manage different types of employees
    (full-time, part-time, manager, intern, and contract employees).
    Each employee type has specific attributes and salary calculation rules.
     The system should be able to calculate the total salary for each employee
     based on their role and conditions.


    Conditions:

    1. The system must validate employee data (name, ID, salary) to ensure they are valid.
        If any invalid data is entered (e.g., negative salary), the system should provide an error message: "Invalid data entered!".
    2. The system should allow calculating and displaying the total salary for each employee type.

     */

    // private Variables to encapsulate (hide) employee data
    private String name ;
    private String id;

    protected double salary;  // protected so subclasses can access salary

    // parametrised constructor to initialise common employee properties
    public Employee(String name, String id){
        this.name = name;
        this.id = id;
    }

    // abstract method to calculate salary => abstract so, it must be implemented by each subclass.

    public abstract double calculateSalary(); // it is mandatory to be implemented byb subclass

    // Getters to read the values of private variables (encapsulation)
    public String getName(){
        return name;
    }

    public String getId() {
        return id;
    }

    // abstract method to display all these values
    public abstract String getDetails();


}
