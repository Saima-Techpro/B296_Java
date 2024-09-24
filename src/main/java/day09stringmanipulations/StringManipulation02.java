package day09stringmanipulations;

public class StringManipulation02 {
    public static void main(String[] args) {

        /*
        Task: Calculate the total price of the products below:
                    tv: $458.90  , laptop: $788.99

         NOTE: prices are given in String data type
         */

        String tv = "$458.90";
        String laptop = "$788.99";

        // Step 1: Get rid of $ sign
         String tvPrice = tv.replaceAll("\\$", ""); // For replaceAll() method, we need to use "\\$" because \\ will make it a Regex
        // String tvPrice = tv.replace("$", ""); // For replace(), we don't need \\ because replace() works with char => single character
        System.out.println("tvPrice without $ sign= " + tvPrice);

        String laptopPrice = laptop.replaceAll("\\$", "");
        // String laptopPrice = laptop.replace("$", "");
        System.out.println("laptopPrice without $ sign= " + laptopPrice);

        // System.out.println(tv.substring(1)); => substring(1) will start returning the value from index 1 and the remaining value of the String

        // Step 2:

       //  double OR Double ?
        // double => Primitive => only values, NO methods
        // Double => Non-Primitive (Wrapper class of double) => has values AS WELL AS methods
        Double tvPriceDouble = Double.valueOf(tvPrice);
        System.out.println("tvPriceDouble = " + tvPriceDouble);
        Double laptopPriceDouble = Double.valueOf(laptopPrice);
        System.out.println("laptopPriceDouble = " + laptopPriceDouble);

        /*
        NOTE:
         Double.parseDouble() => returns primitive => double but you can store it to Double Wrapper class (auto-boxing)
         Double.valueOf() => returns non-primitive => Double but you can store it to its primitive data type (unboxing)
         */


        Double totalPrice = tvPriceDouble + laptopPriceDouble;
        System.out.println("totalPrice = $" + totalPrice);  // $1247.8899999999999

        System.out.println("totalPrice = $" + Math.round(totalPrice)); // $1248
        System.out.println(String.format("%.2f", totalPrice)); // 1247.89

        System.out.println("============= Rounding off with Math.pow() ===============");
        // Another way to round off decimals and specify number of decimals
        int decimalPlaces = 2;

        // Rounding to 2 decimal places
        double roundedValue = Math.round(totalPrice * Math.pow(10, decimalPlaces)) / Math.pow(10, decimalPlaces);
        System.out.println(roundedValue);  // Output: 1247.89

        /*
        Multiplication: totalPrice * Math.pow(10, 2) shifts the decimal places of 1247.8899999999999 two places to the right, resulting in 124788.99999999999
        Rounding: Math.round(124788.99999999999) rounds the value to the nearest integer, which is 124789
        Division: 124789 / Math.pow(10, 2) shifts the decimal point back two places to the left, resulting in 1247.89
         */

        System.out.println("=============================");

        char ch = 'Z';
        System.out.println("ch = " + ch);
        System.out.println(Integer.valueOf(ch));

        boolean b = true;
        // System.out.println(Integer.valueOf(b));
        System.out.println(Boolean.valueOf("true")); // true

        Integer integerObject = Integer.valueOf(123);  // Returns Integer object from int
        System.out.println(integerObject); //123

        /*
                      ********** NOTES about valueOf() and parseXXX() methods **********

        1. valueOf() works for wrapper classes to convert strings or primitive values into wrapper objects.
        2. parseXXX() works primarily for numeric and boolean types, converting strings to primitive values.

           Both methods are primarily designed to work with strings but behave differently based on the data type.
           Other data types like char need manual handling (e.g., using charAt() for char).

         */


    }
}
