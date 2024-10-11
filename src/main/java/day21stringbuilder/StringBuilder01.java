package day21stringbuilder;

public class StringBuilder01 {
    public static void main(String[] args) {
        /*
        - If you lose your id/registration form which identifies your name, does that mean that
          you'd lose your name?
        -  NO

        Immutable means not changeable

         */

        // Strings are immutable => UNCHANGEABLE
        String s = "Java"; //Java
        String st = s + "x"; // Javax
        String str = st +"?"; // Javax?
        System.out.println(str +  " is easy?"); // Javax? is easy?
        System.out.println(s);
        s = str +  " is easy?";
        System.out.println("s after updating= " + s);


        String name  = "Tom";
        String name1  = "Tom";
        // There are two String variables with same value "Tom". Java creates String pool and assigns
        // the two values to the same container with same reference in Stack memory

        String name2 = new String("Tom");
        // BUt this variable will have its container and unique reference despite the fact that it has the same value.
        // Reason being we are creating an object here using 'new' keyword
        // We are telling Java to not allocate the name2 value in String pool by using 'new' keyword
        // JVM is responsible for allocating space and reference in memory


        name = name + " loves Java";
        System.out.println("name after updating= " + name);

        /*
         - We can insist Java to update the value of String variable by using assignment operator '='
         - name variable is kicked out of String Pool and will be allocated new container with its own
           unique reference
         - once all values are updated, the original container is left with no address.
         - Java has "Garbage Collector". It collects all the address-less / pointer-less containers,
           finalises it, gets rid of them. Thus frees the memory.
         - "Garbage Collector" operation is performed by JVM. We can't interfere/affect in any way.
         - Because of this key feature, Java proves its efficiency.

         */


        System.out.println("======= StringBuilder ==========");
        // Java created a StringBuilder class to create Strings.
        // StringBuilder class is MUTABLE => CHANGEABLE
        // Is the original value protected in StringBuilder?
        // NO

        StringBuilder sb = new StringBuilder();
        sb.append("Java");
        System.out.println("Original sb = " + sb); // Java
        sb.append("!");
        System.out.println("sb = " + sb); //Java!


        /*
        REAL LIFE IMPLEMENTATION:
        In banks, customer's details like name, id, password, ccv numbers etc. need to be protected.
        So we would use IMMUTABLE data type to store this type of information.

        For customer's withdraws/deposits from the bank, we should use MUTABLE data like StringBuilder

        StringBuilder is used when we need to change/update data frequently.
        Strings are IMMUTABLE; StringBuilder is MUTABLE
         */

    }
}
