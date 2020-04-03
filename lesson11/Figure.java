public abstract class Figure {
    String name;
    double length;

    public Figure(String name, double length) {
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
