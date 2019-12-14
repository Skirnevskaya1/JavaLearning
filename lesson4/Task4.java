import java.util.Scanner;

/**
 * Created by User on 14.12.2019.
 */
public class Task4 {
    // Вывести на экран номер четверти координатной плоскости, которой принадлежит точка с
    //координатами (x,y), при условии что x≠0 и y≠0.
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.next());
        int y = Integer.parseInt(scanner.next());
        if (x > 0 && y > 0)
            System.out.println("номер четверти: 1");
        else if (x < 0 && y > 0)
            System.out.println("номер четверти: 2");
        else if (x < 0 && y < 0)
            System.out.println("номер четверти: 3");
        else if (x > 0 && y < 0)
            System.out.println("номер четверти: 4");
        else System.out.println("номер четверти: 0");
    }


}
