import java.util.Scanner;

/**
 * Created by User on 08.12.2019.
 */
public class Task3 {
    //Напишите программу, которая в заданном числе устанавливает определенный бит в 1
    //(биты при этом нумеруются с нуля, начиная от младших)

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Integer a = scanner.nextInt();
        Integer b = scanner.nextInt();
        Integer s = a | 1 << b;
        System.out.println(s);
    }
}
