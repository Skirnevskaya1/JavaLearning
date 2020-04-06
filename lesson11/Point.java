public class Point implements Moveable {
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    private double x;
    private double y;

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
