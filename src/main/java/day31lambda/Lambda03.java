package day31lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda03 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(3, 5, 2, 6, 5, 3, 11));
        System.out.println("nums = " + nums); // [3, 5, 2, 6, 5, 3, 11]


        // method call
        sumOfElements(nums); // sum of all elements: 35

        sumOfUniqueElements(nums); // sum of unique elements: 27


        sumOfUniqueOddElements(nums); // 19

        System.out.println("=======Multiplication=======");
        multiplyUniqueEvenElements(nums); // 12

    }

    // Create a method to calculate the total(sum) of all the elements

    public static void sumOfElements(List<Integer> list){
//        int sum = 0; // where zero is identity element
//        for (Integer w: list){
//            sum = sum+w;
//        }
//        System.out.println("sum = " + sum);

        int result = list.stream().reduce(0, (a, b) -> a+b);
        System.out.println("result = " + result);
    }

      /*
        NOTES:
        in reduce() function, identity element is declared zero because we are doing addition
        reduce() function is used to reduce the elements to a single element result after performing addition/multiplication operation
        Integer::sum => is the method reference  of (t, u) -> t+u
         */


    // [3, 5, 2, 6, 5, 3, 11]
    // Create a method to get the sum of elements AFTER removing the duplicates

    public static void sumOfUniqueElements(List<Integer> list){

        int result = list.
                        stream(). // puts the list into stream format
                        distinct(). // returns the stream with unique elements only
                        reduce(0, Integer::sum); // reduces the elements to a single element in the stream
        System.out.println("result = " + result);       // Integer::sum => method reference

    }

    // Create a method to get the sum of unique odd elements
    // [3, 5, 2, 6, 5, 3, 11]
    public static void sumOfUniqueOddElements(List<Integer> list){
        int result = list.
                stream().
                distinct(). // keeps unique elements
                filter(t -> t%2 !=0).// keeps odds only
                reduce(0, Integer::sum);  // reduces all odds to a single value after addition

        System.out.println("result = " + result);
    }

    // Create a method to multiply unique even elements
    public static void multiplyUniqueEvenElements(List<Integer> list){
        int result = list.
                stream().
                distinct().
                filter(t -> t%2==0).
                reduce(1, (t,u) -> t*u);
        System.out.println("result = " + result);

    }

}
