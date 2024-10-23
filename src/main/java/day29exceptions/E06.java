package day29exceptions;

public class E06 {
    public static void main(String[] args) {
        // Count the number of characters in the String
        String s = "Java is not easy." ;

        String str = null;

        // method call
        numOfChars(s); // 17
        numOfChars(str);
    }

    public static void numOfChars (String s){
        try {
            int length = s.length();
            System.out.println("length = " + length);
        } catch (NullPointerException npe){
            System.err.println("Can't count the length of a null variable");
            //npe.printStackTrace();
        }

    }
}
