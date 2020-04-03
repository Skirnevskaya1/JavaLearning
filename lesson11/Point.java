public class Point implements Moveable {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(double dx, double dy) {
        double ax = this.x + dx;
        double ay = this.y + dy;
        System.out.println("Координаты после сдвига: " + "\n" + ax + " ; " + ay);
    }

    @Override
    public void rotate(double degrees) {
        double ax = (x * (Math.cos(degrees))) - (y * (Math.sin(degrees)));
        double ay = (x * (Math.sin(degrees))) + (y * (Math.cos(degrees)));
        System.out.println("Координаты после поворота: " + "\n" + ax + " ; " + ay);
    }
}
