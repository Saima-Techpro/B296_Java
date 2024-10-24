package day30enums_iterators_records;

import java.util.Arrays;
import java.util.Scanner;

public class EnumRunner {
    public static void main(String[] args) {

        /*
        1) The data in the enum are constants.
        2) You cannot create a new object from the enum using the new keyword.
        3) This is because each constant data you put into the enum works with the logic of an object created from this class.
        4) Each constant we put inside the enum is by default public, static, and final.
            (Here, provinces are implied - when defining an enum, you don't need to and cannot write these keywords in front of the constants; the syntax of the language does not support this.)
        5) Therefore, you can access each constant data inside the enum by writing the enum name.
        6) The constructor in the enum is not used to create a new object, but to initialize the variables inside each constant data in the enum.


         */




        // Cities cities = new Cities(); // 'new'  is used to create a new object
        /*
        new Cities(); => this would mean that we are trying to create a new set
        of values stored in the Cities enum. Which is contrary to the very concept
        of enums => enums are used to store constant / fixed values
         */

        // System.out.println(Cities.ADANA);

        Cities c1 = Cities.ANKARA;
        System.out.println("c1 = " + c1);

        System.out.println("City Name = " + c1.getCityName()); // Ankara
        System.out.println("City Name = " + Cities.KONYA.getCityName()); // Konya

        String cityName = Cities.KONYA.getCityName();
        System.out.println("cityName = " + cityName);

//        int plateCode = Cities.ANTALYA.getPlateCode();
//        System.out.println("plateCode = " + plateCode);


        // Ask user to enter a plate code to find related city name

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the plate code to check which city it belongs to!");
        int plateCode = scanner.nextInt();


        Cities[] allValues =  Cities.values();
        // System.out.println("allValues = " + Arrays.toString(allValues));

        if (plateCode < 0 || plateCode > 81){ // takes care of invalid values first
            System.out.println("Enter a valid plate code please");
        }else {
            for (Cities w : allValues){
                // System.out.println(w.getCityName());
                if (plateCode == w.getPlateCode()){
                    System.out.println(w.getCityName());
                    System.out.println(plateCode + " plateCode belongs to " + w.getCityName() + " city.");
                }

            }
        }





    }
}
