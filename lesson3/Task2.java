import java.util.Scanner;

/**
 * Created by User on 08.12.2019.
 */
public class Task2 {
    //Напишите программу, вычисляющую заданную степень числа 2, используя битовые операции.
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Integer a = scanner.nextInt();
        Integer b = 1 << a;
        System.out.println(b);
    }
}
