public class Artist implements Runnable {
    private static int constanta = 0;
    private static String name;

    public static String getName() {
        return name;
    }

    public Artist(String name) {
        Artist.name = name + " " + constanta;
        constanta++;
        System.out.println("Создан артист: " + Artist.name);
    }

    public static Artist getInstance() {
        String name = "Артист ";
        return new Artist(name);
    }

    @Override
    public void run() {
        System.out.println(name + " - начал работу");
        try {
            System.out.println("Создаю трек...");
            while (true) {
                int time = (int) (Math.random() * (5000 - 1000) + 1000);
                Thread.sleep(time);
                Track track = Track.getInstance();
                Main.service.addTrack(track);
                System.out.println("Трек успешно отправлен на сервис!");
                break;
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println(Thread.currentThread().getName() + "ОШИБКА! Не получилось отправить трек");
        }
    }
}
