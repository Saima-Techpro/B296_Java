package day32lambda;

import java.util.*;

public class Lambda02 {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(Arrays.asList(11, 2, 24, 5, 2, 11, 13));
        System.out.println("myList = " + myList); //[11, 2, 24, 5, 2, 11, 13]
        System.out.println(Integer.MAX_VALUE); // 2147483647


        findMinimum(myList); // 2
        findMinimum1(myList); // 2
        findMinimum2(myList); // 2
        findMinimum3(myList); // 2
    }


    // Create a method find out the maximum element from the given list
    //  [11, 2, 24, 5, 2, 11, 13]

    // 1st way: by using Integer.MIN_VALUE as our identity element in reduce()
    public static void findMinimum(List<Integer> list){

        int min = list.stream().distinct().reduce(Integer.MAX_VALUE, ( t,   u) ->  t > u  ?  u : t);
        System.out.println("min = " + min);

        // Integer.MAX_VALUE provides maximum value that an integer can have (2147483648)
        // This value is used as an identity element and assigned in t variable at first
        // The first element from the stream goes to u variable
        // Condition used in ternary returns the value from the relevant variable
        // That value is assigned back to t variable everytime
        // until we get the last value in t which should be the minimum


    }

    // 2nd way: by using an element from the stream itself as our identity element in reduce()
    // myList = [11, 2, 24, 5, 2, 11, 13]
    public static void findMinimum1(List<Integer> list){
        int min = list.stream().distinct().reduce(list.get(0) , (t,   u) ->   t < u ?   t :   u);
        System.out.println("min = " + min);

        // list.get(0) provided the first element from the list
        // This is used as an identity element and assigned in t variable at first
    }

    // 3rd way: using sorted()
    public static void findMinimum2(List<Integer> list){
        int min = list.
                stream().
                distinct(). // [11, 2, 24, 5, 13]
                sorted(). // sort the elements from small to big => [2, 5, 11, 13, 24]
                reduce((t,u) ->  t).get();

        System.out.println("min = " + min);
    }


    // 3rd way: using sorted()
    public static void findMinimum3(List<Integer> list){
        Optional<Integer> min = list.
                stream().
                distinct(). // [11, 2, 24, 5, 13]
                sorted(Comparator.reverseOrder()). // sort the elements from biggest to smallest => [24, 13, 11, 5, 2]
                reduce((t,u) ->  u);

        if (min.isPresent()){
            System.out.println("min value = " + min.get());
        }else {
            System.out.println("List is empty or value can't be found");
        }

    }

    // 4th way: using method reference
    // myList = [11, 2, 24, 5, 2, 11, 13]
    public static void findMinimum4(List<Integer> list){
        int min = list.
                stream().
                distinct().
                //reduce((t, u) -> Math.min(t,u)).
                reduce(Math::min).  // method reference
                get(); // get() is used to get the element from Optional data
        System.out.println("min = " + min);
        // Math::min is the method reference for  Math.min() method
    }

    // 5th way:
    // myList = [11, 2, 24, 5, 2, 11, 13]
    public static void findMinimum5(List<Integer> list){
        int min = list.
                stream().
                distinct().
                sorted(). // from the smallest to largest element
                findFirst().
                get();

        System.out.println("min = " + min);
        // Math::min is the method reference for  Math.min() method
    }












}
