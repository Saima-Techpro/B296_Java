package day16arrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        // INTERVIEW QUESTION
        // Move all zero elements to the end of array from a given array

        int[] arr = {0, 2, 5, 0, 12, 17,0, 0, 21};  // => {2, 5, 12, 17, 0, 0, 0}

        System.out.println(Arrays.toString(arr)); // [0, 2, 5, 0, 12, 17, 0, 0, 21]

        // int[] brr = new int[9]; // hard coded
        // [0, 2, 5, 0, 12, 17, 0, 0, 21]
        int[] brr = new int[arr.length]; // dynamic way to get declare the size same as arr

        int index = 0;

        for (int w : arr){
            if (w !=0){
                 brr[index] = w;
                 index++;
            }
            // System.out.println(Arrays.toString(brr));
        }
        System.out.println(Arrays.toString(brr)); // [2, 5, 12, 17, 21, 0, 0, 0, 0]













    }
}
