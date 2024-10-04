package day17multidimensionalarrays;

import java.util.Arrays;

public class MdArrays05 {
    public static void main(String[] args) {

        // Find the maximum (greatest) element from a given MultiDimensional Array
        // {{4, 7},{-9,4,8},{15,36,-12,9},{67,23,88}}

        int[][] num= {{4, 7},{-9,4,8},{15,36,-12,9},{67,23,88}};

        // 1st way:
        int value = 0 ;

        for (int[] inner : num){
            for (int w : inner ){

                if (value < w ){
                    value=w ;
                }
            }

        }
        System.out.println(value); // 88

//        Arrays.sort(num);  doesn't work with 2D Arrays
//        System.out.println("Arrays.deepToString(num) = " + Arrays.deepToString(num));

        // 2nd way:
        int maxValue = num[0][0];
        for (int[] outerArray : num) {
            for (int innerArray : outerArray) {
                maxValue = Math.max(maxValue, innerArray);
            }
        }
        System.out.println("maxValue = " + maxValue); // 88


    }
}
