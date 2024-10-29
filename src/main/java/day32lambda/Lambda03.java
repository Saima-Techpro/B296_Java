package day32lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda03 {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Natalia");
        myList.add("Ali");
        myList.add("Rumeysa");
        myList.add("Hasibullah");
        myList.add("Kemal");
        myList.add("Ali");
        myList.add("rumeysa");
        // System.out.println("myList = " + myList); // [Natalia, Ali, Rumeysa, Hasibullah, Kemal, Ali, rumeysa]

        printElements(myList); // Natalia Ali Hasibullah Kemal Ali

        System.out.println();
        System.out.println("=================");

        elementsGreaterThanSix(myList);
        System.out.println("=================");

        System.out.println(elementsGreaterThanFive(myList));

        System.out.println("================");
        elementsGreaterThanFive1(myList);

        System.out.println("===============");
        listOfElements2(myList);
        System.out.println();
        System.out.println("===============");
        listOfElements3(myList);
        System.out.println();
        System.out.println("===============");
        removeIfGreaterThanSeven(myList);
    }

    // Create a method to print the elements except the ones that start with 'r' or 'R'

    public static void printElements(List<String> list){
        list.stream().filter(t -> !t.startsWith("R") && !t.startsWith("r")).forEach(t-> System.out.print(t +" "));

    }

    // Create a method to print the UNIQUE elements whose number of characters is greater 6
    // [Natalia, Ali, Rumeysa, Hasibullah, Kemal, Ali, rumeysa]

    public static void elementsGreaterThanSix(List<String> list){

        list.stream().
                distinct().
                filter(t-> t.length() > 6 ).
                forEach(t-> System.out.println(t));

    }

    /*

     Create a method returning version of the list as follows:
    1.	must contain elements whose length is greater than 5
    2.  must contain elements all converted to uppercase
    3.	must return as a list as well

     */

    public static List<String> elementsGreaterThanFive(List<String> list){
        return list.stream().filter(t-> t.length()>5).map(t -> t.toUpperCase()).toList();
    }

    public static void elementsGreaterThanFive1(List<String> list){
       List<String> myList =  list.stream().filter(t-> t.length()>5).map(t -> t.toUpperCase()).collect(Collectors.toList());
        System.out.println("myList = " + myList);
    }

    /*
    Create a method returning version of the list as follows:
    1.	must contain UNIQUE elements
    2.  must be in alphabetical order
    3. must be in lowercase
    4. must return as a list as well
    5. print the elements in the same line with space between
    */

    // [Natalia, Ali, Rumeysa, Hasibullah, Kemal, Ali, rumeysa]
    public static void listOfElements2(List<String> list){
        list.stream().sorted().map(t-> t.toLowerCase()).distinct().toList().forEach(t-> System.out.print(t+" "));
    }
    // ali hasibullah kemal natalia rumeysa

    public static void listOfElements3(List<String> list){
        list.stream().distinct().sorted().map(t-> t.toLowerCase()).toList().forEach(t-> System.out.print(t+" "));
    }
    // ali hasibullah kemal natalia rumeysa rumeysa


    // Create a method to delete the elements whose length is greater than 7
    public static void removeIfGreaterThanSeven(List<String> list){
        // we don't need to use stream() here because removeIf() method comes from Collection interface
        // we can use it directly with our list
        list.removeIf(t-> t.length() >7);
        System.out.println(list);
    }

}
