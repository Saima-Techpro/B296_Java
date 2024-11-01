package miniprojects.miniproject3_InventoryManagementSystem;

public class InventoryItem {

    /*
    item: The name of the item (String)
    quantity: The quantity of the item in stock (int)
    price: The price of the item (double)

    We need to make this class IMMUTABLE.
    Which means NO SETTERS
    So this class will NOT be fully encapsulated

    NOTE: In this InventoryItem class, setters are not used because the class is designed to be immutable.

     */
    private final String item;
    private final int quantity;
    private final double price;

    // Constructor to initialise these fields
    public InventoryItem(String item, int quantity, double price) {
        this.item = item;
        this.quantity = quantity;
        this.price = price;
    }

    // Create getters only to give READ-ONLY access

    public String getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }


    // Update the quantity of an item
    public InventoryItem updateWithQuantity(int newQuantity){
        return new InventoryItem(this.item, newQuantity, this.price);
    }
    /*
    Since the InventoryItem class is designed to be immutable (its fields cannot be changed after the object is created),
     this method allows you to create a new instance of InventoryItem with an updated quantity.
     It doesn't change the existing object; instead, it generates a new one with the specified changes.
     */

    @Override
    public String toString() {
        return "{" +
                "item='" + item + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
