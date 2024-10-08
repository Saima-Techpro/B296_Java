package day19methodcreation_overloading;

public class MethodCreation01 {
    public static void main(String[] args) {
        /*
        Main method is considered the engine in Java.

        Java provides us many methods from its library so we can use them.
        For Example: Math.max(), Math.min(), subString(), indexOf(), get(), set() etc.

        We can create our OWN customised methods according to our needs/tasks.
        We can use methods, loops, if statements etc. provided by Java to create our customised methods

        Rules:
        1. We can NOT create methods inside the main method.
        2. We create methods OUTSIDE the main method; then we call it inside the
           main method to run it. This is called "method call".

         SYNTAX
         accessModifier  static (optional) returnDataType/void nameOfMethod(parameters){method body}
         Note: if we declare a  returnDataType, it should have a 'return' keyword.

         add(int a, int b) => add is the name of the method
                           => int a , int b are the parameters
                           => together they're called "method signature"

         */

        // method call
        System.out.println("Result: " + add(2, 7));
        System.out.println(add(12, 95)); // 107
        System.out.println(add(64, 3));  // 67


    }


    // Create a method to add two integers
    public static int add(int a, int b){
        int result = a+b;
        return result;
    }




}
