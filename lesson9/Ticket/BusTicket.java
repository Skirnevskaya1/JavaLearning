package Ticket;

public class BusTicket extends Ticket {

    protected boolean ticketPass(boolean ticket) {
        if (ticket == true) {
            System.out.println("get on the bus");
        } else {
            System.out.println("no bus allowed");
        }
        return ticket;
    }
}
