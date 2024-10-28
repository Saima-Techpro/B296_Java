package day30enums_iterators_records;

public class Runner {
    public static void main(String[] args) {

        Employee employee = new Employee("Jerry", 123);
        System.out.println(employee); // toString()
        System.out.println(employee.getEmployeeName()); // Jerry
        System.out.println(employee.getEmployeeNumber()); // 123



        // Create object using record
        EmployeeRecord employee1 = new EmployeeRecord("Emily", 456);
        System.out.println("employee1 = " + employee1);  // toString() works at the background
        System.out.println(employee1.employeeName());  // getter method works at the background
        System.out.println(employee1.employeeNum()); // getter method works at the background

        EmployeeRecord.address = "New York, USA";
        System.out.println(EmployeeRecord.address); // New York, USA

        System.out.println(EmployeeRecord.DEFAULT_EMPLOYEE_ADDRESS); // London, UK


        // method call for non-static method
        System.out.println(employee1.nameInUpperCase()); // EMILY


        // method call for static method
        EmployeeRecord.print();






        // https://docs.oracle.com/en/java/javase/14/language/records.html
    }
}
