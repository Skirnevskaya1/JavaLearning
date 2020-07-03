public class Track {
    String artist;
    String name;
    int trackNum;
    static int constant = 1;
    double length;
    long amountOfListening;

    public Track(String artist, String name, int trackNum, double length, long amountOfListening) {
        this.artist = artist;
        this.name = name;
        this.trackNum = trackNum + constant;
        this.length = length;
        this.amountOfListening = amountOfListening;
    }

    public String toStringGet() {
        return "Track{" +
                "artist='" + artist + '\'' +
                ", name='" + name + '\'' +
                ", trackNum=" + trackNum +
                ", length=" + length +
                ", amountOfListening=" + amountOfListening +
                '}';
    }

    public String toStringAdd() {
        return "Track{" +
                "artist='" + artist + '\'' +
                ", name='" + name + '\'' +
                ", trackNum=" + trackNum +
                ", length=" + length +
                '}';
    }


}
