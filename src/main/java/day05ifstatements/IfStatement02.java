package day05ifstatements;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {

        // Get the number from the user and check if it's Odd or Even.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scanner.nextInt();

        // 1st way:
        if (number % 2 == 0) {
            System.out.println(number + " is Even.");
        }

        if (number % 2 != 0) {
            System.out.println(number + " is Odd.");
        }

        // Java has to work twice to check if the number is Odd or Even.
        // Our aim is to make Java work less and avoid repetition wherever it's possible
        // DRY => Do not Repeat Yourself

        // 2nd way: (RECOMMENDED)
        // This syntax works only if we have two conditions.

        if (number % 2 == 0) {
            System.out.println(number + " is Even.");
        } else {
            System.out.println(number + " is Odd.");
        }

        /*
        RULE: Make your application work faster by following these rules:
             1. Avoid repetition
             2. Make Java work less


         */


    }
}
