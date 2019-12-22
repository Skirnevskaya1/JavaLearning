import java.util.Scanner;

/**
 * Created by User on 22.12.2019.
 */
public class Task5 {
    //Определить и вывести на экран цифры целого числа n.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        int i = 1;
        while (n != 0) {
            int p = n % 10;
            System.out.println(i + " - я цифра справа равна " + p);
            n = n / 10;
            i++;
        }
    }
}
