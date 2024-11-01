package miniprojects.miniproject3_InventoryManagementSystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static miniprojects.miniproject3_InventoryManagementSystem.InventoryManagement.*;


public class Runner {
    public static void main(String[] args) {

        /*
        Arrays.asList: This method returns a fixed-size list backed by the original array.
        This means you can modify elements, but you cannot add or remove elements. Attempting to do so will throw an UnsupportedOperationException.

        ArrayList: This is a resizable array implementation in Java. You can freely add or
        remove elements, and the ArrayList will automatically resize to accommodate changes.

        So, by wrapping Arrays.asList in a new ArrayList, you’re creating a flexible,
        resizable list that can handle the addition and removal of items as required by
        the inventory management system.

        Arrays are fixed-size; ArrayList are not.

         */
        List<String> strList = new ArrayList<>(Arrays.asList("Ali", "Veli", "Maryam"));


        List<InventoryItem> inventory = new ArrayList<>(Arrays.asList(
                new InventoryItem("iPhone", 10, 6000.90),
                new InventoryItem("SamSung", 8, 5500.50),
                new InventoryItem("Nokia7610", 5, 2000.85),
                new InventoryItem("Huawei", 12, 5900.30),
                new InventoryItem("Blackberry", 4, 3000)
        ));

       // System.out.println(inventory);

        // Display all items
        System.out.println("Inventory Items: ");
        displayInventory(inventory);

        // Add a new item
        System.out.println("Adding a new item: ");
        addItem(inventory, new InventoryItem("sony", 7, 1800));
        displayInventory(inventory);


        // Remove an item
        System.out.println("Removing an item: ");
        removeItem(inventory, "Nokia7610");
        displayInventory(inventory);


        // Update the quantity of an item
        System.out.println("Update the quantity of an item: ");
        updateItemQuantity(inventory, "sony", 17);
        displayInventory(inventory);

        // Filter items based on a minimum quantity
        System.out.println();
        System.out.println("Filtering items: ");
        System.out.println(filterByMinQuantity(inventory, 10));
        System.out.println("You can call the method inside another method too ");
        displayInventory(filterByMinQuantity(inventory, 10));


        //  Sort items by name of the item, quantity, or price
        System.out.println();
        System.out.println("Sorting by name of the item: ");
        displayInventory(sortByKey(inventory, "item"));

        //  Sort items by name of the item, quantity, or price
        System.out.println();
        System.out.println("Sorting by quantity of the item: ");
        displayInventory(sortByKey(inventory, "quantity"));


        //  Sort items by name of the item, quantity, or price
        System.out.println();
        System.out.println("Sorting by quantity of the price: ");
        displayInventory(sortByKey(inventory, "price"));


        // Calculate the total value of the inventory
        System.out.println();
        System.out.println("Total value of the inventory: ");
        System.out.println(totalInventoryValue(inventory)); // 217416.6


    }
}
