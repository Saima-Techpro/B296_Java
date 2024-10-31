package day34lambda;

import day33lambda.Utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda02 {
    public static void main(String[] args) throws IOException {
        /*
         How to print the text from a given text file on the console?

       a) "lines()" is a method of the Files class. It returns a Stream<String> for reading data
          line by line from a specified file path.
        This allows you to perform stream operations on each line in the file.

         b) Paths.get() is a static method of the Paths class.
            It returns a Path object representing the given file path string.
            This Path object is used for file and directory operations. (provides access to them)

         */

        // Write code that reads the text from a text file and prints it on the console

        Path path = Path.of("src/main/java/day34lambda/File.txt");

        // Files.lines(path).forEach(Utils::printWithSpace); // if you want to print whole text on the same line
        Files.lines(path).forEach(System.out::println);

        System.out.println("===== Task 2 =====");

        // Write code that reads the text from a text file and prints it on the console in UPPERCASE
        //iles.lines(path).map(String::toUpperCase).forEach(System.out::println);


        System.out.println("===== Task 3 =====");
        // Write the code that prints all words from the text file
        List<String> words = Files.lines(path).
                                   map(t-> t.replaceAll("\\p{Punct}", "").
                                    split(" ")). // returns String Array
                                    flatMap(Arrays::stream). // flatMap() is used to change the String Array back to Stream
                                    toList();

        System.out.println("words = " + words);

        System.out.println("===== Task 4 =====");
        // Write the code that prints all UNIQUE words from the text file
        List<String> uniqueWords = Files.lines(path).
                                    map(t-> t.replaceAll("\\p{Punct}", "").
                                    split(" ")). // returns String Array
                                    flatMap(Arrays::stream). // flatMap() is used to change the String Array back to Stream
                                    distinct().
                                    toList();

        System.out.println("uniqueWords = " + uniqueWords);


    }
}
