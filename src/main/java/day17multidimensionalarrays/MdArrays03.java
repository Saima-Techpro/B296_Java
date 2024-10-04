package day17multidimensionalarrays;

import java.util.Arrays;

public class MdArrays03 {
    public static void main(String[] args) {

        // Create an int Multidimensional Array
        // Calculate its min and max value
        // Get the total of min and max


        int[][] numbers = {{24, 5}, {2, 66, 12}, {32, 95, 56, 9}};
        System.out.println(Arrays.deepToString(numbers));
        // [[24, 5], [2, 66, 12], [32, 95, 56, 9]]

        int minValue = numbers[0][0];  // we assume the value at index[0][0] is the minimum value
        int maxValue = numbers[0][0];  // we assume the value at index[0][0] is the maximum value

        for (int[] outerArray: numbers){
            for (int each : outerArray){

               minValue = Math.min(minValue, each); // Math.min() method compares the two values and returns the minimum of the two
                maxValue = Math.max(maxValue, each);


            }
        }
        System.out.println("minValue = " + minValue); // 2
        System.out.println("maxValue = " + maxValue); // 95

        System.out.println("Sum:" + (minValue+maxValue)); // 97


        // Find the sum of all the values from the given Multidimensional Array

        int sum = 0;
        for (int[] outer : numbers){
            for (int each : outer){
                sum += each;
            }
        }
        System.out.println("sum = " + sum);  // 301


    }
}
