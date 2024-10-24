package day30enums_iterators_records;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Iterator02 {
    public static void main(String[] args) {


        List<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Orange");
        myList.add("Cherry");
        myList.add("Fig");
        myList.add("Lychee");
        System.out.println("myList = " + myList); // [Apple, Orange, Cherry, Fig, Lychee]


        // Modifying an element
        // Update each element by adding "s" => Apples

        // [Apple, Orange, Cherry, Fig, Lychee]
        ListIterator<String> myListIterator =  myList.listIterator();

        while (myListIterator.hasNext()){
            String element = myListIterator.next();
            myListIterator.set(element + "s");
        }
        System.out.println("myList = " + myList);

        // remove e specific element
        // [Apples, Oranges, Cherrys, Figs, Lychees]

        /*

        while (myListIterator.hasNext()){
            String element = myListIterator.next();

            if (element.equals("Figs")){
                myListIterator.remove();
            }
        }

        System.out.println("myList after removing = " + myList);

        myListIterator updated all the elements with "s" and has reached at the end of the list.
        The pointer is at the end.
        If we start the next loop, hasNext() will return false in the first run and the given element
        will NOT be removed because the while loop never reached next() or remove().

        To solve this, we have 2 options:
        Options 1: re-initialise the myListIterator and then run the loop
        Options 2: Create a new list
        Options 3: use hasPrevious()
         */



//        Options 1: re-initialise the myListIterator
        myListIterator = myList.listIterator();

        while (myListIterator.hasNext()){
            String element = myListIterator.next();

            if (element.equals("Figs")){
                myListIterator.remove();
            }
        }

        System.out.println("myList after removing = " + myList); // [Apples, Oranges, Cherrys, Lychees]




//        Options 2: Create a new list
        List<String> yourList = new ArrayList<>(Arrays.asList("Apple", "Cherry", "Orange", "Fig", "Lychee"));
        System.out.println("yourList = " + yourList);

        ListIterator<String> yourListIterator =  yourList.listIterator();

        while (yourListIterator.hasNext()){
            String element = yourListIterator.next();
            if (element.equals("Fig")){
                yourListIterator.remove();
            }
        }
        System.out.println("yourList = " + yourList); // [Apple, Cherry, Orange, Lychee]


        //Options 3: use hasPrevious()
        while (myListIterator.hasPrevious()){
            String element = myListIterator.previous();
            if (element.equals("Lychees")){
                myListIterator.remove();
            }
        }
        System.out.println("myList = " + myList); // [Apples, Oranges, Cherrys]


    }
}
