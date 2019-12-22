import java.util.Scanner;

/**
 * Created by User on 21.12.2019.
 */
public class Task3 {
    //Вывести все квадраты натуральных чисел, не превосходящие данного числа N.
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        double i = 1.0;

        while (Math.sqrt(i) < n) {
            System.out.println(Math.sqrt(i));
            i += 1;
        }
    }
}
