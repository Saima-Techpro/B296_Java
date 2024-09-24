package day06switch_ternary;

import java.util.Scanner;

public class Ternary02 {
    public static void main(String[] args) {

     // Create a ternary to print the absolute value of a given number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number please to find its absolute value");
        int number = scanner.nextInt();

        // with if statement
        if (number<0){
            System.out.println("absolute value of the number is: " + number*-1);
        }else {
            System.out.println("absolute value of the number is: " + number);
        }



        // ternary
        int absValue =  number<0 ? number*-1 : number;
        System.out.println("absValue = " + absValue);


        // Example: If two numbers have same sign, multiply them. Otherwise, print "I can't multiply these numbers"
        // same sign => +, +  or -, -

        int a = 5, b = -9;

        String result = (a>0 && b>0) || (a<0 && b<0)  ? Integer.toString(a*b) : "I can't multiply these numbers";

        System.out.println("String result = " + result);

        Object result1 = (a>0 && b>0) || (a<0 && b<0)  ? a*b : "I can't multiply these numbers";


        /*
        Object data type is the FATHER of all data types => Adam is to humans, Object is to data types
        General rule: To store the result in its relevant data type
        BUt is some cases, when we have to deal with different data types, it's an option to use Object data type.
        Remember OBJECT data type uses HUGE memory. USE IT ONLY WHEN YOU REALLLLLLLY NEED IT.
         */













    }
}
