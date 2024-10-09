package day20constructors_date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {
        // LocalTime is itself a data type in JAVA
        /*
         LocalTime Class uses date and time formats

            HH : mm ==> 24-hour clock system
            hh : mm ==> 12-hour clock system AM, PM not shown
            hh : mm a ==> 12-hour clock system AM, PM
            HH : mm : ss ==> shows seconds
            HH : MM ==> incorrect format because MM is used for months
            "mm" stands for "minute". "MM" stands for "month".

            dd-MM-yyyy ==> day - month - year
            MMM ==> Aug
            MMMM ==> August
         */



        // Get the current time
        LocalTime currentTime = LocalTime.now();
        System.out.println("currentTime = " + currentTime);  // 22:45:07.118466


        // format time
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println("formated Time = " + dtf.format(currentTime)); // 10:48 pm


        // format date
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        System.out.println("formated Date) = " + dtf1.format(currentDate)); // 09-October-24


        // What's the time in your part of the world?
        LocalTime currentTimeInLondon = LocalTime.now(ZoneId.of("Europe/London"));
        System.out.println("currentTimeInLondon = " + currentTimeInLondon); // 19:55:58.056960

        LocalTime currentTimeInDubai = LocalTime.now(ZoneId.of("Asia/Dubai"));
        System.out.println("currentTimeInDubai = " + currentTimeInDubai); // 22:57:22.284941


        // Can we use Date and Time together?
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("currentDateTime = " + currentDateTime); // 2024-10-09T22:58:47.937259

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd-MMM-yy - HH:mm");
        String currentDateTime1 = dtf2.format(currentDateTime);
        System.out.println("current Date and Time = " + currentDateTime1);


    }

}
