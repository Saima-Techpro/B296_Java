package day01variables;

import static day06switch_ternary.VariableTypes.experience;

public class Variables01 {

// main method can be created with 'main' or 'psvm'
    public static void main(String[] args) {

    // Data type     nameOfVariable     assignment operator     value      semi colon
           int           age                    =                25           ;

     // Create a variable whose value is 15.99  (decimal)

        double num1 = 15.99;
        float num2 = 12.50F;

        /*
                            DATA TYPES
              for whole numbers => short , byte , int, long
              for decimals => float, double

         1) integer: It is used for whole numbers
            integer variables use 32 bits of memory (4 bytes   => 8 bits= 1 byte)
            The minimum value for integers is -2,147,483,648
            The maximum value for integers is 2,147,483,647
            default value of int  is zero

         2) short: It is used for whole numbers
            short variables use 16 bits of memory
            The minimum value for short is -32,768
            The maximum value for short is 32,767
         3) byte: It is used for whole numbers
            byte variables use 8 bits of memory
            The minimum value for byte is -128
            The maximum value for byte is 127

         4) long: It is used for whole numbers
            long variables use 64 bits of memory
            The minimum value for long -9,223,372,036,854,755,808
            The maximum value for long 9,223,372,036,854,755,807

            NOTE: Java accepts long value as integer by default.
            If the given values exceeds int maximum range, then we will see an error.
            To fix that error, we add 'L' at the end to insist upon using long data type.

         */

        int populationOfSpain = 52000000;


        long populationOfWorld = 8000000000L;

        long populationOfUK = 67000000;

        byte ageOfStudents = 27;

        System.out.println(ageOfStudents);

        System.out.println(populationOfUK);

        System.out.println("populationOfWorld = " + populationOfWorld);


        /*
        To run class on Windows: SHIFT+F10
        To run class on Mac: CONTROL+R
         */


        /*
             DATA TYPE for decimals

           float: It is used for decimals.
                  float variables use 32 bit sof memory
           NOTE: when we create float variable, we need to add 'f' OR 'F' at the end of value.

           double: It is used for decimals.
                  double variables use 64 bit sof memory

           byte < short < int < long < float < double   => PRIMITIVE DATA TYPE

         */

        float priceOfShirt = 75.99f;
        double salaryOfDevs = 10000.99;

        /*

        boolean: It is used for 'True' or 'False' values.
                 It only uses 1 bit of memory

         char: It is used to store single characters =>  'a', '!', 'D'
              char uses 16 bits of memory
              Use single quotation mark

            byte, short, int, long, float, double, boolean, char   => PRIMITIVE DATA TYPE
            PRIMITIVE DATA TYPE only has "VALUES"
         */

        boolean isRetired = true;
        boolean isOld = false;

        System.out.println("isOld = " + isOld);

        char nameInitial = 'S';
        System.out.println("nameInitial = " + nameInitial);


        experience = 24;
        System.out.println("experience = " + experience); // we can call static variable anywhere


    }

}
