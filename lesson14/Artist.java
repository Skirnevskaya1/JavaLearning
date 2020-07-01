
public class Artist implements Runnable {
    Track track;
    Service service;

    public Artist(Track track) {
        this.track = track;
    }

    @Override
    public void run() {
        service.addTrack(track);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Отправляю трек на сервис");
    }
}
