import java.util.Scanner;

/**
 * Created by User on 29.12.2019.
 */
public class Task2 {
    //Определить количество разрядов числа
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        Integer n = scanner.nextInt();
        System.out.println(discharge(n));
    }

    public static int discharge(int n) {
        int i = 0;
        if (n < 0)
            n = -n;
        while (n > 0) {
            n = n / 10;
            i += 1;
        }
        return i;
    }
}
