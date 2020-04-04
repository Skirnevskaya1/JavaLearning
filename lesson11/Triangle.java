public class Triangle extends Figure implements Rotatable, Moveable {
    double x1;
    double y1;
    double x2;
    double y2;
    double x3;
    double y3;
    Point point;

    public Triangle(String name, double x1, double y1, double x2, double y2, double x3, double y3) {
        super(name);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.point = new Point(x1, y1);
    }

    public double findLength1() {
        double length = Math.sqrt((Math.pow(x2, 2) - 2 * x2 * x1 + Math.pow(x1, 2)) + (Math.pow(y2, 2) - 2 * y2 * y1 + Math.pow(y1, 2)));
        return length;
    }

    public double findLength2() {
        double length = Math.sqrt((Math.pow(x3, 2) - 2 * x3 * x2 + Math.pow(x2, 2)) + (Math.pow(y3, 2) - 2 * y3 * y2 + Math.pow(y2, 2)));
        return length;
    }

    public double findLength3() {
        double length = Math.sqrt((Math.pow(x3, 2) - 2 * x3 * x1 + Math.pow(x1, 2)) + (Math.pow(y3, 2) - 2 * y3 * y1 + Math.pow(y1, 2)));
        return length;
    }

    public double findHeight() {
        double p = 0.5 * (findLength1() + findLength2() + findLength3());
        double height = (2 * Math.sqrt(p * (p - findLength1()) * (p - findLength2()) * (p - findLength3()))) / findLength1();
        return height;
    }

    @Override
    public double findArea() {
        return (0.5 * findLength1() * findHeight());
    }

    @Override
    public double findPerimeter() {
        return (findLength1() + findLength2() + findLength3());
    }

    @Override
    public void move(double dx, double dy) {
        System.out.println("\n" + "Наименование = " + name + "\n" + "Длина стороны фигуры: " + "\n" + findLength1() + "\n" + findLength2() + "\n" + findLength3() + "\n" + "Координаты местонахождения: " + "\n" + x1 + " ; " + y1);
        System.out.println("Сдвиг координаты на : " + dx + " ; " + dy);
        point.move(dx, dy);
    }

    @Override
    public void rotate(double degrees) {
        double ax = (x1 * (Math.cos(degrees))) - (y1 * (Math.sin(degrees)));
        double ay = (x1 * (Math.sin(degrees))) + (y1 * (Math.cos(degrees)));
        System.out.println("Координаты после поворота: " + "\n" + ax + " ; " + ay);
    }

    public String toString() {
        return "Наименование = " + name +
                "; Длина стороны = " + findLength1() + " см" + "\n" + "Длина 2ой стороны = " + findLength2() + " см; Длина 3ей стороны = " + findLength3() + " см; " + "S = " + findArea() + "\n" + "P = " + findPerimeter();
    }
}
