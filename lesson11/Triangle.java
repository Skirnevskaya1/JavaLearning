public class Triangle extends Figure implements Rotatable, Moveable {
    protected double x1;
    protected double y1;
    protected double x2;
    protected double y2;
    protected double x3;
    protected double y3;
    Point point;

    public double getX1(double dx) {
        return x1;
    }

    public double setX1(double x1) {
        this.x1 = x1;
        return x1;
    }

    public double getY1(double dy) {
        return y1;
    }

    public double setY1(double y1) {
        this.y1 = y1;
        return y1;
    }

    public double getX2(double dx) {
        return x2;
    }

    public double setX2(double x2) {
        this.x2 = x2;
        return x2;
    }

    public double getY2(double dy) {
        return y2;
    }

    public double setY2(double y2) {
        this.y2 = y2;
        return y2;
    }

    public double getX3() {
        return x3;
    }

    public double setX3(double x3) {
        this.x3 = x3;
        return x3;
    }

    public double getY3() {
        return y3;
    }

    public double setY3(double y3) {
        this.y3 = y3;
        return y3;
    }

    public Triangle(String name, double x1, double y1, double x2, double y2, double x3, double y3) {
        super(name);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.point = new Point(x1, y1);
        this.point = new Point(x2, y2);
        this.point = new Point(x3, y3);
    }

    public double findLength(double ax1, double ay1, double ax2, double ay2) {
        double length = Math.sqrt((Math.pow(ax2, 2) - 2 * ax2 * ax1 + Math.pow(ax1, 2)) + (Math.pow(ay2, 2) - 2 * ay2 * ay1 + Math.pow(ay1, 2)));
        return length;
    }

    public double findHeight() {
        double p = 0.5 * (findLength(x1, y1, x2, y2) + findLength(x1, y1, x3, y3) + findLength(x2, y2, x3, y3));
        double height = (2 * Math.sqrt(p * (p - findLength(x1, y1, x2, y2)) * (p - findLength(x1, y1, x3, y3)) * (p - findLength(x2, y2, x3, y3)))) / findLength(x1, y1, x2, y2);
        return height;
    }

    @Override
    public double findArea() {
        return (0.5 * findLength(x1, y1, x2, y2) * findHeight());
    }

    @Override
    public double findPerimeter() {
        return (findLength(x1, y1, x2, y2) + findLength(x1, y1, x3, y3) + findLength(x2, y2, x3, y3));
    }

    @Override
    public void move(double dx, double dy) {
        System.out.println("\n" + "Наименование = " + name + "\n" + "Длина стороны фигуры: " + "\n" + findLength(x1, y1, x2, y2) + "\n" + findLength(x1, y1, x3, y3) + "\n" + findLength(x2, y2, x3, y3) + "\n" + "Координаты местонахождения: " + "\n" + x1 + " ; " + y1 + "\n" + x2 + " ; " + y2 + "\n" + x3 + " ; " + y3);
        System.out.println("Сдвиг координаты на : " + dx + " ; " + dy);
        point.move(setX1(dx), setY1(dy));
        point.move(setX2(dx), setY2(dy));
        point.move(setX3(dx), setY3(dy));
    }

    @Override
    public void rotate(double degrees) {
        double ax = (x1 * (Math.cos(degrees))) - (y1 * (Math.sin(degrees)));
        double ay = (x1 * (Math.sin(degrees))) + (y1 * (Math.cos(degrees)));
        System.out.println("Координаты после поворота: " + "\n" + ax + " ; " + ay);
    }

    public String toString() {
        return "Наименование = " + name +
                "; Длина стороны = " + findLength(x1, y1, x2, y2) + " см" + "\n" + "Длина 2ой стороны = " + findLength(x1, y1, x3, y3) + " см; Длина 3ей стороны = " + findLength(x2, y2, x3, y3) + " см; " + "S = " + findArea() + "\n" + "P = " + findPerimeter();
    }
}
