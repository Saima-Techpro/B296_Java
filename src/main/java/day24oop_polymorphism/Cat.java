package day24oop_polymorphism;

public class Cat extends Mammal{
    public void meow(){
        System.out.println("Cats meow");
    }

    @Override
    public void feed(){
        System.out.println("Cats love milk.");
    }



    @Override
    public void eat(){
        System.out.println("Cats eat fish.");
    }

    @Override
    public void drink(){
        System.out.println("Cats don't drink fizzy drinks");
    }

    @Override
    public Animal create(){
        System.out.println("Inheritance allows cat object to overirde this method and create Cat object");
        return new Cat();
    }




}
