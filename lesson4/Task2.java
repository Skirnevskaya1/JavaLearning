import java.util.Scanner;

/**
 * Created by User on 14.12.2019.
 */
public class Task2 {
    //Запишите условия для точек, принадлежащих выделенной области
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите x: ");
        int x = scanner.nextInt();
        System.out.println("Введите y: ");
        int y = scanner.nextInt();
        int x1 = 0, y1 = 0, x2 = 6, y2 = 0;
        int x3 = 0, y3 = 0, x4 = 0, y4 = 6;
        int x5 = 0, y5 = 6, x6 = 6, y6 = 0;
        int x7 = -4, y8 = 4;

        int a1 = y1 - y2;
        int b1 = x2 - x1;
        int c1 = x1 * y2 - x2 * y1;
        int a2 = y3 - y4;
        int b2 = x4 - x3;
        int c2 = x3 * y4 - x4 * y3;
        int a3 = y5 - y6;
        int b3 = x6 - x5;
        int c3 = x5 * y6 - x6 * y5;

        if (a1 * x + b1 * y + c1 >= 0 && a2 * x + b2 * y + c2 <= 0 && a3 * x + b3 * y + c3 <= 0 || (x - x7) * (x - x7) + (y - y8) * (y - y8) <= 9) {
            System.out.println("Принадлежит выделенной области");
        } else System.out.println("Не принадлежит выделенной области");
    }
}
