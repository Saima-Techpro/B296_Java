package day31lambda;

import com.sun.security.auth.UnixNumericGroupPrincipal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {

        /*
        1. Lambda expressions, introduced in Java 8, are a feature that is used to facilitate functional programming.
           Lambda themselves are not "functional programming" but rather a feature that supports functional
           programming style in Java (which remains object-oriented language).

           Lambda essentially represent anonymous functions (functions without names) and
           are usually used to define short functions.

        2. Lambda expressions (Functional programming) is commonly used with Collections and Arrays.


         The general advantages of lambda expressions:

        1- Writing less code: Lambdas allow you to write less and more readable code.
        2- Functional programming: They help you utilize Java's functional programming features.
        3- Anonymous: Lambda expressions do not have a name.
        4- Can contain a single expression: Lambda expressions can contain a single expression that performs one or more
            operations.
        5- Can take one or more parameters: Lambda expressions can take one or more parameters.

        Lambda expressions are sometimes also called "arrow functions" ->

         */


        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 9, 12, 23, 49, 65));

        // method call
        printElements(numbers);
        System.out.println("============");
        printElementsWithLambda(numbers);
        System.out.println("============");
        printEvens(numbers);
        System.out.println("============");
        printEvensWithLambda(numbers);



    }

    // Create a simple method to print the elements
    public static void printElements(List<Integer> list){
        for (Integer w: list){
            System.out.print( w + " ");
        }
    }


    public static void printElementsWithLambda(List<Integer> list){
        list.stream().forEach( t -> System.out.println(t));
    }



    // stream() => returns a sequential Stream over the elements in this collection
    // 't' here represents name of a variable which receives each element one by one from forEach() function
    // NOTE: In Structured language, we CREATE loops, in Functional programming, we use forEach() function
    // These functions are also called 't functions' because of 't ->'


    public static void printEvens(List<Integer> list){
        for (Integer w : list){
            if (w%2==0){
                System.out.print(w + " ");
            }
        }
    }

    // 5, 9, 12, 23, 49, 65
    public static void printEvensWithLambda(List<Integer> list){
        list.stream().filter(t-> t%2==0).forEach(t -> System.out.println(t));
    }

    // filter() works as "if statements" in Structured language
    // in Lambda, we use filter() function in place of if statements

}
