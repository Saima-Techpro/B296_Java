package day17multidimensionalarrays;

import java.util.Arrays;

public class MdArrays04 {
    public static void main(String[] args) {

       // Convert a Multidimensional Array into a single array
       // [[5, 4, 6], [8, 3], [1, 7, 9]] => [5, 4, 6, 8, 3,1, 7, 9]


       int[][]  numbers = {{5, 4, 6}, {8,3}, {1, 7, 9}};
        System.out.println(Arrays.deepToString(numbers)); // [[5, 4, 6], [8, 3], [1, 7, 9]]

        // step 1: Find out how many elements are there in 2d array. (loop + length)

        int totalNumOfElements = 0;

        for (int[] w : numbers){
            totalNumOfElements = totalNumOfElements+ w.length; // 8
        }
        System.out.println("totalNumOfElements = " + totalNumOfElements);

        // Step 2: Use this totalNumOfElements to declare the size of new empty single array
        // (Remember arrays are fixed size,so we need to declare the size while creating a new array object)

         int[] singleArray = new int[totalNumOfElements];
        System.out.println(Arrays.toString(singleArray)); // [0, 0, 0, 0, 0, 0, 0, 0]

        // Step 3: Using nested for-each loop, bring the elements/values out of 2D array and assign them to single array

        // [[5, 4, 6], [8, 3], [1, 7, 9]]

        int index = 0;

        for (int[] outer: numbers){
            for (int each : outer){
                singleArray[index] = each;
                index++;
            }
        }

        System.out.println("singleArray = " + Arrays.toString(singleArray)); // [5, 4, 6, 8, 3, 1, 7, 9]


    }
}
