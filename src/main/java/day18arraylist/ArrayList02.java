package day18arraylist;

import java.util.ArrayList;

public class ArrayList02 {
    public static void main(String[] args) {
        // Arrays, ArrayList, Lists

        // Create an Integer ArrayList
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(22);
        myList.add(5);
        myList.add(39);
        myList.add(14);
        System.out.println("myList = " + myList); // [22, 5, 39, 14]

        // Calculate the number of elements in the given ArrayList
        int numOfElements = myList.size();
        System.out.println("numOfElements = " + numOfElements); // 4

        // How to get specific element from an ArrayList?
        int firstElement = myList.get(0);
        System.out.println("firstElement = " + firstElement); // 22

        int fourthElement = myList.get(3);
        System.out.println("fourthElement = " + fourthElement); // 14

        // Replace a specific element
        // [22, 5, 39, 14]
        // System.out.println(myList.set(1, 7)); // 5 => prints the element that is being replaced
        myList.set(1, 7);
        System.out.println("myList updated = " + myList); // [22, 7, 39, 14]

        // Replace all odd elements from the ArrayList with 10
        // using loops
        // for-each loop
        for (Integer w : myList){

            if (w%2 != 0){ // checking if the elements are odd
                myList.set(myList.indexOf(w), 10);
            }
        }
        System.out.println("myList updated odd elements= " + myList); // [22, 10, 10, 14]


        // Replace all even elements from the ArrayList with 7
        // for loop

        for (int i = 0; i < myList.size() ; i++) {

            if (myList.get(i)%2 == 0 ){  // checking if the elements are even
                myList.set(i, 7);
            }
        }
        System.out.println("myList updated even elements= " + myList); // [7, 7, 7, 7]


    }
}
