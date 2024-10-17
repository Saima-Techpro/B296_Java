package day25oop_interface;

public interface Brake {

    // methods are public and abstract by default in interfaces
    public abstract void abs();

    void esp(int a);
    void run();

    // We can insist on creating concrete methods in interface as well.
    // For that, we can use two keywords: "static" or "default"

    public static void speed(){
        System.out.println("180km per hour.... ");

    }

    public default void power(){ // default is NOT an access modifier.
                                 // It's a keyword telling Java that we are creating regular method in an interface
        System.out.println("Concrete method by using default keyword.");
        log();
    }

    // private methods in Interface are allowed too since Java 9
    private void log(){
        System.out.println("Private log method is used here... ");
    }








}
