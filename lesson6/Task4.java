import java.util.Scanner;

/**
 * Created by User on 29.12.2019.
 */
public class Task4 {
    //Функция заполнения массива случайными числами
    public static void main(String[] args) {
        int[] array = new int[15];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Начало диапазона - ");
        Integer min = scanner.nextInt();
        System.out.println("Конец диапазона - ");
        Integer max = scanner.nextInt();

        mass(array, min, max);
        for (int i = 0; i < 15; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] mass(int[] arr, int min, int max) {
        for (int i = 0; i < 15; i++) {
            arr[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        return arr;
    }
}
