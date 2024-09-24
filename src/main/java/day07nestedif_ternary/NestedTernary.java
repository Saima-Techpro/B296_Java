package day07nestedif_ternary;

import java.util.Scanner;

public class NestedTernary {
    public static void main(String[] args) {

     /*
     Type code that takes three integers a, b, and c as input and
     uses a ternary operator to find the smallest of the three numbers.
      */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers please");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();


        // condition ? (condition ? true : false)   : (condition ? true : false);

        int smallest = a<b ? (a<c ? a : c) : (b<c ? b : c) ;



        System.out.println("smallest number is = " + smallest);


    }
}
