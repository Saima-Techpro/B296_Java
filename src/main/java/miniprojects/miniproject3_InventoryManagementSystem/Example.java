package miniprojects.miniproject3_InventoryManagementSystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {

        List<String> strList = new ArrayList<>(Arrays.asList("Ali", "William", "Maryam"));

        System.out.println("strList = " + strList); // [Ali, William, Maryam]

        // method call
        System.out.println(sortByLength(strList)); // [Ali, Maryam, William]

    }

    public static List<String> sortByLength(List<String> list){
       return list.stream().sorted((t, u) -> Integer.compare(t.length(), u.length())).toList();

    }

    // NOTE: we can create CUSTOM COMPARATORS and use them inside the sorted()
    // sorted(Comparator::comparing(t-> t......))



}
