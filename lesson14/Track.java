public class Track {
    private static Artist artist;
    private static String name;
    private static int time;
    private static int amountOfListening;
    private static int constant = 0;
    private final static int max = 480;
    private final static int min = 40;

    public Track(Artist artist, String name, int time, int amountOfListening) {
        this.artist = artist;
        this.name = name + "" + constant;
        this.time = time;
        // this.amountOfListening = amountOfListening + constant;
        this.amountOfListening = amountOfListening;
        constant++;
    }

    public static Track getInstance() {
        artist = null;
        name = "Track ";
        time = (int) (Math.random() * (max - min)) + min;
        amountOfListening = 0;
        return new Track(artist, name, time, amountOfListening);
    }

    public static String getAmountOfListening() {
        int amount = amountOfListening + 1;
        return "Track { " + Artist.name + "; " + name + "; " + time + " секунд(а); " + amount + " кол-во прослушиваний }";
    }

    @Override
    public String toString() {
        return "Track { " + Artist.name + "; " + name + "; " + time + " секунд(а); " + amountOfListening + " кол-во прослушиваний }";
    }
}
