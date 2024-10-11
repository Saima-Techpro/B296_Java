package day21stringbuilder;

public class StringBuilder02 {
    public static void main(String[] args) {
        /*
         length() method provides character count whereas capacity() method indicates the size of places
        being allocated but unused.

           ==> Initially, Java gives you a capacity of 16.
                If you exceed this given capacity, Java adjusts the new capacity : default*2+2
                NOTE: Capacity growth can reach OPTIMIZATION after the capacity has doubled a few times.

                Optimization means it will stop following this rule => default*2+2 of increasing the allocation
                of more spaces after some point, and it will start allocating ONLY that many places that are added.
         */

        StringBuilder sb = new StringBuilder();
        System.out.println("sb = " + sb);
        System.out.println("length: " + sb.length()); // 0
        System.out.println("capacity: " + sb.capacity()); // 16

        sb.append("Java");
        System.out.println("sb = " + sb); // Java
        System.out.println("length: " + sb.length()); // 4
        System.out.println("capacity: " + sb.capacity()); // 16

        sb.append(" is easy.");
        System.out.println("sb = " + sb); // Java is easy.
        System.out.println("length: " + sb.length()); // 13
        System.out.println("capacity: " + sb.capacity()); // 16

        sb.append(" It is OOP.");
        System.out.println("sb = " + sb); // Java is easy. It is OOP. This OOP is driving me crazy.
        System.out.println("length: " + sb.length()); // 54
        System.out.println("capacity: " + sb.capacity()); // 34


        sb.append(" This OOP is driving me crazy.");
        System.out.println("sb = " + sb); // Java is easy. It is OOP.
        System.out.println("length: " + sb.length()); // 13+11 = 24
        System.out.println("capacity: " + sb.capacity()); // 70

        sb.append(" ******************************************************************************");
        System.out.println("sb = " + sb); // Java is easy. It is OOP. This OOP is driving me crazy. ******************************************************************************
        System.out.println("length: " + sb.length()); // 133
        System.out.println("capacity: " + sb.capacity()); // 142

        System.out.println("====== CUSTOM CAPACITY ===========");
        StringBuilder sb1 = new StringBuilder(); // default capacity is 16

        StringBuilder sb2 = new StringBuilder(5); // custom capacity = 5
        System.out.println( sb2.length()); // 0
        System.out.println(sb2.capacity()); // 5

        sb2.append("Custom");
        System.out.println( sb2.length()); // 6
        System.out.println(sb2.capacity()); // 12 capacity increased by givenCapacity*2+2 => 5*2+2


        sb2.append("capacity");
        System.out.println( sb2.length()); // 14
        System.out.println(sb2.capacity()); // 26

        sb2.append(" is possible");
        System.out.println( sb2.length()); // 26
        System.out.println(sb2.capacity()); // 26


    }
}
