public class Triangle extends Figure {
    private Point point1;
    private Point point2;
    private Point point3;

    public Triangle(String name, double x1, double y1, double x2, double y2, double x3, double y3) {
        super(name);
        this.point1 = new Point(x1, y1);
        this.point2 = new Point(x2, y2);
        this.point3 = new Point(x3, y3);
    }

    public double findLength(Point point1, Point point2) {
        double length = Math.sqrt((Math.pow(point2.getX(), 2) - 2 * point2.getX() * point1.getX() + Math.pow(point1.getX(), 2)) + (Math.pow(point2.getY(), 2) - 2 * point2.getY() * point1.getY() + Math.pow(point1.getY(), 2)));
        return length;
    }

    public double findHeight() {
        double p = 0.5 * (findLength(point1, point2) + findLength(point1, point3) + findLength(point2, point3));
        double height = (2 * Math.sqrt(p * (p - findLength(point1, point2)) * (p - findLength(point1, point3)) * (p - findLength(point2, point3)))) / findLength(point1, point2);
        return height;
    }

    @Override
    public double findArea() {
        return (0.5 * findLength(point1, point2) * findHeight());
    }

    @Override
    public double findPerimeter() {
        return (findLength(point1, point2) + findLength(point1, point3) + findLength(point2, point3));
    }

    @Override
    public void move(double dx, double dy) {
        System.out.println("\n" + "Наименование = " + name + "\n" + "Длина стороны фигуры: " + "\n" + findLength(point1, point2) + "\n" + findLength(point1, point3) + "\n" + findLength(point2, point3) + "\n" + "Координаты местонахождения: " + "\n" + point1.getX() + " ; " + point1.getY() + "\n" + point2.getX() + " ; " + point2.getY() + "\n" + point3.getX() + " ; " + point3.getY());
        System.out.println("Сдвиг координаты на : " + dx + " ; " + dy);
        point1.move(dx, dy);
        point2.move(dx, dy);
        point3.move(dx, dy);
    }

    @Override
    public void rotate(double degrees) {

        double ax1 = (point1.getX() * (Math.cos(degrees))) - (point1.getY() * (Math.sin(degrees)));
        double ay1 = (point1.getX() * (Math.sin(degrees))) + (point1.getY() * (Math.cos(degrees)));
        double ax2 = (point2.getX() * (Math.cos(degrees))) - (point2.getY() * (Math.sin(degrees)));
        double ay2 = (point2.getX() * (Math.sin(degrees))) + (point2.getY() * (Math.cos(degrees)));
        double ax3 = (point3.getX() * (Math.cos(degrees))) - (point3.getY() * (Math.sin(degrees)));
        double ay3 = (point3.getX() * (Math.sin(degrees))) + (point3.getY() * (Math.cos(degrees)));
        point1.setX(ax1);
        point1.setY(ay1);
        point1.setX(ax2);
        point1.setY(ay2);
        point1.setX(ax3);
        point1.setY(ay3);
        System.out.println("Координаты после поворота: " + "\n" + ax1 + " ; " + ay1 + "\n" + ax2 + " ; " + ay2 + "\n" + ax3 + " ; " + ay3);
    }

    public String toString() {
        return "Наименование = " + name +
                "; Длина стороны = " + findLength(point1, point2) + " см" + "\n" + "Длина 2ой стороны = " + findLength(point1, point3) + " см; Длина 3ей стороны = " + findLength(point2, point3) + " см; " + "S = " + findArea() + "\n" + "P = " + findPerimeter();
    }
}