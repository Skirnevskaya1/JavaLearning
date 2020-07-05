
public class Artist implements Runnable {
    private static int constanta = 0;
    private String name;

    public Artist(String name) {
        this.name = name + " " + constanta;
        constanta++;
        System.out.println("Артист " + this.name);
    }

    @Override
    public void run() {

        try {
            System.out.println("Пришло вдохновение! Создаю трек");
            while (true) {
                int time = (int) (Math.random() * (5000 - 1000) + 1000);
                Thread.sleep(time);

                Track track = Track.getInstance();
                Main.service.addTrack(track);
//                System.out.println("Трек успешно отправлен на сервис!");
            }


        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println(Thread.currentThread().getName() + "ОШИБКА! Не получилось отправить трек");
        }
    }
}
