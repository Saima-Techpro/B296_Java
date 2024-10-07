package day18arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList04 {
    public static void main(String[] args) {

        // Type code to check if the ArrayList doesn't have any element other than space
        // or it doesn't have any element at all
        // [] is acceptable ; [ , , ] is acceptable but [a] is not acceptable

        // 3rd way of creating ArrayList
        // using List interface
        List<String> list1= new ArrayList<>();
        System.out.println("list1 = " + list1); // []
        list1.add(" ");
        list1.add(" ");
        list1.add(" ");
        list1.add("a");
        System.out.println("list1 = " + list1); // [ ,  ,  ] ; if we add 'a'  => [ ,  ,  , a]


       //  removeAll()  method is used to remove multiple elements after checking a given condition

        List<String> list2 = new ArrayList<>();
        list2.add(" ");
//        list2.add("a");
//        list2.add("y");
//        list2.add(",");
//        list2.add("1");

        list1.removeAll(list2); // check list1, remove all those elements which are similar to the elements in list2

        System.out.println("list1 after removing spaces = " + list1); // []

        if (list1.isEmpty()){
            System.out.println("The list is empty");
        }else {
            System.out.println("The list is not empty or it contains elements other than spaces");
        }

        /*
        NOTE: only those elements will be removed from list1 that match with the elements from list2;
              other elements in list2 which don't exist in list1, removeAll() method doesn't bother about them
         */

    }
}
