package day07nestedif_ternary;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {

        /*
        Syntax for nested if

        if (condition){ // primary condition
            if (condition){   // nested if => secondary condition

            }
        }else {
            if (){

            }
        }

         */

        /*
        Task 1:
        Use nested If Statement and nested Ternary both

     Type code to check the password
     If it has more than 8 characters, initial should be 'i'
     If it has no more than 8 characters initial should be 'K'
     Solve the task by using nested-ternary as well

     Hint: length() method is used to count the length of a String

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your password");
        
        String password = scanner.nextLine();
        
        // Nested If statement
        if (password.length() < 1){
            System.out.println("Password can't be empty");
        } else if (password.length()>8) { // primary condition

            if (password.charAt(0) == 'i'){ // secondary condition
                // chartAt() method returns single character on the given index
                System.out.println("Valid password");
            }else {
                System.out.println("Invalid password");
            }
        } else if (password.length()<8) { // primary condition
            if (password.charAt(0) == 'K'){ // secondary condition
                System.out.println("Valid password");
            }else {
                System.out.println("InValid password");
            }

        }


        // Nested Ternary

        // condition ? codes for true condition : codes for false condition;   => basic ternary syntax

       // condition ? "Password can't be empty" : (condition ? true : false ) :   (condition ? true : false) : "Invalid password" ;



        String result = password.length() < 1 ? "Password can't be empty" :

                password.length()>8 ? (password.charAt(0) =='i' ?"Valid password": "Invalid Password"):


                        (password.length()<8 ? (password.charAt(0) == 'K' ? "Valid password" : "Invalid password" ) : "Invalid password");

        // NOTE: USE NESTED (if or ternary) discreetly because they slow down the programmes.



    }

}
