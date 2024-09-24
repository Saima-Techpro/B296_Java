package day05ifstatements;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {

        // Reformat your code
        // MAC => opt+command+L
        // Windows => Ctrl+alt+L
        /*
        When we two conditions, we use if-else statements
        When we have more than two conditions, we use if-else if.... else

        SYNTAX:
         if (){

        } else if () {

        } else if () {

        } else {

        }
         */

//   Example: Ask user to give the number of the day and check what day is it.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of the day");
        byte numOfDay = scanner.nextByte();

        // 1st way => Java has to work more as it has to check all conditions if the user enter 7
        if (numOfDay == 1){
            System.out.println("Monday");
        } else if (numOfDay == 2){
            System.out.println("Tuesday");
        }else if (numOfDay == 3){
            System.out.println("Wednesday");
        }else if (numOfDay == 4){
            System.out.println("Thursday");
        }else if (numOfDay == 5){
            System.out.println("Friday");
        }else if (numOfDay == 6){
            System.out.println("Saturday");
        }else if (numOfDay == 7){
            System.out.println("Sunday");
        }  else {
            System.out.println("Invalid number for the days");
        }


        System.out.println(" ====== 2nd way =======");
        // 2nd way:
        if (numOfDay<1 || numOfDay > 7){
            System.out.println("Invalid number");
        }else if (numOfDay == 1){
            System.out.println("Monday");
        } else if (numOfDay == 2){
            System.out.println("Tuesday");
        }else if (numOfDay == 3){
            System.out.println("Wednesday");
        }else if (numOfDay == 4){
            System.out.println("Thursday");
        }else if (numOfDay == 5){
            System.out.println("Friday");
        }else if (numOfDay == 6){
            System.out.println("Saturday");
        }else if (numOfDay == 7){
            System.out.println("Sunday");
        }






    }
}
