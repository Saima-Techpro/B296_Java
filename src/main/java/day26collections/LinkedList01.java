package day26collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
    public static void main(String[] args) {

        /*
         a) ArrayLists are successful in "search operations" but not good at "adding" and "removing" operations.
             Example: search products on amazon
         b) LinkedList are successful in "adding" and "removing" operations but not good at "search operations".
             Example: Shopping cart => adding / removing items


          Structural difference:
          LinkedLists have "nodes" , not elements. "Nodes" consist of 2 parts:
                        1) data  2) pointer
                        "Pointer" acts like index but is not an index.

          Functional difference:
             - When we add or remove any node, LinkedLists don't have to re-index all the remaining data that's why it is
              successful at adding and removing.
             - When we add/remove data from LinkedLists , it adds another node (data+pointer) in the middle or remove it in
               removing operation, but doesn't change/check the other nodes.

           Arrays[] are fixed length / structure. They can't dynamically grow small / big.

           Multidimensional Arrays are also complex structures. Not suitable for dynamic elements; lack flexibility.

           We use Lists (ArrayList or LinkedList to store multiple values,
           so we can change size (add/remove elements) dynamically.

         */

        // List<String> list2 = new List(); // error => because List is an interface and interfaces do NOT have constructors

        ArrayList<String> list1 = new ArrayList<>(); // concrete class constructor to reach out to the same concrete class
        
        List<String> list2 = new ArrayList<>(); // concrete class constructor to reach out to List interface

        List<String> list3 = new LinkedList<>(); // concrete class constructor to reach out to List interface

//        Object list4 = new ArrayList<>(); //This also works
//        Object list5 = new LinkedList<>(); //This also works

        List<String> myList = new LinkedList<>();
        System.out.println("myList = " + myList); // []

        myList.add("Ali");
        System.out.println("myList = " + myList); // [Ali]
        myList.add("Ayse");
         System.out.println("myList = " + myList); // [Ali, Ayse]

        // LinkedList structural design: LinkedLists have nodes => Head-> node-> node-> Tail
        // Each node consists of two parts: 1. data  2. pointer
        // Head-> [Ali]-> [Ayse]-> Tail
        
        myList.add(1, "Veli");
        System.out.println("myList = " + myList);// [Ali, Veli, Ayse]

        myList.addFirst("Tom");
        System.out.println("myList = " + myList);// [Tom, Ali, Veli, Ayse]
        
        myList.addLast("Emily");
        System.out.println("myList = " + myList); // [Tom, Ali, Veli, Ayse, Emily]


        List<String> classList = new LinkedList<>();
        classList.add("Hulya");
        classList.add("Hasibullah");
        classList.add("Kaleem");

        System.out.println("classList = " + classList); // [Hulya, Hasibullah, Kaleem]

       myList.addAll(classList);
       System.out.println("myList = " + myList); // [Tom, Ali, Veli, Ayse, Emily, Hulya, Hasibullah, Kaleem]

        myList.addAll(1, classList);
        System.out.println("myList = " + myList); // [Tom, Hulya, Hasibullah, Kaleem, Ali, Veli, Ayse, Emily, Hulya, Hasibullah, Kaleem]

         // remove some nodes
        myList.remove(4);
        System.out.println("myList = " + myList); // Ali is removed
        
        myList.remove("Ayse");
        System.out.println("myList = " + myList); // Ayse is removed

        myList.removeAll(classList);
        System.out.println("myList = " + myList); // [Tom, Veli, Emily]

        myList.removeFirst();
        System.out.println("myList = " + myList); // [Veli, Emily]
        myList.removeLast();
        System.out.println("myList = " + myList);  // [Veli]
        /*

        These two methods are available in Deque interface. Not in List interface anymore.
        myList.removeFirstOccurence();
        myList.removeLastOccurence();

        OR
        These two method can be used if you're creating list using concrete class
        like this =>  LinkedList<String> nameList = new LinkedList<>();

        If we declare  list as LinkedList<String> nameList = new LinkedList<>();,
        it will have access to both the removeFirstOccurrence() and removeLastOccurrence() methods.
        This is because the LinkedList class implements both the Deque and List interfaces,
         which means it includes the methods from both these interfaces.

        removeFirstOccurrence(Object o) is part of the Deque interface.
        removeLastOccurrence(Object o) is also part of the Deque interface.
        remove(Object o) is part of the List interface.

         */

        LinkedList<String> nameList = new LinkedList<>();
        nameList.add("Fatma");
        nameList.add("Kemal");
        nameList.add("Junaid");
        nameList.add("Fatma");
        nameList.add("Junaid");
        nameList.add("Fatma");

        System.out.println("nameList = " + nameList);  // [Fatma, Kemal, Junaid, Fatma, Junaid, Fatma]

        nameList.removeFirstOccurrence("Junaid");
        System.out.println("nameList = " + nameList);  // [Fatma, Kemal, Fatma, Junaid, Fatma]


        nameList.removeLastOccurrence("Fatma");
        System.out.println("nameList = " + nameList);   // [Fatma, Kemal, Fatma, Junaid]

         // Example 1: If the number of characters in the given name is more than 4, remove them from the list.
         // Don't use for-each loop

        LinkedList<String> names = new LinkedList<>();
        names.add("Ali");
        names.add("Tom");
        names.add("Alexander");
        names.add("Asye");
        names.add("Natalia");
        names.add("Jeremy");
        names.add("Emily");
        names.add("Hasibullah");
        System.out.println("names = " + names);  // [Ali, Tom, Alexander, Asye, Natalia, Jeremy, Emily, Hasibullah]

        // 1st way
        
        for (int i = 0; i < names.size(); i++)  {

            if (names.get(i).length() > 4) {
                names.remove(names.get(i));
                i--;
            }

        }
        System.out.println("names = " + names); // [Ali, Tom, Asye]
        /*
        This i--; adjustment is necessary because removing an element shifts the remaining elements to the left,
         causing the next element to move into the current index position.
         Without i--, the loop would skip the element that moves into the current position.

         */


        LinkedList<String> names1 = new LinkedList<>();
        names1.add("Anna");
        names1.add("Fatma");
        names1.add("Natalia");
        names1.add("Natalia");
        names1.add("Ali");
        names1.add("Natalia");
        names1.add("Natalia");
        System.out.println("names1 = " + names1);  // [Anna, Fatma, Natalia, Natalia, Ali, Natalia, Natalia]

        for (int i = 0; i < names1.size(); i++) {
            if (names1.get(i).length() > 4 ){
                names1.remove(i);
                i--;
            }
        }
        System.out.println("names1 = " + names1);


    }
}
