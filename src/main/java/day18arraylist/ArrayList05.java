package day18arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList05 {
    public static void main(String[] args) {

        // 3rd way:
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(5);
        list.add(3);
        list.add(2);
        System.out.println("list = " + list); // [7, 5, 3, 2]

        // remove 5 from the list
        list.remove(1);
        System.out.println("list = " + list); // [7, 3, 2]

        // get a specific element
        System.out.println( list.get(2)); // 2  => element at index 2

        // replace the element 7 with 16
        System.out.println(list.set(0, 16)); // prints the number being replaced

        // To see the updated list
        System.out.println("list = " + list); // [16, 3, 2]


        // 4th way of creating a ArrayList
        List<Integer> newList = Arrays.asList(12, 8, 15, 3); // the benefit of creating ArrayList like this is that we can assign the values at the same time
        System.out.println("newList = " + newList);  // [12, 8, 15, 3]

//        newList.remove(1);  // shows error => UnsupportedOperationException
//        System.out.println("newList after removing the element= " + newList);

//       newList.add(20); // shows error => UnsupportedOperationException
//        System.out.println("newList = " + newList);

        System.out.println(newList.get(2));
        newList.set(1, 13);
        System.out.println("newList = " + newList);

        /*
         Notes about Arrays.asList() method
        1) We can use this method to create List. But this doesn't behave the same way as ArrayLists.
           Because asList() method is coming from Arrays class which works as Arrays at the background. (secretly array)
        2) Arrays are fixed size structures that's why we can't use add() and remove() methods with the lists
           that are created by using asList() method.
        3) However, we can still use other methods like set() or size() methods which are available for Lists

        4) We can use this way of creating Lists when we have fix size of elements. We don't need to add/remove
           elements. But we can use other methods that are available for lists.

         */

        int[] arr = new int[3];
        System.out.println("arr = " + Arrays.toString(arr)); // [0, 0, 0]
        arr[0] = 12;
        // Following methods are coming from List interface. They're not available for arrays
        // arr.add();
        // arr.remove();
        // arr.get();
        // arr.set();

        System.out.println("arr = " + Arrays.toString(arr));

        // method call
        // printText("I'm learning method call"); //  can't do method call because it has 'protected' access modifier
                                                // 'protected' access modifier doesn't allow method call across packages if there's no relationship between the classes



    }
}
