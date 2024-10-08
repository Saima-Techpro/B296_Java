package day19methodcreation_overloading;

import static day19methodcreation_overloading.MethodCreation01.add;
import static day19methodcreation_overloading.MethodCreation02.*;

public class Runner {
    public static void main(String[] args) {


        // method call
        System.out.println("result :  " + add(23, 7));
        multiply(2, 4, 7);
        // addAndMultiply(); // can't call this method here because it has 'private' access modifier.
                          // it allows to import because of 'static' keyword.

        printText("I'm learning method call"); // ok for method call because it has 'protected' access modifier
        System.out.println(subtract(87, 23)); // ok for method call because it has 'default' access modifier


        // divide(); // cannot call this method like this. It is a non-static method. Non-static method belongs to Class
        //  Create class instance/object and then reach out to non-static method
        MethodCreation02 md = new MethodCreation02();
        System.out.println(md.divide(12, 4));

         // NOTE: non-static members belong to objects; static members belong to classes directly


        // printText2(); //  cannot call this method like this. It is a non-static method.

        Runner runner = new Runner();
        runner.printText2("I hate access modifiers and static keyword!!!");

    }


    public void printText2(String s){
        System.out.println(s);
    }





}
