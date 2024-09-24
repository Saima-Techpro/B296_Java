package day05ifstatements;

import java.util.Scanner;

public class IfStatement04 {
    public static void main(String[] args) {
        // Check the name of the weekday given by user and print 'weekday' or 'weekend' on the console

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the day of the week");
        String dayName = scanner.next();

        // 1st way
        if (dayName.equalsIgnoreCase("Monday")){
            System.out.println("Weekday");
        } else if (dayName.equalsIgnoreCase("Tuesday")) {
            System.out.println("Weekday");
        } else if (dayName.equalsIgnoreCase("Wednesday")) {
            System.out.println("Weekday");
        } else if (dayName.equalsIgnoreCase("Thursday")){
            System.out.println("Weekday");
        } else if (dayName.equalsIgnoreCase("Friday")) {
            System.out.println("Weekday");
        } else if (dayName.equalsIgnoreCase("Saturday")) {
            System.out.println("Weekend");
        } else if (dayName.equalsIgnoreCase("Sunday")) {
            System.out.println("Weekend");
        } else {
            System.out.println("Invalid name of the day");
        }


        System.out.println("==========2nd way ===========");
        // 1st Way works fine and provides result for the given day. But JAVA has to work a lot. There's a lot of repetition.
        // So we use the 2nd way:

        // 2nd Way (RECOMMENDED)

        boolean weekendCondition = dayName.equalsIgnoreCase("Saturday") || dayName.equalsIgnoreCase("Sunday");

        boolean weekdayCondition  = dayName.equalsIgnoreCase("Monday") ||
                dayName.equalsIgnoreCase("Tuesday") ||
                dayName.equalsIgnoreCase("Wednesday") ||
                dayName.equalsIgnoreCase("Thursday") ||
                dayName.equalsIgnoreCase("Friday");


        if (weekendCondition){
            System.out.println("Weekend");
        }else if (weekdayCondition){
            System.out.println("Weekday");
        } else {
            System.out.println("Invalid name of the day");
        }

        // 3rd way
        if (dayName.equalsIgnoreCase("Saturday") || dayName.equalsIgnoreCase("Sunday")){
            System.out.println("Weekend");
        } else if (dayName.equalsIgnoreCase("Monday") ||
                dayName.equalsIgnoreCase("Tuesday") ||
                dayName.equalsIgnoreCase("Wednesday") ||
                dayName.equalsIgnoreCase("Thursday") ||
                dayName.equalsIgnoreCase("Friday")) {
            System.out.println("Weekday");
        }else {
            System.out.println("Invalid name of the day");
        }


    }
}
