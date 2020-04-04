public class Point implements Moveable {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(double dx, double dy) {
        double ax = x + dx;
        double ay = y + dy;
        System.out.println("Координаты после сдвига: " + "\n" + ax + " ; " + ay);
    }
}
