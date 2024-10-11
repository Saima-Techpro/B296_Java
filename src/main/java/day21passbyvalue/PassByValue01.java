package day21passbyvalue;

import java.util.ArrayList;
import java.util.Arrays;

public class PassByValue01 {

    public static void main(String[] args) {

        /*
                 Pass By Value
           - When we create a variable and pass it through a method, Java creates a copy of that variable and
             uses that copy for further manipulation.
           - This is called Pass By Value.
           - Through this rule, Java protects the original value of the variables. If this property didn't exist,
             the value of the variable would be updated with every method call and that's not good.
           - Java applies this Pass By Value property on primitives and objects.

              int price = 100;
              Original Price of a shirt is 100 => there's 10% discount for seniors, 10% discount for students,
              20% discount for veterans etc.
            - Pass By Reference => Java does not allow "Pass By Reference". Because with address/ reference, original
              values will be updated/can be changed which makes the direct data manipulation possible.

              EXCEPTION TO THIS RULE:
              Arrays, ArrayList and StringBuilder allow the direct data manipulation (because if mutability)

         */
        String str = "Java";
        System.out.println("Original = " + str); // Java

        int price = 100;
        System.out.println("Original price = " + price);

        // method call
        modifyString(str); // JAVA
        System.out.println("str after method call = " + str); //Java

        modifyInt(price);
        System.out.println("price after method call = " + price);


        int[] arr = {1, 2, 3};
        System.out.println("Original Array: " + Arrays.toString(arr)); // [1, 2, 3]

        // method call
        modifyArray(arr);
        System.out.println("Array after method call: " + Arrays.toString(arr)); // [1, 7, 9]



    }


    // Create a method to modify the string
    public static void modifyString(String s){
        s = s.toUpperCase();
        System.out.println("Modified string: " + s);
    }

    public static void modifyInt(int a){
        a = 20;
        //System.out.println("a = " + a);
    }

    public static void modifyArray(int[] a){
     a[1] = 7;
     a[2] = 9;
        System.out.println("method call = " + Arrays.toString(a));
    }

}
