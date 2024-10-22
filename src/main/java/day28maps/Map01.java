package day28maps;

import java.util.*;

public class Map01 {
    public static void main(String[] args) {

        /*

         1) Maps have key - value structure
           2)Keys are unique but values are not
           3)Every element in a Map is called as "Entry"
           4)All elements are called as "EntrySet"
           5)Key cannot be null in maps except "HashMap" but value can
           6)HashMap puts the entries in random order, because of that it is superfast.
	       7)Maps are NOT collections.

-	Maps are like dictionaries. They are descriptive. e.g.: Jim = 13.
-	The left side, i.e., keys, are unique. The value side can have duplicates.
-	For keys, a Set is used. For values, a Collection structure is generally used.
-	***(A Collection structure is used, which can be a List or an Array depending on the situation.)

         */

        // HASHMAP

        HashMap<String , Integer>  myMap = new HashMap<>();
        System.out.println("myMap = " + myMap); // {}
        myMap.put("Tom Cruise", 67);
        myMap.put("John Travolta", 60);
        myMap.put("George Clooney", 56);
        myMap.put("Mat Damen", 49);
        myMap.put("Keira Knightly", 32);
        myMap.put("Kivanc Tatlitug", 36);
        myMap.put("Ann Hathway", 41);

        // HashMap follows random insertion hence fast
        System.out.println("myMap = " + myMap); // {Ann Hathway=41, Kivanc Tatlitug=36, Mat Damen=49, George Clooney=56, Keira Knightly=32, Tom Cruise=67, John Travolta=60}

        // How to get key?
        // keySet() => Returns a Set view of the keys contained in this map.
        // System.out.println("myMap.keySet() = " + myMap.keySet()); // [Ann Hathway, Kivanc Tatlitug, Mat Damen, George Clooney, Keira Knightly, Tom Cruise, John Travolta]

        Set<String> keys = myMap.keySet();
        System.out.println("keys = " + keys); // Ann Hathway, Kivanc Tatlitug, Mat Damen, George Clooney, Keira Knightly, Tom Cruise, John Travolta]


        // How to get values?
        // values() => Returns a Collection view of the values contained in this map.
        // System.out.println(myMap.values()); // [41, 36, 49, 56, 32, 67, 60]
        Collection<Integer> values = myMap.values();
        System.out.println("values = " + values); // [41, 36, 49, 56, 32, 67, 60]

        // How to get a specific data?
        // get() works with the key and returns its value
        //System.out.println(myMap.get("Kivanc Tatlitug"));
        Integer age = myMap.get("Kivanc Tatlitug");
        System.out.println("age = " + age); // 36

        // Can we get key / value pair one by one from the Map?

        // keys only
        for (String w: keys){
            System.out.println(w);
        }

        // values only
        for (Integer w: values){
            System.out.println(w);
        }

        // key=value pair
       // {Ann Hathway=41, Kivanc Tatlitug=36, Mat Damen=49, George Clooney=56, Keira Knightly=32, Tom Cruise=67, John Travolta=60}

        for (Map.Entry<String, Integer> w : myMap.entrySet()){
            System.out.print(w + " ");
        }

        System.out.println();
        System.out.println("====== For loop ======");
        // Can we use other loops?
        // For loop
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(myMap.entrySet());
        int i = 0;
        while (i < entryList.size()) {
            Map.Entry<String, Integer> entry = entryList.get(i);
            System.out.print(entry.getKey() + "=" + entry.getValue() + " ");
            i++;
        }

        System.out.println();
        System.out.println("====== While loop ======");

        // while loop
        List<Map.Entry<String, Integer>> entryList1 = new ArrayList<>(myMap.entrySet());

        int j = 0;
        while (j < entryList1.size()) {
            Map.Entry<String, Integer> entry = entryList1.get(j);
            System.out.print(entry.getKey() + "=" + entry.getValue() + " ");
            j++;
        }






    }
}
