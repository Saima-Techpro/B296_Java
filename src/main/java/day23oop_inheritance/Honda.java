package day23oop_inheritance;

public class Honda extends Car{

    public int torque = 130;

    // non-parameterised constructor
    public Honda(){
        // super(); // go to the parent class and look for non-parameterised constructor from the parent class
        super("eco-friendly");
        System.out.println("this.torque = " + this.torque); // this keyword takes us to variables of this class
        System.out.println("super.model = " + super.model); // super keyword takes us to the super class variables
        System.out.println("Civic");
    }


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

            6) "this()" is used to tell Java to use the constructor of this class.
               "this(with parameter)" is used to tell Java to go to the parameterised constructor of this class,
                implement all codes in that constructor first and then come back and implement the constructor
                which had this(with parameter) used initially.
     */


}
