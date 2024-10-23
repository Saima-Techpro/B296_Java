package day28maps;
import java.util.*;
public class HW {
    public static void main(String[] args) {

        /*
        Homework: Interview Question
        - Write code that shows how many times each word is used in a given String.
        - The operation should be case-insensitive.
        - Mike is Mike.  => mike is mike ==> mike, is, mike
        - expected result should be in a map => {mike=2, is=1}
        - Extension: Also count the letters => {m=2, i=3....}


         */

        String str = "Mike is Mike.";

        str = str.replaceAll("\\p{Punct}","").toLowerCase();
        System.out.println("v1 => " + str); //v1 => mike is mike

        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words)); //[mike, is, mike]

        //create an empty map to store words and number of usage

        HashMap<String, Integer> myMap = new HashMap<>();
        for(String w : words){  //[mike, is, mike]
            Integer usage = myMap.get(w); //check the map if there is any value of the key; if no, put the key into the map with value of 1
            //...if yes, put key into map by increasing existing value by one
            if(usage == null){
                myMap.put(w, 1);
            }else{
                myMap.put(w, usage+1);
            }
        }
        System.out.println(myMap);//{mike=2, is=1}


        //Another way:
        String sentence = "How much wood would a woodchuck chuck if a woodchuck could Chuck wood WOOD";
        String[] splittedSentence = sentence.toLowerCase().split(" ");

        Map<String, Integer> map = new HashMap<> ();

        for (String w:splittedSentence) {
            if (!w.equals(" ")) { // Ignore spaces
                if (!map.containsKey(w)) {  // if map doesn't contain the string
                    map.put(w, 1);
                } else {
                    int count = map.get(w); // returns the value of w
                    map.put(w, count + 1);

                }
            }

        }
        System.out.println(map);

    }
}
