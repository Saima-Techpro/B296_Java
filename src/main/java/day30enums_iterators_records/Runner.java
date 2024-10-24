package day30enums_iterators_records;

public class Runner {
    public static void main(String[] args) {
        Employee employee = new Employee("Jerry", 123);
        System.out.println(employee); // toString()
        System.out.println(employee.getEmployeeName()); // Jerry
        System.out.println(employee.getEmployeeNumber()); // 123

        // Using Records
        EmployeeRecord employee1 = new EmployeeRecord("Emily", 678);
        System.out.println(employee1); // toString() works at the backend
        System.out.println(employee1.employeeName()); // Emily  (getter method works at the backend)
        System.out.println(employee1.employeeNum()); // 678    (getter method works at the backend)

        System.out.println(employee1.nameInUpperCase()); // EMILY
        EmployeeRecord.print(); // static method can be called through the name of the Record


        // https://docs.oracle.com/en/java/javase/14/language/records.html
    }
}
