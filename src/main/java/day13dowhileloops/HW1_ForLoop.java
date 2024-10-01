package day13dowhileloops;

import java.util.Scanner;

public class HW1_ForLoop {
    public static void main(String[] args) {

        // USE FOR LOOP OR WHILE LOOP to solve the following question

        /*
          Example: Accept input from user:

    1.	If password and username are correct: print "Welcome to your account"
    2.	If username and password are incorrect; print 4 times "Enter your username and password"
    3.	If username and password are incorrect fifth time as well, print "Account is blocked"

    4.	Valid credentials => username= ""admin""    password= "pwd123"

         */

        String correctUsername = "admin";
        String correctPassword = "pwd123";

        // while loop

        Scanner scanner = new Scanner(System.in);
        String userName;
        String password;

        int attempts = 1;
        int maxAttempts = 5;

        // for loop

        for (int attempt = 0; attempt < maxAttempts; attempt++) {
            System.out.print("Enter username: ");
            userName = scanner.nextLine();
            System.out.print("Enter password: ");
            password = scanner.nextLine();

            if (userName.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Welcome to your account");
                break;
            } else if (attempt < maxAttempts - 1) {
                System.out.println("Warning: You are going to "+attempts+" attempt. ");
                System.out.println("Enter your username and password");
            } else {
                System.out.println("Account is blocked");
            }
        }



    }
}
