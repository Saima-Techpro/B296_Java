package miniprojects.miniproject2_BusTicketCalculation;

public class Ticket {
    // Distance , journey type, seatNo, price

    public double distance;
    public int journeyType;
    public int seatNo;
    public double price;


    // This method will be called to print the ticket
    public void printTicket(Bus bus){
        System.out.println("------ Ticket Detail -------");
        System.out.println("Bus Num = " + bus.busNum);
        System.out.println("Distance = " + this.distance + " km");
        System.out.println("Journey Type = " + (this.journeyType == 1 ? "One way" : "Round Trip"));
        System.out.println("Seat No = " + this.seatNo);
        System.out.println("Total Price = $" + Math.round(this.price));
        System.out.println("Have a nice trip!!!");
    }


}
