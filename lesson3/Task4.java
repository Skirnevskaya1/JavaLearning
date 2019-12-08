import java.util.Scanner;

/**
 * Created by User on 08.12.2019.
 */
public class Task4 {
    //Напишите программу, которая инвертирует определенный бит в заданном числе (биты при этом нумеруются с 0, начиная с младших).
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Integer a = scanner.nextInt();
        Integer b = scanner.nextInt();
        Integer s = a ^ (1 << b);
        System.out.println(s);
    }
}
