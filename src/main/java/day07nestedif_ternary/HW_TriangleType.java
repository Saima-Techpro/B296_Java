package day07nestedif_ternary;

import java.util.Scanner;

public class HW_TriangleType {
    public static void main(String[] args) {
        /*
        Type code that takes three integers a, b, and c as the sides of a triangle and
        uses NESTED TERNARY operators to determine the type of triangle:

If all three sides are equal: "Equilateral".
If two sides are equal: "Isosceles".
If no sides are equal: "Scalene".
If the three sides do not form a valid triangle (i.e., violate the triangle inequality theorem), output: "Not a Triangle".
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter three sides of a triangle");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Check if it forms a valid triangle, then determine the type
        String triangleType = (a + b > c && a + c > b && b + c > a) ? (a == b && b == c)  ? "Equilateral" :
                (a == b || b == c || a == c) ? "Isosceles" : "Scalene" : "Not a Triangle";

        System.out.println("The triangle with sides " + a + ", " + b + ", and " + c + " is: " + triangleType);



    }
}
