package day20constructors_date_time;

import java.util.Scanner;

public class CarRunner {
    public static void main(String[] args) {

        /*
        static members (variables + methods)  are like moon = available to all objects at the same time
        non-static members (variables + methods)  are like eye-colour = available to specific object

         NOTE: non-static members belong to objects; static members belong to classes directly
         */


        // method call => calling the method into main method to run it
        // To call non-static members, we need to create objects/instances


        Car car = new Car(); // Creating a car instance (object)
        car.accelerate();
        car.brake();
        System.out.println(car.brand + ", "+car.engine + ", "+ car.model + ", "+car.year );


        Car car2 = new Car("Honda");
        System.out.println(car2.brand);

//        Car car3 = new Car();
//        System.out.println(car3.brand);  // Car3 can still see the original value of brand variable

        Car tesla = new Car("Tesla", "S", 2023);
        System.out.println(tesla.brand);
        System.out.println(tesla.model);
        System.out.println(tesla.year);


        Car ferrari = new Car("Ferrari", "Roma", 2020, 90000, "Diesel", true, false);
        System.out.println(ferrari.brand + ", "+ferrari.model + ", "+ ferrari.year + ", "+ferrari.price);
        System.out.println(ferrari.engine + ", "+ ferrari.sunRoof + ", "+ferrari.airCond);



//        Scanner scanner = new Scanner(System.in);


    }

}
