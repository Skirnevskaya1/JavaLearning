public class Listener implements Runnable {
    String name;
    private static int constanta = 0;

    public Listener(String name) {
        this.name = name + " " + constanta;
        constanta++;
    }

    public static Listener getInstance() {
        String name = "Слушатель";
        return new Listener(name);
    }

    @Override
    public void run() {
        while (true) {
            try {
                int time = (int) (Math.random() * (5000 - 1000) + 1000);
                Thread.sleep(time);
                Track track = Track.getInstance();
                Main.service.getTrack();
                System.out.println(this.name + " получил и послушал трек " + track);

            } catch (InterruptedException | TrackNotFoundException e) {
                e.printStackTrace();
                System.out.println("Возникла ошибка в получении трека!" + e);
            }
            break;
        }
    }
}
