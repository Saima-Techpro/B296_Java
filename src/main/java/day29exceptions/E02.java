package day29exceptions;

public class E02 {
    public static void main(String[] args) {
        // Convert the given String to int

        String s = "1234";

        String str = "123abc87!?";

        // method call
        convertStringToInt(s); // 1234

        convertStringToInt(str); // NumberFormatException is thrown when String has mix of numbers and other characters
                                // those characters can't be changed into int data type



    }

    public static void convertStringToInt(String s){
        try{
            int numbers = Integer.valueOf(s);
            System.out.println("numbers in int data type = " + numbers);
        }catch (NumberFormatException e){
            System.out.println("Strings with mix of numbers and letters can't be converted ti int data");
            System.out.println(e.getMessage());

        }

    }
}
