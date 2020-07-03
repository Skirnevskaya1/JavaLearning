public class Listener implements Runnable {
    Service service;
    Track track;

    public Listener(Service service, Track track) {
        this.service = service;
        this.track = track;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(2000);
            service.getTrack(track);
            System.out.println("Трек получен!");
        } catch (InterruptedException | TrackNotFoundException e) {
            e.printStackTrace();
            System.out.println("Возникла ошибка в получении трека!");
        }
    }
}
