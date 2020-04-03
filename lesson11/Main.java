import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Square square = new Square("Квадрат", 5);
        Triangle triangle = new Triangle("Треугольник", 2, 2, 2);
        System.out.println(square.toString() + "\n" + triangle.toString());
        System.out.println("-------------------------------------------------");
        square.shear(0, 0, 1, 0, 1, 1, 0, 1, 0.5);
        System.out.println("-------------------------------------------------");
        square.rotation(2, 2, 2.5, 2.3, 2.5, 2.7, 2, 3, 30);
    }
}
