public class Square extends Figure implements Moveable {
    Point point = new Point(1, 1);//сдвиг величина

    public Square(String name, double length) {
        super(name, length);
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

    public void move(double dx, double dy) {
        System.out.println("Наименование = " + name + "\n" + "Длина стороны фигуры: " + length + "\n" + "Координаты местонахождения: " + "\n" + dx + " ; " + dy);
        point.move(dx, dy);
    }

    public void rotate(double degrees) {
        point.rotate(degrees);
    }
}
