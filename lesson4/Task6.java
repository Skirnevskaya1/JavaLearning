import java.util.Scanner;

/**
 * Created by User on 14.12.2019.
 */
public class Task6 {
    /*
    Для заданного 0<n<130 , рассматриваемого как возраст человека, вывести фразу вида «Вам 21
год», «Вам 32 года», « Вам 12 лет».
     */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.next());

        if (x > 0 && x < 130) {
            if (x % 10 == 1 && x != 11)
                System.out.println("Вам " + x + " год");
            else if (x % 10 == 2 && x != 12 || x % 10 == 3 || x % 10 == 4)
                System.out.println("Вам " + x + " года");
            else System.out.println("Вам " + x + " лет");
        } else System.out.println("Error!");
    }
}
