package miniprojects.miniproject3_InventoryManagementSystem;

import java.util.List;

public class InventoryManagement {
    /*

1. Display all items in the inventory.
2. Add a new item, remove an item or update the quantity of an item
3. Sort items by name, quantity, or price.
4. Filter items based on a minimum quantity.
5. Calculate the total value of the inventory.
     */

    // Display all items
    public static void displayInventory(List<InventoryItem> inventory){
        inventory.forEach(System.out::println);
    }


    // Add a new item
    public static void addItem(List<InventoryItem> inventory, InventoryItem newItem){
        inventory.add(newItem);
    }

    // Remove an item
    public static void removeItem(List<InventoryItem> inventory, String itemName){
        inventory.removeIf(item -> item.getItem().equalsIgnoreCase(itemName));
    }


    // Update the quantity of an item
//    This method iterates through the inventory list to find the item by name.
//    When the item is found, it creates a new InventoryItem with the updated quantity using the withQuantity method
//    and replaces the old item in the list.
//    This maintains immutability while allowing for updates.

    public static void updateItemQuantity(List<InventoryItem> inventory, String itemName, int newQuantity){
        // to iterate through all objects in our inventory list, we use loop
        for (int i = 0; i < inventory.size(); i++) {
            InventoryItem item = inventory.get(i);  // this item will be used to compare with the parameter and if item with this name exists in our inventory, further action will be done

            if (item.getItem().equalsIgnoreCase(itemName)){
                // then create a new InventoryItem with the updated quantity
                inventory.set(i, item.updateWithQuantity(newQuantity));  // set() method will set the new object created through method call updateWithQuantity() at the index i
                break; // exit after updating the first match that this loop will find
            }
        }
    }
    // NOTE: the old item in the list will be cleaned up by the garbage collector if there are no other references to it, leaving the list with only the updated item.

    /* OR using for-each loop

    public static void updateItemQuantity(List<InventoryItem> inventory, String itemName, int newQuantity) {
        for (InventoryItem item : inventory) {
            if (item.getItem().equalsIgnoreCase(itemName)) {
                // Create a new InventoryItem with the updated quantity
                int index = inventory.indexOf(item); // Get the index of the item
                inventory.set(index, item.withQuantity(newQuantity)); // Update the item
                break; // Exit after updating the first match
            }
        }
    }

    Note about for-each loop:
    While this loop works fine, using indexOf can lead to a performance hit if the list is large,
    as it searches through the list to find the index. In cases where performance is critical, it might be better to
    use the traditional for-loop approach or use an iterator.

     */


   //  Sort items by name of the item, quantity, or price
    public static List<InventoryItem> sortByKey(List<InventoryItem> inventory, String key){

        return  inventory.stream().sorted((item1, item2) -> {
            switch (key){
                case "item":
                    return item1.getItem().compareTo(item2.getItem());
                case "quantity":
                    return Integer.compare(item1.getQuantity(), item2.getQuantity());
                case "price":
                    return Double.compare(item1.getPrice(), item2.getPrice());
                default:
                    throw new IllegalArgumentException("Invalid key: " + key);
            }
        }).toList();

    }
    /*
        NOTES about sortByKey()
        .sorted((item1, item2) -> { ... }): The sorted method uses a custom comparator to determine the order by which to sort the list.
        return item1.getItem().compareTo(item2.getItem()); =>  Compares item1 and item2 based on their item field (getItem())
        return Integer.compare(item1.getQuantity(), item2.getQuantity());  => Compares item1 and item2 by their quantity (assumed to be an int).
        return Double.compare(item1.getPrice(), item2.getPrice());  => Compares item1 and item2 by their price (assumed to be a double).

    In Java, the sorted method allows us to define how items should be compared to establish their
    order. The term "custom comparator" here means that instead of using a predefined comparison method,
    we are creating our own comparison logic within the sorted method.

    If key is "item", it uses item1.getItem().compareTo(item2.getItem()), which orders items alphabetically.
    If key is "quantity", it uses Integer.compare(item1.getQuantity(), item2.getQuantity()), ordering items by quantity.
    If key is "price", it uses Double.compare(item1.getPrice(), item2.getPrice()), ordering by price.


     */

   // Filter items based on a minimum quantity
    public static List<InventoryItem> filterByMinQuantity(List<InventoryItem> inventory, int minQuantity){
        return  inventory.stream().filter(t-> t.getQuantity() >= minQuantity).toList();
    }


   // Calculate the total value of the inventory
    public static double totalInventoryValue(List<InventoryItem> inventory){
       return inventory.stream().mapToDouble(t-> t.getQuantity() * t.getPrice()).sum();
    }

    // OR using map() and reduce() combination on Mr Shukrullah's suggestion :)

//    public static double totalInventoryValue(List<InventoryItem> inventory) {
//        return inventory.stream()
//                .map(item -> item.getQuantity() * item.getPrice())  // Map each item to its value
//                .reduce(0.0, Double::sum);                          // Sum all values
//    }

    /*
    chatGPT answer about which one is better?

    mapToDouble(...).sum()	=> Maps each item to a double value and sums directly	=> Best for readability and performance when calculating sums
    map(...).reduce(...)	=> Maps to a value and reduces with a custom operation	=> Use when you need more control over the reduction, like custom operations

    For this particular case, mapToDouble(...).sum() is generally better due to its readability and efficiency
    with primitive streams. It’s designed specifically for scenarios where you want to map elements to primitive
    values and sum them, making it a more straightforward and efficient solution.
     */

}
