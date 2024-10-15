package day24oop_polymorphism;

public class Animal {

    public static int price;
    public final int year = 12; // final variables cannot be created without assigning the value


     public void eat(){
        System.out.println("Animals eat...");
    }


    public void drink(){
        System.out.println("Animals drink...");
    }

    // let's create some methods with return type
    // return type  => int => primitive data type
    // is it a class? NO because primitive data type cannot be classes
    // if it's not a class, it can't have a parent-child relation
    public int add (int a, int b ){
         return a+b;
    }


    public Number multiply(int a, int b){
        return a*b;
    }

    // Can we use Animal as return type?
    // Yes, because it is a non-primitive data type => so we can use it as class and data type
//    public Animal create(){
//         Animal animal = new Animal();
//         return animal;
//    }

    // OR
    public Animal create(){
        System.out.println("Classes can be used as data types");
        return new Animal(); // returns the object without allocating space in the memory
    }


}
