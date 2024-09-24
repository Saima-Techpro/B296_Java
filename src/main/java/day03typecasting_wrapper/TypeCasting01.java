package day03typecasting_wrapper;

public class TypeCasting01 {
    public static void main(String[] args) {

        /*
        The action of converting primitive data types from one to another is called TYPE CASTING.

        1. Auto-widening: Java automatically converts smaller data types into larger data types.
        2. Explicit Narrowing: Java does NOT automatically convert larger data types into smaller ones.
           Java resists this type of conversion because of the risk of loosing data. UNLESS we insist on
           doing this by declaring the data type on the left hand side of the variable before we assign to
           larger data type.


         */

        // 1. Auto-widening:

        byte a = 11;
        int b = a;
        System.out.println(b); // 11

        // Explicit Narrowing:
        int c = 124;
        short d = (short) c;  // We insist the conversion to smaller data type by declaring it before the variable => (short) c
        System.out.println(d); // 124


        // Task:
        short x = 3524;
        // If we try to cast the data into a smaller data type, but it out of range of the target data type,
        // we will lose data. But Java allows us to take that risk when we insist.
        byte y = (byte) x;
        System.out.println(y); // -60


    }
}
