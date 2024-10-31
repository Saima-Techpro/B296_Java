package day33lambda;

public class Utils {

    /*
     In Java, the fundamental concept behind creating a "Utils" (utility) class is to gather helper methods related to
    a certain concept or functionality together. These classes usually consist of static methods and are called directly
    via the class name. We add methods for functionality that is not built into Java but is frequently used in our
    projects, and we invoke these methods as needed. We can create new methods that are fit for the purpose.

     */
    // This method print the elements from a variable on the same line with a space between them
    public static void printWithSpace(Object obj){
        System.out.print(obj +  " ");
    }


    // This method is going to provide the last character of the String
    public static char getLastChar(String str){
        return str.charAt(str.length()-1);
    }


    // This method is going to check if the given number is even or not
    public static boolean isNumEven(int num){
        return num%2 == 0;
    }




}
