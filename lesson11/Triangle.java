public class Triangle extends Figure implements Rotatable, Moveable {
    double height;
    double sideLength2;
    double sideLength3;

    public Triangle(String name, double length, double x, double y, double sideLength2, double sideLength3) {
        super(name, length, x, y);
        this.sideLength2 = sideLength2;
        this.sideLength3 = sideLength3;
    }

    public double findHeight() {
        double p = 0.5 * (length + sideLength2 + sideLength3);
        height = (2 * Math.sqrt(p * (p - length) * (p - sideLength2) * (p - sideLength3))) / length;
        return height;
    }

    @Override
    public double findArea() {
        return (0.5 * length * findHeight());
    }

    @Override
    public double findPerimeter() {
        return (length + sideLength2 + sideLength3);
    }

    @Override
    public void move(double dx, double dy) {
        System.out.println("\n" + "Наименование = " + name + "\n" + "Длина стороны фигуры: " + "\n" + length + "\n" + sideLength2 + "\n" + sideLength3 + "\n" + "Координаты местонахождения: " + "\n" + x + " ; " + y);
        System.out.println("Сдвиг координаты на : " + dx + " ; " + dy);
        super.move(dx, dy);
    }

    @Override
    public void rotate(double degrees) {
        double ax = (x * (Math.cos(degrees))) - (y * (Math.sin(degrees)));
        double ay = (x * (Math.sin(degrees))) + (y * (Math.cos(degrees)));
        System.out.println("Координаты после поворота: " + "\n" + ax + " ; " + ay);
    }

    public String toString() {
        return "Длина 2ой стороны = " + sideLength2 + " см; Длина 3ей стороны = " + sideLength3 + " см; " + super.toString();
    }
}
