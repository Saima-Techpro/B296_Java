package day22stringbuffer;

public class StringBuffer01 {
    public static void main(String[] args) {

        /*
        1. StringBuffer is another class in Java to create Strings.
           StringBuffer was the first class created by Java for Strings. (Java 1.4???)

        2. StringBuffer is very similar to StringBuilder. Both of them create "Mutable" Strings (changeable)
        3. StringBuffer is "multithreaded" whereas StringBuilder is single-threaded. So StringBuilder is faster.
        4. StringBuffer is thread-safe (synchronised); StringBuilder is not thread-safe.

        What is a thread?
               A thread is the smallest unit of a program that can execute independently.
               In single threads, execution is done sequentially (in an order).

        What is multi-threading?
               Multithreading in Java is the process of executing multiple threads concurrently (at the same time). (distribution of labour)

        What is synchronisation?
              Organizing operations in a logical sequence is called "synchronisation".


        We have learned about three classes that create Strings => Strings, StringBuilder, StringBuffer

        1) If an Immutable String is needed ==> String class
        2) For a Mutable String, use StringBuilder or StringBuffer
           a) Use StringBuilder when multi-threading is not needed
           b) Use StringBuffer when multi-threading is required

         */
        StringBuffer sbf = new StringBuffer();
        System.out.println(sbf);
        sbf.append("We are learning StringBuffer.");

        System.out.println(sbf); // We are learning StringBuffer. => data type here is StringBuffer

        String str = sbf.toString();
        System.out.println(str); // We are learning StringBuffer.  => data type here is String

        str = str.toUpperCase();
        System.out.println(str); // WE ARE LEARNING STRINGBUFFER.

        StringBuffer sbf1 = new StringBuffer(str);
        System.out.println("sbf1 = " + sbf1); // WE ARE LEARNING STRINGBUFFER. => data type here is StringBuffer


        StringBuilder sb = new StringBuilder(str);
        System.out.println("sb = " + sb); // WE ARE LEARNING STRINGBUFFER. => data type here is StringBuilder


    }
}
