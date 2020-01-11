/**
 * Created by User on 09.01.2020.
 */
public class ArrayGenerator1 {
    public static int[][] getIntArray(int[][] array, int lengthA, int lengthB) {

        for (int i = 0; i < lengthA; i++) {
            for (int j = 0; j < lengthB; j++) {
                array[i][j] = (int) (Math.random() * 100);
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
        return array;
    }
}
