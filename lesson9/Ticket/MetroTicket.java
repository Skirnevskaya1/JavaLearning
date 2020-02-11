package Ticket;

public class MetroTicket extends Ticket {

    public MetroTicket(String ticketName) {
        super(ticketName);
    }

    @Override
    public void ticketPass(boolean ticket) {
        if (ticket == true) {
            showInfo();
            System.out.println("Проходите!");
        } else {
            showInfo();
            System.out.println("Проход воспрещен!");
        }
    }
}
