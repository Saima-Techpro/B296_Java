package day04scanner_increment_decrement;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {

        // Ask the user to provide width, length and height of a rectangular prism.
        // Then calculate its total area.
        // HINT: formula for rectangular prism  =>    A=2(wl+hl+hw)
        // OR (2*w*l) + (2*h*l) + (2*w*h)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width, length and height of a rectangular prism");
        double width = scanner.nextDouble();
        double length = scanner.nextDouble();
        double height = scanner.nextDouble();

        double totalArea = (2*width*length) + (2*height*length) + (2*width*height);

        System.out.println("totalArea = " + totalArea);










    }
}
