package day30enums_iterators_records;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator01 {
    public static void main(String[] args) {

        /*
         1- Iterators do the same job as loops
        2) There's no risk of an infinite loop with iterators (like with for-each)
        3) There is no performance difference between iterators and loops
        4) Iterators are more successful when it comes to removing elements from a collection
            or modifying an element within a collection
        5) There are two types of iterators:
            a) Iterator => This is only used for element removal; adding new elements or changing an element is not possible
            b) ListIterator => This can remove, add, and modify elements

            Note:
            The Iterator only works from left to right (from the first element to the last)
            ListIterator are Bi-directional => can work in both directions (goes Next and get back to Previous)

         */


        List<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Orange");
        myList.add("Cherry");
        myList.add("Fig");
        myList.add("Lychee");
        System.out.println("myList = " + myList);  // [Apple, Orange, Cherry, Fig, Lychee]

        // Update each element by adding "s" => Apples

//        for (String w : myList){
//            System.out.println(w+"s");
//        }


        System.out.println("===== Iterators=======");

        // myList = [Apple, Orange, Cherry, Fig, Lychee]

        Iterator<String> myIter = myList.iterator();

        while (myIter.hasNext()){
            myIter.next();
            myIter.remove();
            // myIter.set(); There's NO such method in iterator() because it doesn't allow adding operation

        }
        System.out.println("myList = " + myList); // []


         /*
        hasNext() method checks if there is any element in the list or not; returns true if there is; returns false if there is no more element
        next()  method makes the pointer jump over the element and put it in front of next element. it also returns that element it jumped over.
        remove() just removes that element.
         */
    }
}
