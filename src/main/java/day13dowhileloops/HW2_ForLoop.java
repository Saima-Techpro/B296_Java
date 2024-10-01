package day13dowhileloops;

import java.util.Random;
import java.util.Scanner;

public class HW2_ForLoop {
    public static void main(String[] args) {

        // Guess the number game => Use either FOR LOOP or WHILE LOOP

        Random random = new Random();
        int randomNum = random.nextInt(101);  // Generate random number between 0 and 100
        Scanner scanner = new Scanner(System.in);
        int userNum;

        // FOR LOOP

        int maxAttempts = 10;

        for (int counter = 1; counter <= maxAttempts; counter++) {
            System.out.println("Attempt " + counter + ": Enter a number between 0 - 100");
            userNum = scanner.nextInt();

            if (userNum < randomNum) {
                System.out.println("The number you entered is smaller than the given number");

            } else if (userNum > randomNum) {
                System.out.println("The number you entered is greater than the given number");

            } else {
                System.out.println("Congratulations! You guessed the number correctly!");
                System.out.println("You guessed the number in " + counter + " attempt(s)!");
                break;
            }

            if (counter == maxAttempts) {
                System.out.println("You've used all attempts. The correct number was: " + randomNum);
            }

        }



    }
}
