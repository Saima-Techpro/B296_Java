package day28maps;

import java.util.*;

public class Map03 {
    public static void main(String[] args) {

        /*
         a)HashMap is non-synchronized. This means that multiple threads can access a HashMap at the same time.
        For example, if one customer withdraws money while another deposits at the same time, it could result in an
        incorrect account balance. (it is also not thread-safe)
        However, synchronization must be managed manually in such cases.
        (developers use special structures like Synchronized Blocks, Locks, and Semaphores.)

        b)HashTable is thread - safe and synchronized
        (meaning that only one thread can use the same Hashtable at a time, creating a queue and extending the service
        time).

        // DIFFERENCE
        a) HashMap allows one null key(must be unique, cannot have 2 nulls, it would overwrite) and as many null values as
        you want.

        b) Hashtable does not allow null values for either keys or values.

        Attempting to add a null value will throw a NullPointerException.

        HashMap is fast, HashTable is slower compared to HashMap.

        Note:Both HashMaps and HashTables store their entries in a random order.

         */


        Hashtable<String, Integer> stdGrades = new Hashtable<>();
        stdGrades.put("Ali", 94);
        stdGrades.put("Aisha", 96);
        stdGrades.put("Veli", 90);
        stdGrades.put("Kemal", 95);
        stdGrades.put("Mert", 94);
        stdGrades.put("Hulya", 94);
        System.out.println("stdGrades = " + stdGrades); // {Aisha=96, Hulya=94, Mert=94, Ali=94, Kemal=95, Veli=90}


        // Can we add null to Hashtable?
        // NO
        // stdGrades.put(null, 85); // NullPointerException
       //  stdGrades.put("Mehmet", null); // NullPointerException
       // System.out.println("stdGrades = " + stdGrades);



        /*
            *** TREEMAP ***
        TreeMap keeps the data in natural order, so they are very slow
        They order entries considering keys
        They are not thread safe and synchronized
        Don't allow null in key part, but allow null in value part

         */
        TreeMap<String, String> capitals = new TreeMap<>();
        capitals.put("UK", "London");
        capitals.put("Turkiye", "Ankara");
        capitals.put("UAE", "Abu Dhabi");
        capitals.put("Spain", "Madrid");
        capitals.put("Germany", "Berlin");

        System.out.println("capitals = " + capitals); // {Germany=Berlin, Spain=Madrid, Turkiye=Ankara, UAE=Abu Dhabi, UK=London}


        // TreeMap does NOT allow null key, but accepts null value
        //capitals.put(null, "Rome"); // NullPointerException
        capitals.put("Italy", null);
        capitals.put("Afghanistan", null);
        capitals.put("Tunisia", null);
        System.out.println("capitals = " + capitals);


        /*
           *** LinkedHashMap ***
               It keeps the entries with insertion order and keeps the order all the time
         */

        LinkedHashMap<String, String> capitals1 = new LinkedHashMap<>();
        capitals1.put("UK", "London");
        capitals1.put("Turkiye", "Ankara");
        capitals1.put("UAE", "Abu Dhabi");
        capitals1.put("Spain", "Madrid");
        capitals1.put("Germany", "Berlin");

        // LinkedHashMap follows the insertion order
        System.out.println("capitals1 = " + capitals1);// {UK=London, Turkiye=Ankara, UAE=Abu Dhabi, Spain=Madrid, Germany=Berlin}


        // Get the entries from the map ony by one. Then separate the keys and values

        Set<Map.Entry<String, String>> allEntries = capitals.entrySet();
        System.out.println("allEntries = " + allEntries);


        for (Map.Entry<String, String> w: allEntries){
            String key = w.getKey();
            String value = w.getValue();

            System.out.println("key = " + key);
            System.out.println("value = " + value);
        }










    }
}
