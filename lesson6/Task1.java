import java.util.Scanner;

/**
 * Created by User on 29.12.2019.
 */
public class Task1 {
    //Функция, вычисляющая среднее арифметическое элементов массива
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine(); // считываем строку, имеет такой вид "1 2 3 4 5 6"
        String[] numbersStr = s.split(" "); // разделяем строку по робелу, возвращает массив ["1"  "2"  "3"  "4"]
        int[] numbers = new int[numbersStr.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numbersStr[i]);
        }
        System.out.println("Среднее арифметическое чисел равно: " + average(numbers));
    }

    public static double average(int[] numbers) {
        double average1 = 0;
        if (numbers.length > 0) {
            double sum = 0;
            for (int j = 0; j < numbers.length; j++) {
                sum += numbers[j];
            }
            average1 = sum / numbers.length;
        }
        return average1;
    }
}
