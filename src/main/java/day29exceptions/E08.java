package day29exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E08 {
    public static void main(String[] args) {

        /*
        FileNotFoundException => Compile Time Exception

         Explanation: We used FileInputStream. It is a class.
         FileInputStream class is used in Java to read files in byte format.
            It is part of Java's java.io package.
            It is commonly used to read file types like text files, images, audio files, etc.
            Note: In the ASCII table, "A" or any other character is equivalent to 1 byte.


        - The read() method reads one byte from the file (returning its integer-ASCII value 0 to 255)
        - If the file contains the character 'A', the read() method will return a value of 65.
        - If the file contains the character 'a', the read() method will return a value of 97.

          -1 is considered as the end of the file (EOF).
        - read() returns -1 when it reaches the end of the file.
         */

        String path = "src/main/java/day29exceptions/notes.txt";
        try {
            FileInputStream fis = new FileInputStream(path);

            int a = 0;
            while ((a = fis.read()) != -1){
                System.out.print( (char) a);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
