public class Square extends Figure {
    Point point;

    public Square(String name, double length, double x, double y) {
        super(name, length);
        this.point = new Point(x, y);
    }

    @Override
    public double findArea() {
        return (length * length);
    }

    @Override
    public double findPerimeter() {
        return (4 * length);
    }

    public String toString() {
        return super.toString();
    }

    @Override
    public void move(double dx, double dy) {
        System.out.println("Наименование = " + name + "\n" + "Длина стороны фигуры: " + length + "\n" + "Координаты местонахождения: " + "\n" + point.getX() + " ; " + point.getY());
        System.out.println("Сдвиг координаты на : " + dx + " ; " + dy);
        point.move(dx, dy);
    }

    @Override
    public void rotate(double degrees) {
        double ax = (point.getX() * (Math.cos(degrees))) - (point.getY() * (Math.sin(degrees)));
        double ay = (point.getX() * (Math.sin(degrees))) + (point.getY() * (Math.cos(degrees)));
        point.setX(ax);
        point.setY(ay);
        System.out.println("Координаты после поворота: " + "\n" + ax + " ; " + ay);
    }
}
