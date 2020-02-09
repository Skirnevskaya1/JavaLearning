package Ticket;

public class MetroTicket extends Ticket {

    protected boolean ticketPass(boolean ticket) {
        if (ticket == true) {
            System.out.println("take the subway");
        } else {
            System.out.println("no subway allowed");
        }
        return ticket;
    }
}
