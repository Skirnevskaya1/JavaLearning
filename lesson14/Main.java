public class Main {
    static Service service = new Service();

    public static void main(String[] args) throws InterruptedException {

        for (int i = 1; i < 10; i++) {
            Thread threadArtist = new Thread(Artist.getInstance());
            threadArtist.start();

            Thread threadListener = new Thread(Listener.getInstance());
            threadListener.start();
            int time = (int) (Math.random() * (5000 - 1000) + 1000);
            Thread.sleep(time);
        }
    }
}
