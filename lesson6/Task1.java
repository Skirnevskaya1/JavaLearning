import com.sun.javafx.scene.layout.region.Margins;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by User on 29.12.2019.
 */
public class Task1 {
    //Функция, вычисляющая среднее арифметическое элементов массива
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();

        while (true) {
            break;
        }
        String numbers1 = String.valueOf(num.split(" "));
        // for (String value : numbers) {
        //     list.add(value);

        int numbers =Integer.parseInt(numbers1);

        System.out.print("среднее арифметическое чисел равно: " + average(numbers));
    }

    public static double average(int numbers) {
        float s = 0;
        int n = 1;
        for (; numbers != -1;) {
            s = (s + numbers);
            //numbers = Integer.parseInt(numbers1);
            n++;
        }


//        double average1 = 0;
//        if (numbers.length > 0) {
//            double sum = 0;
//            for (int j = 0; j < numbers.length; j++) {
//                sum += numbers[j];
//            }
//            average1 = sum / numbers.length;
//        }
//        return average1;
        return (s / (n - 1));
    }
}
