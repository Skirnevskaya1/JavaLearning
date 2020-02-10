package Ticket;

public class SingleTicket extends Ticket {

    public SingleTicket(String ticketName) {
        super(ticketName);
    }

    @Override
    public void ticketPass(boolean ticket) {
        if (ticket == true) {
            showInfo();
            System.out.println("Проходите!");
        } else {
            System.out.println("Проход воспрещен!");
        }
    }
}
