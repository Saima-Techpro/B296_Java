package day12loops;


import java.util.Scanner;

public class HW {
    public static void main(String[] args) {

        System.out.println("======== Task 1 ========");
        // Task 1: Type code to multiply counting numbers from 3 to 8 using loops

        int multiplication = 1;

        for (int i = 3; i < 9; i++) {

            multiplication = multiplication * i;

        }
        System.out.println("multiplication = " + multiplication); // 20160

        System.out.println("======== Task 2 ========");

        // Task 2: Calculate total value of first two digits and last two digits in the given integer
        // 1997 => 19 + 97 = 116

        //decrement can be done by dividing by 100

        int sum = 0;
        for (int i = 1997; i >0 ; i/=100){
            sum = sum + i%100;
            //System.out.println("sum = " + sum);
        }

        System.out.println("sum = " + sum);


        System.out.println("======== Task 3 ========");
        // Task 3: // Calculate the total value of decimal part of the given number
        // 459.789 => 789 => 7+8+9 => 24
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a decimal value");
        double number = scan.nextDouble();

        String strNum = String.valueOf(number);  // This will make the data type of number to String, so we can manipulate it easily
        System.out.println("strNum = " + strNum); // 789 => This is String data type of the given number

        String decimalPart = strNum.split("\\.")[1];
        System.out.println("decimalPart = " + decimalPart);  // 789

        // Now we need to separate each digit from the given number
        // use % and division operation

        // NOTE: we can't do any mathematical operation on String data type. So we have to convert it back to Int

        int intDigit = Integer.valueOf(decimalPart);
        System.out.println("intDigit = " + intDigit); // 789  => but this is converted back into int data type

        int total = 0;
        for (int i = intDigit; i>0; i /=10 ){
            total = total + i%10;
            //System.out.println(total );
        }
        System.out.println("total = " + total);



    }
}
