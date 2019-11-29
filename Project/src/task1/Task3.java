package task1;

import java.util.Scanner;

/**
 * Created by User on 29.11.2019.
 */
public class Task3 {
    public static void main(String args[]) {
        //Дано трехзначное число. Найдите сумму его цифр.
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int a1 = a / 100;
        int a2 = (a / 10) % 10;
        int a3 = a % 10;
        System.out.println(a1 + a2 + a3);
    }
}
