package day29exceptions;

public class E09 {
    public static void main(String[] args) {

        /*
          finally block

    1) The 'finally block' is commonly used for:
    a) Releasing resources: (disconnecting database connections, using the close() method),
       Especially before Java 7, resources like database connections had to be closed manually.
       Such resources, if left open for too long, would occupy unnecessary space in the system
       and could lead to potential performance issues.
       This became automated post-Java 7 (with the try-with-resources statement).

    b) Closing files: (we had just made a file connection. it could be closed with fis.close();)
      It's necessary to close files after reading or writing operations are done. Otherwise,
      file handles unnecessarily occupy space in the system.

    c) Cleanup operations that must run in all cases:
      (Some operations, whether successful or not, should always be performed at the end of a certain process.
      For example, logging the start and end times of each operation to a log file. With BufferedWriter)

         */
        // Get a specific element from the given String Array
        String[] arr = {"Java", "is", "not", "easy."};

        int a = 12;
        int b = 0;

        // method call
        getElementFromArray(arr, a, b);


    }

    public static void getElementFromArray(String[] s, int a, int b){
        try {
            int idx = a/b;
            String element = s[idx];
            System.out.println("element = " + element);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index can't be greater than the length of array which is " + (s.length-1));
        } catch (ArithmeticException e){
            System.out.println("Can't divide with zero");
        } catch (Exception e){
            e.printStackTrace();
        } finally { // works everytime when the code is executed
            // connection.close;
            System.out.println("Cut the connection with the database.");
        }
    }

    /*
     - multiple finally is not allowed. can be used ONCE.
    - try + catch  || try + multiple catch || try + catch + finally || try + finally => all variations are available....
    - multiple catch is ok but multiple finally is not.
    - try + finally is ok.
    - we can NOT use try block on its own.
     */


}
