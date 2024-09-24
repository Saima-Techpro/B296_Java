package day05ifstatements;

import java.util.Scanner;

public class IfStatement05 {
    public static void main(String[] args) {

        // Example: Based on the age entered by the user, print one of the following messages:
        // 0-4 => infant
        // 5-12 => child
        // 13-20 => teen
        // 21-40 => adult
        // 41+  => middle age
        // Also include "invalid age" message

        System.out.println("======= Pelin's solution ========");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();

        if (age >= 0 && age <= 4) {
            System.out.println(age + " years old is a Infant");
        } else if (age >= 5 && age <= 12) {
            System.out.println(age + " years old is a Child");

        } else if (age >= 13 && age <= 20) {
            System.out.println(age + " years old is a Teen");

        } else if (age >= 21 && age <= 40) {
            System.out.println(age + " years old is a Adult");

        } else if (age >= 41 && age < 60) {
            System.out.println(age + " years old is a Middle age");

        } else if (age >= 61 && age < 90) {
            System.out.println(age + " years old is old");

        } else {
            System.out.println("Invalid Age");
        }


        System.out.println(" ====== 2nd way ========");

        // 2nd way:

        if (age<0 || age > 130){
            System.out.println("Invalid age");
        } else if (age<5) {
            System.out.println("Infant");
        } else if (age < 13) {
            System.out.println("Child");
        } else if (age < 20) {
            System.out.println("Teen");
        } else if (age < 41) {
            System.out.println("Adult");
        } else if (age < 60) {
            System.out.println("Middle age");
        } else if (age < 90) {
            System.out.println("Old age");
        }


    }
}
