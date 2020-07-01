import java.util.ArrayList;

public class Service {
    public static void main(String[] args){

        Track track= new Track("LOLO", "YOPPPP", 5, 5);

        ArrayList arrayListArtist = new ArrayList();
        arrayListArtist.add(track);

        Thread threadArtist = new Thread((Runnable) arrayListArtist);
        threadArtist.start();

        Service service=new Service();
        ArrayList arrayListListener = new ArrayList();
        arrayListListener.add(track);


    }
    //выдавать треки (получить)
    public Track getTrack(Track track) {
        return track;
    }

    //записывает (установка)
    public Track addTrack(Track track) {
        return track;
    }


}
