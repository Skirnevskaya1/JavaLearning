import java.util.Scanner;

/**
 * Created by User on 12.12.2019.
 */
public class Task1 {
    //Запишите условия для точек, принадлежащих выделенной области
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите x: ");
        int x = Integer.parseInt(scanner.next());
        System.out.println("Введите y: ");
        int y = Integer.parseInt(scanner.next());
        if ((x == 4 && y == 0) || (x == -4 && y == 0) || (x == 0 && y == 6))
            System.out.println("Принадлежит выделенной области");
        else System.out.println("Не принадлежит выделенной области");
    }
}
