public class Main {
    public static void main(String[] args) {
        Square square = new Square("Квадрат", 5, 0, 1);
        Triangle triangle = new Triangle("Треугольник", 2, 1, 1, 2, 2,3);
        System.out.println(square.toString() + "\n" + triangle.toString());
        System.out.println("-------------------------------------------------");
        square.move(2, 2);
        square.rotate(30);
        triangle.move(0.5, 1);
        triangle.rotate(5);
    }
}
