/**
 * Created by User on 06.01.2020.
 */
public class ArrayGenerator {
    public static int[] getIntArray(int length, int max, int min) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * (max - min + 1) + min);
            System.out.print(array[i] + " ");
        }
        return array;
    }

    public static double[] getDoubleArray(int length, double max, double min) {
        double[] array = new double[length];
        for (int i = 0; i < length; i++) {
            array[i] = (double) (Math.random() * (max - min + 1) + min);
            System.out.print(array[i] + " ");
        }
        return array;
    }
}
