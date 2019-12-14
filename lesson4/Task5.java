import java.util.Scanner;

/**
 * Created by User on 14.12.2019.
 */
public class Task5 {
    /*
     Написать программу, которая по введенному номеру единицы измерения (1-дециметр, 2-
километр, 3-метр, 4-миллиметр, 5-сантиметр, 6-дюймы, 7-футы, 8-мили) и длине отрезка
выдавала бы соответствующее значение длины отрезка в метрах.
     */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер единицы измерения: ");
        int x = Integer.parseInt(scanner.next());
        System.out.println("Введите длину отрезка: ");
        double y = Integer.parseInt(scanner.next());

        if (x == 1) {
            double s = y / 10;
            System.out.println(s + " м.");
        } else if (x == 2) {
            double s = y * 1000;
            System.out.println(s + " м.");
        } else if (x == 3) {
            System.out.println(y + " м.");
        } else if (x == 4) {
            double s = y / 1000;
            System.out.println(s + " м.");
        } else if (x == 5) {
            double s = y / 100;
            System.out.println(s + " м.");
        } else if (x == 6) {
            double s = y / 39.37d;
            System.out.println(s + " м.");
        } else if (x == 7) {
            double s = y * 30.48d;
            System.out.println(s + " м.");
        } else if (x == 8) {
            double s = y * 160934;
            System.out.println(s + " м.");
        } else System.out.println("Введите номер единицы измерения правильно и попробуйте еще раз!");
    }
}
