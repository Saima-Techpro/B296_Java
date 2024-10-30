package day33lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda02 {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();

        // myList.add("Arda Güler");
        myList.add("Ronaldinho");
        myList.add("Messi");
        myList.add("Zidane");
        myList.add("Torres");
        myList.add("Torres");
        myList.add("Yamin");
        myList.add("Pelinovich");
        myList.add("Maldini");
        myList.add("CR7");
        myList.add("Arda Güler");

        System.out.println("myList = " + myList); // [Ronaldinho, Messi, Zidane, Torres, Torres, Yamin, Pelinovich, Maldini, CR7, Arda Güler]


        // method call
        // printElements(myList);


        //printElementsLowercaseSorted(myList);
        System.out.println();
        // sortedByLastChar(myList);

        sortedByLastCharWithUtils(myList);
        //sortedByFirstChar(myList);

    }

    // Create a method to print all elements in Uppercase in the same line with a space between
    public static void printElements(List<String> list){
        list.
                stream().
                map(t -> t.toUpperCase()).
                forEach(t-> System.out.print(t + " ")); //  in place of map(t -> t.toUpperCase()), you can use replaceAll() directly on the list => list.replaceAll(String::toUpperCase);
    }

    // Create a method that prints unique elements from the list,
    // in lowercase and sorted by their length (from shortest to longest)

    public static void printElementsLowercaseSorted(List<String > list){
        list.
                stream().
                distinct().
                map(t-> t.toLowerCase()).
                //sorted(). // sort the elements alphabetically
                sorted(Comparator.comparing(String::length)).
                // forEach(t-> System.out.print(t + " "));
                forEach(Utils::printWithSpace);
    }

    /*
    Comparator.comparing() compares the elements in the stream according to the given condition (which happens to be the length in this example)
    String::length is the method reference of t-> t.length()

    sorted(Comparator.comparing(String::length).reversed())  => returns elements sorted from longest to shortest

    So here, we are asking sorted() to sort the elements after comparing their length.

    NOTE: If two elements have same length, sorted() method will sort them in the insertion order

     */

    // Create a method to sort the unique elements according to their last character
    // [Ronaldinho, Messi, Zidane, Torres, Torres, Yamin, Pelinovich, Maldini, CR7, Arda Güler]

    public static void sortedByLastChar(List<String> list){
        list.
                stream().
                distinct().
                sorted(Comparator.comparing(t-> t.charAt(t.length()-1))).
                forEach(t-> System.out.print(t +  " "));
    }

    public static void sortedByLastCharWithUtils(List<String> list){
        list.
                stream().
                distinct().
                sorted(Comparator.comparing(Utils::getLastChar)).
                forEach(Utils::printWithSpace);
    }



    // Create a method to sort the unique elements according to their first character
    // [Ronaldinho, Messi, Zidane, Torres, Torres, Yamin, Pelinovich, Maldini, CR7, Arda Güler]

    public static void sortedByFirstChar(List<String> list){
        list.
                stream().
                distinct().
                sorted(). // sorts the Strings in alphabetical order anyway
                // sorted(Comparator.comparing(t-> t.charAt(0))).
                forEach(t-> System.out.print(t +  " "));
    }


}
