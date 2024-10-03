package day16arrays;

import java.util.Arrays;
import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        // HW: Create an array to store names of students.
        // Ask user to enter the names
        // Use loops to get the names from the user
        // Print all the names of the students on the console

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of students you want to register");
        int numOfStudents = scan.nextInt();

        String[] studentNames = new String[numOfStudents];
        System.out.println("studentNames = " + Arrays.toString(studentNames));  // [null, null, null, null, null]


        for (int i =0; i < numOfStudents; i++) {

            System.out.println("Please enter " +(i+1) +" the name of the student. To stop, press Q");

            String inputNames = scan.next();

            if ( !inputNames.equalsIgnoreCase("Q")) {

                studentNames[i] = (inputNames.replaceAll("\\s++", " "));
            } else {
                break;  // sentinel value
            }
        }
        System.out.println(Arrays.toString(studentNames));  // [Tom, null]
        System.out.println(studentNames[0]);  // Tom


    }
}
