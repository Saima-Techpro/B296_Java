package day15arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        /*
        When we create byte, short, int, double, String etc. variables, we can store only SINGLE value at a time.
         Java provides a special structure to store MULTIPLE values in the same variable (container).
         That is called Arrays class.

         1. Arrays can store multiple values.
           e.g. you can store multiple student names in the same variable / container.
         2. Arrays allow to  store multiple values that belong to SAME data type.
           e.g. int array will store only int values
         3. To create array, we need to specify two things =>  a) data type      b) the size
         4. Arrays are faster because they have fix size structure
         5. Arrays use less memory because they have fix size structure
         6. Arrays can store both Primitive data type and object references as well (references of Non-Primitive data type
            such as Strings and Wrapper classes)
         */

        // Create an array of size 5 on int data type and print the sum of the first and the last integer

        // int[] numbers = new int[5];

        int numbers[] = new int[5];
        System.out.println( Arrays.toString(numbers));  // [0, 0, 0, 0, 0]

        Integer numbers1[] = new Integer[5];
        System.out.println(Arrays.toString(numbers1));  // [null, null, null, null, null]

        // NOTE: zero is the default value for Arrays with Primitive data type
        // NOTE: null is the default value for Arrays with Non-Primitive data type (Strings, wrapper classes, objects)

        numbers[1] = 12;
        numbers[0] = 7;
        numbers[2] = 41;
        numbers[4] = 88;
        numbers[3] = 35;
        // numbers[5] = 26; this will show error because numbers array has a fix size of 5; it doesn't allow to add 6th number

        // How tp print an Array?
        System.out.println("numbers = " + numbers);  // [I@a09ee92
        System.out.println(Arrays.toString(numbers));  // [7, 12, 41, 35, 88]

        // How to get the specific value from an array?
        int firstNum = numbers[0];
        // int lastNum = numbers[4]; // hard code for last index
        int lastNum = numbers[numbers.length-1]; // dynamic way for last index

        // sum
        System.out.println("sum = " + (firstNum + lastNum)); // 95


       // Example:  Create an array of cities of size 7 and adds names to this array
        String cities[] = new String[7];
        cities[0] = "London";
        cities[1] = "Manchester";
        cities[2] = "Liverpool";
        cities[3] = "Cambridge";
        cities[4] = "Derby";
        cities[5] = "Carlisle";
        cities[6] = "Bath";

        System.out.println(Arrays.toString(cities)); // [London, Manchester, Liverpool, Cambridge, Derby, Carlisle, Bath]

        // How to print each value one by one?


        // 1st way: For Loop

        for (int i = 0; i < cities.length; i++){
            System.out.println(cities[i]);
//            String cityName = cities[i];
//            System.out.println("cityName = " + cityName);

        }

        System.out.println("========================");
        // 2nd way: for each loop -> This is the enhanced version of For Loop
        //                           It is usually used with Arrays and Collections
        /*
                  syntax
        for (returnDataType nameOfTemporaryContainer : nameOftheVariable){
            loop body to execute codes
        }

        This loop keeps iterating until it reaches the last value
         */

                          // [London, Manchester, Liverpool, Cambridge, Derby, Carlisle, Bath]

        for (String temp : cities){
            System.out.println(temp);
        }

        System.out.println( "============================");
        // Example: Create a double array and find the sum of all values
        double prices[] = new double[5];
        prices[0] = 12.68;
        prices[1] = 24.90;
        prices[2] = 9.99;
        prices[3] = 78.50;
        prices[4] = 10.99;

        System.out.println(Arrays.toString(prices));  // [12.68, 24.9, 9.99, 78.5, 10.99]

        double sum =  0;

        for (double w : prices){
            sum = sum + w;
        }
        System.out.println("sum = " + sum);


    }
}
