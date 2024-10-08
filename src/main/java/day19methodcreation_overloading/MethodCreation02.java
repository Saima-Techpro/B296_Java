package day19methodcreation_overloading;

public class MethodCreation02 {
    public static void main(String[] args) {

        /*
                   ACCESS MODIFIERS IN JAVA
            1) public - NO RESTRICTION AT ALL - everyone can access within the project
            2) protected - accessible within package
                           also accessible to specific members which are related (through inheritance)
            3) default - accessible within the same package (package private)
                         it's less restrictive than private, but more than public and protected
            4) private - accessible ONLY within the class
         */


        // Method call
        multiply(2, 4, 7); // 56
        System.out.println(addAndMultiply(3, 5, 7)); // 22
        printText("Java is driving me crazy!!");
    }

    // Create a method to multiply 3 numbers
    public static int multiply(int a, int b, int c){
        int result = a*b*c; // local instance/variable
        System.out.println("result = " + result);
        return result;
    }

    // Create a method with 3 parameters. Multiply two of them and add the third one.

    private static int addAndMultiply(int a, int b, int c){
        return a*b+c;
    }

    // Create a method to print the given text
    protected static void printText(String s){
        System.out.println(s);
    }

    // Create a method to subtract two values
    // this method has 'default' modifier by default
     static int subtract(int a, int b){
        return a-b;
    }

    public int divide(int a, int b){
        return  a/b;
    }






}
