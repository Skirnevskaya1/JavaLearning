public class Track {
    private String artist;
    private String name;
    private int trackNum;
    private static int constant = 1;
    private double length;
    private long amountOfListening;

    public String getArtist() {
        return artist;
    }

    public long getAmountOfListening() {
        return amountOfListening;
    }

    public void setAmountOfListening(long amountOfListening) {
        this.amountOfListening = amountOfListening;
    }

    public Track(String artist, String name, int trackNum, double length, long amountOfListening) {
        this.artist = artist;
        this.name = name;
        this.trackNum = trackNum + constant;
        this.length = length;
        this.amountOfListening = amountOfListening;
    }

    @Override
    public String toString() {
        return "Track{" +
                "artist='" + artist + '\'' +
                ", name='" + name + '\'' +
                ", trackNum=" + trackNum +
                ", length=" + length +
                ", amountOfListening=" + amountOfListening +
                '}';
    }
}
