import java.util.Scanner;

/**
 * Created by User on 08.12.2019.
 */
public class Task1 {
    public static void main(String args[]) {
        //Напишите программу, которая обнуляет заданное количество последних бит числа
        Scanner scanner = new Scanner(System.in);
        Integer a = scanner.nextInt();
        Integer b = scanner.nextInt();
        a = a >> b;
        a = a << b;
        System.out.println(a);
    }
}
