public class Square extends Figure {
    private double x;
    private double y;
    Point point;

    public Square(String name, double length, double x, double y) {
        super(name, length);
        this.x = x;
        this.y = y;
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
        System.out.println("Наименование = " + name + "\n" + "Длина стороны фигуры: " + length + "\n" + "Координаты местонахождения: " + "\n" + x + " ; " + y);
        System.out.println("Сдвиг координаты на : " + dx + " ; " + dy);
        point.move(dx, dy);
    }

    @Override
    public void rotate(double degrees) {
        double ax = (x * (Math.cos(degrees))) - (y * (Math.sin(degrees)));
        double ay = (x * (Math.sin(degrees))) + (y * (Math.cos(degrees)));
        System.out.println("Координаты после поворота: " + "\n" + ax + " ; " + ay);
    }
}
