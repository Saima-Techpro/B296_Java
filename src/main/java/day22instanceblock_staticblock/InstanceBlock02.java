package day22instanceblock_staticblock;

public class InstanceBlock02 {

    // instance block runs first
    // constructor runs next
    // other class members(variables+methods) run next

    // In case of multiple instance blocks, it follows the order from top to bottom


    // instance variables (non-static) variables are object property => you need to create an object to reach out to them

    public int year ; // instance / class variable

    public int price;
    public String colour;
    public String fuelType;
    public String brand;
    public String model;
    public boolean airCond;



    // instance block
    {
        System.out.println("Hello everyone!");
    }

    {
        System.out.println(price = 60000);
        System.out.println(colour = "Black");
        System.out.println(fuelType = "Diesel");
        System.out.println(brand = "Honda");
        System.out.println(model = "Accord");
        System.out.println(airCond = true);

    }


    // default constructor
    public InstanceBlock02(){
        //System.out.println("Hello everyone!"); // To avoid repetition, we put this msg in instance block
    }

    // parameterised constructor
    public InstanceBlock02(int year){
       //  System.out.println("Hello everyone!");
        this.year = year;
        System.out.println(year);
    }


    public InstanceBlock02(int year, int price, String colour, String fuelType, String brand, String model, boolean airCond) {
        this.year = year;
        this.price = price;
        this.colour = colour;
        this.fuelType = fuelType;
        this.brand = brand;
        this.model = model;
        this.airCond = airCond;
    }

    public static void main(String[] args) {

        InstanceBlock02 obj1 = new InstanceBlock02();

        InstanceBlock02 obj2 = new InstanceBlock02(2022);

        InstanceBlock02 obj3 = new InstanceBlock02(2024);

        System.out.println("=======================");

        InstanceBlock02 obj4 = new InstanceBlock02(2024, 90000, "White", "Hybrid", "Nissan", "Patrol", true);


        System.out.println(obj4.colour); // White
        System.out.println(obj4.fuelType); // Hybrid


    }



}
