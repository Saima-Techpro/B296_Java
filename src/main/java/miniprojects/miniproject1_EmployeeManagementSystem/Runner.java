package miniprojects.miniproject1_EmployeeManagementSystem;

public class Runner {
    public static void main(String[] args) {

        // Employee employee = new Employee(); // abstract class does NOT allow object creation


        FullTimeEmployee firstEmployee = new FullTimeEmployee("Ali", "Avx123", 1000, 100, 50);
//        System.out.println(firstEmployee.getName());
//        System.out.println(firstEmployee.getId());
//        System.out.println(firstEmployee.calculateSalary());
        System.out.println(firstEmployee.getDetails());


        // PartTimeEmployee
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Johnson", "ab45xyz", 18.90, 32);
        System.out.println(partTimeEmployee.getDetails());

        PartTimeEmployee partTimeEmployee2 = new PartTimeEmployee("Emily", "xyz453", 18.90, 42);
        System.out.println(partTimeEmployee2.getDetails());


        // Intern
        Intern intern = new Intern("David", "ghl4239", 600, 3);
        System.out.println(intern.getDetails());

        // Manager
        Manager manager = new Manager("Fatma", "87Abc12", 1500, 100, 200);
        System.out.println(manager.getDetails());



    }
}
