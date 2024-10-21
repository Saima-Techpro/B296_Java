package day27collections;

import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Set02 {
    public static void main(String[] args) {

           /*

        2)LinkedHashSet: This set stores elements based on their addition order (insertion order).

        LinkedHashSets are a good choice for applications that require maintaining the order of elements.
        However, they offer slower performance than HashSets. (medium)

        Example: Caching "recently viewed items" on an e-commerce site where both uniqueness and order are important.
        Example2; You can use it to keep student information in order of registration in schools


         3) TreeSet:
        This set stores elements based on their natural order (from smallest to largest).
        It offers slower performance than HashSets and LinkedHashSets.
        In Java, TreeSet is a class that implements the SortedSet interface.
        Therefore, TreeSet is a sorted set.

            */

        // How to create LinkedHashSet?
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        System.out.println("lhs = " + lhs); // []
        lhs.add(23);
        lhs.add(3);
        lhs.add(11);
        lhs.add(6);
        lhs.add(8);
        System.out.println("lhs = " + lhs); // follows the insertion order => [23, 3, 11, 6, 8]


        LinkedHashSet<Integer> lhs2 = new LinkedHashSet<>();
        lhs2.add(3);
        lhs2.add(50);
        lhs2.add(65);
        lhs2.add(89);
        lhs2.add(6);
        System.out.println("lhs2 = " + lhs2);  // [3, 50, 65, 89, 6]

        // retainAll() method keeps the data in first which is common in the second set
        // lhs =  [23, 3, 11, 6, 8]
        // lhs2 = [3, 50, 65, 89, 6]
        System.out.println(lhs.retainAll(lhs2)); // returns true means the operation of retaining the data is done
        System.out.println("lhs = " + lhs);  // [3, 6]
        System.out.println("lhs2 = " + lhs2);

        // Can we add null?
        lhs.add(null);
        System.out.println("lhs = " + lhs);  // [3, 6, null] => added null in the "insertion order"


        // Can we add null again?
        lhs.add(null);
        System.out.println("lhs = " + lhs); // [3, 6, null] => DUPLICATES ARE NOT ALLOWED IN SETS


        // How to create TreeSet?
        TreeSet<Character> ts = new TreeSet<>();
        System.out.println("ts = " + ts); // []

        ts.add('D');
        ts.add('Y');
        ts.add('L');
        ts.add('B');
        ts.add('O');
        System.out.println("ts = " + ts); // [B, D, L, O, Y] => TreeSet follows natural order


        // Can we add null?
        // TreeSet does NOT accept null
//        ts.add(null);
//        System.out.println("ts = " + ts); // NullPointerException


        // subSet() method returns a set from within the existing set => subset
        // TreeSet<Character>  ts1 =  ts.subSet('D', 'O');

        //System.out.println(ts.subSet('D', 'O'));
        SortedSet<Character>  ts1 =  ts.subSet('D', 'O'); // staring value is inclusive, ending value is exclusive
        System.out.println("ts1 = " + ts1); // [D, L]

        //  ts = [B, D, L, O, Y]
        // ceiling() method returns the least element in this set greater than or equal to the given element
        System.out.println(ts.ceiling('Y')); // Y
        System.out.println(ts.ceiling('Z')); // null
        System.out.println(ts.ceiling('P')); //  Y
        System.out.println(ts.ceiling('A')); //  B

        /*

        If the element exists in the set, ceiling() returns the element itself.
        If the element does not exist but there is a larger element, it returns the smallest element that is larger.
        If all elements are smaller than the specified element, it returns null.

         */



    }
}
