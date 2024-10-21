package day26collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedList02 {
    public static void main(String[] args) {

        LinkedList<String> list1 = new LinkedList<>(Arrays.asList("Earth", "Moon", "Mars"));
        System.out.println("list1 = " + list1); // [Earth, Moon, Mars]
        list1.add("Jupitar");
        System.out.println("list1 = " + list1); // [Earth, Moon, Mars, Jupitar]
        /*
        list1 structure:
        list1 is a LinkedList.
        Arrays.asList() method is used and it creates fixed length Array.
        When it's passed through new LinkedList<>() constructor, it changes its behaviour and
        becomes mutable / modifiable LinkedList.

        new LinkedList<>() constructor creates a new empty List by copying the elements from  Arrays.asList().
         */


        LinkedList<String> list2 = new LinkedList<>(List.of("Earth", "Moon"));
        System.out.println("list2 = " + list2); // [Earth, Moon]
        list2.add("Mercury");
        System.out.println("list2 = " + list2); // [Earth, Moon, Mercury]

        /*
        list2 structure:
        list2 is a LinkedList.

        List.of() method is used and it creates an immutable list.
        When it's passed through new LinkedList<>() constructor, it changes its behaviour and
        becomes mutable / modifiable LinkedList.

        new LinkedList<>() constructor creates a new empty List by copying the elements from List.of().
         */



        List<String> list3 = List.of("Neptune", "Pluto");
        System.out.println("list3 = " + list3); // [Neptune, Pluto]

//        list3.add("Saturn");
//        System.out.println("list3 = " + list3); // UnsupportedOperationException

        /*
        list3 structure:
        list3 is a List.

        List.of() method is used and it creates an immutable list.
        But it is NOT passed through new LinkedList<>() constructor.
        So if we try to modify it, it throws exception.

         */

        // list1 = [Earth, Moon, Mars, Jupitar]
        // poll() method returns and removes the first element from the list
        // doesn't show error if the list is empty. just returns null

        System.out.println(list1.poll()); // Earth
        System.out.println("list1 = " + list1); //  [Moon, Mars, Jupitar]

        // clear() method clears all elements
//        list1.clear();
//        System.out.println(list1);
//        System.out.println(list1.poll()); // null
//        System.out.println(list1);


        // element() method retrieves the first element but DOES NOT remove it
//        System.out.println(list1.element()); // Moon
//        System.out.println("list1 = " + list1); // [Moon, Mars, Jupitar]
//
//        // pop() method returns and removes the first element from the list
        // throws NoSuchElementException if the list is empty
        System.out.println(list1.pop()); // Moon
        System.out.println(list1); // [Mars, Jupitar]


    }
}
