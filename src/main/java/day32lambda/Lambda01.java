package day32lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>(Arrays.asList(11, 2, 24, 5, 2, 11, 13));
        System.out.println("myList = " + myList); //[11, 2, 24, 5, 2, 11, 13]
        System.out.println(Integer.MIN_VALUE); // -2147483648

        //System.out.println( 2 < 5 ? "True": "False");

        // method call
        findMaximum(myList); // 24
        findMaximum1(myList); // 24
        findMaximum2(myList); // 24
        findMaximum3(myList); // 24
        findMaximum4(myList); //


    }

    // Create a method find out the maximum element from the given list
    //  [11, 2, 24, 5, 2, 11, 13]

    // 1st way: by using Integer.MIN_VALUE as our identity element in reduce()
    public static void findMaximum(List<Integer> list){
        int max = list.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println("max = " + max);

        // Integer.MIN_VALUE provides minimum value that an integer can have (-2147483648)
        // This value is used as an identity element and assigned in t variable at first
        // The first element from the stream goes to u variable
        // Condition used in ternary returns the value from the relevant variable
        // That value is assigned back to t variable everytime
        // until we get the last value in t which should be the maximum


    }



    // 2nd way: by using an element from the stream itself as our identity element in reduce()
    // myList = [11, 2, 24, 5, 2, 11, 13]
    public static void findMaximum1(List<Integer> list){
        int max = list.stream().distinct().reduce(list.get(0) , (t,   u) ->   t > u ?   t :   u);
        System.out.println("max = " + max);

        // list.get(0) provided the first element from the list
        // This is used as an identity element and assigned in t variable at first
    }

    // 3rd way: using sorted()
    public static void findMaximum2(List<Integer> list){
        int max = list.
                    stream().
                    distinct(). // [11, 2, 24, 5, 13]
                    sorted(). // sort the elements from small to big => [2, 5, 11, 13, 24]
                    reduce((t,u) ->  u).
                    get();

        System.out.println("max = " + max);
    }

    /*
    reduce () function can be used with / without identity element


    1. reduce () function with identity element:
       identity element for addition = 0
       identity element for multiplication = 1
       identity element for maximum value = Integer.MIN_VALUE
       identity element for maximum value = list.get(0)


    2. reduce () function  without identity element:
       sorted() function sorts the stream from small to big elements
       reduce() does NOT use identity element and returns Optional Data type
          1. first option to declare Optional<Integer> data type for max variable
          2. 2nd option is to use get() after reduce() to get smaller data type (int)

     */

    // 4th way: using method reference
    // myList = [11, 2, 24, 5, 2, 11, 13]
    public static void findMaximum3(List<Integer> list){
        int max = list.
                    stream().
                    distinct().
                    // reduce((t, u) -> Math.max(t,u)).
                    reduce(Math::max).  // method reference
                    get(); // get() is used to get the element from Optional data
        System.out.println("max = " + max);
        // Math::max is the method reference for  Math.max() method
    }

    // 5th way:
    // myList = [11, 2, 24, 5, 2, 11, 13]
    public static void findMaximum4(List<Integer> list){
        int max = list.
                stream().
                distinct().
                sorted(Comparator.reverseOrder()). // from the largest element to the smallest
                findFirst().
                get();

        System.out.println("max = " + max);
        // Math::max is the method reference for  Math.max() method
    }



}
