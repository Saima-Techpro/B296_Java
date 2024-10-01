package day13dowhileloops;

import java.util.Scanner;

public class DoWhile02 {
    public static void main(String[] args) {

        /*
        Ask user to enter an integer.
        If the integer is less than 100, tell user "You won!".
        Otherwise, tell user "You lost!"

         */


        Scanner scanner = new Scanner(System.in);

        int num;

        do{

            System.out.println("Enter an integer");
            num = scanner.nextInt();

            if (num < 0){ // in case of invalid values

                System.out.println("You can't enter the negative numbers");
                break; // break keyword acts as a switch

            }else if (num < 101){
                System.out.println("You won!!");
            }


        }while (num < 101);

        System.out.println("You lost!! No more tries !!");











    }
}
