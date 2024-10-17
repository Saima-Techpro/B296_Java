package day25oop_abstraction;

public class Civic extends Honda{

    @Override  // optional to use
    public void music(){
        System.out.println("Music system for Civic");
    }

    public void engine(){
        System.out.println("Civic engine size 1.8");
    }


    /*
    If there's a parent-child relation between an "abstract" and a "normal/concrete"
    class, the child class will show error UNTIL and UNLESS the abstract method is implemented.
    So the implementation of an "abstract" method is mandatory.
     */
}
