/**
 * Created by User on 29.12.2019.
 */
public class Task1 {
    //Функция, вычисляющая среднее арифметическое элементов массива
    public static void main(String[] args) {
        int[] numbers = {1, 2, 8, -88, 66, -25, -1, 88, 98};
        System.out.print("среднее арифметическое чисел равно: " + average(numbers));
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

