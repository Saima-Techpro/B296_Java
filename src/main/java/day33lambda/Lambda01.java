package day33lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Lambda01 {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Alexander");
        myList.add("Ali");
        myList.add("Yusuf");
        myList.add("Maryam");
        myList.add("Josef");
        myList.add("Shukrullah");
        System.out.println("myList = " + myList); // [Alexander, Ali, Yusuf, Maryam, Josef, Shukrullah]


        // method call
        // removeElements1(myList);  // [Alexander, Ali, Maryam, Josef, Shukrullah]

        // removeElements2(myList); // [Ali, Josef]

        // removeElements3(myList); // [Alexander, Ali, Shukrullah]

        System.out.println(checkLength(myList)); // false

        System.out.println(checkLength1(myList)); // true

        System.out.println(checkLength2(myList)); // true
    }

    // Create a method to delete elements which start with "Y" and ends with "f"
    public static void removeElements1(List<String> list){
//        list.removeIf(t-> t.startsWith("Y") && t.endsWith("f"));
        list.removeIf(t-> t.charAt(0) == 'Y' && t.charAt(t.length()-1) == 'f');

        System.out.println("list = " + list);
    }


    // Create a method to delete elements which contains 'a'
    public static void removeElements2(List<String> list){
        list.removeIf(t-> t.contains("a"));
        System.out.println("list = " + list);
    }


    // Create a method to delete elements whose length is between 4 and 8 or ends with 'f'
    // [Alexander, Alf, Yusuf, Maryam, Josef, Shukrullah]

    public static void removeElements3(List<String> list){
        Predicate<String> condition = t-> t.length() > 4 && t.length()<8 || t.endsWith("f");
        list.removeIf(t-> condition.test(t));
        System.out.println("list = " + list);
    }


    // Create a method to check if ALL elements length is greater than 6
    public static boolean checkLength(List<String> list){
        return  list.stream().allMatch(t-> t.length() > 6);

        // allMatch() checks whether all elements of this stream match the provided predicate.
        // even if a single element doesn't fulfill the condition, allMatch() will return false
    }

    // Create a method to check if ANY element length is greater than 9
    // [Alexander, Ali, Yusuf, Maryam, Josef, Shukrullah]
    public static boolean checkLength1(List<String> list){
        return  list.stream().anyMatch(t-> t.length() > 9);


        // anyMatch() checks if any of the elements of this stream match the provided predicate.
        // even if a single element fulfills the condition, anyMatch() will return true
    }


    // Create a method to check that NONE element should start with "X"
    // [Alexander, Ali, Yusuf, Maryam, Josef, Shukrullah]

    public static boolean checkLength2(List<String> list){
        Predicate<String> condition = t-> t.startsWith("X");
         return list.stream().noneMatch(t -> condition.test(t));

        // return list.stream().noneMatch(t-> t.startsWith("y"));
    }

    /*

list.stream() creates a stream from the list of strings.
.noneMatch(t -> condition.test(t)) is a terminal operation that checks if no element in the stream satisfies the condition.
Specifically, it evaluates condition.test(t) for each element t in the stream:
If any element starts with "X", condition.test(t) returns true for that element, causing noneMatch to return false.
If no element starts with "X" (i.e., condition.test(t) is false for all elements), noneMatch returns true.

Return Value:

If no elements start with "X," checkLength2 will return true.
If at least one element starts with "X," checkLength2 will return false.

In essence, noneMatch is used here to confirm that none of the strings in list start with "X".

     */






}
