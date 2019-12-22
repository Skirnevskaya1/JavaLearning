import java.util.Scanner;

/**
 * Created by User on 22.12.2019.
 */
public class Task2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();//числитель
        double b = scanner.nextDouble();//знаменатель
        int znak = 1;
        double sum = 0;
        int k = 0;//количество чисел ряда

        for (; a / b > 0.001; ) {
            sum += znak * (a / b);
            k += 1;
            znak = -znak;
            a += 1;
            b *= 2;
        }
        System.out.println(sum);
        System.out.println(k);
    }
}