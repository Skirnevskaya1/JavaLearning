public class Listener implements Runnable {
    public Listener(Service service) {
        this.service = service;
    }

    Service service;
    Track track;

    @Override
    public void run() {
        service.getTrack(track);
    }
}
