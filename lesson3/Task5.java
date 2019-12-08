import java.util.Scanner;

/**
 * Created by User on 08.12.2019.
 */
public class Task5 {
    public static void main(String args[]) {
        //Напишите программу, обнуляющие все биты числа, кроме нескольких последних
        Scanner scanner = new Scanner(System.in);
        Integer a = scanner.nextInt();
        Integer b = scanner.nextInt();
        Integer q = a &= (1 << b) - 1;
        System.out.println(q);
    }
}
