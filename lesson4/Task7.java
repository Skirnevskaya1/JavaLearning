import java.util.Scanner;

/**
 * Created by User on 14.12.2019.
 */
public class Task7 {
    //Даны три целых числа, каждое записано в отдельной строке.
    //Выведите наибольшее из данных чисел (программа должна вывести ровно одно целое число).
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.next());
        int y = Integer.parseInt(scanner.next());
        int z = Integer.parseInt(scanner.next());

        if (x >= y && x >= z)
            System.out.println(x);
        else if (y >= x && y >= z)
            System.out.println(y);
        else System.out.println(z);
    }
}
