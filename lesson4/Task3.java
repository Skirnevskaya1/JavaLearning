import java.util.Scanner;

/**
 * Created by User on 14.12.2019.
 */
public class Task3 {
    public static void main(String args[]) {
        //Написать собственный пример на нахождение максимума, минимума среди нескольких
        //введенных переменных с использованием оператора ветвления.
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.next());
        int y = Integer.parseInt(scanner.next());
        int z = Integer.parseInt(scanner.next());
        min(x, y, z);
        max(x, y, z);
    }
    public static void min(int x, int y, int z) {
        if (x <= y && x <= z)
            System.out.println("Минимум " + x);
        else if (y <= x && y <= z)
            System.out.println("Минимум " + y);
        else
            System.out.println("Минимум " + z);
    }

    public static void max(int x, int y, int z) {
        if (x >= y && x >= z)
            System.out.println("Максимум " + x);
        else if (y >= x && y >= z)
            System.out.println("Максимум " + y);
        else
            System.out.println("Максимум " + z);
    }
}
