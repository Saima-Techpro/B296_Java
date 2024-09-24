package day03scanner;

import java.util.Scanner;

import static day06switch_ternary.VariableTypes.experience;

public class Scanner01 {
    public static void main(String[] args) {

        /*

            ******** Scanner Class ********
            - Scanner class is used to get the input(values) from the user.
            - Why do we need it?
            - Every application needs to interact with the users and need their credentials/PIN to allow them into their accounts.
              (ATM, Banking, E-commerce, School accounts, Calculators)
            - User inputs (provides) their data (values) and that goes into the application database.
            - Once verified, the app allows the user to use the app.


            - How do we get the data from the user?
            Step 1: Create an object from Scanner class
                    Type Scanner word, it will be red. Hover over it, it will show java.util, select that option
                    Scanner class will be imported from java.util library

                    Scanner Object
                    ClassName    objectName Assignment Operator 'new' keyword Constructor(with parameters)

            Step 2: Give a message to the user about the data / input that you want to get
            Step 3: Store the data provided by the user



         */

        //ClassName    objectName Assignment Operator 'new' keyword Constructor(with parameters)   semicolon
          //  Scanner       input          =              new           Scanner(with parameters)       ;
          // Scanner       input          =              new           Scanner(System.in)                ;
          // Scanner       scanner          =              new           Scanner(System.in)                ;


        // Step 1: Create an object from Scanner class
           Scanner  scan  =  new Scanner(System.in);

        // Step 2: Give a message to the user about the data / input that you want to get
        System.out.println("Enter your name please");  // Ali

        //  Step 3: Store the data provided by the user
        String name = scan.next();

        System.out.println("name = " + name);

        // Task : Ask user to provide their age and address, store and print it on the console
        // age
        System.out.println("Enter your age please!");
        byte age = scan.nextByte();
        System.out.println("age = " + age);

        // address
        System.out.println("Enter your address please!");
        String address = scan.next();  // next() stores data BEFORE space

        System.out.println("address = " + address);


        experience = 35;
        System.out.println("experience = " + experience);


    }
}
