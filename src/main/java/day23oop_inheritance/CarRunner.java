package day23oop_inheritance;

public class CarRunner {
    public static void main(String[] args) {

        System.out.println("========First object====== ");
        Car car1 = new Car();  // Car is the data type (reference type) and Car() is the constructor. Constructor side is active side
        // This is a car object

        System.out.println(car1.model);
        System.out.println(car1.year);
        // car1.torque


        System.out.println("========Second object====== ");
        Car car2 = new Honda();
        // This is Honda object
        System.out.println(car2.model);
        System.out.println(car2.year);
        // car2.torque => this shows error because car2 is created by calling Car class and Car is the parent of Honda. Parent class can't use child class property
        // in inheritance, parent (Car) can't use the feature from child (Honda)

        Honda honda = new Honda();
        System.out.println("honda.torque = " + honda.torque);


        Vehicle car3 = new Car();
        Vehicle car4 = new Honda();

    /*
           NOTES ABOUT "super()" and "super" keyword

            1)"super" keyword is used to get data(variables + methods) from parent classes in inheritance

            2)If there is no data in parent, Java looks for the data in grandparents
              If no parent has the data, Java gives Compile Time Error.

            3)"super()" must be the first statement in the constructor body, but "super" can be in any line

            4)"super()" is for calling "constructors" from parent class, "super" is for calling variables and methods
              from the parent class

            5)"this" is used to call data from the class itself.
              When you use "this", it means you are telling Java "do not go to the parent, stay in this class"


           Why make a super call?

        1) If you use the super keyword, you can call the method of the parent class and also modify the behaviour
            of this method according to the needs of the child class.
        2) The extends keyword only allows inheritance, but does not modify the methods of the parent class



    Constructor Hierarchy

       When you create an object from a child class, the constructors are executed from topmost parent class downwards

     Imagine you are an automobile manufacturer producing different types of automobiles.

    1- Grandparent Class(Vehicle): This class contains the basic features of all automobiles.
    For example, common features like the brand, model, and fuel type of the automobiles are defined here.
    This class has a constructor, and when a new automobile is created, this constructor is called.
    This constructor sets up the basic features of the automobile.

    2- Parent Class(Car): This class extends the Grandparent class and represents more specialized types of automobiles.
     For example, features of sedan or h-pack automobiles could be defined here.
     The constructor of the Parent class sets both its own features and those of the inherited Grandparent class.

    3- Child Class: This class extends the Parent class and represents an even more specific type of automobile,
    for example, sports cars. The constructor of the Child class sets up its own features as well as those
    inherited from the Parent and Grandparent classes.

    **The constructors run downwards from top to bottom

    Result: Each class represents a more specialized type of automobile and inherits the features of its
    superclass while adding its own specific features.


     */



    }
}
