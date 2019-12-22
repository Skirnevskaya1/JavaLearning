import java.util.Scanner;

/**
 * Created by User on 22.12.2019.
 */
public class Task6 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        for (int i = 1; n != 0; i++) {
            int p = n % 10;
            System.out.println(i + " - я цифра справа равна " + p);
            n = n / 10;
        }
    }
}
