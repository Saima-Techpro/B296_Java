package day21stringbuilder;

public class StringBuilder03 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java is object-oriented language");
        System.out.println("sb = " + sb);

        // replace() method operate with 3 parameters:
        // staring index => inclusive
        // ending index => exclusive
        // string => that you want to add
        sb.replace(0,4, "Python");
        System.out.println("sb = " + sb); // Python is object-oriented language

        // delete(startingIndex, endingIndex)
        // staring index => inclusive
        // ending index => exclusive
        sb.delete(0,6);
        System.out.println(sb); // is object-oriented language

        sb.deleteCharAt(0);
        System.out.println(sb); //is object-oriented language

        // insert() method skips the given number of index and adds the given String after that
        sb.insert(3, "SQL ");
        System.out.println(sb); // is SQL object-oriented language

        // Difference between replace() and insert()?
        // replace() method removes the string from the given indexes
        // insert() method does NOT remove the string from the given indexes, Just adds the new String

        sb.reverse(); // reverses the given String.
        // We DO NOT HAVE reverse() in String data type.
        System.out.println(sb); // egaugnal detneiro-tcejbo LQS si

        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");

        System.out.println(sb1.equals(sb2)); // false
        // equals() method checks the value as well as reference of the objects

        System.out.println(sb1.compareTo(sb2)); // 0


        StringBuilder sb3 = new StringBuilder("Java");
        StringBuilder sb4 = new StringBuilder("Lava");

        System.out.println(sb3.equals(sb4)); // false
        // equals() method checks the value as well as reference of the objects

        System.out.println(sb3.compareTo(sb4)); // -2

        // compareTo() method returns int value.
        // It checks the ASCII values of the characters
        // If the two StringBuilder objects are equal, it returns 0.
        // If the first StringBuilder object comes before the second, it returns negative value showing the difference between the characters on ASCII Chart
        // If the first StringBuilder object comes AFTER the second, it returns positive value showing the difference between the characters on ASCII Chart


    }
}
