package day18arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList01 {
    public static void main(String[] args) {

       /*
          What is ArrayList?
          1. ArrayList is a dynamic structure to store multiple values/elements of the same data type.
          2. We don't need to mention the size while creating the ArrayList. It automatically
              adjusts the size of the variable/container when we add / remove the elements.
          3. ArrayLists cannot store Primitives(byte, short, int, double etc.). They store
             references (Non-Primitives like Strings and Wrapper classes)

             DIFFERENCES BETWEEN ARRAYS and ARRAYLIST?
          a) Arrays  are fixed size, but ArrayLists are not. (They're flexible, adjusts the size automatically)
          b) Arrays can Primitives, ArrayLists store Non-Primitives
          c) Arrays are faster than ArrayLists
          d) Arrays use less memory than ArrayLists
          e) Arrays don't allow reindexing; ArrayLists allow reindexing

          Real life example where we can use ArrayList?
          Shopping list

          So which one is better?
          - It really depends on the task/purpose.
          - If you're creating a variable to store static data (that's fixed/known), use Arrays
          - If you're creating a variable to store dynamic data (that's changing), use ArrayLists


        */

//        int[] nums = new int[4];
//        System.out.println("Arrays of nums = " + nums); // Ljava.util.Arrays;@a09ee92
//        System.out.println("Arrays of nums = " + Arrays.toString(nums)); // [0, 0, 0, 0]

        // How to create an ArrayList?
        // 1st way:
        // ArrayList<Integer>  ages = new ArrayList<Integer>(); // Java 6 and earlier


        // 2nd way:
        ArrayList<Integer>  ages = new ArrayList<>(); // Java 8 onwards
        System.out.println("ArrayList of ages = " + ages);  // []


        // How to add elements to an Arraylist?
        ages.add(4);
        ages.add(9);
        ages.add(6);
        System.out.println("ages = " + ages);  // [4, 9, 6]

        // Reindexing
        ages.add(1, 21);

        System.out.println("ages = " + ages); // [4, 21, 9, 6]

        // Add an element between 9 and 6
        ages.add(3, 15);
        System.out.println("ages = " + ages); // [4, 21, 9, 15, 6]

        // Add 10 at the of the ArrayList
        ages.add(10);
        System.out.println("ages = " + ages); // [4, 21, 9, 15, 6, 10]

        ages.addLast(25);
        System.out.println("ages = " + ages); // [4, 21, 9, 15, 6, 10, 25]

        // Add an element in the beginning of the ArrayList
        ages.addFirst(1);
        System.out.println("ages = " + ages); // [1, 4, 21, 9, 15, 6, 10, 25]

        // Add the given ArrayList into ages list

        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(45);
        grades.add(70);
        grades.add(85);
        System.out.println("grades = " + grades); // [45, 70, 85]
//        System.out.println(ages.addAll(grades)); // true
//        System.out.println("ages after adding the grades = " + ages); // [1, 4, 21, 9, 15, 6, 10, 25, 45, 70, 85]

        System.out.println(ages.addAll(2, grades)); // true
        // boolean isAdded = ages.addAll(2, grades);
        System.out.println("ages after adding the grades = " + ages); // [1, 4, 21, 45, 70, 85, 9, 15, 6, 10, 25]


    }
}
