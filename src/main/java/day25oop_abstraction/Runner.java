package day25oop_abstraction;

public class Runner {
    public static void main(String[] args) {

        // Honda honda = new Honda();  We can NOT  create object from an "abstract" class

        // How do we access the methods in "abstract" class?
        // Through its child classes.

        Civic car1 = new Civic();
        car1.music();
        car1.engine();
        //  car1.brake(); compile time error because Java doesn't find brake() method inside Civic class.
        // When it goes to super class, it doesn't find it there either. So it shows error.


        Accord car2 = new Accord();
        car2.music();

        // AbstractChild abChild = new AbstractChild(); // We can NOT  create object from an "abstract" class



    }
}
