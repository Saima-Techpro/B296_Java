package day23oop_inheritance;

public class AnimalRunner {
    public static void main(String[] args) {

        Cat cat = new Cat();  // Cat instance (object) => constructor makes the active and passive features available for the object
        cat.meow();
        cat.eat();  // inherited from Animal class
        cat.drink(); // inherited from Animal class
        cat.feed();

        Dog dog = new Dog();
        dog.bark();
        dog.eat();
        dog.drink();

        Bird bird = new Bird();
        bird.tweet();
        bird.eat();
        bird.drink();

        /*
                 OOP => Object-Oriented Programming language

        OOP has 4 fundamental principles:
        1. Inheritance
        2. Polymorphism
        3. Encapsulation
        4. Abstraction

         1. Inheritance: (based on real life concept of inheritance like eye colour, name, state, money etc.)
            It is a concept that transfers the properties from one class to other classes.
            We use "extends" keyword in child class to inherit the properties from parent class

            NOTE: But in coding, it's one-way => parent class can NOT use property of child class

         1. Why do we use inheritance?
         a) to prevent "repetition"
         b) to make "maintenance" easy
         c) to make our classes "atomic" (small)
         d) to maintain "readability" of the classes


         2. To make a class child to another class, we use "extends" keyword.
         3. Child classes can use class members form paren class. However, parent classes
            can't use anything from child classes (one-way relation)
         4. Every class in Java has a parent class. It's called "Object class".
            Object class is like Adam.. it doesn't have any parent.

         5. Inheritance types in Java
            a) Multilevel Inheritance  => Grandparent => parent => child
            b) Hierarchical Inheritance => Single parent => Many children
            c) Multiple Inheritance => more than one parent at the same level (Java doesn't support it)
            d) Opposite of "Multiple Inheritance" is "Single Inheritance"
              Java supports "Single Inheritance"

        NOTE: Java does not support "Multiple Inheritance". It supports "Single Inheritance"

          IS-A relationship and HAS-A relationship

        Mammal IS-A child of Animal => true
        Bird IS-A child of Mammal => true
        Bird IS-A child of Animal => true
        Cat IS_A Mammal => true

        Animal HAS-A Mammal => true
        Cat HAS-A Mammal => false
        Dog HAS-A Animal => false
        Dog HAS-A Mammal => false


       In Java, the relationship from parent to child is called a HAS-A Relationship (from top to bottom)
       In Java, the relationship from child to parent is called an IS-A Relationship (from bottom to top)










         */






    }
}
