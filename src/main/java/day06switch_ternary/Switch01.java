package day06switch_ternary;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {

       /*
       1. Switch statement is also used for conditional situations. (Just like if-else statements)
       2. But it has simpler syntax
       3. We don't write if(), instead we write switch()


       Main difference?
       1. The order of the values/condition doesn't matter in Switch statements.
       2. Java automatically stops execution when it finds the true condition.
          But that's not the case with Switch statements. Java keeps executing the rest
          of the switch block UNLESS we use 'break' keyword.
       3. Switch statements only work with byte, char, short, int, String data types.
          If statements have no such limitations.

        */

        // Create a code to print day numbers based on the day name

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a day of the week");
        String day = scanner.next();


        // 1st way:
        if (day.equalsIgnoreCase("monday")){
            System.out.println(1);
        } else if (day.equalsIgnoreCase("tuesday")) {
            System.out.println(2);
        } else if (day.equalsIgnoreCase("wedday")){
            System.out.println(3);
        } else if (day.equalsIgnoreCase("thursday")) {
            System.out.println(4);
        }else if (day.equalsIgnoreCase("friday")){
            System.out.println(5);
        } else if (day.equalsIgnoreCase("saturday")) {
            System.out.println(6);
        }else if (day.equalsIgnoreCase("sunday")){
            System.out.println(7);
        } else  {
            System.out.println("Please provide a valid day name");
        }

        System.out.println("=====================");
        // 2nd way:
        /*
        switch (variableName){
            case 1:  (condition)
            codes to be executed after the condition is met / true
                break; (OPTIONAL) Use when you need it
            case 2:
                break;
            case 2:
                break;
            case 4:
                break;
            case 4:
                break;
            default:
        }

         */

        switch (day.toLowerCase()){
            case "monday":
                System.out.println(1);
                break;
            case "tuesday":
                System.out.println(2);
                break;
            case "wednesday":
                System.out.println(3);
                break;
            case "thursday":
                System.out.println(4);
                break;
            case "friday":
                System.out.println(5);
                break;
            case "saturday":
                System.out.println(6);
                break;
            case "sunday":
                System.out.println(7);
                break;
            default:
                System.out.println("Provide a valid name please");
        }











    }
}
