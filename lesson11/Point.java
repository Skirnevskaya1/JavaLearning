public class Point implements Moveable {
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(double dx, double dy) {
        x = x + dx;
        y = y + dy;
        System.out.println("Координаты после сдвига: " + "\n" + x + " ; " + y);
    }
}
