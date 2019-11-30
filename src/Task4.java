import java.util.Scanner;

/**
 * Created by User on 29.11.2019.
 */
public class Task4 {
    public static void main(String args[]) {
        //Дано целое число n. Выведите следующее за ним четное число.
        //При решении этой задачи нельзя использовать условную инструкцию if и циклы
        //Примечание. До 01 марта 2019 г. задачу нельзя сдать на языке Паскаль.
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = (a / 2) * 2 + 2;
        System.out.println(b);
    }
}
