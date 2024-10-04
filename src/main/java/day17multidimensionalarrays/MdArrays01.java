package day17multidimensionalarrays;

import java.util.Arrays;

public class MdArrays01 {
    public static void main(String[] args) {
        /*
        1.	 A multidimensional array is an array of arrays.
        2.	 In a 2D array, data is stored in rows and columns, similar to a table or matrix.
        3.	Java does not limit the number of dimensions; you can have arrays of any depth (e.g., 3D arrays, 4D arrays, etc.).
        4.	Arrays can be jagged/ragged, meaning the inner arrays can have different sizes.

                  Memory allocation:
            - Multidimensional arrays are stored in HEAP memory. (objects, references)
            - Memory usage of multidimensional arrays will depend on number of rows, columns and data type.
            - A ragged multidimensional array (flexible ones) have even more varying use of memory because
              their values in the inner arrays can be different.
         */


        // Create a multidimensional array of 3 rows and flexible columns of String data type and
        // concatenate all the elements.

        String str[][] = {
                {"Java", "is", "a", "programming", "language."},
                {"I", "love", "Java."},
                {"Just", "kidding!!"}};

        System.out.println(Arrays.deepToString(str)); // [[Java, is, a, programming, language.], [I, love, Java.], [Just, kidding!!]]


        String result = ""; // To store / concatenate each element coming out from multidimensional array

        for (String[]  outerArray : str){
            // System.out.println(Arrays.deepToString(outerArray));
            for (String eachElement : outerArray){
                // System.out.println( eachElement);

                result += eachElement + " ";
            }

        }

        System.out.println("result = " + result); // Java is a programming language. I love Java. Just kidding!!

        // Is it possible to change data type from String[] to simple String?
        // Yes

        String names[] = {"Emina", "Zara", "Ali", "Veli"};
        System.out.println(Arrays.toString(names)); // [Emina, Zara, Ali, Veli]

        // change it to simple String
        String namesStr = String.join("," , names);
        System.out.println(namesStr); // Emina,Zara,Ali,Veli

        // Does this String.join() method work for multidimensional array?
        // No

       //  String simpleString = String.join(str); // str is a multidimensional array

        // NOTE: for multidimensional arrays, we will need to use loops


    }
}
