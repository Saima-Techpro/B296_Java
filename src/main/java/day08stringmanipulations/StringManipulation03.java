package day08stringmanipulations;

import java.util.Scanner;

public class StringManipulation03 {
    public static void main(String[] args) {
        /*
        Check the given password by user and validate with following criteria...
            i) must contain at least 8 characters
            ii) must not contain space characters
            iii) must contain at least one uppercase
            iv) must contain at least one lowercase
            v) must contain at least one digit
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your password");
        String password = scanner.nextLine();

        // i) must contain at least 8 characters
       boolean passwordLength = password.length() >= 8;
        System.out.println("passwordLength = " + passwordLength);

        // ii) must not contain space characters
        String passwordWithoutSpace = password.replaceAll("[^ ]", "");
        System.out.println(passwordWithoutSpace.length());
        boolean spaceCheck = passwordWithoutSpace.length() == 0;

        System.out.println("spaceCheck = " + spaceCheck);


        // iii) must contain at least one uppercase
       boolean upperCaseCheck =  password.replaceAll("[^A-Z]", "").length() > 0;
        System.out.println("upperCaseCheck = " + upperCaseCheck);


        // iv) must contain at least one lowercase
        boolean lowerCaseCheck = password.replaceAll("[^a-z]", "").length() >0;
        System.out.println("lowerCaseCheck = " + lowerCaseCheck);


        // v) must contain at least one digit
        boolean digitCheck = password.replaceAll("[^0-9]", "").length() > 0 ;
        System.out.println("digitCheck = " + digitCheck);


        // In order for this password to be acceptable, ALL above conditions need to pass (true)

        boolean isValid = passwordLength && spaceCheck && upperCaseCheck && lowerCaseCheck && digitCheck ;

        if (isValid){
            System.out.println("Password is valid");
        } else {
            System.out.println("Password is not valid");
        }

        System.out.println("======== with Ternary =========");
        // Ternary
        String passwordAccepted = isValid ? "Password is valid" : "Password is not valid";
        System.out.println("passwordAccepted = " + passwordAccepted);


    }
}
