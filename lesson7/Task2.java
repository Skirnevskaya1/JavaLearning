import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int x = new Integer(Math.abs(scanner.nextInt()));

        // Бинарный формат числа
        String convert = Integer.toBinaryString(x);
        System.out.println(convert);

        // Восьмиричная форма
        convert = Integer.toOctalString(x);
        System.out.println(convert);

        // Шеснадцатиричная форма
        convert = Integer.toHexString(x).toUpperCase();
        System.out.println(convert);

        // помещается ли число х в ячейке типа byte
        if (x == (byte) x) {
            System.out.println("YES");
        } else System.out.println("NO");

        if (x == (short) x) {
            System.out.println("YES");
        } else System.out.println("NO");
    }
}
