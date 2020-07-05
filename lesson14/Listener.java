public class Listener implements Runnable {
    String name;

    public Listener(String name) {
        this.name = name;
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

                Track track = Main.service.getTrack();
                System.out.println(track + "Трек получен!");

            } catch (InterruptedException | TrackNotFoundException e) {
                e.printStackTrace();
                System.out.println("Возникла ошибка в получении трека!" + e);
            }
        }
    }
}
