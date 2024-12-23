package day22instanceblock_staticblock;

public class InstanceBlock01 {

    /*
       What is an instance?
       An object of a class.

       How many types of variables?
       1. local variable
       2. instance variable
       3. static variable

       What is an instance block?
       An instance block is a block of code that runs every time an instance (object) is created.

       NOTE: This serves like the object id

       SYNTAX:  {}

        Main characteristics of Instance block:

        1- Runs for Every Instance: The instance block runs every time a new instance of a class is created.
           That means, for every new object, this block is executed again. (like an id)
        2- Prevents Code Repetition: By using instance blocks, you avoid repeating the initialization
            processes or specific pieces of code for every object.

            chatGPT:
            An instance block in Java is like a special recipe you follow whenever you bake a cake, no matter what
            kind of cake it is. Each time you make a cake (create an object), you perform a set of steps (instance block)
            that you always need, like preheating the oven or greasing the pan, before adding any specific ingredients
            (constructors or fields). So, even though every cake might have different ingredients (object properties),
            those essential steps (instance block) are always followed whenever a new cake (object) is baked (created).

     */

    {
        System.out.println("Hello everyone! ");
    }




    public static void main(String[] args) {
        InstanceBlock01 obj1 = new InstanceBlock01();

        InstanceBlock01 obj2 = new InstanceBlock01();

        InstanceBlock01 obj3 = new InstanceBlock01();

        InstanceBlock01 obj4 = new InstanceBlock01();



    }





}
