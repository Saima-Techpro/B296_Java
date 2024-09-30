package day13whileloops;

public class WhileLoop01 {
    public static void main(String[] args) {

        /*
                    ***** Syntax for 'for loop' *****

         for (startingValue; condition to stop the loop; increment/decrement){

            loop body (codes are executed as long as the condition is true)

            }

                    ***** Syntax for 'while loop' *****

                startingValue is declared outside the loop body
                while(condition){
                   loop body => codes to be executed

                  increment/decrement (otherwise we create INFINITE LOOP)
                }

         */

        System.out.println("========= Task 1 =========");
        // Print all the numbers from 3 to 9

        int startingValue = 3;  // starting value

        while (startingValue <=9){
            System.out.println(startingValue);

            startingValue++;
        }
        System.out.println("========= Task 2 =========");
        // Print all the even numbers from 68 to 35

        int i = 68; // starting value

        while (i > 34){

            if (i%2==0){
                System.out.print(i + " ");
            }

            i--;  // decrement
        }
        System.out.println();
        System.out.println("========= Task 3 =========");
        // Type code to print the sum of integers from 12 to 27

        int x = 12; // starting value

        int sum = 0;


        while (x < 28){
            sum = sum + x;
            //System.out.println("sum = " + sum);  // to see each addition
            x++; // increment
        }

        System.out.println("sum = " + sum); // 312



    }
}
