import java.util.ArrayList;

public class Service {
    static ArrayList<Track> tracks = new ArrayList<Track>();

    public void addTrack(Track track) {
        tracks.add(track);
        System.out.println("Добавлен в сервис трек " + track.toString());
    }

    public Track getTrack() throws TrackNotFoundException {
        if (tracks.size() == 0) {
            throw new TrackNotFoundException("Нет созданных треков!");
        } else {
            int ind = (int) Math.random() * (tracks.size());
            return tracks.get(ind);
        }
//        Track randomElement = trackArrayList.get(rand.nextInt(trackArrayList.size()));
//        System.out.println("Слушатель получает с сервиса трек " + randomElement);
//        return randomElement;
    }
}
