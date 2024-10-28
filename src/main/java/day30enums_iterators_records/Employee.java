package day30enums_iterators_records;

public class Employee {

    private final String employeeName;
    private final int employeeNumber;

    // Constructor
    public Employee(String employeeName, int employeeNumber) {
        this.employeeName = employeeName;
        this.employeeNumber = employeeNumber;
    }

    // Getters
    public String getEmployeeName() {
        return employeeName;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }



    // toString() is used to print
    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeNumber=" + employeeNumber +
                '}';
    }
}
