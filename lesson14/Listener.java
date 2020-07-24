public class Listener implements Runnable {
    private static String name;
    private static int constanta = 0;

    public Listener(String name) {
        Listener.name = name + " " + constanta;
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
                Track trackService = Main.service.getTrack();
                System.out.println(name + " получил и послушал трек " + trackService.getAmount());

            } catch (InterruptedException | TrackNotFoundException e) {
                e.printStackTrace();
                System.out.println("Возникла ошибка в получении трека!" + e);
            }
            break;
        }
    }
}
