package day08stringmanipulations;

public class StringManipulation01 {
    public static void main(String[] args) {

      /*
      String is Non-primitive data type.
      It has values as well as methods.
      We use "" to declare the values in Strings.
      Strings can store text, alphabets, numbers, characters, signs etc.
       */

        String str = "Java is easy";
        System.out.println("Lower Case:  " + str.toLowerCase());
        System.out.println("Upper Case: " + str.toUpperCase());

        System.out.println("****** Concatenation ******");
        String str1 = "I love Java";


        /*
        Concatenation:
        - The process of joining teo Strings together.
        - There are two ways to do that:
           1. String + String  => We can add different symbols like = , : . etc. while joining the strings
           2. concat() method  => We can't do that in this way concatenation

        NOTE: It's always recommended to use methods if they're provided by Java.

         */

        //1st way:

        System.out.println("Concatenation with addition sign: " + str +". " + str1 + "."); // Java is easy. I love Java.

        //2nd way:
        //String concatenatedStr = str.concat(str1);
        // System.out.println("concatenatedStr = " + concatenatedStr); // Java is easyI love Java

        String str2 = "I'm learning Java";
        String concatenatedStr = str.concat(str1).concat(str2);
        System.out.println("concatenatedStr = " + concatenatedStr); // Java is easyI love Java

        // Check the length of the String and calculate total number of characters in that String


        // length() method counts the number of characters ( letter, numbers, special characters, signs etc. INCLUDING SPACES)
        // String str = "Java is easy";

        int numOfChars = str.length();
        System.out.println("length of str = " + numOfChars); // 12


        // Get the first and the last character from the String
        // chartAt() method returns a SINGLE character from the given index

        // String str = "Java is easy";

        char firstChar = str.charAt(0);
        System.out.println("firstChar = " + firstChar); // J

        char lastChar = str.charAt(11);  // HARD CODING  => If your code doesn't work for all/different values
        System.out.println("lastChar = " + lastChar); // y

        int lastIndex = str.length()-1;
        System.out.println("lastIndex = " + lastIndex);

        char lastCharDynamic = str.charAt(str.length()-1);  // Dynamic coding => If your code works for all/different values
        System.out.println("lastCharDynamic = " + lastCharDynamic); // y


        // equals() method is used to check the equality of two Strings
        // It always looks for EXACT match
        // equals() method returns boolean
        // equalsIgnoreCase() ignores the lower or uppercase, and then checks for equality

        //  String str = "Java is easy";

        String s = "java is easy";
        System.out.println("Is equal? " + str.equals(s)); // false
        System.out.println("equalsIgnoreCase?  " + str.equalsIgnoreCase(s)); // true

        // trim() method for Strings
        // It removes all spaces from the beginning and th end of the given String.
        // NOTE: It does NOT remove spaces from between the characters/words/letters etc.

        String s2 = "    There are 20 of us learning Java  . The instructor is super fast     ";

        System.out.println("Total no. of characters before trimming: " + s2.length()); // 73
        System.out.println("last character before trimming: " + s2.charAt(s2.length() - 1)); // space

        s2 = s2.trim();
        System.out.println("s2 = " + s2);  // "There are 20 of us learning Java  . The instructor is super fast"

        System.out.println("Total no. of characters after trimming: " + s2.length()); // 64
        System.out.println("last character after trimming: " + s2.charAt(s2.length() - 1)); // t



    }
}
