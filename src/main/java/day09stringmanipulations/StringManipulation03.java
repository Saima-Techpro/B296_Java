package day09stringmanipulations;

public class StringManipulation03 {
    public static void main(String[] args) {

        /*

        charAt() method returns single character at the given index => char data type
        substring() method returns String at the given index => String data type
        indexOf() method returns the INDEX of the SINGLE character of a given String => int data type

         */

        String str = "Java is an OOP language";
        int indexOfO = str.indexOf("OOP");
        System.out.println("indexOfO = " + indexOfO); // 11  => returns the index of the first letter of the given String

        // Example: Get the domain name from the given email and print it on the console
        String email = "abc@gmail.com";

        // 1st way:
        int startIndex = email.indexOf("@")+1;  // 3+1
        System.out.println("startIndex = " + startIndex); // 4

        // fullDomainName
        String fullDomainName = email.substring(startIndex);
        System.out.println("fullDomainName = " + fullDomainName); // gmail.com

        //DomainName without .com
        int endingIndex = email.indexOf(".");
        System.out.println("endingIndex = " + endingIndex);  // 9
        String domainName = email.substring(startIndex, endingIndex);
        System.out.println("domainName = " + domainName); // gmail


        // 2nd way:
        // String email = "abc@gmail.com";
        String fullDomainName1 = email.split("@")[1];
        System.out.println("fullDomainName1 = " + fullDomainName1);  // gmail.com

        // OR

        String domainNameWithoutCom = email.split("@")[1].split("\\.")[0];
        System.out.println("domainNameWithoutCom = " + domainNameWithoutCom); // gmail

        System.out.println(email.split("a")[2]); // il.com
        /*
        split() splits the given String and returns String Array (will learn later)

        NOTE: if the given letter/sign in split() method occurs more than once, split() method
              cuts the String wherever it sees the given letter/sign => splits the String on
              all occurrences of that letter/sign.
              Like in above example, 'a' occurred twice, so split() method will cut the String
              wherever it sees 'a'. Soo in this case we will be left with 3 String Arrays and
              we can reach out to whichever we want by using index []
         */


        String secondEmail = "abc.xyz@yahoo.com";
        int firstIndex = secondEmail.indexOf("@") +  1;
        System.out.println("firstIndex = " + firstIndex); // 8

        System.out.println(secondEmail.indexOf(".")); // 3   index of the first occurrence
        int lastIndex = secondEmail.lastIndexOf(".");
        System.out.println(lastIndex); // 13  index of the last occurrence


        String yahooName = secondEmail.substring(firstIndex, lastIndex);
        System.out.println("yahooName = " + yahooName);

        // indexOf() returns the index of the first occurrence of the given character
        // lastIndexOf() returns the index of the last occurrence of the given character


        // Count the number of words in second email

        String sentence = "I love Java. Java is interesting. But I need to spend time to understand it.";

        String sentenceWithoutPunc = sentence.replaceAll("\\p{Punct}", "");

        System.out.println("sentenceWithoutPunc = " + sentenceWithoutPunc);

        int wordCount = sentenceWithoutPunc.split(" ").length;
        // NOTE: split() + length => no need to use ()

        System.out.println("wordCount = " + wordCount); // 15


    }
}
