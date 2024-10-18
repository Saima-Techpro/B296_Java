package miniprojects.miniproject1_EmployeeManagementSystem;

public class PartTimeEmployee extends Employee{

    /*
      Part-Time Employees: Salary is calculated as hourly rate * hours worked.

      Part-Time Hours: Part-time employees can only work between 1 and 40 hours per week.
                        If more than 40 hours is entered, display a warning message:
                       "Invalid number of hours entered!".

       name, id, salary =>  common properties from super class (parent class)
       hourlyRate , hoursWorked => specific properties required for PartTimeEmployee


     */

    // specific properties required for PartTimeEmployee
    private double hourlyRate;
    private int hoursWorked;

    // Constructor to initialise the values for PartTimeEmployee
    public PartTimeEmployee(String name, String id, double hourlyRate, int hoursWorked){
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }


    // override calculateSalary method for specific implementation of PartTimeEmployee => hourly rate * hours worked

    public double calculateSalary(){
        // check if hours per week are valid or not
        if (hoursWorked < 1 || hoursWorked > 40 ){
            System.out.println("Invalid number of hours entered!");
            System.out.println("Num of hours worked: "+ hoursWorked);
          return 0;
        }else {
            return hourlyRate * hoursWorked;  // salary = hourly rate * hours worked
        }

    }

    // override the getDetails() from Employee superclass
    public String getDetails() {
        return "Part-Time Employee name: " + getName() + " , ID: " + getId() + " , Total salary: " + calculateSalary();
    }



}
