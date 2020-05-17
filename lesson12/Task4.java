import java.io.FileReader;
import java.io.IOException;

public class Task4 {
    public static void main(String[] args) {
        try {
            FileReader file1 = new FileReader("E:\\JJava\\Учеба\\Project12\\src\\File1.txt");
            FileReader file2 = new FileReader("E:\\JJava\\Учеба\\Project12\\src\\File2.txt");

            char[] f1 = new char[20];
            char[] f2 = new char[20];
            file1.read(f1);
            file2.read(f2);

            int max = f1.length < f2.length ? f1.length : f2.length;
            for (int i = 0; i < max; i++) {
                if (f1[i] != f2[i]) {
                    System.out.println(f1[i] + " != " + f2[i]);
                } else {
                    System.out.println(f1[i] + " == " + f2[i]);
                }
            }
            file1.close();
            file2.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
