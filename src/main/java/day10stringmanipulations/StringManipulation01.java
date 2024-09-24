package day10stringmanipulations;

import java.util.Scanner;

public class StringManipulation01 {
    public static void main(String[] args) {

        /*
        Example: Convert all the digits into "*" in a card number except last 4 digits.
                //  1234 6789 1234 6789 ==> **** **** **** 6789
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your card number");
        String cardNum = scanner.nextLine();

        String firstPart = cardNum.substring(0, 15).replaceAll("[0-9]", "*");
        System.out.println("firstPart = " + firstPart);


        String secondPart = cardNum.substring(15);
        System.out.println("secondPart = " + secondPart);

        System.out.println(firstPart + " " + secondPart);
        // You would need to add a space here if you used String firstPart = cardNum.substring(0, 14)
        // Or use index 14 in both parts to include the space in the second part
        // use String firstPart = cardNum.substring(0, 14)
        // String secondPart = cardNum.substring(14);


        String result = firstPart + secondPart;
        System.out.println("result = " + result);

        // System.out.println(firstPart.concat(" ! " + secondPart)); // concat() method also joins the two Strings together.
        System.out.println(firstPart.concat(secondPart));

        // Another way
        System.out.println(cardNum.length()); // 19
        String lastFourDigits = cardNum.substring(cardNum.length() - 4);
        String secondPart2 = cardNum.substring(0, cardNum.length() - 4).replaceAll("\\d","*");
        System.out.println(secondPart2 + lastFourDigits);


    }
}
