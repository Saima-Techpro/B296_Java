package day23oop_inheritance;

public class Vehicle {
    // Every class has an invisible constructor which allows object creation

    // non-parameterised constructor
    public Vehicle(){
        System.out.println("Vehicle constructor.... ");
    }

    // parameterised constructor

    public Vehicle(String brand){
        System.out.println(brand);
    }

    public Vehicle(String brand, int price){
        System.out.println(brand +", " +price );
    }

    public Vehicle(String brand, int price, String engine){
        System.out.println(brand +", " +price + ", " + engine);
    }


}
