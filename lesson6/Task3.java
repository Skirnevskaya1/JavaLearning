/**
 * Created by User on 29.12.2019.
 */
public class Task3 {
    //Найти массив с максимальной суммой элементов
    public static void main(String[] args) {

        int[] array = new int[15];
        int[] arrayMax = new int[15];
        int num = 0, max = 0;
        int i, j, q;
        //создаем 10 массивов
        for (i = 1; i <= 10; i++) {
            q = randomArray(array);
            if (q > max) {
                max = q;
                for (j = 0; j < 15; j++) {
                    arrayMax[j] = array[j];
                    num = i;
                }
            }
        }
        System.out.println(num + "-й массив с максимальной суммой элементов: ");
        for (i = 0; i < 15; i++) {
            System.out.print(" " + arrayMax[i]);
        }
        System.out.println(" - " + max);
    }

    public static int randomArray(int[] a) {
        int l, sum;
        sum = 0;
        for (l = 0; l < 15; l++) {
            a[l] = (int) (Math.random() * 100);
            sum += a[l];
            System.out.print(" " + a[l]);

        }
        System.out.println(" - " + sum);
        return sum;
    }
}