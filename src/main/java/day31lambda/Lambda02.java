package day31lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda02 {
    public static void main(String[] args) {


        List<Integer> nums = new ArrayList<>(Arrays.asList(3, 5, 2, 6, 11));
        System.out.println("nums = " + nums);

//        int a = 10;
//        a = a * a;  // variable 'a' is updated only if 'a*a' is assigned back to a variable
//        System.out.println(a); // 100

        // Create a list with duplicate values
        List<Integer> numbers = new ArrayList<>(Arrays.asList(7, 3, 5, 2, 5, 6,11, 7));
        System.out.println("numbers = " + numbers); // [7, 3, 5, 2, 5, 6, 11, 7]


        // method call
        printSquare(nums);
        System.out.println("==============");
        cubeOfOdds(nums);

        System.out.println("==============");
        removeDuplicates(numbers); // 7 3 5 2 6 11





    }

    // [3, 5, 2, 6, 11]
    // Create a method to print square of each element
    public static void printSquare(List<Integer> list){
        list.stream().map(t-> t*t).forEach(t -> System.out.println(t));
        // map() function updates elements in the stream after any mathematical operations (does NOT need re-assignment)

    }


    // Create a method to print the cube of odd elements only => map(), forEach(), filter()
    public static void cubeOfOdds(List<Integer> list) {
        list.stream().filter(t -> t % 2 != 0).map(t -> t * t * t).forEach(t -> System.out.println(t));
        // list.stream(). map(t -> t*t*t). filter(t-> t%2 !=0).forEach(t -> System.out.println(t));  // this is also possible but it makes Java work more
    }


    // Create a method to remove duplicate elements from the list
    public static void removeDuplicates(List<Integer> list){
        list.
                stream(). // puts the list elements in stream format
                distinct(). // filters the duplicates, keeps the uniques elements
                forEach(t -> System.out.print(t + " ")); // works the same as for each loop
    }


}
