package day17multidimensionalarrays;

public class HW {
    public static void main(String[] args) {

        /*
           Write a code to check if a given 2D array is symmetric.
           One of these is symmetric:
               int[][] arr = {{1, 2, 3}, {2, 4, 5}, {3, 5, 6}};
               int[][] brr = {{1, 0, 3}, {2, 4, 5}, {3, 5, 6}};


               Hints:
           1. Symmetry applies to 2D array if the number of rows equal the number of columns.
           2. Compare each element array[i][j] with array[j][i]. If any pair doesn't match,
               the array is not symmetric.

               array[0][1] == array[1][0] should be equal => (2 == 2)
               array[0][2] == array[2][0] should be equal => (3 == 3)
               array[1][2] == array[2][1] should be equal => (5 == 5)


         */

        // Example of a symmetric matrix
        int[][] arr = {
                {1, 2, 3},
                {2, 4, 5},
                {3, 5, 6}
        };

        int rows = arr.length;  // Number of rows
        int cols = arr[0].length; // Number of columns


        // Step 1: Check if the number of rows equal the number of columns (required for symmetry)
        if (rows != cols) {
            System.out.println("the number of rows are not equal to the number of columns");  // non- symmetric
        }

        // Step 2: Check symmetry by comparing elements

        int counter = 0; // to count the number of pairs

        for (int i = 0; i < rows; i++) {  // Iterate over rows
            for (int j = 0; j < cols; j++) {  // Iterate over columns
                // Check if element at (i, j) is equal to element at (j, i)
                if (arr[i][j] != arr[j][i]) {
                    counter++;  // If any pair doesn't match, array is not symmetric
                }
            }

        }

        if (counter == 0){
            System.out.println("The array is symmetric!");
        }else {
            System.out.println("The array is not symmetric!");
        }

    }
}
