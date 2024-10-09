package day20constructors_date_time;

public class Car {

    /*
    In rear life projects, we have many classes (C1, C2, C3 ....) which store active and passive
    characteristics (variables + methods) but they don't have main methods.
    We create a separate helper class usually named as 'Runner'. We put main method in the Runner
    class, which serves as an entry point to the project. All objects are created in Runner class.



    In Java, classes are like templates / blueprints that are used to create objects.

    Constructor is like a chef in Java. Just like we need a chef to cook food, we need constructor
     to create objects.

     Whenever we create a class, Java automatically creates a constructor. This is invisible.
     It's called "default constructor".
     "default constructor" works at the background and it stays invisible by default.

     SYNTAX:
     access modifier ClassName () {}

     - We can create multiple constructors and use multiple parameters according to our needs
     - But if we create our own constructors, the default one will be over-written
     - If we want to keep default as well as our own constructors, we need to make the default one visible
     - In parametrised constructors, we use 'this' keyword
        'this' keyword is very important. it ensures to update the value of the variable in this class to
        the value provided in the parameter

     So, can we say that constructors are special methods?

     Yes, we can say that constructors are special methods in Java, but with some key differences
     compared to regular methods.

    Difference between a constructor and a method?

    -	Constructors are used to initialize objects when they are created, whereas regular methods are used to define behaviours or actions that the object can perform.
    -	A constructor must have the same name as the class, while regular methods can have any name.
    -	Constructors do not have a return type, not even void, unlike regular methods that must specify a return type.
    -	Constructors are automatically invoked when an object is created using the new keyword, whereas regular methods are explicitly called on an object.

    So while constructors share some similarities with methods (like containing code blocks and accepting parameters),
    they have these unique features that make them "special methods."


       */

    public Car(){} // now "default constructor" is visible

    // Parametrised constructor
    public Car(String brand) {
        this.brand = brand;  // 'this' keyword is very important. it ensures to update the value of the variable in this class to the value provided in the parameter

    }

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }


    public Car(String brand, String model, int year, int price, String engine, boolean airCond, boolean sunRoof) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.engine = engine;
        this.airCond = airCond;
        this.sunRoof = sunRoof;
    }



    // Let's create some passive characteristics (variables)

    String brand = "Toyota";
    String model = "Auris";
    int year = 2021;
    int price = 20000;
    String engine = "Hybrid";

    boolean airCond = true;
    boolean sunRoof = false;

    // Let's create some active characteristics (methods)

    public void accelerate() {  // non-static method
        System.out.println(brand + " reaches upto 120km/h in 5 seconds");
    }

    public void brake(){
        System.out.println( brand + " brakes in 2 seconds");
    }


}
