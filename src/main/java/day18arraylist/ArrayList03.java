package day18arraylist;

import java.util.ArrayList;

public class ArrayList03 {
    public static void main(String[] args) {

        // Create a String ArrayList with duplicate values. Transfer the unique values into new ArrayList
        ArrayList<Character> a = new ArrayList<>();
        a.add('J');
        a.add('a');
        a.add('a');
        a.add('v');
        a.add('a');
        System.out.println("a = " + a); // [J, a, a, v, a]

        ArrayList<Character> b = new ArrayList<>(); // to store unique values
        System.out.println("b = " + b); // []

        for (Character w : a) {
            if (!b.contains(w)) {
                b.add(w);
            }
        }
        System.out.println("b = " + b); // [J, a, v]

        // HW
        // Solve the above using 'continue' keyword



        //         INTERVIEW QUESTION
        // Create a String ArrayList for cities and remove the ones that contains "u"

        ArrayList<String > cities = new ArrayList<>();
        cities.add("Dubai");
        // cities.add("Zurich");  add this later to show the importance of index control through i--
        cities.add("London");
        cities.add("Baku");
        cities.add("Izmir");
        cities.add("Istanbul");
        System.out.println("cities = " + cities); // [Dubai, London, Baku, Izmir, Istanbul]

        /*

        for (String w : cities){
            if (w.contains("u")){
                cities.remove(w);
            }
        }
        System.out.println("cities after removing= " + cities); // ConcurrentModificationException

        NOTE:

        The above loop shows error (throw exception => ConcurrentModificationException).
        This is the loop's way of telling us that structure of the ArrayList is constantly changing;
        and it's impossible to work with it.
        We know the reason is ArrayList always reindex their elements whenever we add/remove an element.
        So we need to create a logic where we can control the index from moving on i.e. loop stays at the
        same index.
        We will use decrement for that purpose

         */

        // [Dubai, London, Baku, Izmir, Istanbul]

        for (int i = 0; i < cities.size(); i++){
            if (cities.get(i).toLowerCase().contains("u")){
                cities.remove(i);
                i--;
            }

        }

        System.out.println("cities = " + cities);


    }
}
