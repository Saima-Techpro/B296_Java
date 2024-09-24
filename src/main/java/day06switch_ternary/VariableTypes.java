package day06switch_ternary;

import java.util.Scanner;


public class VariableTypes {


    public  static  double experience ; // Static Variable

    public static void main(String[] args) {

        /*
          There are three types of Variables in terms of SCOPE.
          1. Local Variable:  is created within a method body {} and can be used only  in the same {} => limited in scope
          2. Class / Instance Variable: is created at the class level and can be reached out at any point within the SAME Class
          3. Static Variable: has 'static' keyword and it has the widest scope => it's available across packages
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your years of service: ");
        byte yService = scanner.nextByte();  // class variable / instance variable

        if (yService<5){
            System.out.println("Ohhh, sorry. You have no bonus for now. You have to work " + (5-yService) +
                    " more year(s) to get a bonus" );

        } else {
            System.out.println("Please enter you salary: ");
            double salary = scanner.nextDouble(); // local variable
            System.out.println("Well done! You have " + salary*0.05 + " bonus" );
        }

        // 2nd if statement
//        if (yService > 8 ){
//            System.out.println("Just checking if I can call yService variable anywhere");
//        }else if (salary > 6000){ // salary variable can't be called here coz it's scope is limited. It's available only in the first else body
//            System.out.println("Just checking if I can call salary variable anywhere");
//        }

        System.out.println(experience);


    }
}
