package day12loops;

import java.util.Scanner;

public class Loop03 {
    public static void main(String[] args) {

        /*
         Example: Type code to find the sum of the Unique digits in the given integer
        // 1232 => 1+3 => 4
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        String number = scanner.next();  // we store the given number in String data type because
                                         // Strings provide us soooooo many options to manipulate the data.

        int sum = 0;

        for (int i = 0; i < number.length(); i++) {



           String digit =  number.substring(i, i+1); // substring(staringIndex , endingIndex) => endingIndex is exclusive



            if (number.indexOf(digit) == number.lastIndexOf(digit)){ // checking the uniqueness here

               sum = sum + Integer.valueOf(digit);
            }




        }
        System.out.println("sum = " + sum);


    }
}
