import java.util.Scanner;

/**
 * Created by User on 12.12.2019.
 */
public class Task1 {
    //Запишите условия для точек, принадлежащих выделенной области
    public static void main(String args[]) {
        int x = 0, y = 0;
        if ((x == 4 && y == 0) && (x == -4 && y == 0) && (x == 0 && y == 6))
            System.out.println("Получился треугольник");
        else System.out.println("Ошибка!");
    }
}
