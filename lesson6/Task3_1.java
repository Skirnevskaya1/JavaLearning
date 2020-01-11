import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * Created by User on 06.01.2020.
 */
public class Task3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество массивов - ");
        int arrayQuantity = scanner.nextInt();
        System.out.println("Введите длину массива - ");
        int arrayLength = scanner.nextInt();
        int[][] array = new int[arrayQuantity][arrayLength];
        int max = 500;
        int min = 1;
        int maxArray = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = ArrayGenerator.getIntArray(arrayQuantity, max, min);
            int q = getSumArray(array[i]);
            if (q > maxArray) {
                maxArray = q;
            }
        }
        System.out.println("Максимальная сумма = " + maxArray);
    }

    public static int getSumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("cумма = " + sum);
        return sum;
    }
}
