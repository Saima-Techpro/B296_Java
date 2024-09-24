package day03typecasting_wrapper;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Wrapper02 {
    public static void main(String[] args) {

        /*

        Primitive data type => byte <short < int < long < float <double

        Primitive data type allows to store values only. They don't have methods.
        In order to do any data manipulation, we need methods.
        This problem was resolved by creating WRAPPER classes for all Primitive data types

        byte   =>  Byte
        short  =>  Short
        int    =>  Integer
        long   =>  Long
        float  =>  Float
        double =>  Double
        char   => Character
        boolean => Boolean

        WRAPPER classes provide values as well as methods.

        Wrapper classes ARE Non-Primitive data types.

        When we convert Primitive data types in to their Wrapper classes, it's called "Auto-boxing".
        Java performs this function automatically.

        When we convert Wrapper classes to their Primitive data types, it's called "Un-boxing".
        Java performs this function automatically.

         */

        int a = 10;

       //  a. => no methods are accessible because int is a Primitive data type.
       // Primitives have values only.


        Integer b = 24;
       //  b.  => shows many methods are accessible because Integer is the wrapper class of int.


       // Auto-boxing
        char c = 'M';
        Character ch = c;
        System.out.println("ch = " + ch);

        // Un-boxing

        Short s = 76;
        short sh = s;
        System.out.println(sh);

        // How to get minimum and maximum values of numeric data type?

        // Byte
        System.out.println("Max value of Byte: " + Byte.MAX_VALUE); // 127
        System.out.println("Min value of Byte: " + Byte.MIN_VALUE); // -128

        // Character

        System.out.println("Max value of Character: " + Character.MAX_VALUE); // returns this symbol ￿, sometimes it can return a ?
        System.out.println("Min value of Character: " + Character.MIN_VALUE);

        /*
        NOTE:
        Character.MAX_VALUE and Character.MIN_VALUE return returns this symbol ￿.
        This represents unicode of max range of char data type. ('\uffff' => 65535)
        This is not readable.

        Character.MIN_VALUE return returns this symbol ￿.
        This represents unicode of max range of char data type. ('\u0000' => 0)
        This is not readable.

         To make these values readable, we need to cast them in int

         */

        System.out.println("Max value of Character after casting: " + (int) Character.MAX_VALUE);
        System.out.println("Min value of Character after casting: " + (int) Character.MIN_VALUE);



        // Integer
        System.out.println("Max value of Integer: " +Integer.MAX_VALUE); // 2147483647
        System.out.println("Min value of Integer: " +Integer.MIN_VALUE); // -2147483648


        System.out.println("=========================");

         /*
        Task: Create two variables to store total amount of money and number of people in a team.
              Calculate the amount each teammate gets. Print it on the console.
          amount = 90
          num of players: 12

         */

        int amount = 90;
        int numOfPlayers = 12;

        System.out.println("Each teammate gets: " + amount/numOfPlayers); // 7 => we were expecting decimal 7.5 but we only 7

        // When both variables have int data type, the result would be returned in int data. The decimal part will be removed.


        float amount1 = 90f;
        System.out.println("Each player gets: " + amount1/numOfPlayers); //   7.5  => float/int
        // When two variables have different data type, the result would be returned in the larger data type.

        short players = 12;
        System.out.println("int/short result: " + amount/players); // 7   => int/short

        // type-casting

        double result = (double) amount / numOfPlayers;
        System.out.println("result = " + result);



    }
}
