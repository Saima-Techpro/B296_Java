package day18arraylist;

import java.util.ArrayList;

public class HW {
    public static void main(String[] args) {

        /*

         Task 1:
        Write a Java method that takes an ArrayList<String> as input and returns a new
        ArrayList<String> with the elements in reverse order.
        You are not allowed to use any built-in reverse method.
         */

        // Create a String ArrayList and assign values
        ArrayList<String> fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Cherry");
        fruitList.add("Date");
        fruitList.add("Orange");

        System.out.println("Original fruitList: " + fruitList);

        // Create a new ArrayList to hold the reversed elements
        ArrayList<String> reversedList = new ArrayList<>();

        // Traverse the list from the end to the beginning
        for (int i = fruitList.size() - 1; i >= 0; i--) {
            reversedList.add(fruitList.get(i));
        }
        // Print the reversed list
        System.out.println("Reversed list: " + reversedList);

        // 2nd way
        for (String w : fruitList) {
            reversedList.add(0, w);
        }

        // Print the reversed list
        System.out.println("Reversed list: " + reversedList);



         /*
         Task 2:
        Write a Java method that takes an ArrayList<Integer>  and returns the element that appears
        the most times in the list. If there are multiple elements with the same highest frequency,
        return the first one that appears in the list.

        Real life implementation:
        Imagine you are running a customer survey for a new product, and customers are rating the product
        on a scale of 1 to 5. You’ve collected the survey responses and stored the ratings in an ArrayList<Integer>.
        Now, you want to find out which rating was given most frequently, so you can understand the general
        sentiment of your customers.
         */

        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(6);
        list.add(3);
        list.add(4);
        list.add(6);
        list.add(2);
        list.add(6);
        list.add(4);
        list.add(6);
        list.add(3);

        System.out.println("list = " + list);

        int mostFrequent = list.get(0); // Assume the first element is the most frequent
        int maxCount = 0;

        // Outer loop to go through each element

        for (int i = 0; i < list.size(); i++) {
            int currentElement = list.get(i);
            int count = 0;

            // Inner loop to count occurrences of currentElement
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).equals(currentElement)) {
                    count++;
                }
            }

            // Update mostFrequent if currentElement has a higher frequency
            if (count > maxCount) {
                maxCount = count;
                mostFrequent = currentElement;
            }
        }
        System.out.println("mostFrequent = " + mostFrequent);

    }


}
