package day19methodcreation_overloading;

public class MethodOverLoading01 {
    public static void main(String[] args) {

        /*
        We can create methods with same name but different parameters and dataType.
        This is called Method OverLoading.

        METHOD SIGNATURE => method name + parameters

        RULE: In Method OverLoading, method name remains the same, method parameters change.

        How to do Method OverLoading?
        1. We MUST keep the name of the method SAME.
        2. We can change the data type
        3. WE can change the number of variables (parameters)
        4. WE can change the place of variables (parameters)

        Can we overload private methods?
        YES
        Can we overload non-static methods?
        YES. But we would need to create class instance to reach that non-static member

       In Java, OOP concept has 4 principles.
       One of them is called POLYMORPHISM

       POLYMORPHISM = Poly + morphism
                      many + forms

       POLYMORPHISM = Method OverLoading  + Method OverRiding


         */

        String s1 = "Java is OOP language";
        System.out.println(s1.substring(0, 1)); // J
        System.out.println(s1.substring(2)); // va is OOP language

        String s2 = new String("Hello");
        System.out.println(s2.substring(0, 1));


        // method call

        System.out.println(add(2, 4));
        System.out.println(add(3, 5, 8));
        System.out.println(add(4, 8.9));
        System.out.println(add(4.90, 8));
        System.out.println(add(23, 2.7, 4.5));



    }

    public static int add(int a, int b){
        return a+b;
    }

    public static int add(int a, int b , int c){
        return a+b+c;
    }

    public static double add(int a, double b){
        return a+b;
    }

    public static double add(double b, int a){
        return a+b;
    }

    public static double add(int a, int b , double c){
        return a+b+c;
    }

    public static double add(int a, double b , double c){
        return a+b+c;
    }

    public static double add(double a, double b , double c){
        return a+b+c;
    }









}
