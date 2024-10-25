package miniprojects.miniproject2_BusTicketCalculation;

public class Runner {
    public static void main(String[] args) {
        // Create Bus object
        Bus bus = new Bus("74");
//        System.out.println(bus.seats);

        // Create Ticket object
        Ticket ticket = new Ticket();

        // start the process
        TicketReservation.start(bus, ticket);


    }

}
