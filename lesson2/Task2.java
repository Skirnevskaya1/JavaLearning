import java.util.Scanner;

/**
 * Created by User on 29.11.2019.
 */
public class Task2 {
    public static void main(String args[]) {
        //Дано двузначное число. Найдите число десятков в нем.
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = a / 10;
        System.out.println(b);
    }
}
