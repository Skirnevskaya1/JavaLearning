
public class Artist implements Runnable {
    Track track;
    Service service;

    public Artist(Track track, Service service) {
        this.track = track;
        this.service = service;
    }

    @Override
    public void run() {
        try {
            System.out.println("Пришло вдохновение! Создаю трек.");
            Thread.sleep(1000);

            service.addTrack(track);
            System.out.println("Трек успешно отправлен на сервис!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ОШИБКА! Не получилось создать и отправить трек");
        }
    }
}
