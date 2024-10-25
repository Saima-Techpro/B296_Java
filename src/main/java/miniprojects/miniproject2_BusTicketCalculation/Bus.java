package miniprojects.miniproject2_BusTicketCalculation;

import java.util.ArrayList;
import java.util.List;

public class Bus {
    // bus number , seats
    public String busNum;
    public List<String> seats = new ArrayList<>();

    // Constructor
    public Bus(String busNum){
        this.busNum = busNum;

        // We initiate the seat list inside the constructor so that a new list of 32 seats
        // is available for every new bus object

        for (int i = 1; i < 33; i++){
            seats.add(i + "");
        }

    }

}
