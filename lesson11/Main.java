import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Square square = new Square("Квадрат", 5);
        Triangle triangle = new Triangle("Треугольник", 2, 2, 2);
        System.out.println(square.toString() + "\n" + triangle.toString());
        System.out.println("-------------------------------------------------");
        square.move(0, 1);
        square.rotate(30);
    }
}
