package day29exceptions;

public class E04 {
    public static void main(String[] args) {
        // Get a specific element from the given String Array
        String[] arr = {"J", "a", "v", "a"};

        // method call
        getElementFromArray(arr, 2); // v
        getElementFromArray(arr, 4); // ArrayIndexOutOfBoundsException

    }

    public static void getElementFromArray(String[] s, int idx){
        try {
            String element = s[idx];
            System.out.println("element = " + element);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index can't be greater than the length of array which is " + (s.length-1));
        }
    }



}
