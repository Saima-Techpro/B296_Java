package day14arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {

        int a = 125575;
        byte b = 8;
        double d = 233445.89565;
        String str = "Java is spinning my head around!!!";

        // String s = "Hulya", "Natalia", "Ali"; We can't store multiple values in String

        String s1 = "";

        // How to create an Array?
        // 1st way:
        String[] stdNames = new String[3];
        int[]  numOfStd = new int[10];
        // 2nd way:
        String teachersNames[] = new String[5];
        int  numOfTeachers[] = new int[10];

        // How to print an Array?
        System.out.println("s1 = " + s1);
        System.out.println("stdNames = " + stdNames); // [Ljava.lang.String;@a09ee92 => reference of the Array object in the memory

        System.out.println(Arrays.toString(stdNames)); // [null, null, null]

        // default value of an empty non-primitive data Array is null


        System.out.println("numOfStd = " + numOfStd); // [I@30f39991

        System.out.println(Arrays.toString(numOfStd));  // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        // default value of an empty primitive data Array is null


        // Create an Array of size 5 and store values in it.
        String batchNames[] = new String[5];
        System.out.println(Arrays.toString(batchNames));  // [null, null, null, null, null]

        batchNames[0] = "Hulya";
        System.out.println(Arrays.toString(batchNames)); // [Hulya, null, null, null, null]

        batchNames[4] = "Boukadida";
        System.out.println(Arrays.toString(batchNames)); // [Hulya, null, null, null, Boukadida]

        batchNames[2] = "Kemal";
        System.out.println(Arrays.toString(batchNames)); // [Hulya, null, Kemal, null, Boukadida]

        batchNames[1] = "Shukrullah";
        System.out.println(Arrays.toString(batchNames)); // [Hulya, Shukrullah, Kemal, null, Boukadida]

        batchNames[3] = "Pelin";
        System.out.println(Arrays.toString(batchNames)); //  [Hulya, Shukrullah, Kemal, Pelin, Boukadida]

//        batchNames[5] = "Saima";
//        System.out.println(Arrays.toString(batchNames)); // ArrayIndexOutOfBoundsException
        //  5 is not inclusive index is 0-4

        // How to get a specific value out of an Array?
         String specificValue = batchNames[0];

        System.out.println(specificValue); // Hulya


    }
}
