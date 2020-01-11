import java.util.Scanner;

/**
 * Created by User on 06.01.2020.
 */
public class Task3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество массивов - ");
        int lengthcount = scanner.nextInt();
        System.out.println("Введите длину массива - ");
        int lengthB = scanner.nextInt();

        int[][] array = new int[lengthcount][lengthB];
        int max = 500;
        int min = 1;

        for (int i=0;i < array.length; i++) {
           array[i] = ArrayGenerator.getIntArray(lengthcount, max, min);
        }
        for (int i=0;i < array.length; i++) {
            getSumArray(array[i]);
        }
    }

    public static int getSumArray(int[] array) {
        int sum =0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Сумма равна = "+sum);
        return sum;
    }
}
