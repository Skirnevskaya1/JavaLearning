import java.math.BigDecimal;

public class Track {
    private static Artist artist;
    private static String name;
    private static int time;
    private static Listener amountOfListening;

    private static int constant = 0;
    private final static int max = 480;
    private final static int min = 40;

    public Track(Artist artist, String name, int time, Listener amountOfListening) {
        this.artist = artist;
        this.name = name + "" + constant;
        this.time = time;
        this.amountOfListening = amountOfListening;
        constant++;
    }

    public static Track getInstance() {
        String name = "Track ";
        int time = (int) (Math.random() * (max - min)) + min;
        return new Track(artist, name, time, amountOfListening);
    }

    @Override
    public String toString() {
        return "Track { " + Artist.name + "; " + name + "; " + time + " секунд(а); " + Listener.amountOfListening + " кол-во прослушиваний }";
    }
}
