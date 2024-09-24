package day06switch_ternary;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {

        // Create a simplified version of a calculator.
        // Ask user to provide two numbers and perform the mathematical operation chosen by the user.
        // + , -, *  , / , %

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number");
        double num2 = scanner.nextDouble();

        System.out.println("Which operator you would like to use from + , -, *  , / , % ");
//        String operation = scanner.next();
//        System.out.println("operation = " + operation);
//        char operator = operation.charAt(5);
//        System.out.println("operator = " + operator);

        char operation = scanner.next().charAt(0);


        switch (operation){
            case '+':
                double sum = num1+num2; // we can create a local variable to store and print the result
                System.out.println("Sum: "+ sum);
                break;
            case '-':
                    System.out.println("Subtraction: " + (num1-num2)); // or we can directly print the result
                break;
            case '*':
                System.out.println("Multiplication: " + (num1*num2));
                break;
            case '/':
                System.out.println("Division: "+ (num1/num2));
                break;
            case '%':
                System.out.println("Percentage: " + (num1%num2));
                break;
            default:
                System.out.println("This calculator doesn't support this symbol ");
        }






    }
}
