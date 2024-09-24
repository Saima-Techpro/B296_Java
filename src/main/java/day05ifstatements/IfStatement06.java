package day05ifstatements;

import java.util.Scanner;

public class IfStatement06 {
    public static void main(String[] args) {

        // If the user is female and older than 60, print "You can retire!"
        // If the user is male and older than 65, print "You can retire!"

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your gender (male/female): ");
        String gender = scanner.next();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        // 1st way:

        if ((gender.equals("female") && age > 60) ||
                (gender.equals("male") && age > 65)) {
            System.out.println("You can retire!");
        } else {
            System.out.println("You cannot retire.");
        }

        System.out.println("==========2nd way========");

        // 2nd way
        if (age <=0){
            System.out.println("Age cannot be less or equal to zero");
        } else if(age <=16){
            System.out.println("You can't work yet");
        } else if (gender.equalsIgnoreCase("female")) {
            if (age > 60){  // nested if else syntax
                System.out.println("You can retire!");
            }else {
                System.out.println("Keep working! You can't retire yet!");
            }
        } else if (gender.equalsIgnoreCase("male")) {
            if (age > 65){
                System.out.println("You can retire!");
            } else {
                System.out.println("Keep working! You can't retire yet!");
            }
        } else {
            System.out.println("Please define your gender");
        }








    }
}
