import java.util.Scanner;

/**
 * Created by User on 21.12.2019.
 */
public class Task4 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        for (int i = 1; Math.sqrt(i) < n; i++) {
            System.out.println(Math.sqrt(i));
        }
    }
}
