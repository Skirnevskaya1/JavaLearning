package Ticket;

public class Main {
    public static void main(String[] args) {

        BusTicket busTicket = new BusTicket("Билет на автобус");
        busTicket.ticketPass(true);
        System.out.println("-------------------------------");

        MetroTicket metroTicket = new MetroTicket("Билет на метро");
        metroTicket.ticketPass(false);
        System.out.println("-------------------------------");

        SingleTicket singleTicket = new SingleTicket("Билет универсальный");
        singleTicket.ticketPass(true);
    }
}
