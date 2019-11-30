import java.util.Scanner;

/**
 * Created by User on 29.11.2019.
 */
public class Task1 {
    public static void main(String args[]) {
        //Дано натуральное число. Выведите его последнюю цифру.
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = a % 10;
        System.out.println(b);
    }
}
