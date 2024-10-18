package miniprojects.miniproject1_EmployeeManagementSystem;

public class Intern extends Employee {
    /*
    Interns: Receive a fixed stipend.

    Intern Duration: Interns can only have a maximum internship period of 12 months.
                    If more than 12 months is entered, display a warning message:
                    "Invalid internship duration!".

     name, id, salary =>  common properties from super class (parent class)
     stipend , duration => specific properties required for Interns


     */

    // specific properties required for Interns
    private double stipend;
    private int duration;

    // Constructor to initialise the values for Interns
    public Intern(String name, String id, double stipend, int duration){
        super(name, id);
        this.stipend = stipend;
        this.duration = duration;
    }


    // override calculateSalary method for specific implementation of Interns => hourly rate * hours worked

    public double calculateSalary(){
        // check if maximum internship period is 12 months or not
        if (duration < 1 || duration > 12 ){
            System.out.println("Invalid internship duration!");
            System.out.println("Num of months worked: "+ duration);
            return 0;
        }
        return stipend;
    }


    // override the getDetails() from Employee superclass
    public String getDetails() {
        return "Intern name: " + getName() + " , ID: " + getId() + " , Total stipend: " + calculateSalary();
    }



}
