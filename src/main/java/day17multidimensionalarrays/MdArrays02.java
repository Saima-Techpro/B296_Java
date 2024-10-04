package day17multidimensionalarrays;

import java.util.Arrays;

public class MdArrays02 {
    public static void main(String[] args) {

        // Find the longest element from a given multidimensional arrays.
        String[][] str = {
                {"apple", "banana", "kiwi"},
                {"Manchester United", "Arsenal", "Liverpool"},
                {"iPhone", "Galaxy Note", "Huawei", "Nova"}
        };

        System.out.println(Arrays.deepToString(str)); // [[apple, banana, kiwi], [Manchester United, Arsenal, Liverpool], [iPhone, Galaxy Note, Huawei, Nova]]

        // [[apple, banana, kiwi], [Manchester United, Arsenal, Liverpool], [iPhone, Galaxy Note, Huawei, Nova]]
        String longestElement = "";
        // System.out.println(longestElement.length()); // 0

        for (String[] eachArray : str) {
            // System.out.println(eachArray.length);
            for (String element : eachArray) {
                // System.out.println(element.length());
                if (element.length() > longestElement.length()) {
                    longestElement = element;
                }
            }
        }
        System.out.println("longestElement = " + longestElement);


    }
}
