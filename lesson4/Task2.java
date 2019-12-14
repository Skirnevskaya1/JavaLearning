/**
 * Created by User on 14.12.2019.
 */
public class Task2 {
    //Запишите условия для точек, принадлежащих выделенной области
    public static void main(String args[]) {
        int x = 0, y = 0;
        if ((x == -4 && y == 4) && (x == -1 && y == 4))
            System.out.println("Радиус круга");
        else if ((x == 0 && y == 0) && (x == 6 && y == 0) && (x == 0 && y == 6))
            System.out.println("1/2 треугольника");
        else
            System.out.println("Ошибка!");

    }
}
