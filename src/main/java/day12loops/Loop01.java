package day12loops;

public class Loop01 {
    public static void main(String[] args) {

        // To format the code => MAC => opt+cmd+L
        // To format the code => Windows => ctl+alt+L
        /*
        for (dataTupe startingValue; condition to stop the loop; increment/decrement){
             loop body
        }
         */

        // Find the sum of the integers from 3 to 9 (where 9 is inclusive)
        // 3+4+5+6+7+8+9 = 42


        int sum = 0;  // we create this variable to store the result of addition
        // where 0 is considered 'identity element' for addition operations

        for (int startingValue = 3; startingValue < 10; startingValue++) {
            sum = sum + startingValue;
            // System.out.println("sum = " + sum);
        }

        System.out.println("sum = " + sum); // 42


        // Find the multiplication of the integers from 3 to 9 (where 9 is inclusive)

        int multiplication = 1;

        for (int i = 3; i < 10; i++) {
            multiplication *= i;   // is the same as multiplication = multiplication * i
        }

        System.out.println("multiplication = " + multiplication); // 181440

        // INTERVIEW QUESTION

        // Calculate the total value of the digits in the given integer
        // 568 => 5+6+8 = 19
        // Hint= use  % and / operators

        int sum1 = 0;

        for (int i = 568; i > 0; i /= 10) {  // same as => i = i/10
            sum1 = sum1 + i % 10;
            // System.out.println("sum1 = " + sum1);
        }
        System.out.println("sum1 = " + sum1);  // 19


    }
}
