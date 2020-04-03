public class Triangle extends Figure {
    double height;
    double sideLength2;
    double sideLength3;

    public Triangle(String name, double length, double sideLength2, double sideLength3) {
        super(name, length);
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

    public String toString() {
        return "Длина 2ой стороны = " + sideLength2 + " см; Длина 3ей стороны = " + sideLength3 + " см; " + super.toString() ;
    }
}
