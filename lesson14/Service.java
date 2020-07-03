import java.util.ArrayList;

public class Service {

    public static void main(String[] args) {
        Service service = new Service();
        Track track = new Track("BBB", "follow you", 2, 3.05, 4);

        ArrayList<Artist> arrayListArtist = new ArrayList<Artist>();
        Artist artist = new Artist(track, service);
        arrayListArtist.add(artist);

        Thread threadArtist = new Thread(artist);
        threadArtist.start();

        ArrayList<Listener> arrayListListener = new ArrayList<Listener>();
        Listener listener = new Listener(service, track);
        arrayListListener.add(listener);

        Thread threadListener = new Thread(listener);
        threadListener.start();
        try {
            threadListener.join(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Ошибка!");
        }
    }

    public Track addTrack(Track track) {
        System.out.println("Записываю на сервис трек " + track.toStringAdd());
        return track;
    }

    public Track getTrack(Track track) throws TrackNotFoundException {
        if (true) {
            System.out.println("Слушатель получает с сервиса трек " + track.toStringGet());
        } else {
            throw new TrackNotFoundException("Внимание! Не найден трек " + track.toStringGet());
        }
        return track;
    }
}
