import java.util.ArrayList;

public class Service {

    public static double num = 1;

    public static void main(String[] args) {
        Service service = new Service();
        Track track = new Track("LOLO", "YOPPPP", 5, 5);

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

    //записывает (установка)
    public Track addTrack(Track track) {
        for (; num < track.length; num++) {
            System.out.println("Записываю трек " + num + " на сервис...");
        }
        return track;
    }

    //выдавать треки (получить)
    public Track getTrack(Track track) throws TrackNotFoundException {
        for (int i = 1; i < track.length; i++) {
            if (true) {
                System.out.println("...........................");
                System.out.println("Слушатель получает трек " + track + " с сервиса");
            } else {
                throw new TrackNotFoundException("Внимание! Трек " + track + " не найден!");
            }
        }
        return track;
    }
}
