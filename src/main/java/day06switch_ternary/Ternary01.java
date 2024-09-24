package day06switch_ternary;

public class Ternary01 {
    public static void main(String[] args) {

        /*
        Ternary is used for the same purpose as if-else  => conditional situations
        But Ternary has SIMPLER syntax

           condition ?  this part will be executed if condition is true : this part will be executed if condition is false ;
           condition ? these codes if condition is true : these codes if condition is false ;

         */

        // Example: If an integer is positive, print "Positive", otherwise print "Negative"

        int a  = 15;

        // 1st way:
        if (a>0){
            System.out.println("Positive");
        }else {
            System.out.println("Negative");
        }
        //2nd way: Ternary

        // System.out.println(a > 0 ? "Positive" : "Negative");
       String result =  a > 0 ? "Positive" : "Negative";


        System.out.println("result = " + result);

        // Type a code to print the minimum of the two values given (double data type)

        double b  = 12.5 , c = 45;
        double result1 = b < c ? b : c;
        System.out.println("result1 = " + result1);

        // Example: Check if the given number is a digit or not. Use ternary
         int x = 3;

        String result2 = x >= 0 && x < 10 ? "It's a digit" : "Not a digit";

        System.out.println("result2 = " + result2);


        if (x >= 0 && x < 10){
            System.out.println("It's a digit");
        }else {
            System.out.println("Not a digit");
        }







    }
}
