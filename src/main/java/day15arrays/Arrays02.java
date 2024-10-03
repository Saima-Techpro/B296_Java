package day15arrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        // Example: Create a String array and print the elements in Alphabetical order

        // 1sy way:
        // String[] countries = new String[5];

        //2nd way:
        String countries[] = new String[5];
        countries[0] = "Turkiye";
        System.out.println(Arrays.toString(countries)); // [Turkiye, null, null, null, null]

        // 3rd way
        String countries1[] = {"Turkiye", "Germany", "UK", "Bulgaria", "Spain"};
        System.out.println(Arrays.toString(countries1)); // [Turkiye, Germany, UK, Bulgaria, Spain]

        // countries1[5] = "USA";  // ArrayIndexOutOfBoundsException

        // How to update a value on an existing index?
        countries1[2] = "USA";
        System.out.println(Arrays.toString(countries1));


        // To order the Arrays, we use sort() method
        // String arrays will be sorted in alphabetical order
        // Numeric arrays will be sorted in ascending order
        // Original array will be changed after sort() method

        Arrays.sort(countries1);
        System.out.println("alphabetical order: " + Arrays.toString(countries1)); // [Bulgaria, Germany, Spain, Turkiye, USA]
        System.out.println(countries1[0]); // Bulgaria


        System.out.println("======== Example 2 =========");
        // Example: Create a String array called names with a size of 5.
        // Print the names whose length is less than 6

        String names[] = {"Ali", "Asye", "Hulya", "Shukrullah", "Pelin"};
        System.out.println(names.length); // 5
        System.out.println(Arrays.toString(names));  // [Ali, Asye, Hulya, Shukrullah, Pelin]

        for (String w : names) {
            if (w.length() < 6) {
                System.out.println(w);
            }

        }


        System.out.println("=============================");

        // Print all the names before "Hulya"
        // [Ali, Asye, Hulya, Shukrullah, Pelin]

        for (String w : names){
            if (w.equals("Hulya")){
                break;
            }

            System.out.print(w + " ");
        }
        System.out.println();
        System.out.println("=============================");
        // Print all the names before "Hulya" and "Hulya"
        // [Ali, Asye, Hulya, Shukrullah, Pelin]

        for (String w : names){

            System.out.println(w);

            if (w.equals("Hulya")){
                break;
            }

        }

        System.out.println("=============================");
        // Print all the names after "Hulya"
        // [Ali, Asye, Hulya, Shukrullah, Pelin]

        for (String w : names){
            if (w.equals("Hulya")){
                continue; // this keyword is used to skip the value if it matches the given condition
            }
            System.out.println(w);
        }



    }
}
