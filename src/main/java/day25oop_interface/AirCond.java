package day25oop_interface;

public interface AirCond {

    // Any variable or method in an interface is 'public' by default
    // We don't need 'abstract' keyword in an interface

     void digital(); // abstract method
     void run();

    // Can we create variables in interfaces?
    // Yes
    // Variables are public, static and final by default.
    // int price;  We must initialise the variables in interfaces
    public static final int price = 20000;


    /*
    in Java interfaces, all variables must be initialized at the time of declaration. This is because variables in an interface are implicitly:
    public – Accessible to all classes.
    static – Belong to the interface, not to individual instances.
    final – Their value cannot be changed once assigned.
     */

}
