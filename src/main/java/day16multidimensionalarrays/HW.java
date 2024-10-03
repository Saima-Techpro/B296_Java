package day16multidimensionalarrays;

public class HW {
    public static void main(String[] args) {

        // Create a String Multidimensional array and print all values which contain "a"


        String[][] cities = { { "Istanbul", "Ankara", "Adana", "Izmir" }, { "Washington", "New York", "Chicago" },
                { "London", "Chelsea", "Newcastle" }, { "Berlin", "Hamburg" } };

        for (String[] i : cities) {

            for (String j : i) {

                if (j.contains("a")) {
                    System.out.println(j);
                }

            }
        }
    }
}
