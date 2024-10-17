package day25oop_abstraction;

public class Accord extends Honda{

//    public void music(){
//        System.out.println("Music system for Accord");
//    }


    public void engine(){
        System.out.println("Accord engine size 2.5");
    }

     /*
    If there's a parent-child relation between an "abstract" and a "normal/concrete"
    class, the child class will show error UNTIL and UNLESS the abstract method is implemented.
    So the implementation of an "abstract" method is mandatory.
     */

}
