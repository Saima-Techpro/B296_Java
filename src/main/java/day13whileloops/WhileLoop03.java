package day13whileloops;

import java.util.Scanner;

public class WhileLoop03 {
    public static void main(String[] args) {

        /*

        Create a multiplication table using the number given by user.
        4 x 1 = 4
        4 x 2 = 8
        4 x 3 = 12
        4 x 4 = 16
        ....
        4 x 10 = 40

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to get its multiples");
        int number = scanner.nextInt();


        int i = 1; // staring value

        int result = 1; // identity element 1 because we are multiplying



        while (i < 11 ){

            if (number < 0 || number > 10 ){
                System.out.println("Please provide a number between 1 and 10 only");
                break; // this keyword acts like a switch
            }

            result = i*number;

            System.out.println(number +" x "+ i + " = " + result );

            i++;

        }











    }
}
