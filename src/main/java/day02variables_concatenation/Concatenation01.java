package day02variables_concatenation;

public class Concatenation01 {
    public static void main(String[] args) {

        /*
               ******* NON-PRIMITIVE DATA TYPE *******
              1. A created class is non-primitive data type.
                 So there's no limit to non-primitive data types.
              2. Non-primitive data type  start with Uppercase in naming.
              3. Memory usage of  Non-primitive data type depends upon the size of their value
              4. Non-primitive data type have values AS WELL AS methods.


         */

        String greetings;

        greetings = "Hello World!";

        System.out.println("greetings = " + greetings);
        System.out.println("Hash code or reference: " +greetings.hashCode()); // -969099747

        // Update the greetings container

        greetings = "Hello TechPro Family!!";
        System.out.println("greetings updated = " + greetings); // Hello TechPro Family!!


        // CONCATENATION  => Putting the values of two or more variables together
        //                   Joining the data together by using '+' sign


        String greetings1 = "Java is fun!!";
        System.out.println(greetings + greetings1);  // Hello TechPro Family!!Java is fun!!


        String classGreetings  = greetings+greetings1;
        System.out.println(classGreetings); // Hello TechPro Family!!Java is fun!!

        /*
        NOTE: When plus sign '+' is used between two String variables, it concatenates (concatenation).
              When plus sign '+' is used between two numerical variables, it adds (addition operation).
              When plus sign '+' is used between one String and one numerical variable, the position of String
               variable and priority of mathematical operation will determine the result.
              See following examples:
         */

        String str = "Apple";
        int x = 14 , y = 20;


        System.out.println(str + x + y); // Apple1420  => Java sees String first, so it will concatenate.
        System.out.println(str + (x+y)); // Apple34   => Java sees String first, so it will concatenate it with the result of addition operation. Java will do maths operation first because of parenthesis.
        System.out.println(x + y + str); // 34Apple  => Java sees int data type first, so it will perform addition operation
        System.out.println(str + x*y); // Apple280  => Java will do maths operation first because multiplication has got first priority
        System.out.println(x*y + str); // 280Apple  => Java will do maths operation first because multiplication has got first priority
        System.out.println(x + str + y); // 14Apple20 => concatenation


        char ch = 'N';
        System.out.println(x + ch + y); // 112 => because JAVA takes the ASCII value of char data type (ASCII value is number) so plus sign works as addition




    }
}
