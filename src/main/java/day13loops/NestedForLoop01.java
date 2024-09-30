package day13loops;

import java.util.Scanner;

public class NestedForLoop01 {
    public static void main(String[] args) {

        /*
        Syntax for NESTED FOR LOOP

        for ( startingValue; condition to stop the loop; increment/decrement){
            for (startingValue; condition to stop the loop; increment/decrement){
            }
        }

         */


        /*
        Example: Type the code to print following pattern:
        Week: 1
            Day: 1
            Day: 2
            Day: 3
            ....
        Week: 2
            Day: 1
            Day: 2
            Day: 3
            ....
         Week: 3
            Day: 1
            Day: 2
            Day: 3
            ....

         */

        for (int i = 1; i < 5; i++) { // outer loop to print Weeks
            System.out.println("Week: " + i);
            for (int j = 1; j < 8; j++) { // inner/nested loop to print days
                System.out.println("   Day: " + j);

            }
        }

        /*
         NOTES:
        Once the outer loop starts running after the checking the condition, Java enters the loop body.
        and executes the codes.
        When it enters the nested loop, it checks the condition, if condition is true, it enters the body of the
        nested loop ... runs it as long as the condition to break the nested loop is not met.

        Once the condition to break the nested loop is met, Java comes OUT of the nested loop.
        But it still is INSIDE the outer loop body.
        And the whole process to check the condition if it is true or not.... starts again

        Outer loop is broken when the condition in the outer loop is met

         */


        /*
         Example: Print the following pattern on the console:
                    * * * *
                    * * * *
                    * * * *
                    * * * *
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = scanner.nextInt();

        System.out.println("Enter the number of columns");
        int columns = scanner.nextInt();

        for (int i = 1; i <=rows; i++) {

            for (int j = 1; j <= columns; j++) {
                System.out.print("* ");
            }

            System.out.println(); // This is used to send the cursor onto the next line

        }






    }
}
