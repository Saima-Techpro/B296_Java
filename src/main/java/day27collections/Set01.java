package day27collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Set01 {
    public static void main(String[] args) {

        /*
        Sets are used to store UNIQUE data.
        For example: national ID, email, fingerprints, driver licence, car plate number etc.
        There are 3 types of sets:
        1. HashSet
        2. LinkedHashSet
        3. TreeSet
         */

          /*

        1) HashSet: This set stores elements based on their hash codes.
        Elements are stored in a structure where each has a unique hash code (identity number).
        When an element is added, its hash code is calculated and placed in a cell corresponding to that hash code.

        HashSets offer the fastest performance. However, they do not maintain the order of elements.
        They accept null as an element.
         */

        // Hashset deal with Hash codes
        String s = "Java";
        System.out.println(s.hashCode()); // 2301506

        String ss = "Java is an interesting language";
        System.out.println(ss.hashCode());  // 747794363


        // How to create HashSet
        // Collections don't accept primitive data type
        // HashSet<int> hs = new HashSet<>();  => error
        // HashSet<Integer> hs = new HashSet<>(); => acceptable

        HashSet<String> fruits = new HashSet<>();
        System.out.println("fruits = " + fruits); // []

        fruits.add("Mango");
        fruits.add("Lychee");
        fruits.add("Fig");
        fruits.add("Orange");
        fruits.add("Date");
        System.out.println("fruits = " + fruits); // [Lychee, Fig, Mango, Orange, Date] => randomly adds data => random order

        // can we add null?
        fruits.add(null);
        System.out.println("fruits = " + fruits); // [null, Lychee, Fig, Mango, Orange, Date]

        // can we add null again?
        fruits.add(null); // allows but overwrite the previous null
        System.out.println("fruits = " + fruits);

        fruits.add("Mango"); // allows but overwrite the previous data
        System.out.println("fruits = " + fruits);

        // clone() returns a shallow copy of the HashSet which can be stored in Object data type
        Object fruitSet = fruits.clone();
        System.out.println("fruitSet = " + fruitSet); // [null, Mango, Lychee, Fig, Orange, Date]

        //clear() method
        fruits.clear();
        System.out.println("fruits = " + fruits);


       // Extra information about Structure

       HashSet<String> hs = new HashSet<>(Arrays.asList("Tom", "Emily", "John"));
        System.out.println("hs = " + hs); // [Emily, Tom, John]

        // hs has HashSet structure although Arrays.asList() creates an underlying structure of Arrays
        // HashSet are mutable
        hs.add("Ali");
        System.out.println("hs = " + hs); // [Emily, Tom, John, Ali]

        Set<String> hs1 = Set.of("Mary", "David"); // Set.of() creates an immutable Set so, it can't be modified or updates
        System.out.println("hs1 = " + hs1); // [Mary, David]

        hs1.add("Maryam");
        System.out.println("hs1 = " + hs1); // UnsupportedOperationException


    }
}
