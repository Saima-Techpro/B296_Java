package miniprojects.miniproject1_EmployeeManagementSystem;

public class Manager extends FullTimeEmployee{

    /*
    Managers: Inherit from Full-Time Employees, with additional managerial perks.
    Managerial Bonus: Managers receive an additional 10% bonus on top of their full-time salary.

    name, id, salary =>  common properties from super class (parent class)
    specific properties required for Manager .... none because they're already present in super class FullTimeEmployee

     */


    // Constructor to initialise the values for Manager
    public Manager(String name, String id, double salary, double bonus, double benefits){
        super(name, id, salary, bonus, benefits);

    }

    /*
     In Multi-level inheritance, at least one of the subclasses MUST implement the abstract methods.
     In this case :
     Employee is abstract = grandparent
     FullTimeEmployee is concrete subclass = parent (has already implemented abstract methods from Employee)
     Manger is concrete subclass = child class (so implementation of abstract methods is optional
     */



    // override calculateSalary method for specific implementation of Full-Time Employees => base salary + bonus + benefits.

    @Override
    public double calculateSalary(){
        // 10% bonus on top of their full-time salary.
        return super.calculateSalary() * 1.1;
    }

    // override the getDetails() from Employee superclass

    public String getDetails() {
        System.out.println(getName() + " is managing the team.");
        return "Manger's name: " + getName() + " , ID: " + getId() + " , Total salary: " + calculateSalary();
    }




}
