import java.util.Scanner;

/**
 * Created by User on 18.01.2020.
 */
public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        Integer x = new Integer(Math.abs(scanner.nextInt()));

        // Бинарный формат числа
        String convert = Integer.toBinaryString(x);
        System.out.println(convert);

        // Восьмиричная форма
        convert = Integer.toOctalString(x);
        System.out.println(convert);

        // Шеснадцатиричная форма
        convert = Integer.toHexString(x).toUpperCase();
        System.out.println(convert);

        if (x >= 0 && x <= 127) {
            System.out.println("YES");
        } else System.out.println("NO");

        if (x >= 0 && x <= 32767) {
            System.out.println("YES");
        } else System.out.println("NO");
    }


}
