package day09stringmanipulations;

public class HW {
    public static void main(String[] args) {


        // Task 1: Type code to find order number of last occurrence of the word "Java"
        String str = "I like to study Java. Learn Java, earn money. Java is OOP language. Java is easy!";

        int wordOccurrence = str.lastIndexOf("Java");
        System.out.println("wordOccurrence = " + wordOccurrence); //68

        int count = str.substring(0, wordOccurrence).split("Java").length;
        System.out.println(count); //4


        // Task 2:   Type code to check if the given letter is unique in the String
        String s = "Hello World"; //H , e and o are unique, but l is repeated so it's not unique
        // Miami => the only unique letter is a

        if (s.indexOf('o') == -1){
            System.out.println("The given letter doesn't exist");

        }  else if (s.indexOf('o') == s.lastIndexOf('o')){
            System.out.println( "The given letter is unique. ");
        } else {
            System.out.println("The given letter is not unique.");
        }





    }
}
