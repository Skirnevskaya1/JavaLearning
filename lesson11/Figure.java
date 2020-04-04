public abstract class Figure extends Point {
    String name;
    double length;

    public Figure(String name, double length, double x, double y) {
        super(x, y);
        this.name = name;
        this.length = length;
    }

    public abstract double findArea();

    public abstract double findPerimeter();

    @Override
    public String toString() {
        return "Наименование = " + name +
                "; Длина стороны = " + length + " см" + "\n" + "S = " + findArea() + "\n" + "P = " + findPerimeter();
    }
}
