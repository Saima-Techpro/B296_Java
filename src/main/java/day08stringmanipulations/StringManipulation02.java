package day08stringmanipulations;

public class StringManipulation02 {
    public static void main(String[] args) {

        /*
                 ******** Notes about REGULAR EXPRESSIONS ********

            To define a group of data, we use Regular Expressions in Java. short  name => REGEX
            REGEX are used with replaceAll() method
            There are many REGEX, but we will learn the most commonly used ones:

            //inclusive Regex
                1) All the letters ==> [a-zA-Z]
                2) All lowercase letters ==> [a-z]
                3) All uppercase letters ==> [A-Z]
                4) All digits ==> [0-9]
                5) All the letters and digits ==> [a-zA-Z0-9]
                6) All punctuations ==> \\p{Punct}
                7) All the vowels ==> [aeiouAEIOU]
                8) All random characters like a, x, y  ==> [axy]
                9) A given range e.g. From A - G and a - g ==> [A-Ga-g]


            //exclusive Regex ==> we use "^" to exclude defined group of data....
            //It means "other than" or "except"

               1) All the characters other than digits ==> [^0-9]
               2) All the characters other than lowercase letters ==> [^a-z]
               3) All the characters other than letters ==> [^a-zA-Z]
               4) All the characters other than space ==> [^ ]

             // Following Regex are used without square bracket
               1) Only space character ==> \\s
                   \\s+  is used for multiple spaces
                   replace multiple spaces with single space => replaceAll("\\s+", " ")
               2) Except space character ==> \\S
               3) Only digits ==> \\d
               4) Except digits ==> \\D
               5) Only punctuation=> \\p



         */


        String str = "   Java is an OOP language   ";
        System.out.println("Total chars: " + str.length()); // 29

        // Remove all the spaces from the String and count the number of characters left
        // 1st way:
        String strWithoutSpaces = str.replaceAll("\\s", ""); // \\s  => all spaces
        System.out.println("strWithoutSpaces = " + strWithoutSpaces);  // JavaisanOOPlanguage
        System.out.println("Total chars after removing spaces: " + strWithoutSpaces.length()); // 19

        // 2nd way:
        String strWithoutSpaces1 = str.replaceAll("[^a-zA-Z]", "");  // [^a-zA-Z] will replace everything like numbers, characters, signs, spaces etc. and keep alphabets only
        System.out.println("strWithoutSpaces1 = " + strWithoutSpaces1);  // JavaisanOOPlanguage
        System.out.println(strWithoutSpaces1.length()); // 19



        // Remove all the alphabets from the String and count the number of characters left
        String strWithoutAlphabets = str.replaceAll("[a-zA-Z]", "");
        System.out.println("strWithoutAlphabets = " + strWithoutAlphabets);

        System.out.println(strWithoutAlphabets.length()); // 10

        System.out.println("=====================================");

        String s = "Learn Java  20 #@!*& 87 Earn money ";

        // Replace the word 'money' with 'dollars'

        System.out.println(s.replaceAll("money", "dollars"));


        // Remove letter 'a' from the string
        System.out.println(s.replaceAll("a", ""));


        // Remove special characters from the string one by one
        System.out.println(s.replaceAll("#", ""));
        System.out.println(s.replaceAll("!", ""));
        System.out.println(s.replaceAll("&", ""));
        System.out.println(s.replaceAll("@", ""));
       System.out.println(s.replaceAll("\\*", ""));

        // Remove special characters from the string all at once
        System.out.println(s.replaceAll("[#!&*@]", ""));

        s = s.replaceAll("[#!&*@]", "");
        System.out.println("s after removing all special characters = " + s); // Learn Java  20  87 Earn money

        // Replace all numbers with *
        String sWithStarSign = s.replaceAll("[0-9]", "*");
        System.out.println(sWithStarSign); // Learn Java  **  ** Earn money


        // Remove all numbers from the String and calculate the characters left

        String sWithoutNumbers = s.replaceAll("[0-9]", "");
        System.out.println("sWithoutNumbers = " + sWithoutNumbers);  // Learn Java     Earn money
        System.out.println(sWithoutNumbers.length()); // 26

        // Replace spaces with ;
        String s2 = sWithoutNumbers.replaceAll("\\s+", " ");
        System.out.println(s2);  // Learn Java Earn money
        s2 = s2.replaceAll("Java", "Java;");
        System.out.println("s2 updated = " + s2); // Learn Java; Earn money


        String string = "Regular expressions in Java !@#$%<>+/ 56 &* are very special.";
        String stringUpdated = string.replaceAll("[^a-zA-Z ]", "");
        // [^a-zA-Z ] means remove everything except the ones that I'm giving you inside the [] => all lowercase, all uppercase letters and space
        // ^ sign means except
        System.out.println("stringUpdated = " + stringUpdated);


        // Remove punctuation marks only
        String stringWithPunc = string.replaceAll("\\p{Punct}", "");
        System.out.println("stringWithPunc = " + stringWithPunc);



    }

}
