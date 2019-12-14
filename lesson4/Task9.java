import java.util.Scanner;

/**
 * Created by User on 14.12.2019.
 */
public class Task9 {
    /*Дано три числа, записанный в отдельных строках.
    Упорядочите их в порядке неубывания. Программа должна считывать три числа a, b, c,
    затем программа должна менять их значения так, чтобы стали выполнены условия a <= b <= c,
    затем программа выводит тройку a, b, c.
     */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.next());
        int y = Integer.parseInt(scanner.next());
        int z = Integer.parseInt(scanner.next());

        if (x <= y && y <= z && x <= z)
            System.out.println(x + " " + y + " " + z);
        else if (y <= x && y <= z && x <= z)
            System.out.println(y + " " + x + " " + z);
        else if (y <= z && y <= x && z <= x)
            System.out.println(y + " " + z + " " + x);
        else if (z <= x && z <= y && x <= y)
            System.out.println(z + " " + x + " " + y);
        else if (z <= y && z <= x && y <= x)
            System.out.println(z + " " + y + " " + x);
        else
            System.out.println(x + " " + z + " " + y);
    }
}
