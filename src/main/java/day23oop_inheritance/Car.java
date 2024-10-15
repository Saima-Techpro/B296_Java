package day23oop_inheritance;

public class Car extends Vehicle{

    // passive features
   String model = "Accord";
   int year = 2022;

    // non-parameterised constructor
    public Car(){
        //super();
        this("this keyword is being executed here..."); // this(parameter) calls the parameterised constructor of this class
        System.out.println("H-pack");
    }
    // parameterised constructor
    public Car(String type){
        //super();
        super("Accura", 40000, "Gas");
        System.out.println("type = " + type);
    }

}
