package Ticket;

public abstract class Ticket {
    private String ticketName;

    public Ticket(String ticketName) {
        this.ticketName = ticketName;
    }

    public void showInfo() {
        System.out.println("Ваш билет: " + ticketName);
    }
    public abstract void ticketPass(boolean ticket);
}
