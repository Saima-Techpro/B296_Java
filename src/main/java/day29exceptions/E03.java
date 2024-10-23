package day29exceptions;

public class E03 {
    public static void main(String[] args) {

        // Get a specific character from the given String

        String s = "Java is easy";

        // method call
        getChar(s , 0); // J
        getChar(s , 3); // a
        getChar(s , 12); // StringIndexOutOfBoundsException is thrown when a non-existing index is asked for
    }


    public static void getChar(String s , int idx){
        try {
            char ch = s.charAt(idx);
            System.out.println("ch = " + ch);
        } catch (StringIndexOutOfBoundsException e){

            System.out.println("Use index according to the length of the String");
            System.err.println("Don't use index out of bound"); // This message will be printed in red
            e.printStackTrace(); // when developers want to see the actual error
            System.out.println("Hello again!!!");


        }
    }
}
