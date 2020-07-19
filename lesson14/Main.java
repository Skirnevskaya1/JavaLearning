public class Main {
    static Service service = new Service();
    static Artist artist;
    static Listener listener;

    public static void main(String[] args) throws InterruptedException {

        for (int i = 1; i < 10; i++) {
            Thread threadArtist = new Thread(artist.getInstance());
            threadArtist.run();
            //threadArtist.start();

            Thread threadListener = new Thread(listener.getInstance());
            threadListener.run();
            // threadListener.start();
            int time = (int) (Math.random() * (5000 - 1000) + 1000);
            Thread.sleep(time);
        }
    }
}
