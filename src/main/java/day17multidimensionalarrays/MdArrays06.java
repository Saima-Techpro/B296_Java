package day17multidimensionalarrays;

import java.util.Arrays;

public class MdArrays06 {
    public static void main(String[] args) {

        // Create a 2D array of integers and print the sum of elements for each row separately

        int[][] numbers = {{5,4,3}, {8,2}, {3, 7, 9}};

        System.out.println(Arrays.deepToString(numbers)); // [[5, 4, 3], [8, 2], [3, 7, 9]]


        // [[5, 4, 3], [8, 2], [3, 7, 9]]


        // int sum = 0;  we created sum variable outside (class variable) the nested loop previously to get the total sum of ALL values
        int rowNum = 0;

        for (int[] outer : numbers){

            int sum = 0; // (local variable) By placing sum variable here, we are limiting its scope and making it available for nested loop only

            for (int each : outer){

                sum += each;
            }

            rowNum++;
            System.out.println("Sum of "+rowNum+ " row: " + sum);
        }




    }
}
