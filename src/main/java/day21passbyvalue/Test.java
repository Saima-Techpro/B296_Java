package day21passbyvalue;

import java.util.Date;
public class Test {
    public static void main(String[] args) {

        int price = 10; // instance variable
        System.out.println("Original price = " + price); // 10
        // method call
        m1(price);
        System.out.println("price after method call : "+ price); // 10



        Date date = new Date(1234567);  // initialising Date object

        System.out.println(date.getTime()); // 1234567
        // method call
        m1(date); // passes the copy of reference of the object
        System.out.println("after method call: "+date.getTime()); // 7654321
    }

    //custom method
    public static void m1(Date date) {
        // date.setTime(7654321);

        date = new Date();
    }

    public static void m1(int a) {
        a = 7654321;

    }
}