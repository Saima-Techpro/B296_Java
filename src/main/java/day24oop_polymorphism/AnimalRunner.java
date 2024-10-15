package day24oop_polymorphism;

public class AnimalRunner {
    public static void main(String[] args) {
        /*
                                 NOTES on POLYMORPHISM
      - Polymorphism => poly means many , morphism means forms  => many forms
      - Polymorphism is the 2nd principle of OOP concept
      - Polymorphism is used to implement the methods in many ways

      - Polymorphism consists of two parts:
          1) Method Overloading (learned previously) (ALWAYS done in the same class)
          2) Method Overriding  (happens in the child class)

             In Method Overriding, child classes use the methods from parent class but implement
             them after some modification.

       Real life example:
       BROWSERS => safari, chrome, edge, mozilla, opera, firefox etc.
       All these types of browsers are actually child classes of Browser class.
       Browser class has some common features like navigation(), version variable etc.
       All browsers inherit these common features from the parent class and then
       implement them for their specific needs after some modification.


       ********* Rules for Method Overriding *********

       1) Private methods cannot be overridden!
       2) Access modifier of the method in child class can not be more
            restrictive / narrower than the access modifier of the method in parent class
       3) Final members in a class can not be overridden.
         Bcs Final keyword is used to prevent any change on the variable or method or class.
         So if we have final keyword, we have the latest version that we can ever assign
      4) If a class is final, can not be inherited...
      5) Static members cannot be overridden...Bcs static members are class property and are common for all the objects...
      6) When we override a method which has a return type, we can declare the same data type in the child
         class where we are overriding, or we can use any of its child classes as return data type as well.

         */
        Dog dog = new Dog();
        dog.bark();
        //inherited methods
        dog.feed();
        dog.eat();
        dog.drink();
        dog.create();



        System.out.println("==================");
        Cat cat = new Cat();
        cat.meow();
        //inherited methods
        cat.feed();
        cat.eat();
        cat.drink();
        cat.create();

        //variables from parent class
        Animal.price = 95; // we can update price value because it's a static member
        // Animal.year = 12;  we can't update / override the 'final' variables coming from parent class




    }
}
