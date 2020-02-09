package Ticket;

public class Ticket {

    public static void main(String[] args) {
        boolean ticket = false;

        BusTicket busTicket = new BusTicket();
        busTicket.ticketPass(ticket);

        MetroTicket metroTicket = new MetroTicket();
        metroTicket.ticketPass(ticket);
    }
}
