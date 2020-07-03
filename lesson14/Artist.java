
public class Artist implements Runnable {
    Track track;
    Service service;

    public Artist(Track track, Service service) {
        this.track = track;
        this.service = service;
    }

    @Override
    public void run() {
        track.getAmountOfListening();
        track.setAmountOfListening(0);
        try {
            System.out.println("Пришло вдохновение! Артист " + track.getArtist() + " создает трек");
            Thread.sleep(1000);
            service.addTrack(track);
            System.out.println("Трек успешно отправлен на сервис!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ОШИБКА! Не получилось создать и отправить трек");
        }
    }
}
