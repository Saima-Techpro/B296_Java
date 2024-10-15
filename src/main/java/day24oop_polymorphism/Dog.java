package day24oop_polymorphism;

public class Dog extends Mammal{
    public void bark(){
        System.out.println("Dogs bark");
    }


    // We can change the implementation of the methods coming from parent class and make it more specific for child class needs
    @Override //  @Override is used to suggest that this method is over-ridden from a parent class... but it's NOT mandatory
    public void feed() {
        System.out.println("Dogs like milk too");
    }

    @Override
     public void eat() {
        System.out.println("Dogs eat meat.");
    }

    @Override
    public void drink(){
        System.out.println("Dogs drink water too");
    }

    @Override
    public Animal create(){
        System.out.println("Inheritance allows dog object to overirde this method and create Dog object");
        return new Dog();
    }

//    @Override
//    public Integer add(int a, int b){
//        return a+b;
//    }


    @Override
    public Integer multiply(int a, int b){
        return a*b;
    }

}
