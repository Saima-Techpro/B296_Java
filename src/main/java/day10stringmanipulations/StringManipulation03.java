package day10stringmanipulations;

public class StringManipulation03 {
    public static void main(String[] args) {

        /*
        Java has two types of memory: STACK and HEAP

        STACK Memory:
        Primitive data type and references of Non-Primitive data type are stored in Stack.
        Stack memory is faster. But it has limited space as compared to HEAP memory.
        It provides address / reference of the Non-Primitive data type like a map /navigation.
        NOTE: Primitive data types don't have reference


        HEAP Memory:
        Non-Primitive data type is stored in HEAP.
        HEAP memory is like a jungle where variables can be lost. so their reference is kept in STACK
        Dynamically created objects (using 'new' keyword) are stored in HEAP e.g. Scanner object
        so HEAP memory contains values, methods as well as objects.

        STRING POOL:
         When Java sees the same value assigned to another string variable using a string
         literal, it doesn't create a new string object in the heap.
         Instead, it reuses the reference from the String Pool, so both variables point
         to the same object in the pool and have the same reference in the stack.
         However, if a new keyword is used, a new String object is created in the heap.

        NOTE:
        equality operator '==' checks the value as well as reference
        equals() method checks the value ONLY


         */

        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1 == s2); // true
        System.out.println(s1.equals(s2)); // true

        String s3 = "Tom";
        System.out.println(s1 == s3); // false
        System.out.println(s1 != s3); // true
        System.out.println(s1.equals(s3)); // false

        String s4 = new String("Hello");
        System.out.println(s1 == s4);  // false
        System.out.println(s1.equals(s4)); // true

        System.out.println(s1 + " World!");
        s1 = s1 + " World!";
        System.out.println("s1 = " + s1); // Hello World!


    }
}
