package day34lambda;

import day33lambda.Utils;

import java.util.stream.IntStream;

public class Lambda01 {
    public static void main(String[] args) {
        /*
          a) IntStream - Allows for sequential operations on primitive int values. (There's also LongStream, DoubleStream)
          b) range - Creates a stream that represents consecutive numbers between specified start (inclusive) and end
                    values (exclusive).
          c) rangeClosed - Creates a stream that represents consecutive numbers between specified start (inclusive) and end
                    values (inclusive).
          d) addExact - Adds two int or long values exactly. This method is in the Math class.
          e) getAsInt - A method found in the OptionalInt class. If a value is present, this method returns it.
                        (We use this when we use IntStream)
                        If a value is not present, it throws a NoSuchElementException.
         */


        // method call
        System.out.println(getSumBetweenGivenIntegers());  // 2464

        System.out.println(multiplyGivenIntegers()); // 19958400

        System.out.println("Factorial of 3 or 3!: " + (3*2*1)); // 6
        System.out.println("Factorial= " + getFactorial(5)); // 120

        System.out.println(getSumOfEvens(2, 12)); // 30
        System.out.println(getSumOfEvens(12, 2)); // 30

    }

    // Create a method to get the sum of integers between 7 and 70
    public static int getSumBetweenGivenIntegers(){
        return IntStream.rangeClosed(7, 70).reduce(Math::addExact).getAsInt();
    }

    // Create a method that multiplies integers between 3  and 11
    public static int multiplyGivenIntegers(){
        return IntStream.rangeClosed(3,11).reduce(Math::multiplyExact).getAsInt();
    }


    // Create a method that gives factorial
    public static int getFactorial(int a){
        if (a == 0){
            return 1;
        }else if (a<0){
            System.out.println("Invalid number for Factorials");
            return a;
        }else {
            int factorial = IntStream.rangeClosed(1, a).reduce(Math::multiplyExact).getAsInt();
            return factorial;
        }

    }

    // Create a method to get the sum of EVEN integers for the given range
//    public static int getSumOfEvens(int a, int b){
//        return  IntStream.range(a, b).filter(t-> t%2==0).sum();
//    }

    // Using Utils method
//    public static int getSumOfEvens(int a, int b){
//        return  IntStream.range(a, b).filter(Utils::isNumEven).sum();
//    }

    // NOTE:  if a is bigger than b, range() and rangeClosed() methods can NOT return the range
    // because these methods always go from smaller to bigger value. They return 0 if we
    // start with bigger value


    public static int getSumOfEvens(int a, int b){

        if (a>b){
            int temp = a; // now a is in temp variable
            a = b; // now b is in a variable
            b = temp; // a is shifted to b now
        }

        return  IntStream.range(a, b).filter(Utils::isNumEven).sum();
    }


}
