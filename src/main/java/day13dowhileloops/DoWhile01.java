package day13dowhileloops;

public class DoWhile01 {
    public static void main(String[] args) {

        /*
                     ***** Syntax for 'while loop' *****

                startingValue is declared outside the loop body
                while(condition){
                   loop body => codes to be executed

                  increment/decrement (otherwise we create INFINITE LOOP)
                }

                ***** Syntax for 'do while loop' *****

                startingValue
                do {

                    loop body => codes to be executed

                   increment/decrement (otherwise we create INFINITE LOOP)

                }while(condition);

         */

        // While loop
        // While loop will check the condition first. If it is true, only then it will run the loop body
        // IN the following example, nothing will be printed
        // RULE: Zero execution is possible in while loops
        // While loop is WISE: it thinks first; acts later

        int i = 1;

        while (i<1){
            System.out.println("while loop ");
            i++;
        }





        // Do while loop
        // Do while loop will run the loop body first (executes the codes) and then check the condition.
        // If the condition is true, it will run the loop body AGAIN. Otherwise, it will not.
        // It checks the condition AFTER running the loop body once.
        // In the following example, message will be printed at least ONCE
        // RULE: Zero execution is NOT possible in do while loops
        // Do while loop is NOT WISE: it acts first; thinks later
        // It's used in ATMs, games etc.

        int k = 1;

        do{
            System.out.println("do while loop ");
        }while (k<1);

        System.out.println("============ While Loop =============");

        // Print the numbers from 3 to 12
        int x = 3;
        while (x < 13){
            System.out.print(x + " ");
            x++;
        }
        System.out.println();

        System.out.println("========= Do While Loop ===========");
        int y = 3;
        do{
            System.out.print(y + " ");
            y++;
        }while (y<13);

    }
}
