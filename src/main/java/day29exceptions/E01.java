package day29exceptions;

public class E01 {

    public static void main(String[] args) {
        /*
        1)"Exception" means un-expected issues in code executions (e.g. divide by zero)
        2)There are two ways to work with Exceptions
            i)  Using try-catch block: Handling Exception
            ii) Throw Exception and block the application
        3) If you do not handle the Exception, Java stops execution and the application is blocked.
        4) "try" can be used with a "single" or "more" catch blocks
        5) "try" "cannot" be used "alone"

        Try block is like asking for help when something unexpected happens in the coding.
        So it doesn't block the application.

        NOTE: Exceptions are not errors.

         */


        // method call
        divide(8, 4);

        divide(8, 0); // throws ArithmeticException before if statement

        divide1(6,0); // ArithmeticException
    }


    // let's create a method to divide
    public static void divide(int a, int b){
        if (b==0){
            System.out.println("Division is not possible by zero");
        }else {
            System.out.println("division = " + a / b);
            System.out.println("Division is successful!");
        }
    }

    // The if statement works but this is not RECOMMENDED, because it can't take care of all types
    // of Arithmetic issues


    public static void divide1(int a, int b){
        try{
            System.out.println("division = " + a / b);
            System.out.println("Division is successful!");
        } catch (ArithmeticException e) { // e is the name of the variable
            System.out.println("Division is not possible by zero");
        }
        System.out.println("System carries on.... ");

    }



}
