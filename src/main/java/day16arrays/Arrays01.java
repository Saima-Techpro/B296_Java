package day16arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        // Create an int array of size 5 and print the numbers less than 5

        int numbers[] = {-4, -8, 5, 12, 1};
        System.out.println(Arrays.toString(numbers)); // [-4, -8, 5, 12, 1]

        for (int w : numbers){

            if (w < 5){
                System.out.println(w);
            }
        }

        System.out.println("==== binarySearch() method ====");

        // See if this array has number 9

        /*
        1. binarySearch() method returns the index of the element if it exists in the array
        2. binarySearch() method returns '-' negative sign for the element that doesn't exist in the array
        3. binarySearch() method returns the order of the place/position of that element IF IT EXISTED in that array
        4. binarySearch() method should be used AFTER sort() method

         */

        // Before sorting the array
        // [-4, -8, 5, 12, 1]
        System.out.println(Arrays.binarySearch(numbers, 12)); // 3
        System.out.println(Arrays.binarySearch(numbers, 9)); // -4

        // After sorting the array
        Arrays.sort(numbers);
        System.out.println("after sorting: "+ Arrays.toString(numbers)); // [-8, -4, 1, 5, 12]

        System.out.println(Arrays.binarySearch(numbers, 12));  // 4
        System.out.println(Arrays.binarySearch(numbers, 9));  // -5 => if 9 existed, it would exist at 5th position between 5 and 12
                                                                 // position = index+1


        System.out.println(Arrays.binarySearch(numbers, 2)); //-4 => it would exist at 4th position
        System.out.println(Arrays.binarySearch(numbers, -5)); // -2 => it would exist at 2nd position


        System.out.println("========= Example 2 ===========");

        String letters[] = {"G", "A", "M", "Y", "O" };
        System.out.println(Arrays.toString(letters));  // [G, A, M, Y, O]

        Arrays.sort(letters);
        System.out.println("After sorting: "+Arrays.toString(letters)); // [A, G, M, O, Y]

        // Find the index of "M"
        int indexOfM = Arrays.binarySearch(letters, "M");
        System.out.println("indexOfM = " + indexOfM);  // 2

        /// Find the index of "C"
        int indexOfC = Arrays.binarySearch(letters, "C");
        System.out.println("indexOfC = " + indexOfC); // -2


        // Print the number of words from the given String
        String str = "Java is fun. Learn Java, earn money";
        // System.out.println(str.split(" ").length); // 7
        String words[] = str.split(" "); // split() splits the String and converts it to an Array like =>  {“Java”, “is”, “fun.” “Learn”, “Java,” , “earn”, “money”};

        // To print the Array, we need to use Arrays.toString()
        System.out.println(Arrays.toString(words));  // [Java, is, fun., Learn, Java,, earn, money]
        System.out.println("number of words = " + words.length);  // 7


    }
}
