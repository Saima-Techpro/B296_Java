package day04scanner_increment_decrement;

public class IncrementDecrement {
    public static void main(String[] args) {

        // Increment
        int s = 8;
        System.out.println("Original: " + s);
        // Increase the value by 2
        s = s + 2;
        System.out.println("Increased value: " + s);
        // Another way of increasing the value
         s += 2 ; // s = s + 2; is doing the exact same thing
        System.out.println("Increased value after second increment: " + s);

        // Decrement
        int d = 15;
        System.out.println("Original: " + d);
        // Decrease the value by 2
        d =  d-2;
        System.out.println("Decreased value: " + d);
        // Another way of decreasing the value
        d -= 2 ; // d =  d-2; is doing the exact same thing
        System.out.println("Decreased value after second decrement: " + d);

        // Increment by multiplication
        // Increase by 5

        int a = 14;
        System.out.println("Original: " + a);

//        a = a*5;
//        System.out.println("Increased: " + a);
        a *= 5;

        System.out.println("Increased second time: " + a);

        // Decrement by division
        // Decrease by 5
        int c =35;
        System.out.println("Original: " + c);
//        c = c/5;
//        System.out.println("Decreased: " + c);  // 7
        c /= 5;
        System.out.println("Decreased second time : " + c); // 7


        // Increase by 1
        int x = 50;
        System.out.println("Original: " + x);
        x++;
        System.out.println("Increased: " + x);

        // Decrease by 1
        int y = 67;
        System.out.println("Original: " + y);
        y--;
        y--;
        y--;
        y--;
        y--;
        System.out.println("Increased: " + y);

        // Now we are going to learn how to do increment/decrement and assign to ANOTHER variable

        // Increment

        int m = 12;
        int l = m++;  // assign first, increment later (Post assignment increment => post increment)
        System.out.println("Post assignment increment: " + l); // 12
        System.out.println("Post assignment increment: " + m);  // 13

        int g = 16;
        int h = ++g; // increment first,  assign later (Pre assignment increment => pre increment)

        System.out.println("Pre assignment increment: " + g); // 17
        System.out.println("Pre assignment increment: " + h); // 17


        // Decrement

        int q = 67;
        int r = q--;  // assign first, decrement later (Post assignment decrement => post decrement)
        System.out.println("Post assignment decrement: " + q); // 66
        System.out.println("Post assignment decrement: " + r); // 67

        int t = 99;
        int u = --t; // decrement first,  assign later (Pre assignment decrement => pre decrement)

        System.out.println("Pre assignment decrement: " + t); // 98
        System.out.println("Pre assignment decrement: " + u); // 98


        int b = 8;
        System.out.println(--b); // 7
        System.out.println(b--); // 7
        System.out.println(b++); // 6
        System.out.println(++b); // 8

        int z = 8 ;
        System.out.println(--z); // 7
        System.out.println(z--); //7
        System.out.println(++z); //7
        System.out.println(z++); //7
        System.out.println(z); // 8



    }
}
