package day20constructors_date_time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {

        // LocalDate is a data type itself in Java


        // Type code to get today's date


        LocalDate currentDate  = LocalDate.now();
        System.out.println("currentDate = " + currentDate); // 2024-10-09 => it's data type is LocalDate

        // Get the value of the month
        int monthValue1 = currentDate.getMonthValue();
        System.out.println("monthValue1 = " + monthValue1); //10

        // Get the month name
        // Note: Month is a enum structure => enums are used to stores values which are unchangeable (constants)
        Month month = currentDate.getMonth();
        System.out.println("month = " + month); // OCTOBER

        // Get the day
        int dayOfMonth = currentDate.getDayOfMonth();
        System.out.println("dayOfMonth = " + dayOfMonth); // 9


        // Get the value of the year
        int year = currentDate.getYear();
        System.out.println("year = " + year); // 2024

        System.out.println(Year.now()); // 2024

        // Get the day of the year
        int dayOfYear = currentDate.getDayOfYear();
        System.out.println("dayOfYear = " + dayOfYear); // 283

        // Get the week
        // DayOfWeek is also an enum
        DayOfWeek day = currentDate.getDayOfWeek();
        System.out.println("day = " + day); // WEDNESDAY


        //  Get the future day, month and year
        //  current date = // 2024-10-09

        LocalDate futureDate = currentDate.plusYears(3).plusMonths(1).plusDays(1);
        System.out.println("future Date = " + futureDate);  // 2027-11-10



        //  Get the past day, month and year
        //  current date = // 2024-10-09

        LocalDate pastDate = currentDate.minusYears(2).minusWeeks(2).minusDays(3).minusMonths(4);
        System.out.println("pastDate = " + pastDate); // 2022-05-23


        // Get specific date based on the given information
        LocalDate date1 = LocalDate.of(1999, 9, 11);
        System.out.println("date1 = " + date1); // 1999-09-11


        LocalDate date2 = LocalDate.of(2005, 4, 21);
        System.out.println("date2 = " + date2); // 2005-04-21

        System.out.println(date1.isBefore(date2)); // true
        System.out.println(date1.isAfter(date2)); // false

        System.out.println(date1.getDayOfWeek()); // SATURDAY


        // Get the exact day when you were born
        LocalDate myBirthday = LocalDate.of(1990, 06, 23);
        System.out.println(myBirthday.getDayOfWeek()); // SATURDAY


        // Example: Ask user to enter a date. Print "Invalid date" if the date entered by user
        // is from past. Otherwise, welcome the user to their account

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the date in yy-mm-dd" );
        int yearValue = scanner.nextInt();
        int monthValue = scanner.nextInt();
        int dayValue = scanner.nextInt();

        LocalDate userDate = LocalDate.of(yearValue,monthValue,dayValue);

        if (userDate.isBefore(LocalDate.now())){
            System.out.println("Invalid date" );
        }else {
            System.out.println("You can continue to your account!");
        }





    }
}
