package day09stringmanipulations;

public class StringManipulation01 {
    public static void main(String[] args) {

        /*
        substring():
        There are two types of substring() methods:
        substring(startingIndex) => single parameter => returns the value at the given index and the rest of the whole String
        substring(startingIndex, endingIndex) => two parameters => returns the value between the starting index and ending index

        starting Index => inclusive => means the value at this index is included
        ending Index => exclusive => means the value at this index is NOT included

        NOTE: index starts at zero

        contains() method looks for exact match of the value in a String

        There are twy types of startsWith() methods:
        startsWith(single parameter) => checks if the String starts with the given word/letter (index 0)
        startsWith("word/letter" ,  index) => two parameters =>
        checks if the String starts with the given word/letter AFTER skipping the given index

         */

        String str = "Learn Java, earn money. Enjoy your life!";

        // Print the first word from the given String
        String firstWord=str.substring(0,5);
        System.out.println("firstWord = " + firstWord);


        // Print the word 'Java' from the given String
        String secondWord = str.substring(6,10);
        System.out.println("secondWord = " + secondWord);


        // Print the remaining String AFTER the word 'earn'
        // "Learn Java, earn money. Enjoy your life!"

        // 1st way:
        String remainingString = str.substring(17, 40); // Hard coding
        System.out.println("remainingString = " + remainingString); // money. Enjoy your life!

        String remainingStringDynamic = str.substring(17, str.length()); // Dynamic coding
        System.out.println("remainingStringDynamic = " + remainingStringDynamic); // money. Enjoy your life!


        // 2nd way:
        String remainingStr = str.substring(17);
        System.out.println("remainingStr = " + remainingStr); // money. Enjoy your life!


        // "Learn Java, earn money. Enjoy your life!"
        // Check if the String has the word 'Enjoy'
        boolean isExist = str.contains("Enjoy");  // contains() looks for exact match of the value
        System.out.println("isExist = " + isExist); // true

        /*
        There are twy types of startsWith() methods:
        startsWith(single parameter) => checks if the String starts with the given word/letter (index 0)
        startsWith("word/letter" ,  index) => two parameters =>
        checks if the String starts with the given word/letter AFTER skipping the given index
         */

        //
        // "Learn Java, earn money. Enjoy your life!"

        boolean isStart = str.startsWith("Learn");
        System.out.println("isStart = " + isStart); // true
        System.out.println(str.startsWith("money", 17)); // true

        //
        boolean isEnd = str.endsWith("!");
        System.out.println("isEnd = " + isEnd); // true



    }
}
