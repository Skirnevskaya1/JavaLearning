public class Track {
    private static Artist artist;
    private static String name;
    private static int time;
    private static long amountOfListening;

    private static int constant = 0;
    private final static int max = 200;
    private final static int min = 100;

    public Track(Artist artist, String name, int time, long amountOfListening) {
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
        return "Track { " + Artist.name + " " + name + " " + time + " " + amountOfListening + " }";
    }
}
