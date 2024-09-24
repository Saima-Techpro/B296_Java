package day04scanner_increment_decrement;

import java.util.Scanner;

public class Modulus {
    public static void main(String[] args) {

        // Ask user to enter 5 digit integer value, calculate the addition of the first 2 and the last 2 digits
        // 65743  => 65  +  43  = 108

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a five digit number");

        int number = scanner.nextInt();

        // first two digits
        int firstTwoDigits = number/1000;
        System.out.println("firstTwoDigits = " + firstTwoDigits);


        // last two digits
        int lastTwoDigits = number%100;
        System.out.println("lastTwoDigits = " + lastTwoDigits);


        int result = firstTwoDigits+lastTwoDigits;
        System.out.println("result = " + result);


    }
}
