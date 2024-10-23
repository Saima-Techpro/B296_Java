package day29exceptions;

public class E05 {
    public static void main(String[] args) {

        /*
        Can we use more than one catch blocks?
        Yes, we can.

        We can use as many catch blocks as we want after try block. The order doesn't matter.

        EXCEPT when it comes to Exception class which is the parent class of all exceptions.
        We can NOT use Exception class first and other exceptions later. Java starts complaining.
        But we can use Exception class after any/all other exceptions.
         */

        // Get a specific character from the given String

        String s = "Java is not easy";
        int a = 20;
        int b = 0;

        // method call
        getChar(s, a , b);
        System.out.println("==================");
        getCharFromString(s, a, b);
    }

    public static void getChar(String s , int a, int b){
        try {
            int idx = a / b;
            char ch = s.charAt(idx);
            System.out.println("ch = " + ch);
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Index can't be greater than the length of String which is " + (s.length()-1));

        } catch (ArithmeticException e){
            System.out.println("Can't divide by zero");
            e.printStackTrace();
        }
    }


    public static void getCharFromString(String s , int a, int b){
        try {
            int idx = a / b;
            char ch = s.charAt(idx);
            System.out.println("ch = " + ch);
        }  catch (Exception e){
            System.out.println("Index can't be greater than the length of String which is " + (s.length()-1));
            System.out.println("Can't divide by zero");
            System.out.println("This is the parent class taking care of ALL types of exceptions");
        }
    }











}
