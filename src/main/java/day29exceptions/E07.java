package day29exceptions;

public class E07 {
    public static void main(String[] args) {
        // Print if the given age is valid

        printAge(12);
        printAge(1);
       // printAge(-1); // IllegalArgumentException will be thrown because we asked for it

        try{
            printAge(-5);
        }catch (IllegalArgumentException e){
            System.out.println("What kind of age is that!!");
        }


    }

    public static void printAge(int age){
        if (age<=0){
            throw new IllegalArgumentException("Age can't be zero or less than zero");
        }else {
            System.out.println("age = " + age);
        }
    }
    // NOTE: by using "throw new", we can throw any exception at any point in our code depending upon the condition
}
