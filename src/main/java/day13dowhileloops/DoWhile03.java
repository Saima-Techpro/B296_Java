package day13dowhileloops;

import java.util.Scanner;

public class DoWhile03 {
    public static void main(String[] args) {

        /*
          Example: Accept input from user:

    1.	If password and username are correct: print "Welcome to your account"
    2.	If username and password are incorrect; print 4 times "Enter your username and password"
    3.	If username and password are incorrect fifth time as well, print "Account is blocked"

    4.	Valid credentials => username= ""admin""    password= "pwd123"

         */

        Scanner scanner = new Scanner(System.in);
        String userName;
        String password;

        int numOfTries = 1;

        do {
            if (numOfTries == 5){
                System.out.println("Your account is blocked!");
                break;
            }

            System.out.println("Enter your username");
            userName= scanner.next();

            System.out.println("Enter your password");
            password = scanner.next();

            numOfTries++; // increment

            if (userName.equals("admin") && password.equals("pwd123")){
                System.out.println("Welcome to your account!");
                break;
            }else {
                System.out.println("Username or password don't match. PLease provide correct credentials!");
                System.out.println("Warning: You are going to "+numOfTries+" attempt. ");
            }

        }while (true);



    }
}
