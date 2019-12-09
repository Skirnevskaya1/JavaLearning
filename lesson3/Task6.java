import java.util.Scanner;

/**
 * Created by User on 08.12.2019.
 */
public class Task6 {
    //Дано натуральное число N. Выведите слово YES, если число N является точной степенью двойки, или слово NO в противном случае.
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a % 2 == 1)
            System.out.println("NO");
        else System.out.println("YES");
    }
}
