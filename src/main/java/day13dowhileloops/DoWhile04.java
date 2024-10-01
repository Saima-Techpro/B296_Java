package day13dowhileloops;

import java.util.Random;
import java.util.Scanner;

public class DoWhile04 {
    public static void main(String[] args) {

        // Guess the number game


        // Step 1: Create a random number using Random class
        Random random = new Random();
        int randomNum = random.nextInt(101);
        // System.out.println("randomNum = " + randomNum);

        Scanner scanner = new Scanner(System.in);
        int userNum;
        int counter = 0;

        boolean isGuessed = true; // works like a switch (jus like 'break' keyword)

        do{
            System.out.println("Enter a number between 0 - 100");
            userNum = scanner.nextInt();

            counter++;

            if (userNum < randomNum){
                System.out.println("The number you entered is smaller than the given number");

            } else if (userNum > randomNum) {
                System.out.println("The number you entered is greater than the given number");

            }else {
                System.out.println("Congratulations! You guessed the number correctly!");
                System.out.println("You guessed the number in "+counter+ " attempt(s)!");
                isGuessed = false;  // you can also use 'break' keyword instead of boolean variable
            }


        }while (isGuessed);  // true




    }
}
