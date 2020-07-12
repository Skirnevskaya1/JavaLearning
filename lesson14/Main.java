import java.util.Random;

public class Main {
    static Service service = new Service();
    static Random rand = new Random();
    static Artist artist;
    static Track track;
    static Listener listener;

    public static void main(String[] args) {
        Service.tracks.add(track);

        Thread threadArtist = new Thread(artist.getInstance());
        threadArtist.start();

        Thread threadListener = new Thread(listener.getInstance());
        threadListener.start();
    }

}
