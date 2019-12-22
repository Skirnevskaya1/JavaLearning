import java.util.Scanner;

/**
 * Created by User on 22.12.2019.
 */
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();

        for (; n % 10 != 2 && n != 0; ) {
            n = n / 10;
        }
        if (n % 10 == 2) {
            System.out.println("Цифра 2 входит в число");
        } else System.out.println("Цифра 2 не входит в число");
    }
}
