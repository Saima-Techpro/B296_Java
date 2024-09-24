package day02variables_concatenation;

public class Variable01 {

    public static void main(String[] args) {

        // Task: Create a variable to store number of cells of human body. Print it on the console

        long numOfCells = 36000_000_000_000L;  // Java will assume that this value needs to be stored as int.
                                              // Creates and allocates the given value in int container
                                                // We need to insist on using long as data type by adding 'L'
        System.out.println("numOfCells = " + numOfCells);


        // Task: Create 2 float variables and print their total value on the console with some message

       // float num1 = 25.69f;
       // float num2 = 67.99f;

        // 1st way:
        float num1 = 25.69f , num2 = 67.99f;
        System.out.println( "Sum: " + num1+num2); //25.6967.99
        System.out.println( "Sum: " + (num1+num2)); // 93.68

        // 2nd way:
        float sum = num1 + num2;
        System.out.println("sum = " + sum);// 93.68


        // Task: Create a char variable and an int variable and try to add them

        char a = 'Z';
        int b = 12;

        System.out.println(a+b); // 102  => Java converts char into its ASCII value if it is used in math operation like this.

        // If we don't want the addition, then do concatenation
        System.out.println("Result: " + a + b );  // Result: Z12


        System.out.println("Result: " + (a + b) );  // Result: 102



    }

}
