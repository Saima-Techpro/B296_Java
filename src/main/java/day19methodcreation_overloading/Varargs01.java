package day19methodcreation_overloading;

public class Varargs01 {
    public static void main(String[] args) {

        /*

        Varargs => var + args => varying arguments
        If we want to male number of parameters flexible, we create varargs.

        SYNTAX:
        To create varargs, we write dataType... space nameOfVariable
                                      int... a

        varargs work in Array structure at the background
        varargs can be used with primitive and non-primitives

        RULES:
        1. More than one variable can be used in the method which has varargs
        But varargs should ALWAYS be used in the end /last parameter
        2. varargs can have zero or single value/element
        3. varargs can accept unlimited number of elements


         */

        // method call
        System.out.println(sum()); // 0
        System.out.println(sum(2)); // 2
        System.out.println(sum(2, 6));  // 8
        System.out.println(sum(4, 9, 6, 12, 34, 56));  // 121

        System.out.println(sum(2.3, 4.9));
        System.out.println(sum(2.3, 4.9, 8.99, 4.50));


    }

    public static int sum(int... a){
        int total = 0;
        for (int w : a){
            total += w;
        }
        return total;
    }


    public static double sum(double... a){
        double total = 0;
        for (double w : a){
            total += w;
        }
        return total;
    }






}
