package miniprojects.miniproject2_BusTicketCalculation;

import java.util.Scanner;

public class TicketReservation {


    // Create start() method which will be called to start the reservation process

    public static void start(Bus bus , Ticket ticket){
        Scanner scanner = new Scanner(System.in);

        int select;
        // use loop to present the choice options to every passenger once the start() is called

        do{
            System.out.println(" Welcome Bouka Transport Reservation Desk");

            // Get distance from the user
            System.out.println("Enter the distance that you want to travel");
            double userDistance = scanner.nextDouble();

            //Get journey type from the user
            System.out.println("Choose the journey trip.");
            System.out.println("1 - One way \n2 - Round trip");
            int userJourneyType = scanner.nextInt();

            // Get age from the user
            System.out.println("Enter your age.");
            int userAge = scanner.nextInt();

            // Ask user to choose the seat
            System.out.println("Please choose the seat number.");
            System.out.println("Single seats are 20% expensive than others");
            // Present list of the available seats to the user, so they can choose a seat
            System.out.println("Available seats = " + bus.seats);
            int userSeat = scanner.nextInt(); // now we save the seat chosen by the user in this variable

            // Remove the seat chosen by the user from the available seat list
            bus.seats.remove(String.valueOf(userSeat));

            /*
            Conditions:
            Values received from the user must be valid (distance and age are positive numbers,
            trip type is 1 or 2).
            Otherwise, "You Have Entered Wrong Data!" or Any warning should be given.
             */

            // to check journey type
            boolean check = userJourneyType==1 || userJourneyType==2;



            if (userDistance > 0 && userAge > 0 && check){
                // initialise the variables stored in Ticket class with the values provided by the user
                ticket.distance = userDistance;
                ticket.journeyType = userJourneyType;
                ticket.seatNo = userSeat;



                // calculate the price
                calculatePrice(ticket , userAge);
                ticket.printTicket(bus);

            }else {
                System.out.println("You Have Entered Wrong Data!");
            }

            // option to restart
            System.out.println("Enter any number to restart or press 0 to quit!");
            select = scanner.nextInt();



        }while (select != 0);
    }



    // Create a method for price calculation
    public static double calculatePrice(Ticket ticket, int age){
        // distance, journeyType, seatNo, age

        // store these values in local variables, so we can apply discounts
        double dis = ticket.distance;
        int type = ticket.journeyType;
        int seat = ticket.seatNo;

        double total = 0;

        switch (type){
            case 1: // one-way trip
                if (seat%3==0){ // for single seat, the ticket price is increased by 20%.
                    total = dis*1.2;
                }else {
                    total = dis*1;
                }
                System.out.println("Total price: "+ total);
                break;
            case 2: // round trip (2 ways)
                if (seat%3==0){ // for single seat, the ticket price is increased by 20%.
                    total = dis*2.4;
                }else {
                    total = dis*2;
                }
                System.out.println("Total price: "+ total);
                // Round-trip, 20% discount is applied on the ticket price.
                total = total*0.8;
                System.out.println("Total price after discount for Round Trip: "+ total);
                break;
        }


        // age discount
        if (age>0 && age < 6){
            total = 0;
            System.out.println("Children up to the age of 5 go free");
        } else if (age < 12) {
            total = total*0.5; // 50% discount
            System.out.println("Total price after child under 12 discount: " + total );
        } else if (age < 25){ // age >=12 && age < 25
            total = total*0.9; //10% discount
            System.out.println("Total price after student discount: " + total );
        } else if (age > 65) {
            total = total*0.7; // 30% discount
            System.out.println("Total price after elderly discount: " + total );
        }

        return ticket.price = total;
    }


}
