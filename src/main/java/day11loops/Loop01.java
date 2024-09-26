package day11loops;

public class Loop01 {
    public static void main(String[] args) {

        // Print "Hi" five times on the console
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        // JAVA PRINCIPLE => AVOID REPETITION  (DRY)

        /*
        The aim is to write HIGH QUALITY and CLEAN CODE

        DRY: Don't Repeat Yourself

        - Java created a structure called loop.
        - There are four types of loops
        1. for Loop  2. while loop   3. do while loop   4. for each loop

        SYNTAX:
        for(startingValue;   condition to stop the loop;   increment/decrement){
            loop body
        }

        NOTE: startingValue is the name of the variable. You can use ANY name for this variable
         */

        System.out.println("=======================");
        for (int startingValue = 1; startingValue < 6;startingValue++){
            System.out.println("Hi");
        }

        System.out.println("=======================");
        // Print the numbers from 20 to 8

        for (int x = 20; x>7; x--){
            System.out.println(x);
        }

        System.out.println("=======================");

        // Print all even numbers from 20 to 8
        for (int g = 20; g > 7; g--){
            if (g%2 == 0){
                System.out.println(g);
            }
        }
        System.out.println("=======================");

        // Another way:
        for (int i = 20; i >7;  i-=2){  // decreasing by 2 => in this case, you need to be careful about the starting value
            System.out.println(i);
        }

        System.out.println("=======================");
        // Print all odd numbers from 20 to 8
        for (int i = 20; i>7; i-- ){
            if (i%2 != 0){
                System.out.println(i);
            }
        }

        System.out.println("=======================");
        // Another way:
        for (int i = 19; i >7;  i-=2){  // decreasing by 2 => in this case, you need to be careful about the starting value
            System.out.println(i);
        }

        System.out.println("=======================");
        // Type odd integers from 68 to 13 in the same line with a
        // space between consecutive integers.

        for (int i = 68; i > 12; i--){
            if (i%2 == 1){
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println("=======================");

        // Type all integers which are divisible by 4 and not divisible by 6
        // from 120 to 11 in the same line with a space between consecutive integers

       for (int i =120; i> 10; i-- ){

           if (i%4 == 0 && i%6 !=0 ){

               System.out.print(i + " ");
           }
       }






    }

}
