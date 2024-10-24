package day30enums_iterators_records;

public class Employee {

    private final String employeeName;
    private final int employeeNumber;

    public Employee(String employeeName, int employeeNumber) {
        this.employeeName = employeeName;
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeNumber=" + employeeNumber +
                '}';
    }
}
