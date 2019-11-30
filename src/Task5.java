import java.util.Scanner;

/**
 * Created by User on 29.11.2019.
 */
public class Task5 {
    public static void main(String args[]) {
        /*
        Дано число n. С начала суток прошло n минут.
        Определите, сколько часов и минут будут показывать электронные часы в этот момент.
        Программа должна вывести два числа: количество часов (от 0 до 23) и количество минут (от 0 до 59).
        Учтите, что число n может быть больше, чем количество минут в сутках.
        */
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int hours = (a / 60) % 24;
        int min = a % 60;
        System.out.println(hours + " " + min);
    }
}
