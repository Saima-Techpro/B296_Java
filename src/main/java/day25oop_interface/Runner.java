package day25oop_interface;

public class Runner {
    public static void main(String[] args) {

        // Can we create object from an INTERFACE?
        // NO
        // Brake brakeObj = new Brake();
        // Does INTERFACE have a constructor?
        // NO

        // So, we can create object using child classes
        AudiA5 audiA5 = new AudiA5();
        audiA5.abs();
        audiA5.digital();
        audiA5.run();  // This method runs fine for our example. But in bigger, more complex structures,
                       // methods with same name can cause confusion to Java.


        // We can deal with this issue through type casting
//        ((Engine)audiA5).run();
//        ((Brake)audiA5).run();
//        ((AirCond)audiA5).run();


        // Call the concrete method
        Brake.speed();

        audiA5.power();

        // We can't update the value of variables in Interfaces because they're final
        System.out.println("Engine.price = " + Engine.price);
        System.out.println("AirCond.price = " + AirCond.price);


    }
}
