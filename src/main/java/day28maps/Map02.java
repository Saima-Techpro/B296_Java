package day28maps;

import java.util.HashMap;

public class Map02 {
    public static void main(String[] args) {

        /*
        -	Hashing Technique" means Java creates unique values (hash codes) for each element.
        -	HashMap can accept "Key" as null; other Maps don't.
        -	Value can be null repeatedly.
        -	The order in HashMap is random order. It's superfast.
         */

        HashMap<String, Integer> stdAges = new HashMap<>();
        stdAges.put("Ali", 19);
        stdAges.put("Asye", 21);
        stdAges.put("Veli", 22);
        stdAges.put("Fatma", 19);
        stdAges.put("Maryam", 25);
        System.out.println("stdAges = " + stdAges); // {Asye=21, Veli=22, Fatma=19, Maryam=25, Ali=19}


        // Can we add null as key?
        stdAges.put(null, 18);
        stdAges.put(null, 21);
        System.out.println("stdAges = " + stdAges); // {null=18, Asye=21, Veli=22, Fatma=19, Maryam=25, Ali=19}


        // Can we add null as value?
        stdAges.put("Hasan", null);
        stdAges.put("Rumeysa", null);
        stdAges.put("Someone else", null);
        System.out.println("stdAges = " + stdAges); // {null=21, Asye=21, Hasan=null, Veli=22, Fatma=19, Someone else=null, Maryam=25, Rumeysa=null, Ali=19}


        // replace()
        stdAges.replace("Ali", 21);
        System.out.println("stdAges = " + stdAges); // {null=21, Asye=21, Hasan=null, Veli=22, Fatma=19, Someone else=null, Maryam=25, Rumeysa=null, Ali=21}

        stdAges.replace("Asye", 21, 25);
        System.out.println("stdAges = " + stdAges);

        // replace() method is used to update values using their keys
        // Technically, you can do the same with put, but using replace provides clearer information
        // replace() method can also work by checking the old value,
        // assign new value conditionally => if the old value matches, it will be replaced with new value


        // putIfAbsent() => checks if that key exists already or not
        stdAges.putIfAbsent("Ali", 35);
        System.out.println("stdAges = " + stdAges);

        stdAges.putIfAbsent("Arda", 35);
        System.out.println("stdAges = " + stdAges);

        // get() => returns the value of the given key
        // getOrDefault() => returns the value of the given key if that key EXISTS in the map
        // otherwise it returns the default value that you provided
        // We can set any default value

        System.out.println(stdAges.get("Fatma")); // 19
        System.out.println(stdAges.get("Mikail")); // null

        System.out.println(stdAges.getOrDefault("Fatma", -1)); // 19
        System.out.println(stdAges.getOrDefault("Mikail", -1));  // -1

        // remove(key) => checks the given key, if matches, removes the whole entry (key:value pair)
        // remove(key, value) => checks the given key and value, if matches, removes the whole entry (key:value pair)

        // {null=21, Asye=25, Arda=35, Hasan=null, Veli=22, Fatma=19, Someone else=null, Maryam=25, Rumeysa=null, Ali=21}
        //System.out.println(stdAges.remove("Someone else")); // null
        stdAges.remove("Someone else");
        System.out.println("stdAges = " + stdAges); // {null=21, Asye=25, Arda=35, Hasan=null, Veli=22, Fatma=19, Maryam=25, Rumeysa=null, Ali=21}

        stdAges.remove("Hasan", null);
        System.out.println("stdAges = " + stdAges); // {null=21, Asye=25, Arda=35, Veli=22, Fatma=19, Maryam=25, Rumeysa=null, Ali=21}

        stdAges.remove("Arda", 45); // looks for the exact match ; if not found, the entry doesn't get removed
        System.out.println("stdAges = " + stdAges);



    }
}
