package day16multidimensionalarrays;

import java.util.Arrays;

public class MdArrays01 {
    public static void main(String[] args) {

        /*

        Multi Dimensional Arrays means arrays within an array. (array of arrays).
        The most common used in Java in Two dimensional array (2D)

         */

        // How to create Multidimensional Array?
        // 1st way: non-flexible

        int[][] arr = new int[3][2];  // [3] => 3 outer arrays ; [2] means an inner arrays with the size of 2

        // How to print?
        System.out.println(Arrays.toString(arr)); // [[I@a09ee92, [I@30f39991, [I@452b3a41]

        System.out.println(Arrays.deepToString(arr)); // [[0, 0], [0, 0], [0, 0]]


        // How to assign values to this 2D Array?

        arr[0][0]= 8;
        arr[0][1] = 7;
        // arr[0][2] = 9; // ArrayIndexOutOfBoundsException

        arr[1][0] = 23;
        arr[1][1] = 56;
        arr[2][0] = 2;
        arr[2][1] = 14;

         // arr[3][0] = 55;  This is not possible because while creating arr, we declared the size of outer array as 3

        System.out.println(Arrays.deepToString(arr)); // [[8, 7], [23, 56], [2, 14]]

        // How to print a specific element from a 2D Array?

        System.out.println("Fourth element:  " + arr[1][1]); // 56
        System.out.println("Second element:  " + arr[0][1]); // 7


        // Flexible way for creating Multidimensional Array
        String languages[][] = new String[4][];

        languages[0] = new String[]{"English" , "Chinese"};
        languages[1] = new String[]{"Java", "Python", "C++", "SQL"};
        languages[2] = new String[]{"Spanish", "Turkish", "French"};
        languages[3] = new String[] {"JavaScript"};


        System.out.println(Arrays.deepToString(languages));  // [[English, Chinese], [Java, Python, C++, SQL], [Spanish, Turkish, French], [JavaScript]]

        System.out.println("======================");

        // How to print each inner array one by one from a Multidimensional Array?
        // [[English, Chinese], [Java, Python, C++, SQL], [Spanish, Turkish, French], [JavaScript]]

        for (String[] innerArray : languages){

            if (innerArray == null){
                continue;
            }
            System.out.println(Arrays.toString(innerArray));
        }

        System.out.println("======================");

        // How to print each element from the inner array one by one from a Multidimensional Array?
        // [[English, Chinese], [Java, Python, C++, SQL], [Spanish, Turkish, French], [JavaScript]]

        for (String[] innerArray : languages){

            if (innerArray == null){
                continue;
            }

            // System.out.println(Arrays.toString(innerArray));
            // [English, Chinese]
            // [Java, Python, C++, SQL]
            // [Spanish, Turkish, French]
            // [JavaScript]]

            for (String eachElement : innerArray){
                System.out.println(eachElement);
            }

        }

        // 3rd way => most FLEXIBLE WAY

        String[][]  names = {{"Tom", "Ali"}, {"Aisha", "Junaid", "Veli", "John"}, {"Henok"}, {"Mel", "Judi", "Jenifer"}};

        System.out.println(Arrays.deepToString(names)); // [[Tom, Ali], [Aisha, Junaid, Veli, John], [Henok], [Mel, Judi, Jenifer]]

        // Arrays.toString() => used only to printing on the console. it does NOT change the data type




    }
}
