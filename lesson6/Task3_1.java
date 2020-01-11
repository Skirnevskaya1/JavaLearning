import java.util.Scanner;

/**
 * Created by User on 06.01.2020.
 */
public class Task3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число строк - ");
        int lengthA = scanner.nextInt();
        System.out.println("Введите число столбцов - ");
        int lengthB = scanner.nextInt();
        int[][] array = new int[lengthA][lengthB];

        ArrayGenerator1.getIntArray(array, lengthA, lengthB);
        getSumArray(array, lengthA, lengthB);
    }

    public static int[][] getSumArray(int[][] array, int lengthA, int lengthB) {

        int a = 0;
        int b = 0;
        int sum = 0;

        for (int i = 0; i < lengthA; i++) {
            for (int j = 0; j < lengthB; j++) {
                sum += array[i][j];
            }
            if (a < sum) {
                a = sum;
                b = i;
            }
        }
        System.out.println(b + "-й массив с максимальной суммой элементов: " + "\nСумма строки ровна = " + sum);


        return array;
    }
}