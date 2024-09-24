package day04scanner_increment_decrement;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {

      /*
      How many JAVA LIBRARIES we have used so far?

      java.util => all utility classes come from this library => Scanner, Arrays, Collections etc.
      java.lang => System ,String, Object
      java.sql => Connection, Statement etc. => all database related operations
      java.io  => used for File related operations


      There are 3rd party external libraries as well:
      Apache Maven
      JavaFx
      Hibernate
      Selenium

       */


        // Ask user to enter following credentials:
        // Firstname and lastname
        // Age
        // Height
        // Weight
        // Marital status => married, unmarried, do not want to mention


        // Step 1: Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Step 2: Send the message to the user
        System.out.println("Enter your Firstname and Lastname please");
        // Step 3: Store the values/data provided by the user
//        String firstName = scanner.nextLine();
//        String lastName = scanner.nextLine();
//        String fullName = firstName + lastName;

         String fullName = scanner.nextLine();

         // Age
        System.out.println("Please enter your age!");
        byte age = scanner.nextByte();

        //Height
        System.out.println("Please enter your Height!");
        float height = scanner.nextFloat();
        //Weight
        System.out.println("Please enter your Weight!");
        float weight = scanner.nextFloat();

        scanner.nextLine();

        // marital status
        System.out.println("Please enter your marital status");
        String maritalStatus = scanner.nextLine();

        /*
        when nextLine() is used after NUMERIC inputs, it creates a problem.
        Because it has a hidden '\n' value. It stops the date flow and because next line character,
        it jumps to the next line straightaway.

        How can we solve this issue?
        1) Don't use it after numeric inputs. Use next() instead.
        2. If you must use nextLine() to store some data, use an empty nextLine() before.
           This will take care of the hidden '\n' and your normal nextLine() method wil work as expected.

         */

        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("height = " + height);
        System.out.println("weight = " + weight);
        System.out.println("maritalStatus = " + maritalStatus);


    }
}
